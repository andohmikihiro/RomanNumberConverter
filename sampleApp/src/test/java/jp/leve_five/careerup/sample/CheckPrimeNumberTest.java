package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPrimeNumberTest {

    @Test
    public void test5�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(5);
        assertEquals(2, count);
    }
    @Test
    public void test2�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(2);
        assertEquals(0, count);
    }
    @Test
    public void test10�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(10);
        assertEquals(4, count);
    }
    @Test
    public void test19�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(19);
        assertEquals(7, count);
    }
    @Test
    public void test54�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(54);
        assertEquals(16, count);
    }
    @Test
    public void test224�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(224);
        assertEquals(48, count);
    }
    @Test
    public void test312�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(312);
        assertEquals(64, count);
    }
    @Test
    public void test616�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(616);
        assertEquals(112, count);
    }
    @Test
    public void test888�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(888);
        assertEquals(154, count);
    }
    @Test
    public void test977�����̑f���̌�() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = checkPrimeNumber.inputOutput(977);
        assertEquals(164, count);
    }

}
