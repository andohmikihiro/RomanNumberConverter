package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class InputOutputTest {

    @Test
    public void test３を入力するとIIIが出力される() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
        assertEquals("III", output);
    }

    @Test
    public void test1を入力するとIが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(1);
        assertEquals("I", output);
    }

    @Test
    public void test2を入力するとIIが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(2);
        assertEquals("II", output);
    }

    @Test
    public void test3を入力するとIIIが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
        assertEquals("III", output);
    }

    @Test
    public void test4を入力するとIVが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(4);
        assertEquals("IV", output);
    }

    @Test
    public void test8を入力するとVIIIが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(8);
        assertEquals("VIII", output);
    }

    @Test
    public void test9を入力するとIXが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(9);
        assertEquals("IX", output);
    }

    @Test
    public void test10を入力するとXが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(10);
        assertEquals("X", output);
    }

    @Test
    public void test15を入力するとXVが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(15);
        assertEquals("XV", output);
    }

    @Test
    public void test490を入力するとiiiが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(490);
        assertEquals("CDXC", output);
    }

    @Test
    public void test3999を入力するとMMMCMXCIXが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3999);
        assertEquals("MMMCMXCIX", output);
    }

    @Test
    public void test4000を入力すると空が返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(4000);
        assertEquals("", output);
    }

    @Test
    public void test900を入力するとCMが返ってくる() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(900);
        assertEquals("CM", output);
    }

    @Test
    public void testiを３つ入力すると３が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("iii");
        assertEquals(3, answer);
    }

    @Test
    public void testvを1つ入力すると5が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("v");
        assertEquals(5, answer);
    }

    @Test
    public void testxを３つ入力すると3０が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("xxx");
        assertEquals(30, answer);
    }

    @Test
    public void testxを３つvを１つiを２つ入力すると36が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("xXxVI");
        assertEquals(36, answer);
    }

    @Test
    public void testLを1つ入力すると50が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("L");
        assertEquals(50, answer);
    }

    @Test
    public void testcを３つ入力すると３00が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("Ccc");
        assertEquals(300, answer);
    }

    @Test
    public void testDを1つ入力すると500が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("D");
        assertEquals(500, answer);
    }

    @Test
    public void testMを2つ入力すると2000が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("Mm");
        assertEquals(2000, answer);
    }

    @Test
    public void testmを2つdを１つcを２つ入力すると2700が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("mMdCC");
        assertEquals(2700, answer);
    }

    @Test
    public void testcを1つ入力すると100が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("c");
        assertEquals(100, answer);
    }

    @Test
    public void testmmmcmlivを入力する3954とが返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("mmmcmliv");
        assertEquals(3954, answer);
    }

    @Test
    public void testiを4つ入力すると正しいローマ数字の記法ではありませんと表示される() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("iiii");
    }

    @Test
    public void testvmを入力すると正しいローマ数字の記法ではありませんと表示される() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("vm");
    }
    @Test
    public void testXIXを入力すると19が返る() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("XIX");
        assertEquals(19, answer);
    }
    @Test
    public void testIXXを入力すると正しいローマ数字の記法ではありませんと表示される() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("IXX");
    }

}