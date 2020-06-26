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
public class Nodo {
    
    private int valor;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo()
    {
        this.valor = -1;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public Nodo(int _valor, Nodo _anterior, Nodo _siguiente)
    {
        setValor(_valor);
        setAnterior(_anterior);
        setSiguiente(_siguiente);
    }
    
    public void setValor(int _valor)
    {
        this.valor = _valor;
    }
    
    public void setAnterior(Nodo _anterior)
    {
        this.anterior = _anterior;
    }
    
    public void setSiguiente(Nodo _siguiente)
    {
        this.siguiente = _siguiente;
    }
    
    public int getValor()
    {
        return this.valor;
    }
    
    public Nodo getAnterior()
    {
        return this.anterior;
    }
    
    public Nodo getSiguiente()
    {
        return this.siguiente;
    }
    
}
