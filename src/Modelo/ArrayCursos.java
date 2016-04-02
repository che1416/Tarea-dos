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
public class ArrayCursos {
    
    
    private ArrayList<Curso>arrayCurso;
    
    public ArrayCursos()
    {
       arrayCurso=new ArrayList<Curso>();    
    }
    
    public void Agregar( Curso curso)
    {
        arrayCurso.add(curso);
    }
    
    public Curso buscarCurso(String siglas)
    {
          Curso cur=null;
        for(int i=0;i<arrayCurso.size();i++)
        {
           if(arrayCurso.get(i).getSiglas().equals(siglas))
           {
               cur=arrayCurso.get(i);
           }
        }
        return cur;
     }
    
    public void modificarCurso(Curso cur)
    {
        for(int i=0;i<arrayCurso.size();i++)
        {
         if(arrayCurso.get(i).getSiglas().equals(cur.getSiglas()))
         {
             arrayCurso.get(i).setNombre(cur.getNombre());
             arrayCurso.get(i).setCantCreditos(cur.getCantCreditos());
        }
        }
    }
    
    public void Eliminar(String siglas)
    {
        for(int i=0;i<arrayCurso.size();i++)
        {
            arrayCurso.remove(arrayCurso.get(i));
        }
    }
    
    public String ListaCurso()
    {
        String mensaje="";
        for(int i=0;i<arrayCurso.size();i++)
        {
            mensaje+=arrayCurso.get(i).toString();
        }
        return mensaje;
    }
}
