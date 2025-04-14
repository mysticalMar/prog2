/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecuciones;

/**
 *
 * @author maria
 */
import EstructuraS.*;
import ObjetosU.Persona;
import java.util.Scanner;
public class Main1 {
public static void main(String[] args) {
ListaEst l1=new ListaEst();
Scanner reader = new Scanner(System.in);
int op=1; int elem;
while (op!= 0){ System.out.println("Lista de Enteros - Menu de Opciones");
System.out.println("1-Pararse en 1er elemento");
System.out.println("2-Avanzar al prox. elemento");
System.out.println("3-preguntar si esta vacia");
System.out.println("4-preguntar si esta llena");
System.out.println("5-Preguntar si esta afuera de la estructura");
System.out.println("6-Insertar elemento");
System.out.println("7-Suprimir elemento");
System.out.println("8-Muestra toda la lista");
System.out.println("0-Salir");
System.out.print("Ingrese Opcion:");
op= reader.nextInt();
System.out.println();
switch (op){
case 0: continue;
case 1: l1.reset();break;

case 2: l1.forward();break;
case 3: if (l1.isempty()) System.out.println("Lista Vacia");
else System.out.println("Lista NO Vacia"); break;
case 4: if (l1.isfull()) System.out.println("Lista Llena");
else System.out.println("Lista NO Llena"); break;
case 5: if (l1.oos()) System.out.println("Fuera de la estructura");
else System.out.println(" NO esta fuera de la estructura"); break;
case 6: if (l1.isfull()) System.out.println(" Operacion invalida-Lista LLENA ");
else { System.out.print(" Ingrese elemento a insertar (int):");
elem=reader.nextInt(); System.out.println();
l1.insert(elem); } break;
case 7: if (l1.isempty()) System.out.println(" Operacion invalida-Lista VACIA ");
else l1.supress(); break;
case 8: if (l1.isempty()) System.out.println(" Operacion invalida-Lista VACIA ");
else l1.muestroL(); break;
default: System.out.println(" Opcion equivocada"); } // fin switch
reader.nextLine(); // limpio \n ultimo int
System.out.print(" toque para continuar ");
reader.nextLine(); // limpio tecla
System.out.println(); }// fin while
System.out.println(" Fin Ejecucion"); }//fin Main1
}//fin clase