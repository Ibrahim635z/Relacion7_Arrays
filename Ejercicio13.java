package Relacion7_Arrays;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String paises[]=new String[] {"España","Rusia","Japon","Australia"};
        int array[][]=new int[4][10];

        //GENERO LOS NUMEROS   
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int) (Math.random() *70+140);
            }
        }

        //FOR ANIDADOS PARA MOSTRAR LOS VALORES EN EL CUAL SE CALCULA LA MEDIA, MAXIMO Y MINIMO PARA CADA FILA Y LUEGO SE INICIALIZAN DE NUEVO
        int media=0,min=211,max=0,pos=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //ESTE IF ES PARA COLOCAR EL ARRAY DE PAISES, EL IF ELSE DE SU INTERIOR SON PURAMENTE ESTETICOAS PARA VISUALIZAR MEJOR LA TABLA
                if(j==0){
                    if(pos<3){
                        System.out.print(paises[pos]+ " :       " +array[i][j]+"     ");
                        pos++;
                    }else{
                        System.out.print(paises[pos]+ " :   " +array[i][j]+"     ");
                        pos++;
                    }
                    
                }else{
                System.out.print(array[i][j]+"     ");
                }
                media+=array[i][j];
                if(array[i][j]<min){
                    min=array[i][j];
                }
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
            media=media/10;
            System.out.print(" | " +media+ " "+min+ " "+max);
            System.out.println();
            media=0;
            min=210;
            max=0;
        }
        entrada.close();
    }
    
}
