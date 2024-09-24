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
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
