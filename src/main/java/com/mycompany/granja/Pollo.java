package com.mycompany.granja;
public class Pollo extends Animal{
    //constructor
    public Pollo(int patas) {
        super(patas);
    }
    
    @Override
    public void hablar() {
        System.out.println("El pollo dice pio");
    }

    @Override
    public void trabajo() {
        System.out.println("Tiene " + patas + " patas");
        System.out.println("Su trabajo es poner huevos");
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
