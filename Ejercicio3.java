package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String palabras[]= new String[5];
        char caracter=' ';
        int cont=0;

        //con un bucle for solicitamos todos los valores del array
        for (int i = 0; i < palabras.length; i++) {

            System.out.println("Introduzca la palabra "     +(i+1)+     " (son 5):");
            palabras[i]=entrada.nextLine();
        }
        System.out.println("Introduzca el caracter que desea comprobar:");
        caracter=entrada.nextLine().charAt(0);
        //con el bucle for recorremos todo el array para comprobar cuales empiezan por ese caracter
        // uso un contador para mas adelanta si ese contador tiene valor 0 que muestre por pantalla que no hay ninguna palabra que empieze por el caracter
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].charAt(0) == caracter){
                System.out.println(palabras[i]);
                cont++;
            }
        }

        if(cont == 0){
            System.out.println("No existe ninguna palabra que haya introducido que empieze por la letra: " +caracter  );
        }

        entrada.close();
    }
    
}
