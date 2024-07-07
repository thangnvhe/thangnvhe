/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thangthoi.mathutil.test;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
//import static là dành riêng cho các hàm static mà không cần phải gọi tên lớp.
import com.thangthoi.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



/**
 *
 * @author thang
 */

public class MathUtilTest {
    
    public static Stream<Arguments> initData() {
        return Stream.of(
            new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
            }
        ).map(Arguments::of);
    }

    @ParameterizedTest
    @MethodSource("initData")
    void testFactorial(int input, int expected) {
        assertEquals(expected, MathUtil.fibonanci(input));
    }
    
    @Test
    public void TestException(){
        //xài biểu thức lamda
        //hàm nhận tham số thứ 2 là một Object có code implement từ funtional interface tên là Excutable có 1 hàm code execute()
        Executable exObject = new Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtil.fibonanci(-5);
            }
        };
        
        Executable exc = () -> MathUtil.fibonanci(22);
        
        assertThrows(IllegalArgumentException.class, exc);
        assertThrows(IllegalArgumentException.class, exObject);
    }
}
