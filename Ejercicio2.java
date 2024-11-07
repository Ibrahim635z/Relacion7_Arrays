package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        String cadena[]=new String[4];
        String supercadena[]={"mas","cuando","reflexion","piramide"};

        for (int i = 0; i < cadena.length; i++) {
            
            System.out.println("Ingrese la frase de la posicion " +i+ " del array");
            cadena[i]=entrada.nextLine();
            cadena[i]+=supercadena[i];
        }

        for (int j = 0; j < cadena.length; j++) {
            System.out.println(cadena[j]);
        }

        




        entrada.close();

    }
}
