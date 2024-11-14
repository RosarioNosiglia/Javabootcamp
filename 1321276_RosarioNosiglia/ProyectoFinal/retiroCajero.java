/*
Proyecto Final - Programa que simule cajero Automático:
--------------------------------------------------------------------------------------------------------------
1.  Pedir el numero de tarjeta y validar que sea numerico y de 16 numeros y pedir el nombre y apellido.
2.  Guardar en una constante el monto de saldo inicial :5500.88 soles y tipo de cambio 4 soles.
3.  Solicitar moneda de retiro  1 soles o 2 dolares.
4.  Solicitar monto a retirar y validar que no sea negativo y mayor a cero y no
    debe pasar el saldo de tarjeta y realizar la conversion si piden dolares y
    restar el saldo
5.  Luego de confirmar el retiro deben de imprimir el por pantalla el monto
    retirado y el monto en letras (ejemplo si retira 1000 deber mostrar: mil con
    ceros soles) y montrar el saldo y fecha y hora de transaccion
---------------------------------------------------------------------------------------------------------------
Fecha   : 10/11/2024
Asociado: 1321276 - Rosario Del Pilar Nosiglia Zegarra
*/



package com.cajero.retiroCajero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Scanner;



public class retiroCajero {


    //Programa principal
    public static void main(String[] args) {

        /*2.  Guardar en una constante el monto de saldo inicial :5500.88 soles y tipo de cambio 4 soles. */
        final Double tipoCambio = 4.0;
        final Double saldoInicial = 5500.88;
        Double newSaldo = 0.0;


        //Instanciar clases
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        MiTarjeta miTarjeta = new MiTarjeta();
        convertirNroLetras letras = new convertirNroLetras();
        Scanner leer = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long tarjeta = null;
        int opc = 0;






        /*1. Pedir el numero de tarjeta y validar que sea numerico
        y de 16 numeros y pedir el nombre y apellido*/

        System.out.println("---------------------------------------------");
        System.out.println("**************CAJERO AUTOMÁTICO**************");
        System.out.println("---------------------------------------------");
        try {
            System.out.println("Ingrese Nro de Tarjeta (16 dígitos): ");
            String s = br.readLine();
            if (s.length() == 16) {
                tarjeta = Long.parseLong(s);

                System.out.println("Ingrese Nombre: ");
                String nombre = leer.nextLine();

                System.out.println("Ingrese Apellidos: ");
                String apellido = leer.nextLine();

                /*3.  Solicitar moneda de retiro  1 soles o 2 dolares.*/
                System.out.println("----------------------------------------------------");
                System.out.println("Por favor indicar el tipo de moneda, para realizar el retiro.\n" +
                        "           1.Soles  || 2.Dólares");
                opc = Integer.parseInt(leer.nextLine());
                System.out.println("Monto a retirar: ");
                Double montoRetiro = leer.nextDouble();

                /*4.  Solicitar monto a retirar y validar que no sea negativo y mayor a cero y no
                   debe pasar el saldo de tarjeta y realizar la conversion si piden dolares y
                   restar el saldo */

                if (opc == 1) {
                    miTarjeta.validarMontoSoles(montoRetiro, saldoInicial);
                } else {
                    miTarjeta.validarMontoDolares(montoRetiro, saldoInicial, tipoCambio);
                }

                /*5.  Luego de confirmar el retiro deben de imprimir el por pantalla el monto
                      retirado y el monto en letras y montrar el saldo y fecha y hora de transaccion */

                switch (opc) {
                    case 1 -> miTarjeta.retiroSoles(montoRetiro, saldoInicial);
                    case 2 -> miTarjeta.retiroDolares(montoRetiro, tipoCambio, saldoInicial);
                    default -> System.out.println("Opción no válida");
                }
                System.out.println("Fecha de transacción: " + zonedDateTime);


            } else {
                System.out.println("Tarjeta inválida, debe ingresar 16 dígitos..");
            }
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Solo ingrese números...");
        }
    }

}




