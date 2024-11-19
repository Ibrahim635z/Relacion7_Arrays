package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int generador[][]=new int[4][5];
        
        for (int fila = 0; fila < generador.length; fila++) {
            for (int columna = 0; columna < generador[fila].length; columna++) {
                System.out.print("Ingrese el valor ["+fila+"]"+"["+columna+"]: ");
                generador[fila][columna]=entrada.nextInt();
            }
        }
        
        int suma_fila=0;


        for (int fila = 0; fila < generador.length; fila++) {
            for (int columna = 0; columna < generador[fila].length; columna++) {
              
                System.out.print("    " +generador[fila][columna]);
                suma_fila+=generador[fila][columna];
                
            }
           
            System.out.println("   Suma fila"+fila+":"+suma_fila);
            suma_fila=0;
            System.out.println();
        }
        
        System.out.println();
     
        entrada.close();
    }
    
}
