// !WITH_NEW_INFERENCE
package bar

fun main() {
    class Some

    <!NI;DEBUG_INFO_MISSING_UNRESOLVED, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!><!NO_COMPANION_OBJECT!>Some<!>[<!SYNTAX!><!>]<!> <!NI;DEBUG_INFO_MISSING_UNRESOLVED, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>names<!> <!DEBUG_INFO_MISSING_UNRESOLVED!><!SYNTAX!>=<!> ["ads"]<!>
}