/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Scarlett
 */
public class RegistroEstudiante {

    private ArrayList<Estudiante> arregloEstudiante;

    public RegistroEstudiante() {

        this.arregloEstudiante = new ArrayList<Estudiante>();
    }

    public String agregarEstudiante(Estudiante estudiante) {

        if (verificarEstudiante(estudiante.getCarnet())==true) {
            return " ya existe un estudiante con ese numero de carnet";
        }
        arregloEstudiante.add(estudiante);
        return "se agrego con exito";
    }

    public boolean verificarEstudiante(String carnet) {

        boolean dev = false;
        if (arregloEstudiante.size() != 0) {

            for (int i = 0; i < arregloEstudiante.size(); i++) {
                if (arregloEstudiante.get(i).getCarnet().equalsIgnoreCase(carnet)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }

    public Estudiante buscarEstudiante(String carnet) {

       Estudiante dev = null;
        if (arregloEstudiante.size() != 0) {

            for (Estudiante estu:arregloEstudiante) {
                if (estu.getCarnet().equalsIgnoreCase(carnet)) {

                    dev =estu;
                    System.out.println(" entro a buscarEstudiante"+"  "+dev.getCarnet()+"  "+dev.getCorreo()+"  "+dev.getNombre());
                    break;

                }
            }

        }
        return dev;
    }

    public String eliminar(String carnet) {

        String mensaje = "No existe el estudiante para eliminar";

        Estudiante estudi = buscarEstudiante(carnet);

        if (estudi != null) {

            arregloEstudiante.remove(estudi);
            mensaje = "Se elimino el estudiante";

        }
        return mensaje;
    }

    public void modificar(Estudiante estudiante){
        for(Estudiante estudi:arregloEstudiante){
            if(estudi.getCarnet().equalsIgnoreCase(estudiante.getCarnet())){
                estudi.setNombre(estudiante.getNombre());
                estudi.setCorreo(estudiante.getCorreo());
                break;
                
            }
            
        }
    }
    
}
