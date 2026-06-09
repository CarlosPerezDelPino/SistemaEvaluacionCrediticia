/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaevaluacioncrediticia.model.entity;

import java.time.LocalDateTime;

/**
 *
 * @author carlos.perez
 */
public class Historial {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPuntajeAnterior() {
        return puntajeAnterior;
    }

    public void setPuntajeAnterior(Integer puntajeAnterior) {
        this.puntajeAnterior = puntajeAnterior;
    }

    public Integer getPuntajeNuevo() {
        return puntajeNuevo;
    }

    public void setPuntajeNuevo(Integer puntajeNuevo) {
        this.puntajeNuevo = puntajeNuevo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    private Integer id;
    private Integer puntajeAnterior;
    private Integer puntajeNuevo;
    private LocalDateTime fecha;
}
