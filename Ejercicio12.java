package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int generador[][]=new int[4][5];

        //Pedir los valores del array bidimensional
        for (int fila = 0; fila < generador.length; fila++) {
            for (int columna = 0; columna < generador[fila].length; columna++) {
                System.out.print("Ingrese el valor ["+fila+"]"+"["+columna+"]: ");
                generador[fila][columna]=entrada.nextInt();
            }
        }
        
        int suma_fila=0;

        //mostrarlo por pantalla con la suma de sus filas

        for (int fila = 0; fila < generador.length; fila++) {
            for (int columna = 0; columna < generador[fila].length; columna++) {
              
                System.out.print("            " +generador[fila][columna]);
                suma_fila+=generador[fila][columna];
                
            }
           
            System.out.println("         Suma fila"+fila+":"+suma_fila);
            suma_fila=0;
            System.out.println();
        }
        
        System.out.println();

        int suma_colum[]=new int[5];
        

        for (int columna = 0; columna < 5; columna++) {
            for (int fila = 0; fila < generador.length; fila++) {
                
                suma_colum[columna]+=generador[fila][columna];
                
            }
           
          
           System.out.print("Sum Colum"+columna+": " +suma_colum[columna]+ " |");
           
        }        



     
        entrada.close();
    }
    
}