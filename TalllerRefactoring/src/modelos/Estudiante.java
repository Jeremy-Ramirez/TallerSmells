package modelos;

import java.util.ArrayList;

public class Estudiante{
    //Informacion del estudiante
    protected String matricula;
    protected String nombre;
    protected String apellido;
    protected String facultad;
    protected int edad;
    protected String direccion;
    protected String telefono;
    protected ArrayList<Paralelo> paralelos;
    protected double nota=0;
   
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Getter y setter del Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter y setter del Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
    public double calcularN(Paralelo p,Notas n){
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(n.getDeberes()+n.getExamen()+n.getLecciones())*0.80;
                double notaPractico=(n.getTalleres())*0.20;
                nota=notaTeorico+notaPractico;
            }
        }
        return nota;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
