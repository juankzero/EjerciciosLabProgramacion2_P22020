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
public class ListaSimple {
    
    private Nodo primero;
    
    public ListaSimple()
    {
        primero = null;
    }
    
    public boolean estaVacia()
    {
        return primero == null;
    }
    
    public void agregarElemento(String _nombre)
    {
        Nodo nuevo = new Nodo(_nombre, null);
        
        if(estaVacia())
        {
            primero = nuevo;
        }else
        {
            Nodo actual = primero;
            
            while(actual.getSiguiente() != null)
            {
                actual = actual.getSiguiente();
            }
            
            actual.setSiguiente(nuevo);          
        }
        
        System.out.println("Nodo agregado!");
        
    }
    
    public void imprimir()
    {
    
        if(estaVacia())
        {
            System.out.println("Lista vacia");
            return;
        }
        
        Nodo actual = primero;
        
        while(actual != null)
        {
            System.out.printf("[ %s ] ", actual.getNombre());
            actual = actual.getSiguiente();
        }
        
        System.out.println("");
    
    }
    
    public void eliminarElemento(String _nombre)
    {
        
        if(estaVacia())
        {
            System.out.println("Imposible Eliminar. Lista Vacia");
            return;
        }
        
        Nodo actual = primero;
        Nodo anterior = null;
              
        while(actual.getSiguiente() != null)
        {
            
            if( actual.getNombre().equals(_nombre) )
            {
                
                if(actual == primero)
                    primero = primero.getSiguiente();
                else
                    anterior.setSiguiente(actual.getSiguiente());
                
                System.out.println("Nodo Eliminado!");
                return;
                            
            }else
            {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            
            
        }
    
    }
    
}
