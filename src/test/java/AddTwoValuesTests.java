import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }


    //TODO
    //add new tests for add() method
    @Test
    public void testAddTwoValues() {
        int first = 10;
        int second = 5;
        int expected = 15;
        assertEquals(String.format("%s  + %s = %s",  first, second, expected), expected, calc.add(first, second));
    }

    //public int multiply(int a, int b)
    @Test
    public void testMultiply() {
        int first = 10;
        int second = 5;
        int expected = 50;
        assertEquals(String.format("%s * %s = %s",  first, second, expected), expected, calc.multiply(first, second));
    }
   // public int division(int a, int b) {
   @Test
    public void testDivision() {
        int first = -10;
        int second = 5;
        double expected = -2;
        assertEquals(String.format("%s / %s = %s",  first, second, expected), expected, calc.division(first, second));
    }

    @Test
    public void testDivision2() {
        int first = 9;
        int second = 2;
        double expected = 4.5;
        assertEquals(String.format("%s / %s = %s",  first, second, expected), expected, calc.division(first, second));
    }
   // public int substraction(int a, int b) {
   @Test
   public void testSubstriction() {
       int first = 10;
       int second = 5;
       int expected = 5;
       assertEquals(String.format("%s - %s = %s",  first, second, expected), expected, calc.substraction(first, second));
   }
   // public int squareRoot(int a) {
   @Test
   public void testSquareRoot() {
       int first = 25;
       double expected = 5;
       assertEquals(String.format("SQRT %s = %s", first, expected), expected, calc.squareRoot(first));
   }
   // public int xX (int a){
   @Test
   public void testXX() {
       int first = 5;
       int expected = 25;
       assertEquals(String.format("x^2 %s = %s", first, expected), expected, calc.xX(first));
   }



    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
