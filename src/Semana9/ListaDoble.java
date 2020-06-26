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
public class ListaDoble {
    
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaDoble()
    {
        primero = ultimo = null;
        //primero = null;
        //ultimo = null;
    }
    
    public boolean estaVacia()
    {
        return primero == null;
    }
    
    public void agregarElemento(int _valor)
    {
        Nodo nuevo = new Nodo(_valor, null, null);
        
        if(estaVacia())
        {
            primero = nuevo;
            ultimo = nuevo;
        }else
        {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            
            ultimo = nuevo;
        }
        
        System.out.println("Nodo agregado!");      
    }
    
    public void imprimirLista()
    {
        if(estaVacia())
        {
            System.out.println("Lista vacia!");
            return;
        }
        
        Nodo actual = primero;
        
        do
        {
            System.out.printf("[ %d ] ", actual.getValor());
            actual = actual.getSiguiente();
        }while(actual != null);
        
        System.out.println("");
    
    }
    
    public void imprimirReversa()
    {
        if(estaVacia())
        {
            System.out.println("Lista vacia!");
            return;
        }
        
        Nodo actual = ultimo;
        
        do
        {
            System.out.printf("[ %d ] ", actual.getValor());
            actual = actual.getAnterior();
        }while(actual != null);
        
        System.out.println("");
        
    }
    
    public void eliminarElemento(int _valor)
    {
        if(estaVacia())
        {
            System.out.println("Imposible eliminar. Lista vacia!");
            return;
        }
        
        Nodo actual = primero;
        
        do
        {
            
            if(actual.getValor() == _valor)
            {
                
                if(actual == primero)
                {
                    primero = primero.getSiguiente();
                    primero.setAnterior(null);
                }else if(actual == ultimo)
                {
                    ultimo = ultimo.getAnterior();
                    ultimo.setSiguiente(null);
                }else
                {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());     
                }
                
                System.out.println("Nodo eliminado!");
                return;
            }
            
            actual = actual.getSiguiente();
            
        }while(actual != null);
        
        
    }
    
}
