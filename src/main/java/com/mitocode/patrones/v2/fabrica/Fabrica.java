package com.mitocode.patrones.v2.fabrica;

public class Fabrica {

    public IDescripcion getVehiculo(String identificador){
        if(identificador.equals("AUTO")){
            return new ImAuto();
        }
        if(identificador.equals("CAMION")){
            return new ImCamion();
        }
        if(identificador.equals("CAMIONETA")){
            return new ImCamioneta();
        }
        return new ImSinCoincidencia();
    }
}
