package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        String cadena[]=new String[4];
        int largo=0,longitud=0,maslargo=0;

        for (int i = 0; i < cadena.length; i++) {
            
            System.out.println("Ingrese la palabra de la posicion " +i+ " del array");
            cadena[i]=entrada.nextLine();
            longitud= cadena[i].length();

            if (longitud>largo){
                largo=cadena[i].length();
                maslargo=i;
            }
            
        }

        System.out.println("La palabra más larga que ha introducido es: " +cadena[maslargo]);

        entrada.close();

    }
}
