/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosU;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Docente extends PersUniv {
 private String Cargo;
 private ArrayList<String> Materias= new ArrayList<>();
 //constructores
 public Docente(){
     super();
     this.Cargo="N/A";
 }
 public Docente(String N, String D, String Dir, int FN[], String f, String c, int i[], String cargo, ArrayList<String> m){
     super(N, D, Dir, FN, f, c, i);
     this.Cargo=cargo;
     this.Materias = new ArrayList<>(m);
 }
 public Docente(Docente d) {
    super(d); // Llama al constructor de copia de PersUniv
    this.Cargo = d.Cargo;
    this.Materias = new ArrayList<>(d.Materias); // llama al constructor de copia de ArrayList y crea una copia de la lista
}
 //Sets y gets
 public void set_Cargo(String c){
     this.Cargo=c;
 }
 public String get_Cargo(){
     return this.Cargo;
 }
 public void set_Materias(ArrayList<String> m){
     this.Materias.addAll(m);
 }
 public ArrayList<String> get_Materias(){
     return new ArrayList<>(this.Materias);
 }
  //metodos
    public void addMat(String s){
        this.Materias.add(s);
    }
    public void delMat(String s){
        this.Materias.remove(s);
    }
    public void showMats(){
        System.out.println(this.Materias);
    }
 @Override
 public String toString(){
      String aux=(super.toString()+"\n Cargo:"+this.Cargo+"\n Materias:"+this.Materias);
      return aux;
 }
}
