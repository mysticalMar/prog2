package ObjetosU;

public class Persona {
    private String nombre;
    private String NroDoc;
    private String Direccion;
    private int fechaNac[]=new int[3];



    //constructores
    public Persona(){
        this.nombre="default";
        this.NroDoc="00000000";
        this.Direccion="none";
        this.fechaNac[0]=1;
        this.fechaNac[1]=1;
        this.fechaNac[2]=1974;
    }
     public Persona(String N, String D, String Dir, int[] FN){
        this.nombre=N;
        this.NroDoc=D;
        this.Direccion=Dir;
        this.fechaNac=FN.clone();
     }
     
     public Persona(Persona P){
        this.nombre=P.nombre;
        this.NroDoc=P.NroDoc;
        this.Direccion=P.Direccion;
        this.fechaNac=P.fechaNac.clone();
     }
     
     //sets y gets
     public String get_nombre(Persona P){
         return this.nombre;
     }
     public void set_nombre(String N){
         this.nombre=N;
     }
    
     public String get_Doc(Persona P){
         return this.NroDoc;
     }
     public void set_Doc(String D){
         this.NroDoc=D;
     }
     
     public String get_Dir(){
         return this.Direccion;
     }
     public void set_Dir(String d){
         this.Direccion=d;
     }
     
     public int[] get_fNac(){
         int f[]=this.fechaNac; //ejecutar para probar. si no funciona, ir posicion a posicion
         return f;
     }
     public void set_fNac(int FN[]){
         this.fechaNac[0]=FN[0];
         this.fechaNac[1]=FN[1];
         this.fechaNac[2]=FN[2];
     }
     
@Override
    public String toString(){
        String aux=("Nombre: "+this.nombre+"\n DNI: "+this.NroDoc+"\n Direccion: "+this.Direccion+"\n Fecha de nacimiento:"+this.fechaNac[0]+"/"+fechaNac[1]+"/"+fechaNac[2]);
        return aux;
    }
}


