fun import() {
    <!FUNCTION_CALL_EXPECTED!>import<!> <!UNRESOLVED_REFERENCE!>a<!><!SYNTAX!>.<!><!DEBUG_INFO_MISSING_UNRESOLVED!>*<!><!SYNTAX!><!>
}

fun composite() {
    val <!UNUSED_VARIABLE!>s<!> = 13+<!SYNTAX!>~<!><!DEBUG_INFO_MISSING_UNRESOLVED!>/<!>12
}

fun html() {
    <!SYNTAX!><<!><!FUNCTION_CALL_EXPECTED!>html<!><!UNRESOLVED_REFERENCE!>><!><!SYNTAX!><<!><!DEBUG_INFO_MISSING_UNRESOLVED!>/<!><!FUNCTION_CALL_EXPECTED!>html<!><!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>><!><!SYNTAX!><!>
}

fun html1() {
    <!SYNTAX!><<!><!FUNCTION_CALL_EXPECTED!>html<!><!UNRESOLVED_REFERENCE!>><!><!SYNTAX!><<!><!DEBUG_INFO_MISSING_UNRESOLVED!>/<!><!FUNCTION_CALL_EXPECTED!>html<!><!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>><!><!FUNCTION_CALL_EXPECTED!>html<!>
}