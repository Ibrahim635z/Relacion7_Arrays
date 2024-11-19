package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);

        int num[][]={{0,30,2,0,0,5},{75,0,0,0,0,0},{0,0,-2,9,0,11}};
        
        System.out.println("Array num  Columna0  Columna1  Columna2  Columna3  Columna4  Columna5");
        
        for (int fila = 0; fila < num.length; fila++) {
            
            System.out.print("Fila " +fila+ "  ");
            for (int columna = 0; columna < num[fila].length; columna++) {
               
                System.out.print("        "+num[fila][columna]);
            }
            System.out.println();
        }
           

        entrada.close();
    }
    
}
