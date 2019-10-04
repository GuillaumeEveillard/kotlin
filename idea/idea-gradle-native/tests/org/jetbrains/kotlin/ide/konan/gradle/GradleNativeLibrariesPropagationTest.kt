/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ide.konan.gradle

import com.intellij.openapi.roots.DependencyScope
import org.jetbrains.kotlin.gradle.ModuleInfo
import org.jetbrains.kotlin.gradle.ProjectInfo
import org.jetbrains.kotlin.gradle.checkProjectStructure
import org.jetbrains.kotlin.idea.configuration.externalCompilerVersion
import org.jetbrains.plugins.gradle.util.GradleConstants
import org.junit.Test
import org.junit.runners.Parameterized

class GradleNativeLibrariesPropagationTest : TestCaseWithFakeKotlinNative() {

    override fun getExternalSystemConfigFileName() = GradleConstants.KOTLIN_DSL_SCRIPT_NAME

    override fun testDataDirName() = "nativeLibraries"

    private val testedTargets = setOf("ios_arm64", "ios_x64", "watchos_arm32", "watchos_x86")

    @Test
    fun testCommonIOS() {
        configureProject()
        importProject()

        checkProjectStructure(
            myProject,
            projectPath,
            exhaustiveModuleList = false,
            exhaustiveSourceSourceRootList = false,
            exhaustiveDependencyList = false,
            exhaustiveTestsList = false
        ) {

            // No platform libraries should be propagated to commonMain since we have a JVM target.
            module("project_commonMain") {
                noPlatformLibrary("Foundation")
                noPlatformLibrary("CFNetwork")
                noPlatformLibrary("WatchKit")
            }

            module("project_appleMain") {
                // Common iOS/watchOS libraries are propagated.
                hasPlatformLibrary("Foundation", "watchos_arm32")

                // iOS- and watchOS-specific libraries are not propagated.
                noPlatformLibrary("CFNetwork")
                noPlatformLibrary("WatchKit")
            }

            module("project_iosMain") {
                // iOS libraries are propagated.
                hasPlatformLibrary("Foundation", "ios_arm64")
                hasPlatformLibrary("CFNetwork", "ios_arm64")

                // WatchKit is unavailable for iOS and shouldn't be propagated.
                noPlatformLibrary("WatchKit")
            }
        }
    }

    @Test
    fun testCommonIOSWithDisabledPropagation() {
        configureProject()
        importProject()

        // No dependencies should be propagated.
        checkProjectStructure(
            myProject,
            projectPath,
            exhaustiveModuleList = false,
            exhaustiveSourceSourceRootList = false,
            exhaustiveDependencyList = false,
            exhaustiveTestsList = false
        ) {

            module("project_commonMain") {
                noPlatformLibrary("Foundation")
                noPlatformLibrary("CFNetwork")
                noPlatformLibrary("WatchKit")
            }

            module("project_appleMain") {
                noPlatformLibrary("Foundation")
                noPlatformLibrary("CFNetwork")
                noPlatformLibrary("WatchKit")
            }

            module("project_iosMain") {
                noPlatformLibrary("Foundation")
                noPlatformLibrary("CFNetwork")
                noPlatformLibrary("WatchKit")
            }
        }
    }

    // TODO: Add when a dev build is ready
    @Test
    fun testCommonIOSWithShortcut() {
        configureProject()
        importProject()

        checkProjectStructure(
            myProject,
            projectPath,
            exhaustiveModuleList = true,
            exhaustiveSourceSourceRootList = false,
            exhaustiveDependencyList = false,
            exhaustiveTestsList = false
        ) {
            module("project")
            module("project_commonMain")
            module("project_commonTest")

            validateIosModules()
            validateTvosModules()
            validateWatchosModules()
        }
    }

