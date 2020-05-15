/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class FileSystem {
    
    public static void main(String[] args) {
        
        Directory raiz = new Directory("C:", 2);
        
        raiz.addDirectory("Users", 2);
        raiz.addDirectory("Windows", 2);
        raiz.addDirectory("Program Files", 2);
        
        ((Directory)(raiz.getFileList().get(0))).addDirectory("Michelle", 2);
        ((Directory)(raiz.getFileList().get(0))).addDirectory("Fernando", 2);
        
        ((Directory)(raiz.getFileList().get(2))).addDirectory("Common Files", 2);
        
        ((Directory)(((Directory)(raiz.getFileList().get(2))).getFileList().get(0))).addFile("wab32", 32, "dll");
        
        
        raiz.addFile("tarea", 120, "pdf");
        
        /*
        C
        |___Users
        |   |____Michelle
        |   |
        |   |____Fernando
        |
        |___Windows
        |
        |___Program Files
        |   |___ Common Files
        |       |
        |       |_wab32.dll
        |
        |___tarea.pdf
        
        */
        
        
        
    }
    
}
