/*
Ejercicio 02:
------------------------------------------------------
Elaborar un programa en java que permita mostrar
las estaciones del año (Primavera , Verano, Otoño, Invierno)
por rangos de mes, mostrar en pantalla.
-------------------------------------------------------
Fecha   : 30/10/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/
package com.Ejercicios.Tarea_01;
import java.util.Scanner;
public class Eje02_Estaciones
{
    public static void main(String[] args)
    {
        //Declaración de variables
        Scanner leer=new Scanner(System.in);
        String estacion="";

        //Mostrar en pantalla opciones de consulta
        System.out.println("-----CONOCE LOS MESES DE CADA ESTACIÓN -----");
        System.out.println("1.PRIMAVERA |2.VERANO |3.OTOÑO |4.INVIERNO");
        System.out.println("Ingresa la opción:");
        int opc= leer.nextInt();
        // Operación para mostrar rango de meses para estaciones del año.
        // Preguntar, como consistenciar el ingreso de datos..
        if (opc>0)
        {
            switch(opc)
            {
                case 1-> System.out.println("ESTACIÓN: PRIMAVERA " +
                        "\n(Desde el 23 de Setiembre al 21 de Diciembre)");

                case 2-> System.out.println("ESTACIÓN: VERANO " +
                        "\n(Desde el 21 de Diciembre al 20 de Marzo)");

                case 3-> System.out.println("ESTACIÓN:OTOÑO " +
                        "\n(Desde el 20 de Marzo al 21 de Junio)");

                case 4-> System.out.println("ESTACIÓN: INVIERNO" +
                        "\n(Desde el 21 de Junio al 23 de Setiembre)");

                default -> throw new IllegalStateException("¡Opción incorrecta!" +
                        "\n - Ingrese 1,2,3 ó 4 -");
            }
        }
        else
        {
            System.out.println("¡Opción incorrecta!.. Ingrese 1,2,3 ó 4 -");
        }

    }
}
