package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
         int generador[]=new int [20];
         int pos_par=0,pos_impar=generador.length-1;

        //colocar los pares al principio y los impares al final desde atras
        
        for (int i = 0; i < generador.length; i++) {
            int num=(int) (Math.random()*100);
            if(num%2==0){
                generador[pos_par]=num;
                pos_par++;
            }else{
                generador[pos_impar]=num;
                pos_impar--;
                }
            }

                //mostrar por pantalla

        for (int j = 0; j < generador.length; j++) {
                System.out.print(" " +generador[j]);    
        }


         entrada.close();
    }
    
}
