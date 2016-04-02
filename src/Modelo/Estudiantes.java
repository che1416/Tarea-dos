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
public class Estudiantes {

    String nombre,cedula,carnet;

    public Estudiantes(String nombre, String cedula, String carnet) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carnet = carnet;
    }

    public Estudiantes() {
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCarnet() {
        return carnet;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", cedula=" + cedula + ", carnet=" + carnet + '}';
    }
    
    
    
    
    
}
