package com.mycompany.granja;

import java.util.Random;

public class Granja {

    enum Animales {
        PATO,
        POLLO,
        VACA,
        VIBORA;
    }

    public static void main(String[] args) {
        Random ale = new Random();
        int num;

        //este vector almacenas animales
        Animal animales[] = new Animal[15];

        //crear sin enum
//        for (int i = 0; i < animales.length; i++) {
//            num = ale.nextInt(4);
//            //para elegir el animal que se creara depemdiendo del numero aleatorio que toque
//            switch (num) {
//                case 0:
//                    animales[i] = new Vaca(4);
//                    break;
//                case 1:
//                    animales[i] = new Pato(2);
//                    break;
//                case 2:
//                    animales[i] = new Pollo(2);
//                    break;
//                case 3:
//                    animales[i] = new Vibora(0);
//                    break;
//                default:
//                    break;
//            }
//        }
        //crear con enum
        for (int i = 0; i < animales.length; i++) {
            Animales ani = tipoAnimal(ale.nextInt(4));
            //para elegir el animal que se creara depemdiendo del numero aleatorio que toque
            switch (ani) {
                case VACA:
                    animales[i] = new Vaca(4);
                    break;
                case PATO:
                    animales[i] = new Pato(2);
                    break;
                case POLLO:
                    animales[i] = new Pollo(2);
                    break;
                case VIBORA:
                    animales[i] = new Vibora(0);
                    break;
                default:
                    break;
            }
        }
        //muestra los animales, como hablan y su trabajo
        for (int i = 0; i < animales.length; i++) {
            animales[i].hablar();
            animales[i].trabajo();
            System.out.println("\n");
        }
    }

    public static Animales tipoAnimal(int num) {
        Animales ani = Animales.VACA;
        switch (num) {
            case 0:
                ani = Animales.VACA;
                break;
            case 1:
                ani = Animales.PATO;
                break;
            case 2:
                ani = Animales.POLLO;
                break;
            case 3:
                ani = Animales.VIBORA;
                break;
        }
        return ani;
    }
}
