/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class TablaMultiplicacion {
    
    public static void main(String[] args) {
        
        System.out.println("*** T A B L A  D E  M U L T I P L I C A R ***");
        
        Scanner lea = new Scanner(System.in);
        
        System.out.print("Ingrese numero de tabla: ");
        int tabla = lea.nextInt();
        
        
        int inicio = 1;
        
        //Imprime la tabla desde 1 hasta 12
        for(inicio = 1; inicio <= 12; inicio++)
        {
            System.out.printf("%d x %d = %d%n", tabla, inicio, (tabla*inicio));
        }
        
        
    }
    
}
