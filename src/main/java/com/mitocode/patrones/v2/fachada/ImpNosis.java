package com.mitocode.patrones.v2.fachada;

public class ImpNosis implements IntNosis{
    @Override
    public String getScoreNosis() {
        String descripcion = "Score: 780 ".concat("Nombre: Marcos");
        return descripcion;
    }
}
