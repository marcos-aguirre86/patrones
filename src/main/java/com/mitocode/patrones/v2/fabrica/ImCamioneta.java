package com.mitocode.patrones.v2.fabrica;

public class ImCamioneta implements IDescripcion{
    @Override
    public String descripcion() {
        String descripciion = "Motor: 2.8 ".concat("Marchas: 6 ").concat("Color: Negro ");
        return descripciion;
    }
}
