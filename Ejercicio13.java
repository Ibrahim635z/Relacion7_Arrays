package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String paises[]=new String[] {"España","Rusia","Japon","Australia"};
        int array[][]=new int[4][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int) (Math.random() *70+140);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"     ");
            }
            System.out.println();
        }
        entrada.close();
    }
    
}
