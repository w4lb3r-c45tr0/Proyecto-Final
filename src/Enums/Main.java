package Enums;

import Enums.NivelAcceso;

public class Main {

    public static void main(String[] args) {

        NivelAcceso nivel = NivelAcceso.ADMIN;

        System.out.println("Nivel de acceso: " + nivel);

        if(nivel == NivelAcceso.ADMIN) {

            System.out.println("Acceso completo al sistema");
        }
    }
}