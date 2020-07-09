/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tan.util;

/**
 *
 * @author Minh Tan
 */
//Class này chứa các hàm tiện ích hỗ trợ các phép tính toán
//hàm tiện ích hàm ý dùng chung cho mọi nơi
//do đó là dùng static
public class MathUtil {

    //hàm gia thừa N!= 1,2,3, .. bùng nổ kết quả nhenh
    //hàn tràn int(2 tỉ) sớm, ta trả về long cỡ 15!
    public static long computerFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
