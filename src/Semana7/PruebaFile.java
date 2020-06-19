/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

import java.io.File;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class PruebaFile {
    
    private String nombreArchivo;
    private File archivo;
    
    public PruebaFile(String _nombre)
    {
        nombreArchivo = _nombre;
        archivo = new File(nombreArchivo);
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }
    
    //Crear archivo o directorio
    public boolean creacion(int _opcion)
    { 
        switch(_opcion)
        {
            case 1:
                
                if(!archivo.isFile())
                {
                    try
                    {
                        archivo.createNewFile();
                        
                        if(archivo.exists())
                            return true;
                        
                        return false;
                        
                    }catch(Exception e)
                    {
                        System.out.println("Error al intentar crear el archivo: " + e.getMessage());
                        return false;
                    }       
                }else
                    System.out.println("Msg: Archivo ya existe!");
                break;
            case 2:
                
                if(!archivo.isDirectory())
                {
                    try
                    {
                        archivo.mkdir();
                        
                        if(archivo.exists())
                            return true;
                        
                        return false;
                        
                    }catch(Exception e)
                    {
                         System.out.println("Error al intentar crear el directorio: " + e.getMessage());
                        return false;
                    }
                }else
                    System.out.println("Msg: Directorio ya existe!");
                
                break;
                
            default:
                System.out.println("Opcion de creacion Archivo/Directorio incorrecta!");
                break;    
        }
        
        return false;
        
    }
    
    public void listar()
    {
        if(archivo.isDirectory())
        {
            String elementos[] = archivo.list();
            
            System.out.printf("Contenido en directorio %s%n", nombreArchivo);
            
            for(int i = 0; i < elementos.length; i++)
            {
                System.out.printf(">> %s%n", elementos[i]);
            }
            
        }else
            System.out.println("El nombre de objeto no es Directorio!");
            
    }
    
}
