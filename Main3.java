/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecuciones;
import EstructuraS.ListaPersonas;
import ObjetosU.*;
import java.util.ArrayList;
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
       ListaPersonas l= new ListaPersonas();
       System.out.println("1: Ingresar prestador");
       System.out.println("2: Eliminar prestador");
       System.out.println("3: Mostrar lista");
       Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();
        input.nextLine();
        switch(opcion){
            case 1:
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
       input.nextLine();
       System.out.println("Ingrese la facultad");
       String facultad= new String();
       facultad=input.nextLine();
       System.out.println("Ingrese la carrera");
       String carrera= new String();
       carrera=input.nextLine();
              //(String N, String D, String Dir, int[] FN)

        System.out.println("Ingrese la fecha de ingreso (dia, mes, año)");
        int fing[]= new int[3];
        fing[0]=input.nextInt();
         input.nextLine();
      fing[1]=input.nextInt();
       input.nextLine();
       fing[2]=input.nextInt();
       input.nextLine();
             
         System.out.println("¿Que tipo de persona desea ingresar? 1: Docente, 2: Alumno, 3: Alumno Postgrado");
         int op2=input.nextInt();
         input.nextLine();
         switch(op2){
             case 1: //cargo y materias (array list)
                 String cargo=new String();
                 System.out.println("Ingrese el cargo");
                 cargo=input.nextLine();
                 ArrayList<String> materias= new ArrayList<>();
                 System.out.println("Cuantas materias quiere ingresar?");
                 int m=input.nextInt();
                 input.nextLine();
                 String aux=new String();
                 for (int i=0; i<m; i++){
                     aux=input.nextLine();
                     materias.add(aux);
                 }
                     //public Docente(String N, String D, String Dir, int FN[], String f, String c, int i[], String cargo, ArrayList<String> m){
                   //  Docente docente =new Docente(nombre, dni, dir, fnac, facultad, carrera, fing, cargo, materias);
                     Persona per= new Docente(nombre, dni, dir, fnac, facultad, carrera, fing, cargo, materias);
                     l.insert(per);    
         }
            case 3: l.muestroEstruc();
            
    }
       }
    
    }
    
