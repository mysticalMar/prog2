/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecuciones;
import ObjetosU.*;
import EstructuraS.ListaPersonas.*;
import java.util.Scanner;
/**
 *
 * @author maria
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("¿Que tipo de persona desea ingresar? 1: Docente, 2: Alumno, 3: Alumno Postgrado");
       Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();
        input.nextLine();
       System.out.println("Ingrese el nombre y apellido");
	String nombre=new String();
        nombre=input.nextLine();
       System.out.println("Nombre:"+nombre); 
       System.out.println("Ingrese el DNI");
       String dni=new String();
       dni=input.nextLine();
        System.out.println("DNI: "+dni);
       System.out.println("Ingrese la direccion");
       String dir=new String();
       dir=input.nextLine();
        System.out.println("Direccion: "+dir);
        System.out.println("Ingrese la fecha de nacimiento (dia, mes, año)");
        int fnac[]= new int[3];
        fnac[0]=input.nextInt();
         input.nextLine();
      fnac[1]=input.nextInt();
       input.nextLine();
       fnac[2]=input.nextInt();
       //(String N, String D, String Dir, int[] FN)
       Persona p=new Persona(nombre, dni, dir, fnac);
       System.out.println(p.toString());
       }
    }
    
