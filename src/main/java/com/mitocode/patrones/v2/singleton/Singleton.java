package com.mitocode.patrones.v2.singleton;

public class Singleton {

    private static Singleton singleton;


    private Singleton(){}


    public static Singleton getInstance(){
        if(singleton == null){
            System.out.println("--Se crea por unica vez la instancia--");
            singleton = new Singleton();
        }else{
            System.out.println("--Ya existe una instancia creada--");
        }
        return singleton;
    }


    public static void main(String [] args){
        Singleton instancia = Singleton.getInstance();
        Singleton instancia_1 = Singleton.getInstance();
        Singleton instancia_2 = Singleton.getInstance();
        Singleton instancia_3 = Singleton.getInstance();


    }




}
