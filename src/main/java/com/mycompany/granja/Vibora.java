package com.mycompany.granja;

public class Vibora extends Animal{
    //constructor
    public Vibora(int patas) {
        super(patas);
    }
    
    @Override
    public void hablar() { 
        System.out.println("La vibora dice ssssh");
    }

    @Override
    public void trabajo() {
        System.out.println("Tiene " + patas + " patas");
        System.out.println("Su trabajo es exterminar ratones");
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
