package com.mitocode.patrones.v2.prototype;

public class App {

    public static void main(String [] args){
        ImpAuto autoOriginal = new ImpAuto("Ford","2009","Sedan");
        System.out.println("Auto original".concat(autoOriginal.toString()));
        ImpAuto autoClonado = (ImpAuto) autoOriginal.clonar();
        autoClonado.setMarca("Nisan");
        System.out.println("Auto clonado".concat(autoClonado.toString()));

    }


}
