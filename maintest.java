/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecuciones;

import ObjetosU.Persona;
import ObjetosU.PersUniv;
import ObjetosU.*;
/**
 *
 * @author maria
 */
public class maintest {

    public static void main(String[] args) {
        // TODO code application logic here
         Persona p=new Persona();
        System.out.println(p.toString());
        PersUniv pu= new PersUniv();
        System.out.println(pu.toString());
        Alumno a= new Alumno();
        System.out.println(a.toString());
        Docente d= new Docente();
        d.addMat("Matematica");
        d.showMats();
        d.delMat("Matematica");
        System.out.println(d.toString());
    }
    
}
