// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts

import kotlin.contracts.*

// TESTCASE NUMBER: 1
fun <T : Boolean>T.case_1(): Boolean? {
    contract { returns(null) implies (!this@case_1) }
    return if (!this) null else true
}
