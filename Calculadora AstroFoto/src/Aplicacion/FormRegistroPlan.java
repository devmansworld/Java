/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aplicacion;

import Libreria.RegistroPlan;

/**
 *
curso ing. en informatica
* 
 */
public class FormRegistroPlan extends java.awt.Frame {
     /*la clase publica FormRegistroPlan extiende la clase java.awt.Frame */
 
    public FormRegistroPlan() {
        initComponents();
    }

    /** Este método es invocado desde el constructor desde el cual se inicializa el formulario 
 ++++    este codigo se genera de manera automática con el editor NetBeans +++++++
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoOscuro = new javax.swing.JPanel();
        planDescarga = new javax.swing.JLabel();
        formatoFotos = new javax.swing.JLabel();
        cantidadFotos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxFormato = new javax.swing.JComboBox<>();
        comboBoxPlan = new javax.swing.JComboBox<>();
        input_MpxCamera = new javax.swing.JTextField();
        input_CantidadFotos = new javax.swing.JTextField();
        boton_Consultar = new javax.swing.JButton();
        boton_Restablecer = new javax.swing.JButton();
        boton_Salir = new javax.swing.JButton();
        tipoCamara = new javax.swing.JLabel();
        fondoClaro = new javax.swing.JPanel();
        tiempoDescarga = new javax.swing.JLabel();
        input_tiempoDescarga = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        fondoOscuro.setBackground(new java.awt.Color(15, 20, 102));

        planDescarga.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        planDescarga.setForeground(new java.awt.Color(254, 158, 17));
        planDescarga.setText("velocidad D/L");

        formatoFotos.setBackground(new java.awt.Color(167, 174, 160));
        formatoFotos.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        formatoFotos.setForeground(new java.awt.Color(249, 175, 33));
        formatoFotos.setText("extensión");

        cantidadFotos.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        cantidadFotos.setForeground(new java.awt.Color(255, 255, 255));
        cantidadFotos.setText("mpx");

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 240, 45));
        jLabel6.setText("cantidad");

        comboBoxFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escoger", ".RAW", ".JPEG", ".TIFF", " " }));
        comboBoxFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFormatoActionPerformed(evt);
            }
        });

        comboBoxPlan.setForeground(new java.awt.Color(10, 76, 55));
        comboBoxPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "categoria kbps", "A  3.277 kbps", "B 4.096 kbps", "C 8.192 kbps", "D 16.384  kbps", "E 24.576 kbps", "F 32.768  kbps" }));
        comboBoxPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlanActionPerformed(evt);
            }
        });

        boton_Consultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_Consultar.setText("Consultar");
        boton_Consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ConsultarActionPerformed(evt);
            }
        });

        boton_Restablecer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_Restablecer.setText("Restablecer");
        boton_Restablecer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Restablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_RestablecerActionPerformed(evt);
            }
        });

        boton_Salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_Salir.setText("Salir");
        boton_Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_SalirActionPerformed(evt);
            }
        });

        tipoCamara.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        tipoCamara.setForeground(new java.awt.Color(74, 240, 45));
        tipoCamara.setText("tamaño archivo");

        fondoClaro.setBackground(new java.awt.Color(103, 131, 230));

        tiempoDescarga.setFont(new java.awt.Font("FreeMono", 3, 12)); // NOI18N
        tiempoDescarga.setForeground(new java.awt.Color(7, 86, 106));
        tiempoDescarga.setText("horas : minutos\n\n");

        javax.swing.GroupLayout fondoClaroLayout = new javax.swing.GroupLayout(fondoClaro);
        fondoClaro.setLayout(fondoClaroLayout);
        fondoClaroLayout.setHorizontalGroup(
            fondoClaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoClaroLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(fondoClaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoClaroLayout.createSequentialGroup()
                        .addComponent(input_tiempoDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoClaroLayout.createSequentialGroup()
                        .addComponent(tiempoDescarga)
                        .addGap(50, 50, 50))))
        );
        fondoClaroLayout.setVerticalGroup(
            fondoClaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoClaroLayout.createSequentialGroup()
                .addComponent(input_tiempoDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempoDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoOscuroLayout = new javax.swing.GroupLayout(fondoOscuro);
        fondoOscuro.setLayout(fondoOscuroLayout);
        fondoOscuroLayout.setHorizontalGroup(
            fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOscuroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOscuroLayout.createSequentialGroup()
                        .addComponent(planDescarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOscuroLayout.createSequentialGroup()
                        .addComponent(formatoFotos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(fondoOscuroLayout.createSequentialGroup()
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOscuroLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOscuroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tipoCamara)))
                .addGap(18, 18, 18)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOscuroLayout.createSequentialGroup()
                        .addComponent(input_MpxCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(cantidadFotos))
                    .addComponent(input_CantidadFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoOscuroLayout.createSequentialGroup()
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOscuroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fondoClaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoOscuroLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(boton_Consultar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_Restablecer)
                        .addGap(18, 18, 18)
                        .addComponent(boton_Salir)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        fondoOscuroLayout.setVerticalGroup(
            fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOscuroLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_MpxCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_CantidadFotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoClaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_Restablecer)
                    .addComponent(boton_Consultar)
                    .addComponent(boton_Salir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(fondoOscuro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Codigo inicial exitform permite cerrar la app */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void boton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ConsultarActionPerformed
        // se genera nueva instancia de RegistroPlan 
        RegistroPlan reg = new RegistroPlan();
        reg.setPlan((int)comboBoxPlan.getSelectedIndex());
        reg.setIdFormatoFoto((int)comboBoxFormato.getSelectedIndex());
        reg.setPesoMP(Integer.valueOf(input_MpxCamera.getText()));
        reg.setCantidadFotos(Integer.valueOf(input_CantidadFotos.getText()));
        input_tiempoDescarga.setText(reg.obtenerDatos());
    }//GEN-LAST:event_boton_ConsultarActionPerformed

    private void comboBoxPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlanActionPerformed

    private void comboBoxFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFormatoActionPerformed

    private void boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_boton_SalirActionPerformed

    private void boton_RestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_RestablecerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_boton_RestablecerActionPerformed

    /**
    * @param args the command line arguments
    * argumentos de línea de comando
    * 
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistroPlan().setVisible(true);
            }
        });
    }

// cada unidad prefab como JButton, JLabel y JCombobox , asi como JTextfield se invoca como una variable privada de tipo javax.swing
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Consultar;
    private javax.swing.JButton boton_Restablecer;
    private javax.swing.JButton boton_Salir;
    private javax.swing.JLabel cantidadFotos;
    private javax.swing.JComboBox<String> comboBoxFormato;
    private javax.swing.JComboBox<String> comboBoxPlan;
    private javax.swing.JPanel fondoClaro;
    private javax.swing.JPanel fondoOscuro;
    private javax.swing.JLabel formatoFotos;
    private javax.swing.JTextField input_CantidadFotos;
    private javax.swing.JTextField input_MpxCamera;
    private javax.swing.JTextField input_tiempoDescarga;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel planDescarga;
    private javax.swing.JLabel tiempoDescarga;
    private javax.swing.JLabel tipoCamara;
    // End of variables declaration//GEN-END:variables

}
