package Relacion7_Arrays;

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
            int numeros[]=new int[20];
            int cuadrados[]=new int[20];
            int cubos[]=new int[20];

            //al ser del mismo tamaño los 3 arrays con el mismo for nos vale para generar los numeros y calcular los cuadrados y cubos de estos.

            for (int i = 0; i < numeros.length; i++) {
                numeros[i]=(int) (Math.random()*100);
                cuadrados[i]=(int) Math.pow(numeros[i], 2);
                cubos[i]=(int) Math.pow(numeros[i], 3);
            }

            System.out.println("NUMEROS    CUADRADOS      CUBOS");

            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]+ "         " +cuadrados[i]+ "           " +cubos[i]);
            }



        entrada.close();
    }
    
}
