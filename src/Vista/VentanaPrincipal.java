/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlVentanaPrincipal;

/**
 *
 * @author Scarlett
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControlVentanaPrincipal cVentanaPrincipal;
   
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.cVentanaPrincipal= new ControlVentanaPrincipal();
        this.btnSalir.addActionListener(cVentanaPrincipal);
        this.jtManipulaEstudiante.addActionListener(cVentanaPrincipal);
        this.reporteEstudiantes.addActionListener(cVentanaPrincipal);
        this.consultaEstudiantes.addActionListener(cVentanaPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuEstudiante = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jtManipulaEstudiante = new javax.swing.JMenuItem();
        reporteEstudiantes = new javax.swing.JMenuItem();
        consultaEstudiantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N

        jMenu1.setText("Archivos");

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        menuEstudiante.add(jMenu1);

        jMenu2.setText("Estudiantes");

        jtManipulaEstudiante.setText("Manipular Estudiantes");
        jMenu2.add(jtManipulaEstudiante);

        reporteEstudiantes.setText("Reporte Estudiantes");
        jMenu2.add(reporteEstudiantes);

        consultaEstudiantes.setText("Consultar Estudiantes");
        jMenu2.add(consultaEstudiantes);

        menuEstudiante.add(jMenu2);

        setJMenuBar(menuEstudiante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem consultaEstudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jtManipulaEstudiante;
    private javax.swing.JMenuBar menuEstudiante;
    private javax.swing.JMenuItem reporteEstudiantes;
    // End of variables declaration//GEN-END:variables
}
