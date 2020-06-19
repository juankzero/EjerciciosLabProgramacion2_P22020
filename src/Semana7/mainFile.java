/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;
import java.util.Scanner;


/**
 *
 * @author Juan Carlos Zepeda
 */
public class mainFile {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("*** P R U E B A  D E  A R C H I V O S / D I R E C T O R I O S ***");
        
        System.out.print("Seleccione opcion a crear: \n1. Crear Archivo/Directorio\n2. Listar Directorio\n"
                + "Opcion: ");
        int opcion = leer.nextInt();
        
        System.out.print("Ingrese nombre de objeto: ");
        String nombreObj = leer.next();
        
        PruebaFile obj = new PruebaFile(nombreObj);
        
        if(opcion == 1)
        {
            System.out.print("Ingrese 1 para Archivo y 2 Directorio: ");
            int opcionArchivo = leer.nextInt();
            
            if(obj.creacion(opcionArchivo))
                System.out.println("Archivo/Directorio creado correctamente!");
            else
                System.out.println("Imposible crear Archivo/Directorio!");
        }else
        {
            obj.listar();
        }
        
    }
    
}
