/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.RegistroEstudiante;
import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Scarlett
 */
public class ControlVentanaPrincipal implements ActionListener{

    private ManipulaEstudiantes manipulaEstudiantes;
    private RegistroEstudiante regis;
   
    public ControlVentanaPrincipal() {
        
        regis= new RegistroEstudiante();
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir")){
            
            System.exit(0);
            
        }
        
        if (e.getActionCommand().equals("Manipular Estudiantes")) {
           this.manipulaEstudiantes= new ManipulaEstudiantes(regis);
           manipulaEstudiantes.show();
        }
    }
}

