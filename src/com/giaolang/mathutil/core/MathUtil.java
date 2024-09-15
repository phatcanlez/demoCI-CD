/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author Admin
 */
//class tiện ích dùng chung về math
public class MathUtil {

    public static final double PI = 3.14159;

    public static long getFactorial(int n) {
//        ko tính số âm, ko tính 21! trở lên
        if (n < 0) {
            throw new IllegalArgumentException("invalid value");
        }
        long re = 1;
        for (int i = 1; i <= n; i++) {
            re *= i;
        }
        return re;
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false; // 0 và 1 không phải là số nguyên tố
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //TDD: Test driven development: là kĩ thuật lập trình/ áp dụng cho dân dev để
    //gia tăng chất lượng code, ý thức là driven
    //TDD yêu cầu khi viết code viết hàm phải viết lun các bộ kiểm thử test casse
    //sau khi có đc tên hàm (chỉ tên hàm mà thôi, ta viết lun các tình huống xài hàm
    //DDT: 
}
