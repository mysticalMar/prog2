/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosU;

/**
 *
 * @author maria
 */
public class Alumno extends PersUniv {
     private String registro;
    //constructores
    public Alumno(){
    super();
    this.registro="0";
    }
    public Alumno(String N, String D, String Dir, int FN[], String f, String c, int i[], String reg){
        super(N, D, Dir, FN, f, c, i);
        this.registro=reg;
    }
    public Alumno(Alumno a){
        super(a);
        this.registro=a.registro;
    }
    //sets y gets
    public void set_reg(String r){
        this.registro=r;
    }
    public String get_reg(){
        return this.registro;
    }
  
     @Override
    public String toString(){
       String aux=(super.toString()+"\n Registro:"+this.registro);
       return aux;
    }
}
