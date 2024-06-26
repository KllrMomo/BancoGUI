/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bake.cakebank;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Acer
 */
public class BankGUI extends javax.swing.JFrame {

    private JTextArea textArea = new JTextArea(20,40);
    private Banco banco;
    
    /**
     * Creates new form BankGUI
     */
    public BankGUI() {
        banco = new Banco();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarSolicitud = new javax.swing.JButton();
        btnAtenderSolicitudes = new javax.swing.JButton();
        btnDarBajaMillonarios = new javax.swing.JButton();
        btnVerificarCuenta = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnMostrarCuentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(246, 202, 225));

        jPanel1.setBackground(new java.awt.Color(252, 172, 208));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Banco Coquette");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAgregarSolicitud.setText("Solicitud Deposito");
        btnAgregarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSolicitudActionPerformed(evt);
            }
        });

        btnAtenderSolicitudes.setText("Atender Solicitudes");
        btnAtenderSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderSolicitudesActionPerformed(evt);
            }
        });

        btnDarBajaMillonarios.setText("Dar de Baja a Millonarios");
        btnDarBajaMillonarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaMillonariosActionPerformed(evt);
            }
        });

        btnVerificarCuenta.setText("Verificar Cuenta");
        btnVerificarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarCuentaActionPerformed(evt);
            }
        });

        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        btnMostrarCuentas.setText("Mostrar Cuentas");
        btnMostrarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCuentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDarBajaMillonarios))
                        .addGap(71, 71, 71)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(btnVerificarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(btnAtenderSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnMostrarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtenderSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerificarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDarBajaMillonarios, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnMostrarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSolicitudActionPerformed
        //Abrir cuadro de dialogo
        JTextField txtNumeroIdentidad = new JTextField();
        JTextField txtCantidad = new JTextField();
        JTextField txtNombre = new JTextField();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(new JLabel("Número Identidad:"));
        panel.add(txtNumeroIdentidad);
        panel.add(new JLabel("Cantidad:"));
        panel.add(txtCantidad);
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        
        int result = JOptionPane.showConfirmDialog(null, panel,"Agregar Solicitud",
                     JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            //Datos de usuario
            String numIdentidad = txtNumeroIdentidad.getText();
            double cantidad;
            String nombre = txtNombre.getText();
         
            try {
                cantidad = Double.parseDouble(txtCantidad.getText());
                
                //Crear solicitud
                SDeposito solicitud = new SDeposito(numIdentidad,cantidad, nombre);
                banco.solicitudes.add(solicitud);
                JOptionPane.showMessageDialog(null, "Solicitud agregada correctamente");
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "La cantidad deber ser un numero valido","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarSolicitudActionPerformed

    private void btnAtenderSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderSolicitudesActionPerformed
        if (!banco.solicitudes.isEmpty()) {
            SDeposito solicitud = banco.solicitudes.get(0); //Primera posicion de la lista
            
            //Verifica y procesa la solicitud
            int pos = banco.verificarCuenta(solicitud);
            banco.cuentas.get(pos).depositar(solicitud.getCantidad());
            //Elimina solicitud de lista
            banco.solicitudes.remove(0);
            JOptionPane.showMessageDialog(null, "Solicitud atendida correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No hay solicitudes que atender");
        }
    }//GEN-LAST:event_btnAtenderSolicitudesActionPerformed

    private void btnDarBajaMillonariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaMillonariosActionPerformed
        List<CAhorro> millonarios = banco.DarBajaAMillonarios(); //Lista de millonarios en el banco

        //Informacion de las cuentas
        if (!millonarios.isEmpty()) {
            String mensaje = "Cuentas millonarias dadas de baja:";
            for (CAhorro cuenta : millonarios) {
                mensaje += ("Numero de identidad: " + cuenta.getNumIdentidad() + "\n");
                mensaje +=("Saldo Actual: " + cuenta.getsActual() + "\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Cuentas Millonarias Dadas de baja" ,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuentas millonarias para dar de baja");
        }
    }//GEN-LAST:event_btnDarBajaMillonariosActionPerformed

    private void btnVerificarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarCuentaActionPerformed
        List<CAhorro> cuentas = banco.cuentas;
        
        if (!cuentas.isEmpty()) {
            String cuentaInfo = "Cuentas en el banco: \n";
            
            for (int i = 0; i < banco.cuentas.size(); i++) {
            CAhorro cuenta = banco.cuentas.get(i);
            cuentaInfo += ("Cuenta " + (i+1) +":");
            cuentaInfo += ("Numero de identidad: " +cuenta.getNumIdentidad() + "\n");
            cuentaInfo += ("Saldo Actual: " + cuenta.getsActual() + "\n");
            } 
            JOptionPane.showMessageDialog(null, cuentaInfo, "Cuentas en el Banco" ,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " No hay cuentas en el banco.");
        }
    }//GEN-LAST:event_btnVerificarCuentaActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        JTextField numId = new JTextField();
        JTextField saldo = new JTextField();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(new JLabel("Numero de Identidad: "));
        panel.add(numId);
        panel.add(new JLabel("Saldo: "));
        panel.add(saldo);
        
        //Panel de dialogo
        int result = JOptionPane.showConfirmDialog(null, panel,"Crear",
                     JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        //Ver si se hizo cloc en OK
        if (result == JOptionPane.OK_OPTION) {
            //Datos de usuario
            String numIdentidad = numId.getText();
            double saldoCuenta;
            try {
                saldoCuenta = Double.parseDouble(saldo.getText());
                
                //Crear solicitud
                CAhorro nuevaCuenta = new CAhorro(numIdentidad,saldoCuenta, 0);
                banco.cuentas.add(nuevaCuenta); // Agrega cuenta al banco
                JOptionPane.showMessageDialog(null, "Solicitud agregada correctamente");
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "La saldo deber ser un numero valido","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        JTextField numIdentField = new JTextField(10);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(new JLabel("Ingrese el numero de identidad de la cuenta que quiere eliminar:"));
        panel.add(numIdentField);
        
        int result = JOptionPane.showConfirmDialog(null, panel,"Agregar Solicitud",
                     JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            //Numero del usuario a eliminar
            String numIdentidad = numIdentField.getText();
            
            //Buscar cuenta
            boolean cuentaEncontrada = false;
            for (int i = 0; i < banco.cuentas.size(); i++) {
                CAhorro cuenta = banco.cuentas.get(i);
                if (cuenta.getNumIdentidad().equals(numIdentidad)) {
                    //Eliminar cuenta
                    banco.cuentas.remove(i);
                    JOptionPane.showMessageDialog(null, "Cuenta eliminada exitosamente");
                    cuentaEncontrada = true;
                    break;
                }
            }
            //Mensaje si no la encuente
            if (!cuentaEncontrada) {
                JOptionPane.showMessageDialog(null, "No se encontro ninguna cuenta con el numero de identidad proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnMostrarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCuentasActionPerformed
        textArea.setEditable(false);
        
        for (CAhorro cuenta : banco.cuentas) {
            textArea.setText(textArea.getText() + "Numero de identidad: " + cuenta.getNumIdentidad() + "\n");
            textArea.setText(textArea.getText() + "Saldo Actual: " + cuenta.getsActual()+ "\n");
        }
        //Mostrar en cuadro de dialogo
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea),"Cuentas en el Banco", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnMostrarCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAgregarSolicitud;
    private javax.swing.JButton btnAtenderSolicitudes;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnDarBajaMillonarios;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnMostrarCuentas;
    private javax.swing.JButton btnVerificarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
