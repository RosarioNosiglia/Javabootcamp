package com.cajero.retiroCajero;

public class MiTarjeta
{

    //Atributos de la clase
    private Long nroTarjeta;
    private String nombre;
    private String apellido;
    private Double newSaldo;

    //Declaración constante
    /*Guardar en una constante el monto de saldo inicial :5500.88 soles
    y tipo de cambio 4 soles.*/

    private  Double saldoIncial;
    private  Double tipoCambio;


    //Constructor
    public MiTarjeta()
    {
        this.nroTarjeta=nroTarjeta;
        this.nombre=nombre;
        this.apellido=apellido;
        this.saldoIncial=0.0;
        this.tipoCambio=0.0;
        this.newSaldo=0.0;

    }


    //Método GET
    public Long getNroTarjeta()
    { return nroTarjeta;}

    public String getNombre()
    { return nombre;}

    public String getApellido()
    { return apellido;}

    public Double getNewSaldo()
    {return newSaldo;}

    public  Double getSaldoIncial()
    { return saldoIncial;}

    public  Double getTipoCambio()
    { return tipoCambio;}

    //Método SET
    public void setNroTarjeta(Long nroTarjeta)

    {this.nroTarjeta=nroTarjeta;}

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }

    public void setNewSaldo(Double newSaldo)
    { this.newSaldo=newSaldo;}



    //METODOS DE LA CLASE

    /*METODO: ValidarMontoSoles
    * Se valida si se tiene saldo para retiro en soles */

    public Boolean validarMontoSoles ( Double montoRetiro, Double saldoInicial)
    {
        /*- validar que no es negativo
          - Validar que es mayor a cero
          - Validar que el monto a retirar, no se pase del saldo de la tarjeta.
         */

        boolean a;

        if(montoRetiro>0 && montoRetiro<=saldoInicial)
        {
             a=true;
            System.out.println("\nOperación exitosa... ");



        }
        else if (montoRetiro>saldoInicial)
            {    a=false;
                System.out.println("\n Saldo insuficiente..");
            }
            else
            {
                a=false;
                System.out.println("\nMonto a retirar debe ser positivo..");
            }
        return a;

    }
    /*METODO: ValidarMontoDolares
     * Se valida si se tiene saldo para retiro en dólares */

    public Boolean validarMontoDolares ( Double montoRetiro, Double saldoInicial, Double tipoCambio)
    {
        /*- validar que no es negativo
          - Validar que es mayor a cero
          - Validar que el monto a retirar, no se pase del saldo de la tarjeta.
         */

        boolean a;

        if(montoRetiro>0 && (montoRetiro<=(saldoInicial*tipoCambio)))
        {
            a=true;
            System.out.println("\nOperación exitosa... ");
        }
        else if (montoRetiro>saldoInicial)
            {    a=false;
                 System.out.println("\n Saldo insuficiente..");
            }
            else
                {
                    a=false;
                    System.out.println("\nMonto a retirar debe ser positivo..");
                }
        return a;
    }


    // METODO: Retiro en soles
    public  Double retiroSoles(Double montoRetiro,  Double saldoInicial)
    {
        newSaldo=(saldoInicial-montoRetiro);
        System.out.println("El monto retirado es "+montoRetiro +" Soles");
        String n = String.valueOf(montoRetiro);
        System.out.println(convertirNroLetras.CantidadConLetra(n) +" 00/100 Soles");
        System.out.println("Saldo actual en cuenta,  es : "+newSaldo +" Soles");
        return newSaldo=0.0;
    }

    //METODO: Retiro en dólares
    public  Double retiroDolares (Double montoRetiroDol,  Double tipoCambio,  Double saldoInicial)
    {
        Double montoRetiro=(montoRetiroDol*tipoCambio);
        newSaldo = (saldoInicial - montoRetiro);
        System.out.println("El monto retirado es "+montoRetiroDol +"  Dólares");
        String n = String.valueOf(montoRetiroDol);
        System.out.println(convertirNroLetras.CantidadConLetra(n) +" con 00/100 Dólares");
        System.out.println("Saldo actual en cuenta,  es : "+newSaldo +" Soles");
        return newSaldo=0.0;
    }

}
