/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cjwizard.demo;

import java.awt.Dialog;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author AO
 */
public class Main extends javax.swing.JDialog {

    /**
     * Creates new form Main
     */
    public Main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jButtonDemo2 = new javax.swing.JButton();
        jButtonDemo1 = new javax.swing.JButton();
        jButtonNavBar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CJ Wizard Demos");

        jButtonDemo2.setText("Wizard Test 2");
        jButtonDemo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDemo2ActionPerformed(evt);
            }
        });

        jButtonDemo1.setText("Wizard Test 1");
        jButtonDemo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDemo1ActionPerformed(evt);
            }
        });

        jButtonNavBar.setText("Example Nav Bar");
        jButtonNavBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDemo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 254, Short.MAX_VALUE))
                    .addComponent(jButtonDemo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDemo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDemo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNavBar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDemo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDemo1ActionPerformed
        // TODO add your handling code here:
        WizardTest test = new WizardTest();
        test.setSize(new Dimension(400, 300));
        test.setModalityType(Dialog.ModalityType.APPLICATION_MODAL); // prevent user from doing something else
        test.setLocationRelativeTo(null);
        test.setVisible(true);

    }//GEN-LAST:event_jButtonDemo1ActionPerformed

    private void jButtonDemo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDemo2ActionPerformed
        // TODO add your handling code here:
        WizardTest2 test = new WizardTest2();
        test.setSize(new Dimension(400, 300));
        test.setModalityType(Dialog.ModalityType.APPLICATION_MODAL); // prevent user from doing something else
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }//GEN-LAST:event_jButtonDemo2ActionPerformed

    private void jButtonNavBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavBarActionPerformed
        // TODO add your handling code here:
         WizardTestNavBar test = new WizardTestNavBar(new javax.swing.JFrame(),true);
        test.setSize(new Dimension(500, 300));
        test.setModalityType(Dialog.ModalityType.APPLICATION_MODAL); // prevent user from doing something else
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }//GEN-LAST:event_jButtonNavBarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Main dialog = new Main(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setTitle("CJ Wizard Demos");
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDemo1;
    private javax.swing.JButton jButtonDemo2;
    private javax.swing.JButton jButtonNavBar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
