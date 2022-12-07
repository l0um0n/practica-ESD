/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fichero;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class VistaRuc extends javax.swing.JFrame {

    private List<Ruc> lista;
    private GestionTXT gestion;
    private DefaultTableModel tb;
    private TableRowSorter trsfiltro;
    public VistaRuc() {
        initComponents();
        cargarTablaDesdeArchivo();
        
    }

    public void filtro() {
    trsfiltro.setRowFilter(RowFilter.regexFilter(btFiltro.getText(), 1));
    }
    
    
    private void cargarTablaDesdeArchivo() {
        gestion = new GestionTXT();
        String url = "C:\\ESD\\ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            tb = (DefaultTableModel) tablaGeneral.getModel();
            tb.setRowCount(0);
            for (Ruc r : gestion.obtenerRegistros()) {
                tb.addRow(new Object[]{
                    r.getNroRuc(),
                    r.getRazonSocial(),
                    r.getDv(),
                    r.getRucAnterior(),
                    r.getEstado()
                });

                //  System.out.println("Razon Social: " + r.getRazonSocial()+ " "  +r.getEstado());
            }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVariable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGeneral = new javax.swing.JTable();
        btnActivos = new javax.swing.JButton();
        btnbloqueados = new javax.swing.JButton();
        btncancelados = new javax.swing.JButton();
        btnSuspendidos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btFiltro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaVariable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. RUC", "Razon Social", "DV", "RUC Anterior", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVariable);
        if (tablaVariable.getColumnModel().getColumnCount() > 0) {
            tablaVariable.getColumnModel().getColumn(0).setResizable(false);
            tablaVariable.getColumnModel().getColumn(1).setResizable(false);
            tablaVariable.getColumnModel().getColumn(2).setResizable(false);
            tablaVariable.getColumnModel().getColumn(3).setResizable(false);
            tablaVariable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel1.setText("General");

        tablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. RUC", "Razon Social", "DV", "RUC Anterior", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaGeneral);
        if (tablaGeneral.getColumnModel().getColumnCount() > 0) {
            tablaGeneral.getColumnModel().getColumn(0).setResizable(false);
            tablaGeneral.getColumnModel().getColumn(1).setResizable(false);
            tablaGeneral.getColumnModel().getColumn(2).setResizable(false);
            tablaGeneral.getColumnModel().getColumn(3).setResizable(false);
            tablaGeneral.getColumnModel().getColumn(4).setResizable(false);
        }

        btnActivos.setText("Ver Activos");
        btnActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivosActionPerformed(evt);
            }
        });

        btnbloqueados.setText("Ver Bloqueados");
        btnbloqueados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbloqueadosActionPerformed(evt);
            }
        });

        btncancelados.setText("Ver Cancelados");
        btncancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceladosActionPerformed(evt);
            }
        });

        btnSuspendidos.setText("Ver Suspendidos");
        btnSuspendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspendidosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jLabel2.setText("Elegir Estado");

        btFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btFiltroKeyTyped(evt);
            }
        });

        jButton1.setText("DatosMap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(469, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnbloqueados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuspendidos))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnActivos)
                        .addGap(18, 18, 18)
                        .addComponent(btnbloqueados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelados)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuspendidos)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarTabla(){
     tb = (DefaultTableModel) tablaVariable.getModel();
            tb.setRowCount(0);
            for (Ruc r : lista) {
                tb.addRow(new Object[]{
                    r.getNroRuc(),
                    r.getRazonSocial(),
                    r.getDv(),
                    r.getRucAnterior(),
                    r.getEstado()

                });
}
    }
    private void btnActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivosActionPerformed
        
        lista=gestion.obtenerRegistrosMap().get("ACTIVO");
        refrescarTabla();
        

       /* gestion = new GestionTXT();
        String url = "C:\\ESD\\ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            tb = (DefaultTableModel) tablaVariable.getModel();
            tb.setRowCount(0);
            for (Ruc r : gestion.obtenerRegistrosActivos()) {
                tb.addRow(new Object[]{
                    r.getNroRuc(),
                    r.getRazonSocial(),
                    r.getDv(),
                    r.getRucAnterior(),
                    r.getEstado()

                });

                //  System.out.println("Razon Social: " + r.getRazonSocial()+ " "  +r.getEstado());
            }
        }*/

