package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
            int generador[]=new int[20];
            int num=0;

            for (int i = 0; i < generador.length; i++) {
                generador[i]= (int) (Math.random()*400);
                System.out.print(" " +generador[i]);
             }

             System.out.println();
             System.out.println(" ¿que numeros quiere resaltar? (1-Multiplos de 5.  2-Multiplos de 7)");
             num=entrada.nextInt();

            
                for (int i = 0; i < generador.length; i++) {
                    if(generador[i]%5==0 && num==1){
                        System.out.print(" [" +generador[i]+ "]");
                    }else if(generador[i]%7==0 && num==2){
                        System.out.print(" [" +generador[i]+"]");
                    }else{
                        System.out.print(" " +generador[i]);
                    }
                }
             


         entrada.close();
    }
    
}
