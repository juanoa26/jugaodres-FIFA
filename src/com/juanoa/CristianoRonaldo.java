package com.juanoa;

public class CristianoRonaldo extends JugadoresDeFutbol{

    @Override
    void correr(boolean tieneElBalon) {
        System.out.println("Cristiano corre mas rápido");
    }

    public static void main(String[] args) {
        CristianoRonaldo cr7 = new CristianoRonaldo();

        cr7.correr();
        cr7.correr(true);
        System.out.println(cr7.altura = 1.87);
        System.out.println(cr7.edad = 37);
    }
}
