/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraS;
import ObjetosU.*;
/**
 *
 * @author maria
 */
public class ListaPersonas implements FuncEstr{
    static int VACIA = -1;
static int LLENA = 10;
private Persona[] elementos;
private int ult=VACIA;
private int cursor=VACIA;

public ListaPersonas() {
elementos = new Persona[LLENA];
ult=VACIA; cursor=VACIA;}

public ListaPersonas( ListaPersonas li) {
elementos = new Persona [LLENA];
ult=VACIA; cursor=VACIA;
li.reset(); reset(); //constructores
    while(!li.oos()){ //mientras que no se salga de la estructura
        insert(li.copy());//inserta el elemento que retorna copy, incialmente el elemento 0
        forward();
        li.forward();} } 

public void reset() {
if (oos()) cursor=VACIA;
else cursor=0;}
public void forward() {
if (oos()) System.out.println("Error-No puede avanzar(oos)");
else cursor++; }
public void insert (Persona x) {
if (ult==-1) { ult=ult+1; cursor=ult;}
else { shiftD(); ult++; }
elementos[cursor]= x; }
public void supress() {
if (ult==0) {cursor=VACIA; ult=VACIA;}
else { shiftI(); ult--; }
}
public Persona copy() {
if (oos())
{ System.out.println("Operacion Invalida");
Persona p=new Persona();
return  p;
}
else return elementos[cursor];
}
public Boolean isempty() {return ult==VACIA;}
public Boolean isfull() {return ult==(LLENA -1);}
public Boolean oos() {return (( cursor==VACIA) || (cursor == ult+1));}
private void shiftI(){
for (int i=cursor; i<=ult; i++) elementos[i]=elementos[i+1];
}
private void shiftD(){
for (int i=ult; i>=cursor; i--) elementos[i+1]=elementos[i];
}

//interface
public int cardinalidad(){
    return this.ult;
}
public Boolean inStruc(Persona p){
    reset();
    while(!oos()){
        if (copy()==p){
            return true;
        }
        else forward();
    }
    return false;
      
    }
public void muestroEstruc(){
    int aux=cursor; int i= 1;
System.out.println("El contenido de la lista es:");
reset();
while (cursor<=ult){
System.out.print("Posicion "+ i + ": " + copy() + " - ");
forward(); i++;
}
System.out.println("NULL");
cursor=aux; }
}

