/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    //Unit testing framework:
    //JUnit,TestNG(java)
    //xUnit,MSTest, NUnit (C#)
    //việc viết code để test code gọi là unit testing
    //đoạn code kiểm thử này đc gọi là: Test script
    //code dùng để test code gọi là test scrpit
    //test script sẽ sử dụng các test case
    //@Test //ra lệnh cho thư viện JUnit mình đã add tự động generate ra cái hàm main
    //biến hàm tryJUnitComparision thành hàm main
    //và gửi hàm main này cho jvm chạy
    //ko có @Test thì class ko có main ko chạy đc
    
    //Quy tắc xanh đỏ:
    //màu xanh khi tất cả các test case phải cùng là màu xanh, thức là expxpect == actual cho tất cả các tình huống test
    
    
    @Test
    public void tryJUnitComparision(){
        //hàm này thử nghiệm việc so sánh expect vs actual
        //Quy tắc định trước nằm ở @ - annotation
        
        Assert.assertEquals(200, 200);
        
    }

    @Test(expected = IllegalArgumentException.class)
    public void TesstFactorialGivenWrongArgumentReturnWell(){        
        MathUtil.getFactorial(-5);
        //Test case #2: n = 0, hy vọng hàm trả về 1
    }
    
    @Test
    public void TesstFactorialGivenRightArgumentReturnWell(){
        //tên hàm kiểm thử  tên hàm của test script phải nói lên ý nghĩa của việc kiểm thử
        //test case số 1: n = 0, hy vọng trả về 1, thực tế hàm trả về mấy ko bít
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));

        //Test case #2: n = 0, hy vọng hàm trả về 1
    }
}
