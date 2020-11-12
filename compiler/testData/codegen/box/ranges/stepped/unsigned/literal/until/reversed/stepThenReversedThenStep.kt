// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in (1u until 11u step 2).reversed() step 3) {
        uintList += i
    }
    assertEquals(listOf(9u, 6u, 3u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in (1uL until 11uL step 2L).reversed() step 3L) {
        ulongList += i
    }
    assertEquals(listOf(9uL, 6uL, 3uL), ulongList)

    return "OK"
}