package com.mitocode.patrones.v2.fabrica;

public class ImAuto implements IDescripcion{
    @Override
    public String descripcion() {
        String descripciion = "Motor: 1.6 ".concat("Marchas: 6 ").concat("Color: Blanco ");
        return descripciion;
    }
}
