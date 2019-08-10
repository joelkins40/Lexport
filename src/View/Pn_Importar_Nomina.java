/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



/**
 *
 * @author RojeruSan
 */
public class Pn_Importar_Nomina extends javax.swing.JPanel {

    
    /**
     * Creates new form pnlHome
     */
    public Pn_Importar_Nomina() {
        initComponents();
        

    }

   


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        t_ruta = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        bt_importar = new Utilerias.RSButtonMetro();
        bt_examinar = new Utilerias.RSButtonMetro();

        jSeparator6.setBackground(new java.awt.Color(128, 128, 131));

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(128, 128, 131));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/importacion.png"))); // NOI18N
        jLabel8.setText("Módulo de Importación");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 860, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(97, 212, 195), 3));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(128, 128, 131));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Dirección del Archivo");

        t_ruta.setForeground(new java.awt.Color(153, 153, 153));
        t_ruta.setBorder(null);
        t_ruta.setEnabled(false);
        t_ruta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_rutaFocusLost(evt);
            }
        });
        t_ruta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_rutaMouseClicked(evt);
            }
        });
        t_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_rutaActionPerformed(evt);
            }
        });
        t_ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_rutaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(t_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(t_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 400, 70));

        jSeparator2.setBackground(new java.awt.Color(128, 128, 131));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1040, 10));

        bt_importar.setBackground(new java.awt.Color(97, 212, 195));
        bt_importar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_importar.setForeground(new java.awt.Color(255, 255, 255));
        bt_importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus24x24.png"))); // NOI18N
        bt_importar.setText("Importar");
        bt_importar.setColorHover(new java.awt.Color(128, 128, 131));
        bt_importar.setColorNormal(new java.awt.Color(97, 212, 195));
        bt_importar.setColorTextHover(new java.awt.Color(102, 255, 255));
        bt_importar.setColorTextNormal(new java.awt.Color(255, 255, 255));
        bt_importar.setColorTextPressed(new java.awt.Color(255, 255, 255));
        bt_importar.setIconTextGap(10);
        bt_importar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_importarMouseClicked(evt);
            }
        });
        bt_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_importarActionPerformed(evt);
            }
        });
        add(bt_importar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 160, -1));

        bt_examinar.setBackground(new java.awt.Color(97, 212, 195));
        bt_examinar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_examinar.setForeground(new java.awt.Color(255, 255, 255));
        bt_examinar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        bt_examinar.setText("Examinar");
        bt_examinar.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_examinar.setColorHover(new java.awt.Color(128, 128, 131));
        bt_examinar.setColorNormal(new java.awt.Color(97, 212, 195));
        bt_examinar.setColorTextHover(new java.awt.Color(153, 255, 255));
        bt_examinar.setColorTextNormal(new java.awt.Color(255, 255, 255));
        bt_examinar.setColorTextPressed(new java.awt.Color(255, 255, 255));
        bt_examinar.setIconTextGap(10);
        bt_examinar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bt_examinarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bt_examinarFocusLost(evt);
            }
        });
        bt_examinar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_examinarMouseClicked(evt);
            }
        });
        bt_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_examinarActionPerformed(evt);
            }
        });
        add(bt_examinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void t_rutaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_rutaFocusLost
       

        // TODO add your handling code here:
    }//GEN-LAST:event_t_rutaFocusLost

    private void t_rutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_rutaMouseClicked
        // TODO add your handling code here:

    
    }//GEN-LAST:event_t_rutaMouseClicked

    private void t_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_rutaActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_t_rutaActionPerformed

    private void bt_importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_importarActionPerformed
       
    }//GEN-LAST:event_bt_importarActionPerformed

    private void t_rutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_rutaKeyTyped
      
    }//GEN-LAST:event_t_rutaKeyTyped

    private void bt_examinarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt_examinarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_examinarFocusGained

    private void bt_examinarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt_examinarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_examinarFocusLost

    private void bt_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_examinarActionPerformed
      
    }//GEN-LAST:event_bt_examinarActionPerformed

    private void bt_examinarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_examinarMouseClicked
        // TODO add your handling code here:
        bt_examinar.setEnabled(false);
    }//GEN-LAST:event_bt_examinarMouseClicked

    private void bt_importarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_importarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_importarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utilerias.RSButtonMetro bt_examinar;
    private Utilerias.RSButtonMetro bt_importar;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField t_ruta;
    // End of variables declaration//GEN-END:variables

}
