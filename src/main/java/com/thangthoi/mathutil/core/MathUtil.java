/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thangthoi.mathutil.core;

/**
 *
 * @author thang
 */
public class MathUtil {
    
    public static void main(String[] args) {
        System.out.println(fibonanci(5) + " = 120");
    }
    
    public static long fibonanci(int n){
        //bắt ngoại lệ khi argument fail
        if(n < 0 || n >20){
            throw new IllegalArgumentException("Had Fail! Please check again.");
        }
        //chặn dưới để cho hàm dừng lại khi là 0! và 1!
        if(n == 0 || n == 1){
            return 1;
        }
        //tính giai thừa theo đệ quy
        return n * fibonanci(n-1);
    }
    
}
