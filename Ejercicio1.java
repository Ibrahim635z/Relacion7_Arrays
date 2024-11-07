package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int listado[]=new int[5];
        int numerito,cont=0;

        for (int i = 0; i < listado.length; i++) {
            
            System.out.println("Ingrese el numero de la posicion " +i+ " del array");
            listado[i]=entrada.nextInt();
        }

        System.out.println("Ingrese el numero que desea saber las veces que se repite");
        numerito=entrada.nextInt();


        for (int j = 0; j < listado.length; j++) {
            
            if(listado[j]==numerito){
                cont++;
            }
        }


        System.out.println("El numero " +numerito+ " se repite " +cont+ " veces");



        entrada.close();
    }
    
}
