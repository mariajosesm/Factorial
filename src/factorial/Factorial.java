/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
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
        Scanner pedir=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num=pedir.nextInt();
        if(num>=0 && num<=100){
        System.out.println(String.format("El factorial del numero es: %d",factorial(num)));
        }
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
