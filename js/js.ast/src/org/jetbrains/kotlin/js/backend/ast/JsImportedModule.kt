/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.backend.ast


class JsImportedModule @JvmOverloads constructor(
    val externalName: String,
    var internalName: JsName,
    val plainReference: JsExpression?,
    val relativeRequirePath: Boolean = false
) {
    val key = JsImportedModuleKey(externalName, plainReference?.toString())
}

val JsImportedModule.requireName: String
    get() = if (relativeRequirePath) "./$externalName.js" else externalName

data class JsImportedModuleKey(val baseName: String, val plainName: String?)