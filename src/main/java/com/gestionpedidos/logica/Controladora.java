/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionpedidos.logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Controladora {
    public static List<Pedido> listaPedidos = new ArrayList<>();

    public void guardarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }
    
    public List<Pedido> traerPedidos(){
        return listaPedidos;
    }
    
    public void eliminarPedido(int indice){
    listaPedidos.remove(indice);
    }
}
