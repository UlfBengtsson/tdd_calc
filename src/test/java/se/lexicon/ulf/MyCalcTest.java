package se.lexicon.ulf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import se.lexicon.ulf.models.MyCalc;

/**
 * Unit test for MyCalc
 */
public class MyCalcTest
{
    /**
     • It should be able to handle basic mathematical operations
        (addition, subtraction, multiplication, division)
     • Each mathematical operation should be in its own method
     • No exception crash allowed //Adjusted by client
     • Overloaded method for Addition & Subtract that accepts a array as input parameter.
     • Addition and Subtraction should be able to handle any number of parameters

     Optional:
     • Interface that handle Exceptions that may happen when user enters input.
     */
    @Test
    public void additionOnePulsOne()
    {
        //Arrange
        int numberA = 1;
        int numberB = 1;

        //Act
        double result = MyCalc.addition(numberA, numberB);

        //Assert
        assertEquals( 2, result ,0);
    }

    @Test
    public void additionFivePlusTwo()
    {
        //Arrange
        int numberA = 5;
        int numberB = 2;

        //Act
        double result = MyCalc.addition(numberA, numberB);

        //Assert
        assertEquals( 7, result, 0 );
    }

    @Test
    public void additionFivePointTwoPlusTwoPointFour()
    {
        //Arrange
        double numberA = 5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.addition(numberA, numberB);

        //Assert
        assertEquals( 7.6, result , 0);
    }

    @Test
    public void additionNegativeFivePointTwoPlusTwoPointFour()
    {
        //Arrange
        double numberA = -5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.addition(numberA, numberB);

        //Assert
        assertEquals( -2.8, result , 2);
    }

    @Test
    public void additionArrayWithZeroNumbers()
    {
        //Arrange
        double[] numbers = {  };

        //Act
        double result = MyCalc.addition(numbers);

        //Assert
        assertEquals( 0, result , 0);
    }

    @Test
    public void additionArrayWithOneNumber()
    {
        //Arrange
        double[] numbers = { 2.4 };

        //Act
        double result = MyCalc.addition(numbers);

        //Assert
        assertEquals( 2.4, result , 0);
    }

    @Test
    public void additionArrayWithTwoNumbers()
    {
        //Arrange
        double[] numbers = { 2.4, 5.6 };

        //Act
        double result = MyCalc.addition(numbers);

        //Assert
        assertEquals( 8, result , 0);
    }

    @Test
    public void additionArrayWithTenNumbers()
    {
        //Arrange
        double[] numbers = { 1, 2, 3, 4, -5, 6, 7, 8, 9, 10 };

        //Act
        double result = MyCalc.addition(numbers);

        //Assert
        assertEquals( 45, result , 0);
    }

    @Test
    public void additionVarArgs()
    {
        //Arrange
        double number1 = 3.3;
        double number2 = 3.3;
        double number3 = 3.3;

        //Act
        double result = MyCalc.addition(number1, number2, number3);

        //Assert
        assertEquals( 9.9, result , 1);
    }
    //------------------------------------------------

    @Test
    public void subtractionOneMinusOne()
    {
        //Arrange
        int numberA = 1;
        int numberB = 1;

        //Act
        double result = MyCalc.subtraction(numberA, numberB);

        //Assert
        assertEquals( 0, result ,0);
    }

    @Test
    public void subtractionFiveMinusTwo()
    {
        //Arrange
        int numberA = 5;
        int numberB = 2;

        //Act
        double result = MyCalc.subtraction(numberA, numberB);

        //Assert
        assertEquals( 3, result, 0 );
    }

    @Test
    public void subtractionFivePointTwoMinusTwoPointFour()
    {
        //Arrange
        double numberA = 5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.subtraction(numberA, numberB);

        //Assert
        assertEquals( 2.8, result , 2);
    }

    @Test
    public void subtractionNegativeFivePointTwoMinusTwoPointFour()
    {
        //Arrange
        double numberA = -5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.subtraction(numberA, numberB);

        //Assert
        assertEquals( -6.6, result , 2);
    }

