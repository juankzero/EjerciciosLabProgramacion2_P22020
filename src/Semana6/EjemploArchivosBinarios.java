/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

import java.io.File;
import java.io.RandomAccessFile;
import jdk.management.resource.internal.inst.RandomAccessFileRMHooks;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class EjemploArchivosBinarios {
    
    private static RandomAccessFile binaryFile;
    private static File file = new File("empleados.dat");
    
    //empleados.bin
    //empleados.dat
    //empleados.txt
    
    public static void main(String[] args) {
        
        /*
        addEmployee(1000, "Ramiro Eustaquio", 1200);
        addEmployee(1001, "Maria Lopez", 1800);
        addEmployee(1002, "Allan Brito", 900);
        addEmployee(1003, "Manolo Valle", 2500);*/
        
        readEmployees();
        
        modifySalary(1002, 1500);
        
        readEmployees();
        
    }
    
    public static void addEmployee(int code, String name, double salary)
    {
        
        try
        {
            binaryFile = new RandomAccessFile(file, "rw");
            
            //nos ubicamos al final del archivo
            binaryFile.seek(binaryFile.length());
            
            binaryFile.writeInt(code);
            binaryFile.writeUTF(name);
            binaryFile.writeDouble(salary);
            
            binaryFile.close();
            
            System.out.println("Empleado Almacenado");
            
            
        }catch(Exception e)
        {
            System.out.printf("Error al intentar crear/abrir el archivo %s%n", file.getName());
        }
        
    }
    
    public static void readEmployees()
    {
        try
        {
            binaryFile = new RandomAccessFile(file, "r");
            
            //ubicarse al inicio del archivo
            binaryFile.seek(0);
            
            while( binaryFile.getFilePointer() < binaryFile.length() )
            {
                int code = binaryFile.readInt();
                String name = binaryFile.readUTF();
                double salary = binaryFile.readDouble();
                
                System.out.printf("Employee { code: %d, name: %s, salary: %f }%n", 
                        code, name, salary);
            }
            
            binaryFile.close();
            
            
        }catch(Exception e)
        {
            System.out.printf("Error al intentar crear/abrir el archivo %s%n", file.getName());
        }
        
    }
    
    public static void modifySalary(int code, double salary)
    {
        try
        {
            
            binaryFile = new RandomAccessFile(file, "rw");
            
            binaryFile.seek(0);
            
            while(binaryFile.getFilePointer() < binaryFile.length())
            {
                int _code = binaryFile.readInt();
                String _name = binaryFile.readUTF();
                
                if(_code == code)
                {
                    binaryFile.writeDouble(salary);
                    binaryFile.close();
                    
                    System.out.println("Registro modificado");
                    return;
                }else
                    binaryFile.readDouble();    
            }
            
            System.out.println("El registro no fue encontrado");
            
        }catch(Exception e)
        {
            System.out.printf("Error al intentar crear/abrir el archivo %s%n", file.getName());
        }
    }
}
