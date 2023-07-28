package org.example.ejemplo2;

public class Ejemplo2 {


    public static void main(String[] args) {

        int variableALaQueLeMiroElEstado=10;
        switch (variableALaQueLeMiroElEstado){

            case 0:
                System.out.println("El camino se fue por el 0");
                break;

            case 10:
                System.out.println("El camino se fue por 10");
                break;


            case 100:
                System.out.println("El camino se fue por 100");
                break;

            default:
                System.out.println("El camino por defecto");
                System.out.println("No es ni 0 ni 10 ni 10");
                break;

        }


    }


}
