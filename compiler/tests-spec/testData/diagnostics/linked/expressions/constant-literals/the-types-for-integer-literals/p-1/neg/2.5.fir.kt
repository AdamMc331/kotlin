// SKIP_TXT

// FILE: functions.kt

package functions

// TESTCASE NUMBER: 1
fun f1(x1: Byte) = x1

// TESTCASE NUMBER: 2
fun f2(x1: Short) = x1

// TESTCASE NUMBER: 3, 4
fun f3(x1: Int) = x1

// FILE: main.kt

import functions.*

// TESTCASE NUMBER: 1
fun case_1() {
    <!INAPPLICABLE_CANDIDATE!>f1<!>(128)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(-129)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(32767)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(-32768)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(2147483647)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(-2147483648)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(9223372036854775807)
    <!INAPPLICABLE_CANDIDATE!>f1<!>(-9223372036854775807)
    f1(<!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
    f1(<!AMBIGUITY!>-<!><!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
}

// TESTCASE NUMBER: 2
fun case_2() {
    <!INAPPLICABLE_CANDIDATE!>f2<!>(32768)
    <!INAPPLICABLE_CANDIDATE!>f2<!>(-32769)
    <!INAPPLICABLE_CANDIDATE!>f2<!>(2147483647)
    <!INAPPLICABLE_CANDIDATE!>f2<!>(-2147483648)
    <!INAPPLICABLE_CANDIDATE!>f2<!>(9223372036854775807)
    <!INAPPLICABLE_CANDIDATE!>f2<!>(-9223372036854775807)
    f2(<!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
    f2(<!AMBIGUITY!>-<!><!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
}

// TESTCASE NUMBER: 3
fun case_3() {
    <!INAPPLICABLE_CANDIDATE!>f3<!>(9223372036854775807)
    <!INAPPLICABLE_CANDIDATE!>f3<!>(-9223372036854775807)
    f3(<!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
    f3(<!AMBIGUITY!>-<!><!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
}

// TESTCASE NUMBER: 4
fun case_4() {
    f3(<!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
    f3(<!AMBIGUITY!>-<!><!ILLEGAL_CONST_EXPRESSION!>1000000000000000000000000000000000000000000000000<!>)
}