// TODO add your handling code here:
    }//GEN-LAST:event_btnActivosActionPerformed

    private void btnbloqueadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbloqueadosActionPerformed

        lista=gestion.obtenerRegistrosMap().get("BLOQUEADO");
        refrescarTabla();
        
        
        /*
         gestion = new GestionTXT();
        String url = "C:\\ESD\\ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            tb = (DefaultTableModel) tablaVariable.getModel();
            tb.setRowCount(0);
            for (Ruc r : gestion.obtenerRegistrosBloqueados()) {
                tb.addRow(new Object[]{
                    r.getNroRuc(),
                    r.getRazonSocial(),
                    r.getDv(),
                    r.getRucAnterior(),
                    r.getEstado()

                });

                //  System.out.println("Razon Social: " + r.getRazonSocial()+ " "  +r.getEstado());
            }
        }

*/

        // TODO add your handling code here:
    }//GEN-LAST:event_btnbloqueadosActionPerformed

    private void btncanceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceladosActionPerformed
        
        lista=gestion.obtenerRegistrosMap().get("CANCELADO");
        refrescarTabla();
        
        
        
        /* gestion = new GestionTXT();
        String url = "C:\\ESD\\ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            tb = (DefaultTableModel) tablaVariable.getModel();
            tb.setRowCount(0);
            for (Ruc r : gestion.obtenerRegistrosCancelado()) {
                tb.addRow(new Object[]{
                    r.getNroRuc(),
                    r.getRazonSocial(),
                    r.getDv(),
                    r.getRucAnterior(),
                    r.getEstado()

                });

                //  System.out.println("Razon Social: " + r.getRazonSocial()+ " "  +r.getEstado());
            }
        }*/
    }//GEN-LAST:event_btncanceladosActionPerformed

    private void btnSuspendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspendidosActionPerformed
        
        lista=gestion.obtenerRegistrosMap().get("SUSPENDIDO");
        refrescarTabla();
        
        
        
        /* gestion = new GestionTXT();
        String url = "C:\\ESD\\ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            tb = (DefaultTableModel) tablaVariable.getModel();
            tb.setRowCount(0);
            for (Ruc r : gestion.obtenerRegistrosSuspendidos()) {
                tb.addRow(new Object[]{
                    r.getNroRuc(),
                    r.getRazonSocial(),
                    r.getDv(),
                    r.getRucAnterior(),
                    r.getEstado()

                });

                //  System.out.println("Razon Social: " + r.getRazonSocial()+ " "  +r.getEstado());
            }
        }*/
    }//GEN-LAST:event_btnSuspendidosActionPerformed

    private void btFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btFiltroKeyTyped
        btFiltro.addKeyListener(new KeyAdapter() {
            public void KeyReleased(final KeyEvent e){
               String cadena=(btFiltro.getText()).toUpperCase();
               btFiltro.setText(cadena);
               repaint();
               filtro();
            }
            
        });

        trsfiltro= new TableRowSorter(tablaVariable.getModel());
        tablaVariable.setRowSorter(trsfiltro);


        // TODO add your handling code here:
    }//GEN-LAST:event_btFiltroKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        for (Map.Entry<String, List<Ruc>> en : gestion.obtenerRegistrosMap().entrySet()) {
            Object key = en.getKey();
           // Object val = en.getValue();
            System.out.println("Estados: " + en.getKey());
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaRuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRuc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btFiltro;
    private javax.swing.JButton btnActivos;
    private javax.swing.JButton btnSuspendidos;
    private javax.swing.JButton btnbloqueados;
    private javax.swing.JButton btncancelados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaGeneral;
    private javax.swing.JTable tablaVariable;
    // End of variables declaration//GEN-END:variables
}
