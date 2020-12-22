package com.mitocode.patrones.v2.fabrica;

public class ImCamion implements IDescripcion{
    @Override
    public String descripcion() {
        String descripciion = "Motor: 1114 ".concat("Marchas: 8 ").concat("Color: Rojo ");
        return descripciion;
    }
}