    @Test
    public void subtractionArrayWithZeroNumbers()
    {
        //Arrange
        double[] numbers = {  };

        //Act
        double result = MyCalc.subtraction(numbers);

        //Assert
        assertEquals( 0, result , 0);
    }

    @Test
    public void subtractionArrayWithOneNumber()
    {
        //Arrange
        double[] numbers = { 5.7 };

        //Act
        double result = MyCalc.subtraction(numbers);

        //Assert
        assertEquals( 5.7, result , 0);
    }

    @Test
    public void subtractionArrayWithTwoNumbers()
    {
        //Arrange
        double[] numbers = { 2.4, 5.6 };

        //Act
        double result = MyCalc.subtraction(numbers);

        //Assert
        assertEquals( -3.2, result , 1);
    }

    @Test
    public void subtractionArrayWithTenNumbers()
    {
        //Arrange
        double[] numbers = { 1, 2, 3, 4, -5, 6, 7, 8, 9, 10 };

        //Act
        double result = MyCalc.subtraction(numbers);

        //Assert
        assertEquals( -43, result , 0);
    }

    //------------------------------------------------------------------

    @Test
    public void multiOneTimesOne()
    {
        //Arrange
        int numberA = 1;
        int numberB = 1;

        //Act
        double result = MyCalc.multiplication(numberA, numberB);

        //Assert
        assertEquals( 1, result ,0);
    }

    @Test
    public void multiFiveTimesTwo()
    {
        //Arrange
        int numberA = 5;
        int numberB = 2;

        //Act
        double result = MyCalc.multiplication(numberA, numberB);

        //Assert
        assertEquals( 10, result, 0 );
    }

    @Test
    public void multiFivePointTwoTimesTwoPointFour()
    {
        //Arrange
        double numberA = 5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.multiplication(numberA, numberB);

        //Assert
        assertEquals( 12.48, result , 4);
    }

    @Test
    public void multiNegativeFivePointTwoTimesTwoPointFour()
    {
        //Arrange
        double numberA = -5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.multiplication(numberA, numberB);

        //Assert
        assertEquals( -12.48, result , 4);
    }

    @Test
    public void multiZeroTimesTwoPointFour()
    {
        //Arrange
        double numberA = 0;
        double numberB = 2.4;

        //Act
        double result = MyCalc.multiplication(numberA, numberB);

        //Assert
        assertEquals( 0, result , 4);
    }
    //------------------------------------------------------------------

    @Test
    public void divisonOneOverOne()
    {
        //Arrange
        int numberA = 1;
        int numberB = 1;

        //Act
        double result = MyCalc.divison(numberA, numberB);

        //Assert
        assertEquals( 1, result ,0);
    }

    @Test
    public void divisonFiveOverTwo()
    {
        //Arrange
        int numberA = 5;
        int numberB = 2;

        //Act
        double result = MyCalc.divison(numberA, numberB);

        //Assert
        assertEquals( 2.5, result, 0 );
    }

    @Test
    public void divisonFivePointTwoOverTwoPointFour()
    {
        //Arrange
        double numberA = 5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.divison(numberA, numberB);

        //Assert
        assertEquals( 2.16, result , 3);
    }

    @Test
    public void divisonNegativeFivePointTwoOverTwoPointFour()
    {
        //Arrange
        double numberA = -5.2;
        double numberB = 2.4;

        //Act
        double result = MyCalc.divison(numberA, numberB);

        //Assert
        assertEquals( -2.16, result , 3);
    }

    @Test
    public void divisonZeroOverTwoPointFour()
    {
        //Arrange
        double numberA = 0;
        double numberB = 2.4;

        //Act
        double result = MyCalc.divison(numberA, numberB);

        //Assert
        assertEquals( 0, result , 4);
    }

    @Test
    public void divisonTwoPointFourOverZero()
    {
        //Arrange
        double numberA = 2.4;
        double numberB = 0;

        //Act
        double result = MyCalc.divison(numberA, numberB);

        //Assert
        assertTrue( Double.isInfinite(result) );
    }
    //------------------------------------------------------------------

    @Test
    public void shouldAnswerWithTrue()
    {
        //Arrange

        //Act

        //Assert
        assertTrue( true );
    }
}
