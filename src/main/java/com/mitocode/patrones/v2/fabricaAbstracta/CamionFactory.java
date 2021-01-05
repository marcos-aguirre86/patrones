package com.mitocode.patrones.v2.fabricaAbstracta;

public class CamionFactory extends AbstractFactory{
    @Override
    public IDescripcionVehiculo getVehiculo(String codigo) {
        IDescripcionVehiculo vehiculo = null;
        if(codigo != null && !codigo.isEmpty()){
            if(codigo.equalsIgnoreCase("IVECO")){
                vehiculo = new CamionIveco();
            }
            if(codigo.equalsIgnoreCase("FORD")){
                vehiculo = new VehiculoNoExiste();
            }
        }else{
            vehiculo = new VehiculoNoExiste();
        }
        return vehiculo;
    }
}

