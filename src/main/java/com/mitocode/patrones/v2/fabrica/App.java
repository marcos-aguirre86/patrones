package com.mitocode.patrones.v2.fabrica;

public class App {

    public static void main(String [] args){
        Fabrica fabrica = new Fabrica();

        IDescripcion auto = fabrica.getVehiculo("AUTO");
        System.out.println(auto.descripcion());
        IDescripcion camion = fabrica.getVehiculo("CAMION");
        System.out.println(camion.descripcion());
        IDescripcion camioneta = fabrica.getVehiculo("CAMIONETA");
        System.out.println(camioneta.descripcion());
        IDescripcion camionetas = fabrica.getVehiculo("CAMIONETASS");
        System.out.println(camionetas.descripcion());
    }
}
