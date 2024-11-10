package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int tamaño1=0,tamaño2=0;
        //ya que los array pueden ser de distinto tamaño preguntamos al usuario que tamaño tendra cada uno
        System.out.println("Ingrese el tamaño del primer Array: ");
        tamaño1=entrada.nextInt();
        System.out.println("Ingrese el tamaño del segundo Array");
        tamaño2=entrada.nextInt();

        int array1 []= new int [tamaño1];
        int array2 []= new int [tamaño2];
        int tamaño3=0;
        //en esta parte comprobamos cual es el arra mas grande para que el array de salida sea de ese tamaño
        if (tamaño1 < tamaño2) {
            tamaño3 = tamaño2;
        } else if (tamaño1 > tamaño2) {
            tamaño3 = tamaño1;
        } else {
            tamaño3 = tamaño1; 
        }

        int array_final [] = new int [tamaño3];

        // con un for para cada array solicitamos los valores que tendran
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca el valor de la posicion " +(i+1)+ " del primer Array");
            array1[i]= entrada.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Introduzca el valor de la posicion " +(i+1)+ " del Segundo Array");
            array2[i]= entrada.nextInt();
        }
        //ahora procedemos a comparar los valores en cada posicion usando un bucle for y guardarlos en el array final
        for (int i = 0; i < array_final.length; i++) {
            if (array1[i] < array2[i]){
                array_final[i]= array2[i];
            }else{
                array_final[i]= array1[i];
            }

            System.out.println(array_final[i]);
        }

    


        entrada.close();

    }
    
}