    private fun ProjectInfo.validateIosModules() {
        // Main modules.
        module("project_iosMain") {
            moduleDependency("project_commonMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "ios_arm64")
        }

        module("project_iosDeviceMain") {
            moduleDependency("project_iosMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "ios_arm64")
        }

        module("project_iosSimulatorMain") {
            moduleDependency("project_iosMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "ios_x64")
        }

        // Test modules.
        module("project_iosTest") {
            moduleDependency("project_commonTest", DependencyScope.TEST)
            moduleDependency("project_iosMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "ios_arm64")
        }

        module("project_iosDeviceTest") {
            moduleDependency("project_iosTest", DependencyScope.TEST)
            moduleDependency("project_iosDeviceMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "ios_arm64")
        }

        module("project_iosSimulatorTest") {
            moduleDependency("project_iosTest", DependencyScope.TEST)
            moduleDependency("project_iosSimulatorMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "ios_x64")
        }
    }

    private fun ProjectInfo.validateTvosModules() {
        // Main modules.
        module("project_tvosMain") {
            moduleDependency("project_commonMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "tvos_arm64")
        }

        module("project_tvosDeviceMain") {
            moduleDependency("project_tvosMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "tvos_arm64")
        }

        module("project_tvosSimulatorMain") {
            moduleDependency("project_tvosMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "tvos_x64")
        }

        // Test modules.
        module("project_tvosTest") {
            moduleDependency("project_commonTest", DependencyScope.TEST)
            moduleDependency("project_tvosMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "tvos_arm64")
        }

        module("project_tvosDeviceTest") {
            moduleDependency("project_tvosTest", DependencyScope.TEST)
            moduleDependency("project_tvosDeviceMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "tvos_arm64")
        }

        module("project_tvosSimulatorTest") {
            moduleDependency("project_tvosTest", DependencyScope.TEST)
            moduleDependency("project_tvosSimulatorMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "tvos_x64")
        }
    }

    private fun ProjectInfo.validateWatchosModules() {
        // Main modules.
        module("project_watchosMain") {
            moduleDependency("project_commonMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "watchos_arm32")
        }

        module("project_watchosDeviceMain") {
            moduleDependency("project_watchosMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "watchos_arm32")
        }

        module("project_watchosDevice32Main") {
            moduleDependency("project_watchosDeviceMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "watchos_arm32")
        }

        module("project_watchosDevice64Main") {
            moduleDependency("project_watchosDeviceMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "watchos_arm64")
        }

        module("project_watchosSimulatorMain") {
            moduleDependency("project_watchosMain", DependencyScope.COMPILE)
            hasPlatformLibrary("Foundation", "watchos_x86")
        }

        // Test modules.
        module("project_watchosTest") {
            moduleDependency("project_commonTest", DependencyScope.TEST)
            moduleDependency("project_watchosMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "watchos_arm32")
        }

        module("project_watchosDeviceTest") {
            moduleDependency("project_watchosTest", DependencyScope.TEST)
            moduleDependency("project_watchosDeviceMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "watchos_arm32")
        }

        module("project_watchosDevice32Test") {
            moduleDependency("project_watchosDeviceTest", DependencyScope.TEST)
            moduleDependency("project_watchosDevice32Main", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "watchos_arm32")
        }

        module("project_watchosDevice64Test") {
            moduleDependency("project_watchosDeviceTest", DependencyScope.TEST)
            moduleDependency("project_watchosDevice64Main", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "watchos_arm64")
        }

        module("project_watchosSimulatorTest") {
            moduleDependency("project_watchosTest", DependencyScope.TEST)
            moduleDependency("project_watchosSimulatorMain", DependencyScope.TEST)
            hasPlatformLibrary("Foundation", "watchos_x86")
        }
    }

    private val ModuleInfo.kotlinVersion: String
        get() = requireNotNull(module.externalCompilerVersion) { "External compiler version should not be null" }

    private fun ModuleInfo.noPlatformLibrary(libraryName: String, targets: Collection<String> = testedTargets) {
        targets.forEach { target ->
            assertNoLibraryDepForModule(module.name, "Kotlin/Native $kotlinVersion - $libraryName [$target]")
        }
    }

    private fun ModuleInfo.hasPlatformLibrary(libraryName: String, target: String) {
        libraryDependency("Kotlin/Native $kotlinVersion - $libraryName [$target]", DependencyScope.PROVIDED)
        noPlatformLibrary(libraryName, testedTargets - target)
    }

    companion object {
        @Parameterized.Parameters(name = "{index}: with Gradle-{0}")
        @Throws(Throwable::class)
        @JvmStatic
        fun data() = listOf(arrayOf("4.10.2"))
    }
}
