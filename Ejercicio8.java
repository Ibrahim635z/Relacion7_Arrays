package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
         int generador[]=new int [100];
         int valor1=0,valor2=0;
         
        //GENERAMOS LOS VALORES
         for (int i = 0; i < generador.length; i++) {
            generador[i]= (int) (Math.random()*20);
         }

         //LOS MOSTRAMOS POR PANTALLA

         for (int i = 0; i < generador.length; i++) {
            System.out.print(" " +generador[i]);   
         }

         //PEDIMOS LOS VALORES PARA SUSTITUIRLOS

         System.out.println("");
         System.out.println("Ingrese el primer valor");
         valor1=entrada.nextInt();
         System.out.println("Ingrese el segundo valor");
         valor2=entrada.nextInt();

        // SUSTITUIMOS LOS VALORES
         for (int i = 0; i < generador.length; i++) {
            if(generador[i]==valor1){
                generador[i]=valor2;
            }
         }
         //MOSTRAMOS POR PANTALLA LA MODIFICACION

         for (int i = 0; i < generador.length; i++) {
            System.out.print(" " +generador[i]);   
         }
         entrada.close();
    }
    
}
