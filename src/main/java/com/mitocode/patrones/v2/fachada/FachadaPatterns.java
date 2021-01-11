package com.mitocode.patrones.v2.fachada;

public class FachadaPatterns {

    private ImpNosis scoreNosis;


    public FachadaPatterns(){
        scoreNosis = new ImpNosis();
    }


    public String getEvaluarCliente(){
       return scoreNosis.getScoreNosis();
    }





}
