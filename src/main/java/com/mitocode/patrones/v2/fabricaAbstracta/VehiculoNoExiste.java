package com.mitocode.patrones.v2.fabricaAbstracta;

public class VehiculoNoExiste implements IDescripcionVehiculo{
    @Override
    public String getDescripcion() {
        return "NO EXISTE ESE VHICULO....";
    }
}
