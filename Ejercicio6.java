package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int alumnos=0;
        float suma=0,media=0,cont=0;

        System.out.println("Cuantos alumnos tiene la clase? ");
        alumnos= entrada.nextInt();

        float 
        clase[]= new float[alumnos];
        //usamos un for para preguntar la nota de cada alumno, hacemos suma de los valores y el uso de un contador para hacer la media
        for (int i = 0; i < clase.length; i++) {
            //a la hora de introducir este dato usar la coma y no el punto para aportar decimales.
            System.out.println("Digame la nota del Alumno " +(i+1));
            clase[i]= entrada.nextFloat();
            suma+=clase[i];
            cont++;
        }
        media=suma/cont;

        System.out.println("La media de la clase es de: " +media);
        //con un for y un if buscamos los alumnos que superen la media y lo mostramos por pantalla

        for (int i = 0; i < clase.length; i++) {
            if(clase[i]> media){
                System.out.println("El alumno " +(i+1)+ " supera la nota media de la clase al tener un: " +clase[i]);
            }
        }

        entrada.close();

    }
    
}
