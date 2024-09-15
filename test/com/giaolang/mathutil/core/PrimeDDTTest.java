/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class PrimeDDTTest {
    
    @Before
    public void setup(){
        System.out.println("Test with DDT Prime");
    }
    
     @Parameterized.Parameters
    public static Collection<Object[]> initData() {
        return Arrays.asList(new Object[][] {
            { false, 0 },    // 0 không phải là số nguyên tố
            { false, 1 },    // 1 không phải là số nguyên tố
            { true, 2 },     // 2 là số nguyên tố
            { true, 3 },     // 3 là số nguyên tố
            { false, 4 },    // 4 không phải là số nguyên tố
            { true, 5 },     // 5 là số nguyên tố
            { false, 9 },    // 9 không phải là số nguyên tố
            { true, 11 },    // 11 là số nguyên tố
            { false, 15 },   // 15 không phải là số nguyên tố
            { true, 17 },    // 17 là số nguyên tố
            { true, 29 },    // 29 là số nguyên tố
            { false, 100 }   // 100 không phải là số nguyên tố
        });
    }

    // Biến tham số
    @Parameterized.Parameter(value = 0)
    public boolean expected;

    @Parameterized.Parameter(value = 1)
    public int n;

    // Hàm test sử dụng tham số
    @Test
    public void testCheckPrime() {
        assertEquals(expected, MathUtil.checkPrime(n));
        System.out.println(expected + " act: " + n);
    }
}
