package com.mitocode.patrones.v2.prototype;

public class ImpAuto implements IntClonar{

    private String marca;
    private String modelo;
    private String tipoAuto;

    public ImpAuto(String marca, String modelo, String tipoAuto){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoAuto = tipoAuto;
    }


    @Override
    public IntClonar clonar()  {
        ImpAuto clonado = null;
        try {
            clonado = (ImpAuto) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    @Override
    public String toString() {
        return "ImpAuto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoAuto='" + tipoAuto + '\'' +
                '}';
    }
}
