package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    private Estudiante est;
    private ArrayList<Paralelo> paralelos;

    Ayudante(Estudiante e){
    	super();
        est = e;
    }   
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
