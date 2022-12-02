package com.mycompany.granja;

public class Pato extends Animal{
    //constructor
    public Pato(int patas) {
        super(patas);
    }
    
    @Override
    public void hablar() {
        System.out.println("El pato dice cua");
    }

    @Override
    public void trabajo() {
        System.out.println("Tiene " + patas + " patas");
        System.out.println("Su trabajo es ");
    }

    @Override
    public int getPatas() {
        return patas;
    }

    @Override
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
