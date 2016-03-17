/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.RegistroEstudiante;
import Vista.GuiBuscarEstudiante;
import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControladorMantenimientoEstudiate implements ActionListener {

    public final static int CARNET = 1;

    public final static int NOMBRE = 2;

    public final static int CORREO = 3;

    public final static int AGREGAR = 4;

    public final static int BUSCAR = 5;

    public final static int EDITAR = 6;

    public final static int ELIMINAR = 7;

    public final static int GUARDAR = 8;

    private ManipulaEstudiantes manipulaEstudiantes;

    private Estudiante estudiante;
    private RegistroEstudiante regis;
    private GuiBuscarEstudiante guiBuscarEstudiante;

    public ControladorMantenimientoEstudiate(ManipulaEstudiantes manipulaEstudiantes, RegistroEstudiante regis) {
        this.manipulaEstudiantes = manipulaEstudiantes;
        this.regis = regis;
        this.guiBuscarEstudiante = new GuiBuscarEstudiante();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.manipulaEstudiantes.getCodigoPorFuente(ae.getSource());

        switch (codigo) {
            case AGREGAR:
                if (manipulaEstudiantes.verificar() == true) {

                    JOptionPane.showMessageDialog(null, "procure llenar los datos requeridos");

                } else {
                    estudiante = new Estudiante(manipulaEstudiantes.getTexCarnet(), manipulaEstudiantes.getTexNombre(), manipulaEstudiantes.getTexCorreo());
                    JOptionPane.showMessageDialog(null, regis.agregarEstudiante(estudiante));
                    manipulaEstudiantes.limpiar();
                }
                break;

            case ELIMINAR:
                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    JOptionPane.showMessageDialog(null, "procure llenar los datos requeridos");
                } else {
                    JOptionPane.showMessageDialog(null, regis.eliminar(manipulaEstudiantes.getTexCarnet()));
                }
                manipulaEstudiantes.limpiar();

                break;

            case BUSCAR:
                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    JOptionPane.showMessageDialog(null, "Ingrese el carnet para buscar el estudiante");
                    manipulaEstudiantes.limpiar();

                } else {
                    Estudiante estudiante = regis.buscarEstudiante(manipulaEstudiantes.getTexCarnet());

                    if (estudiante == null) {

                        JOptionPane.showMessageDialog(null, "no se encontró el estudiante");
                        manipulaEstudiantes.limpiar();

                    } else {

                        guiBuscarEstudiante.setInformacion(estudiante.getCarnet() + " " + estudiante.getNombre() + " " + estudiante.getCorreo() + " ");

                        guiBuscarEstudiante.show();

                    }
                }

                break;

            case EDITAR:

                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    JOptionPane.showMessageDialog(null, "Ingrese el carnet del estudiante que desea modificar");
                    manipulaEstudiantes.limpiar();

                } else {
                    Estudiante estudiante = regis.buscarEstudiante(manipulaEstudiantes.getTexCarnet());

                    if (estudiante == null) {

                        JOptionPane.showMessageDialog(null, "no se encontró el estudiante");
                        manipulaEstudiantes.limpiar();

                    } else {
                        manipulaEstudiantes.setTexCarnet(estudiante.getCarnet());
                        manipulaEstudiantes.setTexNombre(estudiante.getNombre());
                        manipulaEstudiantes.setTexCorreo(estudiante.getCorreo());
                        manipulaEstudiantes.enableBoton(true);
                        manipulaEstudiantes.setEditable(false);
                    }
                }

                break;

            case GUARDAR:
                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    JOptionPane.showMessageDialog(null, "ingrese el carnet del estudiante que desea modificar");
                } else {
                    Estudiante estudiante = new Estudiante(manipulaEstudiantes.getTexCarnet(), manipulaEstudiantes.getTexNombre(), manipulaEstudiantes.getTexCorreo());
                    regis.modificar(estudiante);
                    JOptionPane.showMessageDialog(null, "se ha modificado el estudiante");
                    manipulaEstudiantes.limpiar();
                    manipulaEstudiantes.setEditable(true);
                    manipulaEstudiantes.enableBoton(false);

                }
                break;
        }
    }

}
