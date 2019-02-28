/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author mariajose
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(String.format("El factorial de 3 es %d",factorial(3)));
	System.out.println(String.format("El factorial de 7 es %d",factorial(7)));
	System.out.println(String.format("El factorial de 35 es %d",factorial(35)));
       
    }
    
    public static int factorial(int numero){
    int fac=1;   
    while(numero!=0){
    fac=fac*numero;
    numero--;
    
    }
    return fac;
}
    
}
