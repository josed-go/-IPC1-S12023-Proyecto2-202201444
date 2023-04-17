/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author JD
 */
public class Biblioteca extends javax.swing.JFrame {

    /**
     * Creates new form Biblioteca
     */
    
    Color color1 = new Color(255,210,129);
    Color color2 = new Color(255,221,154);
    Color color3 = new Color(255,233,179);
    Color color4 = new Color(255,244,203);
    Color color5 = new Color(255,255,228);
    
    public Biblioteca() {
        initComponents();
        this.getContentPane().setBackground(new Color(255,255,228));
        ColorTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnACategoria = new javax.swing.JButton();
        btnECategoria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnAImagen = new javax.swing.JButton();
        btnEImagen = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnCambiarD = new javax.swing.JLabel();
        btnCambiarI = new javax.swing.JLabel();
        lblNimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 244, 203));

        tblCategoria.setBackground(new java.awt.Color(255, 255, 228));
        tblCategoria.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATEGORIAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoria.setGridColor(new java.awt.Color(255, 210, 129));
        tblCategoria.setSelectionBackground(new java.awt.Color(255, 233, 179));
        jScrollPane1.setViewportView(tblCategoria);

        jButton1.setBackground(new java.awt.Color(255, 221, 154));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SALIR");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnACategoria.setBackground(new java.awt.Color(255, 221, 154));
        btnACategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnACategoria.setForeground(new java.awt.Color(0, 0, 0));
        btnACategoria.setText("AGREGAR");
        btnACategoria.setFocusPainted(false);

        btnECategoria.setBackground(new java.awt.Color(255, 221, 154));
        btnECategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnECategoria.setForeground(new java.awt.Color(0, 0, 0));
        btnECategoria.setText("ELIMINAR");
        btnECategoria.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnACategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(btnECategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnACategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnECategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 228));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        lblUser.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("José");

        btnAImagen.setBackground(new java.awt.Color(255, 221, 154));
        btnAImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAImagen.setForeground(new java.awt.Color(0, 0, 0));
        btnAImagen.setText("AGREGAR IMAGEN");
        btnAImagen.setFocusPainted(false);

        btnEImagen.setBackground(new java.awt.Color(255, 221, 154));
        btnEImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEImagen.setForeground(new java.awt.Color(0, 0, 0));
        btnEImagen.setText("ELIMINAR IMAGEN");
        btnEImagen.setFocusPainted(false);

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCambiarD.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnCambiarD.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiarD.setText(">");
        btnCambiarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiarDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiarDMouseExited(evt);
            }
        });

        btnCambiarI.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnCambiarI.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiarI.setText("<");
        btnCambiarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiarIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiarIMouseExited(evt);
            }
        });

        lblNimagen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNimagen.setForeground(new java.awt.Color(0, 0, 0));
        lblNimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNimagen.setText("NOMBRE IIMAGEN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnAImagen)
                        .addGap(54, 54, 54)
                        .addComponent(btnEImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiarI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCambiarD)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 185, Short.MAX_VALUE)
                .addComponent(lblNimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnCambiarI))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(btnCambiarD)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNimagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio = new Inicio();
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCambiarDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarDMouseEntered
        HoverBTN(btnCambiarD, color2);
    }//GEN-LAST:event_btnCambiarDMouseEntered

    private void btnCambiarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarDMouseExited
        HoverBTN(btnCambiarD, color5);
    }//GEN-LAST:event_btnCambiarDMouseExited

    private void btnCambiarIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarIMouseEntered
        HoverBTN(btnCambiarI, color2);
    }//GEN-LAST:event_btnCambiarIMouseEntered

    private void btnCambiarIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarIMouseExited
        HoverBTN(btnCambiarI, color5);
    }//GEN-LAST:event_btnCambiarIMouseExited

    private void HoverBTN(JLabel lbl, Color color) {
        lbl.setOpaque(true);
        lbl.setBackground(color);
    }
    
    private void ColorTabla() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CATEGORIAS"},1);
        tblCategoria.setModel(modelo);
        
        tblCategoria.getTableHeader().setBackground(color1);
        tblCategoria.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 14));
        tblCategoria.setOpaque(true);
        
        tblCategoria.setBackground(color5);
        
        TableModel modeloDatos = tblCategoria.getModel();
        
        modeloDatos.setValueAt("Hola", 0, 0);
    }
    
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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACategoria;
    private javax.swing.JButton btnAImagen;
    private javax.swing.JLabel btnCambiarD;
    private javax.swing.JLabel btnCambiarI;
    private javax.swing.JButton btnECategoria;
    private javax.swing.JButton btnEImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNimagen;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblCategoria;
    // End of variables declaration//GEN-END:variables
}
