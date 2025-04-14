/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosU;
import java.util.Arrays;

/**
 *
 * @author maria
 */
public class PersUniv extends Persona {
    private String facultad;
    private String carrera;
    private int fechaIng[]=new int[3];
    //constructores
    public PersUniv(){
        this.facultad="N/A";
        this.carrera="N/A";
        this.fechaIng[0]=1;
        this.fechaIng[1]=1;
        this.fechaIng[2]=2025;
    }
    public PersUniv(String N, String D, String Dir, int FN[], String f, String c, int i[]){
       super(N, D, Dir, FN);
       this.facultad=f;
       this.carrera=c;
       this.fechaIng[0]=i[0];
       this.fechaIng[1]=i[1];
       this.fechaIng[2]=i[2];
    }
   public PersUniv(PersUniv pu){
       super(pu);
       this.facultad=pu.facultad;
       this.carrera=pu.carrera;
       this.fechaIng=pu.fechaIng.clone();
   }
   //sets y gets
   public String get_Fac(){
       return this.facultad;
   }
   public void set_Fac(String f){
       this.facultad=f;
   }
   public String get_Car(){
       return this.carrera;
   }
   public void set_Car(String c){
       this.carrera=c;
   }
   public int[] get_Ing(){
       return this.fechaIng;
   }
   public void set_Ing(int i[]){
       this.fechaIng=i.clone();
   }
   
    @Override
   public String toString(){
       String aux=(super.toString()+"Facultad: "+this.facultad+"\n Carrera "+this.carrera+"\n Fecha de ingreso: "+Arrays.toString(this.fechaIng));
       return aux;
   }
}


