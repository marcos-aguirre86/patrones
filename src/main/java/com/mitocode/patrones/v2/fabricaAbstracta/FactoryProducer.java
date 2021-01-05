package com.mitocode.patrones.v2.fabricaAbstracta;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory){
        AbstractFactory factoryAbstract = null;
            if(factory.equalsIgnoreCase("camion")){
                factoryAbstract = new CamionFactory();
            }
            if(factory.equalsIgnoreCase("auto")){
                factoryAbstract = new AutoFactory();
            }

        return factoryAbstract;
    }
}
