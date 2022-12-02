package com.mycompany.granja;

public class Vaca extends Animal{
    //constructor
    public Vaca(int patas) {
        super(patas);
    }

    @Override
    public void hablar() { 
        System.out.println("La vaca dice muu");
    }

    @Override
    public void trabajo() {
        System.out.println("Tiene " + patas + " patas");
        System.out.println("Su trabajo es produce leche");
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
