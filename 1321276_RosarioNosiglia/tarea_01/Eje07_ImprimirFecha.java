/*
Ejercicio 07:
------------------------------------------------------
Imprimir el día de una fecha cualquiera.
-------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/

package com.Ejercicios.Tarea_01;


import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
import java.time.DayOfWeek;



public class Eje07_ImprimirFecha
{


    public static void main(String[] args)
    {
        //Declaración de variables
        Scanner leer =new Scanner(System.in);

        //Ingresar fecha
        System.out.println("Ingresar fecha YYYY-MM-DD: " );
        String fecha= leer.nextLine();

        //Toma el input, como fecha.
        LocalDate mostrarDia = LocalDate.parse(fecha);

        //Extrae el día en español

        //System.out.println(mostrarDia.getDayOfWeek()); --Muestra el día en inglés
        DayOfWeek diaES=mostrarDia.getDayOfWeek();
        System.out.println("El día es,"+diaES.getDisplayName(TextStyle.FULL,Locale.of("es","ES")));
    }
}
