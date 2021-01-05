package com.mitocode.patrones.v2.fabricaAbstracta;

public class App {

    public static void main(String [] args){
        AbstractFactory camion = FactoryProducer.getFactory("camion");
            IDescripcionVehiculo descCamion = camion.getVehiculo("IVECO");
            System.out.println(descCamion.getDescripcion());

        AbstractFactory auto = FactoryProducer.getFactory("auto");
            IDescripcionVehiculo descAuto = auto.getVehiculo("NISAN");
            System.out.println(descAuto.getDescripcion());
    }


}
