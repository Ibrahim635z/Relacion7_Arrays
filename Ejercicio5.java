package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int array1 []=new int [10];
        int suma_pos=0 , suma_neg=0,media_pos=0,media_neg=0,cont_neg=0,cont_pos=0;
        //usamos un for para pedir los valores
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca el valor " +(i+1)+ " del Array");
            array1[i]=entrada.nextInt();
            //vamos a considerar el valor 0 como positivo. 
            if (array1[i] >= 0){
                suma_pos+=array1[i];
                cont_pos++;
            } else{
                suma_neg+=array1[i];
                cont_neg++;
            }
        }
        //calculamos la media de ambos con la ayuda de los contadores y la suma de todos los elementos positivos y negativos del array
        media_pos=suma_pos/cont_pos;
        media_neg=suma_neg/cont_neg;
        
        System.out.println("La media de los numeros positivos introducidos es: " +media_pos);
        System.out.println("La media de los numeros negativos introducidos es: " +media_neg);

        entrada.close();

    }
    
}
