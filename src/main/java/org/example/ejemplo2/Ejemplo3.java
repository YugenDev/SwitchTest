package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {

        Scanner entradaTeclado=new Scanner(System.in);

        Double temperaturaAmbiente;

        System.out.println("Digite la temperatura ambiente");
        temperaturaAmbiente = entradaTeclado.nextDouble();
        String temperaturaComoTexto=temperaturaAmbiente.toString();

        switch (temperaturaAmbiente) {

            case "30.0":
                temperaturaAmbiente=25.0;
                break;

            case "20.0":
                temperaturaAmbiente=25.0;
                break;

            case "40.0":
                temperaturaAmbiente=25.0;
                break;

            default:
                System.out.println("Usuario, por favor escoja una temperatura: ");
                temperaturaAmbiente=entradaTeclado.nextDouble();






        }



    }

}
