package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado= new Scanner(System.in);

        Double temperaturaAmbiente;

        System.out.println("Ingrese la temperatura ambiente actual: ");
        temperaturaAmbiente = entradaTeclado.nextDouble();

        if (temperaturaAmbiente == 30.0){

            temperaturaAmbiente = 25.0;


        } else if (temperaturaAmbiente == 20.0) {

            temperaturaAmbiente = 25.0;


        } else if (temperaturaAmbiente == 40.0) {

            temperaturaAmbiente = 20.0;


        } else {

            System.out.println("señor usuario, ¿que temperatura desea?");
            temperaturaAmbiente= entradaTeclado.nextDouble();

        }

        System.out.println("la temperatura ha sido satisfatoriamente nivelada a "+temperaturaAmbiente);




    }
}