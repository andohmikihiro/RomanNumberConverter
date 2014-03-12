package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class InputOutputTest {

    @Test
    public void test�R����͂����III���o�͂����() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
        assertEquals("III", output);
    }

    @Test
    public void test1����͂����I���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(1);
        assertEquals("I", output);
    }

    @Test
    public void test2����͂����II���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(2);
        assertEquals("II", output);
    }

    @Test
    public void test3����͂����III���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
        assertEquals("III", output);
    }

    @Test
    public void test4����͂����IV���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(4);
        assertEquals("IV", output);
    }

    @Test
    public void test8����͂����VIII���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(8);
        assertEquals("VIII", output);
    }

    @Test
    public void test9����͂����IX���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(9);
        assertEquals("IX", output);
    }

    @Test
    public void test10����͂����X���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(10);
        assertEquals("X", output);
    }

    @Test
    public void test15����͂����XV���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(15);
        assertEquals("XV", output);
    }

    @Test
    public void test490����͂����iii���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(490);
        assertEquals("CDXC", output);
    }

    @Test
    public void test3999����͂����MMMCMXCIX���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3999);
        assertEquals("MMMCMXCIX", output);
    }

    @Test
    public void test4000����͂���Ƌ󂪕Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(4000);
        assertEquals("", output);
    }

    @Test
    public void test900����͂����CM���Ԃ��Ă���() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(900);
        assertEquals("CM", output);
    }

    @Test
    public void testi���R���͂���ƂR���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("iii");
        assertEquals(3, answer);
    }

    @Test
    public void testv��1���͂����5���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("v");
        assertEquals(5, answer);
    }

    @Test
    public void testx���R���͂����3�O���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("xxx");
        assertEquals(30, answer);
    }

    @Test
    public void testx���R��v���P��i���Q���͂����36���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("xXxVI");
        assertEquals(36, answer);
    }

    @Test
    public void testL��1���͂����50���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("L");
        assertEquals(50, answer);
    }

    @Test
    public void testc���R���͂���ƂR00���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("Ccc");
        assertEquals(300, answer);
    }

    @Test
    public void testD��1���͂����500���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("D");
        assertEquals(500, answer);
    }

    @Test
    public void testM��2���͂����2000���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("Mm");
        assertEquals(2000, answer);
    }

    @Test
    public void testm��2��d���P��c���Q���͂����2700���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("mMdCC");
        assertEquals(2700, answer);
    }

    @Test
    public void testc��1���͂����100���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("c");
        assertEquals(100, answer);
    }

    @Test
    public void testmmmcmliv����͂���3954�Ƃ��Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("mmmcmliv");
        assertEquals(3954, answer);
    }

    @Test
    public void testi��4���͂���Ɛ��������[�}�����̋L�@�ł͂���܂���ƕ\�������() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("iiii");
    }

    @Test
    public void testvm����͂���Ɛ��������[�}�����̋L�@�ł͂���܂���ƕ\�������() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("vm");
    }
    @Test
    public void testXIX����͂����19���Ԃ�() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("XIX");
        assertEquals(19, answer);
    }
    @Test
    public void testIXX����͂���Ɛ��������[�}�����̋L�@�ł͂���܂���ƕ\�������() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("IXX");
    }

}