/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @
 */
public class MenuItem extends javax.swing.JPanel {

    public void setShowing(boolean showing) {
        this.showing = showing;
    }

    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    /**
     * Creates new form MenuItem
     */
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act;

    public MenuItem(Icon icon,String menuName,int Separacion, ActionListener act, MenuItem... subMenu) {
        initComponents();
    
       //MODIFICACIONES DEL BOTON VISUALES
     
      lbAccesos.setIcon(icon);
      lbAccesos.setText(menuName);
      lbAccesos.setIconTextGap(Separacion);
   
      
      ///TERMINA MODIFICACIONES DEL BOTON
        if (act != null) {
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAccesos = new Utilerias.RSButtonMetro();

        setBackground(new java.awt.Color(239, 238, 244));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lbAccesos.setText("boton vario");
        lbAccesos.setColorBorde(new javax.swing.border.MatteBorder(null));
        lbAccesos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbAccesos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbAccesos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbAccesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbAccesosMousePressed(evt);
            }
        });
        lbAccesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbAccesosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAccesos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAccesos, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       //si preioanamoe el form aparecen los menus
       //mejor el de abajo
        
        /*if (showing) {
            hideMenu();
        } else {
            showMenu();
        }
        if (act != null) {
            act.actionPerformed(null);
        }*/
    }//GEN-LAST:event_formMousePressed

    private void lbAccesosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccesosMousePressed
if (showing) {
            hideMenu();
        } else {
            showMenu();
        }
        if (act != null) {
            act.actionPerformed(null);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAccesosMousePressed

    private void lbAccesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbAccesosActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAccesosActionPerformed

    private void showMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < subMenu.size(); i++) {
                    sleep();
                    subMenu.get(i).setVisible(true);
                }
                showing = true;
                getParent().repaint();
                getParent().revalidate();
            }
        }).start();
    }

    private void hideMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = subMenu.size() - 1; i >= 0; i--) {
                    sleep();
                    subMenu.get(i).setVisible(false);
                    subMenu.get(i).hideMenu();
                }
                getParent().repaint();
                getParent().revalidate();
                showing = false;
            }
        }).start();
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utilerias.RSButtonMetro lbAccesos;
    // End of variables declaration//GEN-END:variables
}
