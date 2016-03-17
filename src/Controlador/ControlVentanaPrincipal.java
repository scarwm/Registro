/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.RegistroEstudiante;
import Vista.ConsultaEstudiantes;
import Vista.ManipulaEstudiantes;
import Vista.Reporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControlVentanaPrincipal implements ActionListener {

    private ManipulaEstudiantes manipulaEstudiantes;
    private Reporte reporte;
    private ConsultaEstudiantes consultaEstudiantes;
    private RegistroEstudiante regis;

    public ControlVentanaPrincipal() {

        regis = new RegistroEstudiante();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {

            System.exit(0);

        }

        if (e.getActionCommand().equalsIgnoreCase("Manipular Estudiantes")) {
            this.manipulaEstudiantes = new ManipulaEstudiantes(regis);
            manipulaEstudiantes.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Reporte Estudiantes")) {
            reporte = new Reporte();
            reporte.getPanelTabla().llenarTabla(regis.getMatriz(), Estudiante.getEtiquetas());
            reporte.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Consultar Estudiantes")) {

            consultaEstudiantes = new ConsultaEstudiantes();
            if (regis.getInformacionDeEstudiantes().equals("")) {
                JOptionPane.showMessageDialog(null, "no hay estudiantes en lista");
            } else {
                consultaEstudiantes.llenarTextArea(regis.getInformacionDeEstudiantes());
                consultaEstudiantes.show();
            }
        }
    }
}
