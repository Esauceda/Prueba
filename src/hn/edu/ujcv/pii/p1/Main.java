package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola Programacion II");
        //Para realizar una captura de entrada de datos
        Scanner teclado=new Scanner(System.in);
        String nombreAlumno="Programacion";
        System.out.println("Introduzca el nombre del alumno:");
        nombreAlumno = teclado.next();
        System.out.println("El nombre del alumno es: "+ nombreAlumno);
    }
}
