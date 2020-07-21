/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil.se1408;
import static tan.util.MathUtil.computerFactorial;
/**
 *
 * @author Minh Tan
 */
public class MathUtilSE1408 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //expected : menthod would return 120 when input 5
        System.out.println("5! = " + computerFactorial(5));
        //expected : menthod would return 720 when input 6
        System.out.println("5! = " + computerFactorial(6));
        //expected : menthod would return 1 when input 0
        System.out.println("5! = " + computerFactorial(0));
        //expected : menthod would return 1 when input 1
        System.out.println("5! = " + computerFactorial(1));
        //expected : menthod would return EXCEPTON when input -5
        System.out.println("5! = " + computerFactorial(-5));
        //Code contains method main(), we are writting code which call test app
        //before doing this, we need prepare :
        //1.have data : 5, 6, 0, 1, -5
        //2.have method
        // EXPECTED VALUE
        
        //3.call query, call app, call method run with data has just prepared
        //view return result menthod,
        //EX : cF(6) return 120 => false;
        
        //Test 1 : simple but not enough
        //cause : view by eyes, tu so sanh giua gia tri ve ham
        //va ki vong
        //them nua no cam minh disable nut clean & build
        //code sai ve logic nhung van ra file.jar, .war
        //ta can 1 dung cach khac dam bao chat luong code khi viet code
        //ta nap them thu vien phu tro kiem soat giup kiem soat chat luong khi viet code
        //do la ki thuat TDD kem UNIT TESTING
        //xai thu vien JUNIT, NUnit, TestNG,
        //green is ok, red is not ok
    }

}
