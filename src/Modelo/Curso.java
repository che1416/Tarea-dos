/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Che
 */
public class Curso {
    
     String nombre,siglas,cantCreditos;

    public Curso() {
    }
     public Curso(String nombre, String siglas, String cantCreditos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.cantCreditos = cantCreditos;
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public String getCantCreditos() {
        return cantCreditos;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public void setCantCreditos(String cantCreditos) {
        this.cantCreditos = cantCreditos;
    }
    
     public String toString() {
        return "Curso{" + "nombre=" + nombre + ", siglas=" + siglas + ", cantCreditos=" + cantCreditos + '}';
    }
}
