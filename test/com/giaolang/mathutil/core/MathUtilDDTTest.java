/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
//class này sẽ chứa code để test code bên hàm mathutil
//1 test scrpit chứ nhiều test case

//Assert.assertEquals(200, 200); nhiều bad smell

//kĩ thuật viết tách test script mà tách data ra khỏi lệnh so sánh 

//- Parameterized: tham số hóa biến data ra một chỗ đặt chúng tên biến, tý nhồi chúng lại
//-DDT - data driven testing viết code kiểm thử theo style tách data

//để chơi với DDT, ta cần
//tách data ra 1 chỗ - mảng
//map 
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {{1,0} , {1, 1}, {2, 2} , {6, 3} , {24, 4}, {120, 5}, {720, 6} };
    }
    
    @Parameterized.Parameter(value = 0)
    public  long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //test thoi
    @Test
    public void testFactorial(){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
