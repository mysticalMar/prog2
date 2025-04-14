/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecuciones;

// Agregar antes de clase:
import ObjetosU.*;
import EstructuraS.ListaEst;
import java.util.ArrayList;
import java.util.Scanner;

// en el cuerpo de método main:
public class Main2 {
public static void main(String[] args){
Scanner reader = new Scanner(System.in);

int [] fecha1={12,3,1975};
int [] fecha2={3,5,1990};
int [] fecha3={16,8,2008};
int [] fecha4={28,12,1999};
int [] fecha5={1,3,2000};
int [] fecha6={13,2,1995};
int [] fecha7={1,3,2007};
int [] fecha8={12,5,1963};
int [] fecha9={1,3,1986};
ArrayList<String> matd=new ArrayList<String>();
matd.add("ProgII");

// 1) Creacion de obj. usando diferentes constructores
// Clase Estatica = Clase dinamica
Persona p1= new Persona();
Persona p2= new Persona("Persona2", "18.234.765", "San Martin 256, San Luis", fecha1);
Persona p2c=new Persona(p2);
Persona p3;
p2.set_nombre("jose");
int [] fech=p1.get_fNac();

PersUniv pu1= new PersUniv();
PersUniv pu2= new PersUniv("PersUniv1","20.999.765","Tomas Jofre 879,”SanLuis",fecha2,"Fac.Exactas","Informatica",fecha3);
PersUniv pu2c= new PersUniv(pu2);
PersUniv pu3;

Alumno a1= new Alumno();
Alumno a2= new Alumno("Alumno2","23.908.666","Las Heras 555, San Luis",fecha4,"Fac.Exactas","Matematica",fecha5,"316700");
Alumno a3;

AlumnoPostGrado apg1= new AlumnoPostGrado();
AlumnoPostGrado apg2= new
AlumnoPostGrado("AlumnoPG2","34.171.887","Las Heras 1298,“San Luis",fecha6,"Fac.Exactas","Mineria",fecha7, "420008","Mg.Explotacion Minera");
AlumnoPostGrado apg3;

Docente d1= new Docente();
Docente d2= new Docente("Doc1","16.989.165","Tomas Jofre 888, San Luis",fecha8,"Fac.Exactas","Lic.Cs. de la Comp.",fecha9,"Prof.Adj.Efectivo",matd);
Docente d3;

// 2) Polimorfismo: Creacion de obj. usando constructores de otras clases
// Compatibilidad = Casting implícito = UpCasting
System.out.println("*******************************************");
System.out.println(" Linea 1 - Incorrecta, se quiere asignar a un hijo un constructor padre.");
// PersUniv pu4= new Persona();
System.out.println(" Linea 2 - Correcta, Persona es compatible con PersUniv");
Persona p4= new PersUniv();
System.out.println(" Linea 3 - Correcta, tipos compatibles");

Persona p5= new PersUniv(pu2);
System.out.println(" Linea 4 - Correcta, tipos compatibles");
PersUniv pu5= new AlumnoPostGrado();
System.out.println(" Linea 5 - Incorrecta. Tipos incompatibles: Alumno es hijo de PersUniv");
//Alumno a4= new PersUniv("Alumno3","35.876.877","Rivadavia 798, San Luis",fecha1,"Fac.Humanas","Psicologia",fecha2);
System.out.println(" Linea 6 - Correcta: tipos compatibles");
Alumno a5= new AlumnoPostGrado(apg1);
System.out.println(" Linea 7 - Correcta: tipos comptaibles");
Alumno a6=new Alumno(apg2);
System.out.println(" Linea 8 - Incorrecta: El constructor para alumnoPG necesita un tipo alumnoPG. Al pasarle un tipo alumno, le faltan atributos");
//Alumno a7= new AlumnoPostGrado(a2);
System.out.println(" Linea 9 - Correcta: tipos compatibles ");
PersUniv pu6= new Alumno(apg1);
System.out.println(" Linea 10- Correcta: tipos compatibles");
Alumno a8= new AlumnoPostGrado(apg2);
System.out.println(" Linea 11- Incorrecta: alumno es hijo de persUniv, tipos incompatibles");
//AlumnoPostGrado apg4= new PersUniv();
System.out.println(" Linea 12- Correcta: mismo tipo");
AlumnoPostGrado apg5= new AlumnoPostGrado();
System.out.println(" Linea 13- Incorrecta: tipos incompatibles");
//Docente d4= new Persona();
System.out.println(" Linea 14- Correcta: tipos compatibles");
Persona p6= new PersUniv(a2);
System.out.println(" Linea 15- Incorrecta: clases hermanas, tipos incompatibles");
//Docente d5= new Alumno();
System.out.println(" Linea 16-Correcta, tipos compatibles");
Persona pu7= new Alumno(apg2);

// 3) POLIMORFISMO – Copia de obj. (sin creación, sin pedido de memoria)
// Compatibilidad = Casting Implícito (UpCasting)
// versus Casting Explicito (DownCasting)
System.out.println("*********************************************");
System.out.println("*** 3) POLIMORFISMO - copia de objetos");
System.out.println("*** sin creacion - referencia");
System.out.println("\n Linea 17-Correcta, mismo tipo");
p3=p2;
System.out.println(" Linea 18-Incorrecta, alumno es hijo de persona");
//a3=p2;
System.out.println(" Linea 19-Correcta, tipos compatibles: pu es padre de a"); 
pu3= a2;
System.out.println(" Linea 20- Incorrecta: apg y docente son tipos incompatibles");
//apg2=d2;
System.out.println(" Linea 21- Incorrecta: el tipo estático es hijo del dinámico");
//apg3=a1;
System.out.println(" Linea 22- Correcta: tipos compatibles");
a2=apg2;
System.out.print(" toque <enter> para continuar");
reader.nextLine(); // limpio tecla
//POLIMORFISMO DE ASIGNACIÓN (variables polimorfas)
//CASTING EXPLICITO --- > Objetivo!!!:
// acceder a campos que no existen porque tipo estático es menor que tipo dinámico
System.out.println("************************************************");
System.out.println("*** 4) Polimorfismo de asignación (variables polimorfas) ");
System.out.println("*** Casting Explicito");
System.out.println(" Linea 23- .....COMPLETAR....");
//Alumno a6= (Alumno) d2;

System.out.println(" Linea 24- Observar!!");
System.out.println(" a2 --> apg2:");
// invoco a2.getcarPos() sin casting --> ERROR?"
//System.out.println(a2.getcarPos());
// invoco a2.getcarPos() con casting --> OK? -Analizar Invocacion!"
System.out.println(" (a2.getcarPos(): "+((AlumnoPostGrado)a2).get_CarreraPostG());

System.out.println("\n Linea 25- Observar!!");
System.out.println(" pu3 -> a2:");
// invoco pu3.getFac() sin casting --> ERROR?"
//System.out.println(pu3.getReg());
// invoco pu3.getFac() con casting --> OK?";
System.out.println(" pu3.getReg(): "+((Alumno)pu3).get_reg());

//NO DEBE USARSE CASTING EXPLICITO DE LA SIGUIENTE FORMA!!!
// Ninguna da error en compilacion
// diferentes ERRORES EN TIEMPO DE EJECUCION -
// Descomentar una a una, ejecutar y OBSERVAR Error

//Alumno a7= (Alumno) p5;
//AlumnoPostGrado apg4= (AlumnoPostGrado) p2c;
//Docente d6= (Docente) pu6;
//AlumnoPostGrado apg7= (AlumnoPostGrado) pu2c;

System.out.print("\n toque <enter> para continuar ");
reader.nextLine();
// limpio tecla
// 4)LINKING Estático versus Dinámico
System.out.println("***********************************************");
System.out.println("*** 5) Linking Estatico vs Dinamico");
System.out.println("\n** Objeto pu3 -> a2**** " );

System.out.println("**** METODO POLIMORFICO toString()SIN casting "+pu3.toString());
System.out.println("**** METODO POLIMORFICO toString() CON casting "+ ((Alumno)pu3).toString());

System.out.println("\n**** METODO ESTATICO getReg() SIN casting: ERROR metodo inexistente");
//System.out.println("Muestra SIN casting explicito: \n"+ pu3.getReg());
System.out.println("**** METODO ESTATICO getReg() CON casting \n"+((Alumno)pu3).get_reg());

System.out.print(" toque <enter> para continuar ");
reader.nextLine(); // limpio tecla
System.out.println("\n** Objeto a2 --> apg2 **** " );
System.out.println("* METODO POLIMORFICO toString() SIN casting "+a2.toString());
System.out.println("* METODO POLIMORFICO toString() CON casting " +((AlumnoPostGrado)a2).toString());
System.out.println("\n**** METODO ESTATICO getcarPos() SIN casting: ERROR metodo inexistente\n");
//System.out.println("Muestra SIN casting explicito: \n"+a2.getcarPos());
System.out.println("**** METODO ESTATICO getcarPos() CON casting \n" +((AlumnoPostGrado)a2).get_CarreraPostG());

System.out.print("\n toque <enter> para continuar ");
reader.nextLine(); // limpio tecla
//Completar las sentencias de impresion
System.out.println("pu3 - tipo estatico-> PersUniv " );
System.out.println(" tipo dinamico-> Alumno ");
System.out.println("\n******************************************");
System.out.println("*** Completar las sentencias de impresion" );
System.out.println("\n Al invocar pu3.toString():"+ pu3.toString());

System.out.println("a2 - tipo estatico-> Alumno " );

System.out.println(" tipo dinamico-> AlumnoPostGrado ");
System.out.println("\n Al invocar a2.toString()"+a2.toString());

System.out.println("\n*************************************************");
System.out.println("CONCLUSION: al invocar un metodo polimorfico, Java muestra automaticamente el tipo dinamico");

System.out.println("\n Fin Ejecucion");
}}
