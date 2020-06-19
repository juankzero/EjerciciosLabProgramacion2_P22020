/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class PruebaLista {
    
    public static void main(String[] args) {
        
        ListaSimple lista = new ListaSimple();
        
        lista.agregarElemento("Alejandra");
        lista.agregarElemento("Dereck");
        lista.agregarElemento("Jose");
        lista.agregarElemento("Marcelo");
        lista.agregarElemento("Nicole");
        
        lista.imprimir();
        
        lista.eliminarElemento("Alejandra");
        
        lista.imprimir();
        
        lista.eliminarElemento("Marcelo");
        
        lista.imprimir();
        
        
    }
    
}
