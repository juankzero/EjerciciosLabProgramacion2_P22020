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
public class Nodo {
    
    private String nombre;
    private Nodo siguiente;
    
    public Nodo()
    {
        this.nombre = "ND";
        this.siguiente = null;
    }
    
    public Nodo(String _nombre, Nodo _siguiente)
    {
        setNombre(_nombre);
        setSiguiente(_siguiente);
    }
    
    public void setNombre(String _nombre)
    {
        this.nombre = _nombre;
    }
    
    public void setSiguiente(Nodo _siguiente)
    {
        this.siguiente = _siguiente;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public Nodo getSiguiente()
    {
        return this.siguiente;
    }
}
