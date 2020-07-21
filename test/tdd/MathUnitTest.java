/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tan.util.MathUtil;

/**
 *
 * @author Minh Tan
 */
public class MathUnitTest {
    //this medthods turn into main
    @Test
    public void testSuccessfulCase(){
        //test case succedss means give the true data
        //method cF(1)
        //true    Assert.assertEquals(6, tan.util.MathUtil.computerFactorial(3));
        assertEquals(1, MathUtil.computerFactorial(0));
        assertEquals(1, MathUtil.computerFactorial(1));
        assertEquals(2, MathUtil.computerFactorial(2));
        assertEquals(6, MathUtil.computerFactorial(3));
        assertEquals(24, MathUtil.computerFactorial(4));
        assertEquals(120, MathUtil.computerFactorial(5));
        
    }
    
    @Test(expected = IllegalArgumentException.class) // @Test turn a method into main to run if click Shift + F6
    public void testFailedCase(){
        //test case fail means give the wrong data
        //cF(-5): nagative number can not ouput result , cF(20) : result number is to big can not print,
        //exception is cases with no data before, it is not value
        //so can not compare , can not use assertEquals() because it compare between values
        //We need use other option with exception
        //i need result Exception when we input value = -5 into cF()
        //so print out String which is green or red
        //green means ok red is not ok
        MathUtil.computerFactorial(-5);
    }
}

//when you code is wrong logic but netbean can build file .jar, .war when Clean & build
//it is not safe
//we disable clean & build if test code is red
//when use JUnit, we can use this
//in Java Desktop sout(), JOptionPane, write file log in Java Web
//but any thing can build file .jar, .war
//NB 8.2 1005.