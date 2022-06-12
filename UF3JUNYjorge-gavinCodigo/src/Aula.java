
import java.util.ArrayList;

public class Aula {

    private int numOrdenadores;

    private String nombreAula;

    private int maxAlumnos;

    private ArrayList<Alumno> alumnos;

    private Object Profesor;

    public Aula(int numOrdenadores, String nombreAula, int maxAlumnos, 
            ArrayList<Alumno> alumnos, Object Profesor) {
        this.numOrdenadores = numOrdenadores;
        this.nombreAula = nombreAula;
        this.maxAlumnos = maxAlumnos;
        this.alumnos = alumnos;
        this.Profesor = Profesor;
    }

    public void anadirAlumno(Alumno alumnos){
        
    }
    
    public int getMaxAlumnos(){
        return maxAlumnos;
    }
    
    public void setMaxAlumnos(int maxAlumnos){
        this.maxAlumnos = maxAlumnos;
    }
    
    public int getNumOrdenadores(){
        return numOrdenadores;
           
    }
    
    public void setNumOrdenadores(){
        this.numOrdenadores = numOrdenadores;
    }
    
    public void mostrarAlumnos(Alumno alumnos){
        
    }
    
    public void elimarAlumno(Alumno alumnos){
        
    }
    

  
}
