package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class InputOutputTest {

    @Test
    public void test‚R‚ğ“ü—Í‚·‚é‚ÆIII‚ªo—Í‚³‚ê‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
        assertEquals("III", output);
    }

    @Test
    public void test1‚ğ“ü—Í‚·‚é‚ÆI‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(1);
        assertEquals("I", output);
    }

    @Test
    public void test2‚ğ“ü—Í‚·‚é‚ÆII‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(2);
        assertEquals("II", output);
    }

    @Test
    public void test3‚ğ“ü—Í‚·‚é‚ÆIII‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
        assertEquals("III", output);
    }

    @Test
    public void test4‚ğ“ü—Í‚·‚é‚ÆIV‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(4);
        assertEquals("IV", output);
    }

    @Test
    public void test8‚ğ“ü—Í‚·‚é‚ÆVIII‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(8);
        assertEquals("VIII", output);
    }

    @Test
    public void test9‚ğ“ü—Í‚·‚é‚ÆIX‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(9);
        assertEquals("IX", output);
    }

    @Test
    public void test10‚ğ“ü—Í‚·‚é‚ÆX‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(10);
        assertEquals("X", output);
    }

    @Test
    public void test15‚ğ“ü—Í‚·‚é‚ÆXV‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(15);
        assertEquals("XV", output);
    }

    @Test
    public void test490‚ğ“ü—Í‚·‚é‚Æiii‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(490);
        assertEquals("CDXC", output);
    }

    @Test
    public void test3999‚ğ“ü—Í‚·‚é‚ÆMMMCMXCIX‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3999);
        assertEquals("MMMCMXCIX", output);
    }

    @Test
    public void test4000‚ğ“ü—Í‚·‚é‚Æ‹ó‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(4000);
        assertEquals("", output);
    }

    @Test
    public void test900‚ğ“ü—Í‚·‚é‚ÆCM‚ª•Ô‚Á‚Ä‚­‚é() {
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(900);
        assertEquals("CM", output);
    }

    @Test
    public void testi‚ğ‚R‚Â“ü—Í‚·‚é‚Æ‚R‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("iii");
        assertEquals(3, answer);
    }

    @Test
    public void testv‚ğ1‚Â“ü—Í‚·‚é‚Æ5‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("v");
        assertEquals(5, answer);
    }

    @Test
    public void testx‚ğ‚R‚Â“ü—Í‚·‚é‚Æ3‚O‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("xxx");
        assertEquals(30, answer);
    }

    @Test
    public void testx‚ğ‚R‚Âv‚ğ‚P‚Âi‚ğ‚Q‚Â“ü—Í‚·‚é‚Æ36‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("xXxVI");
        assertEquals(36, answer);
    }

    @Test
    public void testL‚ğ1‚Â“ü—Í‚·‚é‚Æ50‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("L");
        assertEquals(50, answer);
    }

    @Test
    public void testc‚ğ‚R‚Â“ü—Í‚·‚é‚Æ‚R00‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("Ccc");
        assertEquals(300, answer);
    }

    @Test
    public void testD‚ğ1‚Â“ü—Í‚·‚é‚Æ500‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("D");
        assertEquals(500, answer);
    }

    @Test
    public void testM‚ğ2‚Â“ü—Í‚·‚é‚Æ2000‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("Mm");
        assertEquals(2000, answer);
    }

    @Test
    public void testm‚ğ2‚Âd‚ğ‚P‚Âc‚ğ‚Q‚Â“ü—Í‚·‚é‚Æ2700‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("mMdCC");
        assertEquals(2700, answer);
    }

    @Test
    public void testc‚ğ1‚Â“ü—Í‚·‚é‚Æ100‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("c");
        assertEquals(100, answer);
    }

    @Test
    public void testmmmcmliv‚ğ“ü—Í‚·‚é3954‚Æ‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("mmmcmliv");
        assertEquals(3954, answer);
    }

    @Test
    public void testi‚ğ4‚Â“ü—Í‚·‚é‚Æ³‚µ‚¢ƒ[ƒ}”š‚Ì‹L–@‚Å‚Í‚ ‚è‚Ü‚¹‚ñ‚Æ•\¦‚³‚ê‚é() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("iiii");
    }

    @Test
    public void testvm‚ğ“ü—Í‚·‚é‚Æ³‚µ‚¢ƒ[ƒ}”š‚Ì‹L–@‚Å‚Í‚ ‚è‚Ü‚¹‚ñ‚Æ•\¦‚³‚ê‚é() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("vm");
    }
    @Test
    public void testXIX‚ğ“ü—Í‚·‚é‚Æ19‚ª•Ô‚é() {
        InputOutput inputoutput = new InputOutput();
        int answer = inputoutput.convert("XIX");
        assertEquals(19, answer);
    }
    @Test
    public void testIXX‚ğ“ü—Í‚·‚é‚Æ³‚µ‚¢ƒ[ƒ}”š‚Ì‹L–@‚Å‚Í‚ ‚è‚Ü‚¹‚ñ‚Æ•\¦‚³‚ê‚é() {
        InputOutput inputoutput = new InputOutput();
        inputoutput.convert("IXX");
    }

}