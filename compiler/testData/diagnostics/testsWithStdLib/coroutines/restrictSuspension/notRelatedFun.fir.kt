// !DIAGNOSTICS: -UNUSED_PARAMETER -SUSPENSION_CALL_MUST_BE_USED_AS_RETURN_VALUE
// COMMON_COROUTINES_TEST

interface SuperInterface

@COROUTINES_PACKAGE.RestrictsSuspension
open class RestrictedController : SuperInterface

class SubClass : RestrictedController()

suspend fun topLevel() {}

class A {
    suspend fun member() {}
}

fun generate1(f: suspend SuperInterface.() -> Unit) {}
fun generate2(f: suspend RestrictedController.() -> Unit) {}
fun generate3(f: suspend SubClass.() -> Unit) {}

fun A.test() {
    generate1 {
        topLevel()
        member()
        with(A()) {
            topLevel()
            member()
        }
    }
    generate2 {
        topLevel()
        member()
        with(A()) {
            topLevel()
            member()
        }
    }
    generate3 {
        topLevel()
        member()
        with(A()) {
            topLevel()
            member()
        }
    }

    suspend fun SuperInterface.fun1() {
        topLevel()
        member()
        with(A()) {
            topLevel()
            member()
        }
    }
    suspend fun RestrictedController.fun2() {
        topLevel()
        member()
        with(A()) {
            topLevel()
            member()
        }
    }
    suspend fun SubClass.fun3() {
        topLevel()
        member()
        with(A()) {
            topLevel()
            member()
        }
    }

}

