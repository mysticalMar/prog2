/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosU;

/**
 *
 * @author maria
 */
public class AlumnoPostGrado extends Alumno {
    private String CarreraPostG;
    //constructores
    public AlumnoPostGrado(){
        super();
        CarreraPostG="N/A";
    }
    public AlumnoPostGrado(String N, String D, String Dir, int FN[], String f, String c, int i[], String reg, String car){
        super(N, D, Dir, FN, f, c, i, reg);
        this.CarreraPostG=car;
    }
    public AlumnoPostGrado(AlumnoPostGrado a){
        super(a);
        this.CarreraPostG=a.CarreraPostG;
    }
    //sets y gets
    public void set_CarreraPostG(String c){
        this.CarreraPostG=c;
    }
    public String get_CarreraPostG(){
        return this.CarreraPostG;
    }
     @Override
    public String toString(){
       String aux=(super.toString()+"\n Carrera Post Grado:"+this.CarreraPostG);
       return aux;
    }

}
