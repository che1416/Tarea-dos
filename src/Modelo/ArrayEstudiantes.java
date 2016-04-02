/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Che
 */
public class ArrayEstudiantes {
    
    ArrayList<Estudiantes>estudiante;

    public ArrayEstudiantes() {
       
        estudiante=new ArrayList<Estudiantes>();
    }
    
    public void Agregar( Estudiantes estudiante1)
    {
        estudiante.add(estudiante1);
    }
    
    public Estudiantes BuscarEstudiante(String carnet)
    {
       Estudiantes est=null;
       for(int i=0;i<estudiante.size();i++)
       {
           if(estudiante.get(i).getCarnet().equals(carnet))
           {
               est=estudiante.get(i);
           }
       }
         return est;  
    }
    
    public void modificarEstudiante(Estudiantes est)
    {
        for(int i=0;i<estudiante.size();i++)
        {
            if(estudiante.get(i).getCarnet().equals(est.getCarnet()))
            {
                estudiante.get(i).setNombre(est.getNombre());
            }
        }
    }
    
    public void EliminarEstudiante(String carnet)
    {
        for(int i=0;i<estudiante.size();i++)
        {
            if(estudiante.get(i).getCarnet().equals(carnet))
            {
                estudiante.remove(estudiante.get(i));
            }
            
        }
        
    }
    public String listadoEstudiantes()
     {
         String mensaje="";
        for(int i=0;i<estudiante.size();i++)
        {
            mensaje=""+estudiante.get(i).toString();
        }
      return mensaje;
    }
}//fin
