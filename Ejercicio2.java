package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        String cadena[]=new String[4];
        int largo=0,longitud=0,maslargo=0;
        //uso un bucle for para pedir todos los valores de array
        for (int i = 0; i < cadena.length; i++) {
            
            System.out.println("Ingrese la palabra de la posicion " +(i+1)+ " del array (son 4)");
            cadena[i]=entrada.nextLine();
            longitud= cadena[i].length();
            // con este if vamos guardando el valor de la posicion de la palabra mas larga en cada momento para mostrarla por pantalla al final del programa
            if (longitud>largo){
                largo=cadena[i].length();
                maslargo=i;
            }
            
        }

        System.out.println("La palabra más larga que ha introducido es: " +cadena[maslargo]);

        entrada.close();

    }
}
