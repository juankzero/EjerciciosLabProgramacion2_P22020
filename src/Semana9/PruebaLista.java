/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana9;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class PruebaLista {
    
    public static void main(String[] args) {
        
        ListaDoble lista = new ListaDoble();
        
        lista.agregarElemento(4);
        lista.agregarElemento(3);
        lista.agregarElemento(6);
        lista.agregarElemento(1);
        lista.agregarElemento(5);
        lista.agregarElemento(7);
        
        lista.imprimirLista();
        lista.imprimirReversa();
        
        lista.eliminarElemento(6);
        
        lista.imprimirLista();
        
        lista.eliminarElemento(7);
        
        lista.imprimirLista();
        
        lista.eliminarElemento(4);
        
        lista.imprimirLista();
        lista.imprimirReversa();
        
        
    }
    
}
