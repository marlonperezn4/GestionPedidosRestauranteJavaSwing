/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionpedidos.logica;

/**
 *
 * @author Usuario
 */
public class Pedido {
    
    private String nombrePlato;
    private String categoria;
    private int cantidad;
    private String metodoEntrega;
    private String direccion;

    public Pedido(String nombrePlato, String categoria, int cantidad, String metodoEntrega, String direccion) {
        this.nombrePlato = nombrePlato;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.metodoEntrega = metodoEntrega;
        this.direccion = direccion;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMetodoEntrega() {
        return metodoEntrega;
    }

    public void setMetodoEntrega(String metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nombrePlato=" + nombrePlato + ", categoria=" + categoria + ", cantidad=" + cantidad + ", metodoEntrega=" + metodoEntrega + ", direccion=" + direccion + '}';
    }
    
    
    
}
