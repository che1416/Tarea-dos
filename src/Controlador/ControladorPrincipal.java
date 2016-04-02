/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaCurso;
import Vista.VentanaEstudiante;
/**
 *
 * @author Che
 */
public class ControladorPrincipal implements ActionListener {
    
    Principal principal;
    VentanaCurso curso;
    VentanaEstudiante estudiante;
    public ControladorPrincipal(Principal principal) {
        this.principal = principal;
        curso=new VentanaCurso();
        estudiante=new VentanaEstudiante();
    }
    
    public void actionPerformed( ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(e.getActionCommand().equals("Registro Curso"))
        {
            curso.setVisible(true);
        }
        if(e.getActionCommand().equals("Registro Estudiante"))
        {
            estudiante.setVisible(true);
        }
    }
}
