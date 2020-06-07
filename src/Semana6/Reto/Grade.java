/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6.Reto;

/**
 *
 * @author Juan Carlos Zepeda
 */
public class Grade {
    
    private File fileGrade;
    private RandomAccessFile binaryGrade;

    /*
    Inicializa el atributo File
    */
    public Grade() 
    {}
    
    /*
    Almacena una nota a partir del codigo de estudiante, 
    codigo de materia y nota obtenida
    */
    public void addGrade(int codeStudent, int codeCourse, float grade)
    {}
    
    /*
    Imprime todos los alumnos con su materia y nota obtenida
    de acuerdo al formato: Nombre de Alumno, Nombre de Carrera y Nota
    */
    public void printAllGrades()
    {}
    
    /*
    Imprime todas las notas registras a un alumno a partir de su codigo,
    de acuerdo al formato: Nombre de Carrera y Nota;
    finalmente mostrar su indice academico
    */
    public void printGradesByStudent(int codeStudent)
    {}
    
    /*
    Imprime todas las notas registras a partir de su codigo de Materia,
    de acuerdo al formato: Nombre de Alumno y Nota;
    finalmente mostrar el promedio de notas de la materia
    */
    public void printGradesByCourse(int codeCourse)
    {}
    
}