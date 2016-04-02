/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaCurso;
import Modelo.ArrayCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.Matricula;
/**
 *
 * @author Che
 */
public class ControladorVentanaCurso implements ActionListener{
    
    VentanaCurso VCurso;
    ArrayCursos arrayCurso;
   Matricula matricula;
    public ControladorVentanaCurso(VentanaCurso VCurso) {
        this.VCurso = VCurso;
        arrayCurso=new ArrayCursos();
        matricula=new Matricula();
       }

      public void actionPerformed(ActionEvent e)
      {
          if(e.getActionCommand().equals("Agregar"))
          {
              
              arrayCurso.Agregar(VCurso.devolverInfoCurso());
              JOptionPane.showMessageDialog(null," Curso guardado");
               System.out.println(arrayCurso.ListaCurso());
              VCurso.limpiar();
             
              
          }
          if(e.getActionCommand().equals("Consultar"))
          {
              if(arrayCurso.buscarCurso(VCurso.devolverSiglas())==null)
              {
                  JOptionPane.showMessageDialog(null,"No se encuentra el curso");
              }
              else
              {
                 VCurso.mostrarCurso(arrayCurso.buscarCurso(VCurso.devolverSiglas()));
               // JOptionPane.showMessageDialog(null," ES"+arrayCurso.toString());
              }
              
          }
          if( e.getActionCommand().equals("Modificar"))
          {
              
              arrayCurso.modificarCurso(VCurso.devolverInfoCurso());
              JOptionPane.showMessageDialog(null,"Modificado");
          }
          if(e.getActionCommand().equals("Eliminar"))
          {
              arrayCurso.Eliminar(VCurso.devolverSiglas());
              JOptionPane.showMessageDialog(null,"Eliminado");
          }
          if(e.getActionCommand().equals("Asignar"))
          {
              matricula.setVisible(true);
          }
      }
    
    
}
