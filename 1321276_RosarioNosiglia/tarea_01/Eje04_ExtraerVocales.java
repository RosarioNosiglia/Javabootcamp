/*
Ejercicio 04:
------------------------------------------------------
Elaborar un programa en java que permita convertir
un palabra o cadena de texto de minúsculas a mayúsculas
y que extraiga las vocales que se identifique dentro de la palabra
 o cadena de texto y mostrarlo en pantalla
-------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/
package com.Ejercicios.Tarea_01;
import java.util.Scanner;

public class Eje04_ExtraerVocales
{
    public static void main(String[] args)
    {
        //Declarar e inicializar variables
        Scanner leer=new Scanner(System.in);
        int CantVocal =0;


        //Ingresar cadena
        System.out.print("Ingresar texto: ");
        String cadena= leer.nextLine();

        // convertir minúsculas a mayúsculas
        cadena= cadena.toUpperCase();
        System.out.println("Se convierte a mayúsculas: "+cadena);

        // Contar tamaño del texto
        int longitud=cadena.length();
        System.out.println("El texto ingresado tiene :"+longitud+ " caracteres");

       //Extraer las vocales
        for(int i=0;i<longitud;i++)
        {
            char vocal=cadena.charAt(i);
            switch (vocal)
            {
                case 'A' -> System.out.print("A, ");
                case 'E' -> System.out.print("E , ");
                case 'I' -> System.out.print("I , ");
                case 'O' -> System.out.print("O , ");
                case 'U' -> System.out.print("U , ");

            }

        }






    }
}
