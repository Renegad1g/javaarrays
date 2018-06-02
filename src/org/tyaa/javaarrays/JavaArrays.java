/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaarrays;

import java.lang.reflect.Array;

/**
 *
 * @author Yurii
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*try{
            
            String s = null;
            s.getBytes();
            int x = 10 / 0;
            //int x = 10 / 2;
            System.out.println(x);
        } catch(ArithmeticException ex) {
        
            System.out.println("Деление на 0! (" + ex.getMessage() + ")");
            //ex.printStackTrace();
        } catch(Exception ex){
            
            System.out.println("Неизвестная ошибка");
        } finally {
        
            System.out.println("The end");
        }*/
        
        int[] intArray = {1, 4, -7, 0, 1};
        int[] intArray2 = new int[10];
        
        int[][] intArray3 = new int[10][10];
        
        int[][] intArray4 = new int[2][];
        intArray4[0] = new int[2];
        intArray4[1] = new int[3];
        
        intArray4[0][1] = 4;
        
        for (int[] is : intArray4) {
            
            for (int i : is) {
                System.out.println(i);
            }
        }
    }
    
}
