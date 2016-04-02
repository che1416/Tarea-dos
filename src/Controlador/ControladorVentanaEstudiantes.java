/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaEstudiante;
import Modelo.ArrayEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Che
 */
public class ControladorVentanaEstudiantes implements ActionListener{
    
    VentanaEstudiante estudiant;
    ArrayEstudiantes array;

    public ControladorVentanaEstudiantes(VentanaEstudiante estudiant) {
        array= new ArrayEstudiantes();
        this.estudiant = estudiant;
       }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            array.Agregar(estudiant.devolverInfoEs());
            System.out.print(array.listadoEstudiantes());
            estudiant.Limpiar();
           
            JOptionPane.showMessageDialog(null," agregado");
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            array.modificarEstudiante(estudiant.devolverInfoEs());
            JOptionPane.showMessageDialog(null,"modificado");
        }
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
          if(array.BuscarEstudiante(estudiant.devolverCarnet())==null)
          {
                  JOptionPane.showMessageDialog(null,"NO existe");
          
          }
          else
          {
              estudiant.mostrarEstudiante(array.BuscarEstudiante(estudiant.devolverCarnet()));
          }
        
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            array.EliminarEstudiante(estudiant.devolverCarnet());
            JOptionPane.showMessageDialog(null,"Eliminado");
        }
    }
    
}
