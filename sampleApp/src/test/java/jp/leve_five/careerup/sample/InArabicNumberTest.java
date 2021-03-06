
package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class InArabicNumberTest {


    @Test
    public void test1を入力するとIが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(1);
        assertEquals("I", roman);
    }
    @Test
    public void test2を入力するとIIが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(2);
        assertEquals("II", roman);
    }
    @Test
    public void test3を入力するとIIIが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(3);
        assertEquals("III", roman);
    }
    @Test
    public void test4を入力するとIVが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(4);
        assertEquals("IV", roman);
    }
    @Test
    public void test8を入力するとVIIIが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(8);
        assertEquals("VIII", roman);
    }
    @Test
    public void test9を入力するとIXが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(9);
        assertEquals("IX", roman);
    }
    @Test
    public void test10を入力するとXが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(10);
        assertEquals("X", roman);
    }
    @Test
    public void test15を入力するとXVが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(15);
        assertEquals("XV", roman);
    }
    @Test
    public void test490を入力するとiiiが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(490);
        assertEquals("CDXC", roman);
    }
    @Test
    public void test3999を入力するとMMMCMXCIXが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(3999);
        assertEquals("MMMCMXCIX", roman);
    }
    @Test
    public void test4000を入力すると空が返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(4000);
        assertEquals("", roman);
    }
    @Test
    public void test900を入力するとCMが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(900);
        assertEquals("CM", roman);
    }
    

}