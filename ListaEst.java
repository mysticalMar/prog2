/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraS;

/**
 *
 * @author maria
 */
public class ListaEst {
static int VACIA = -1;
static int LLENA = 10;
private int[] elementos;
private int ult=VACIA;
private int cursor=VACIA;
public ListaEst() {
elementos = new int[LLENA];
ult=VACIA; cursor=VACIA;
}
public ListaEst( ListaEst li) {
elementos = new int [LLENA];
ult=VACIA; cursor=VACIA;
li.reset(); reset();
while(!li.oos()){
insert(li.copy());
forward();
li.forward();} }
public void reset() {
if (oos()) cursor=VACIA;
else cursor=0;
}
public void forward() {
if (oos()) System.out.println("Error-No puede avanzar(oos)");
else cursor++;
}
public void insert (int x) {
if (ult==-1) { ult=ult+1; cursor=ult;}
else { shiftD(); ult++; }
elementos[cursor]=x;
}

public void supress() {
if (ult==0) {cursor=VACIA; ult=VACIA;}
else {shiftI(); ult--; }
}
public int copy() {
if (oos()) { System.out.println("Operacion Invalida");
return -99; }
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
public void muestroL(){
int aux=cursor;
int i=1;
System.out.println("El contenido de la lista es:");
reset();
while (cursor<=ult){
System.out.print("Posicion "+ i + ": " + copy() + " - ");
forward(); i++;
}
System.out.println("NULL");
cursor=aux; }
}
