/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.entity;

import java.math.BigDecimal;

/**
 *
 * @author carlos.perez
 */
public class Simulacion {

    private Integer id;
    private BigDecimal deudaSimulada;
    private Integer scoreEstimado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getDeudaSimulada() {
        return deudaSimulada;
    }

    public void setDeudaSimulada(BigDecimal deudaSimulada) {
        this.deudaSimulada = deudaSimulada;
    }

    public Integer getScoreEstimado() {
        return scoreEstimado;
    }

    public void setScoreEstimado(Integer scoreEstimado) {
        this.scoreEstimado = scoreEstimado;
    }
}
