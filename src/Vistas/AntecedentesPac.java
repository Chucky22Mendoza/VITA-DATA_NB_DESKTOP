/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Conexiones.Conexion;
import Procedimientos.Antecedentes;
import Procedimientos.DetalleMedQui;
import com.sun.awt.AWTUtilities;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mendo
 */
public class AntecedentesPac extends javax.swing.JFrame {

    int _x, _y;
    
    /**
     * Creates new form AntecedentesPac
     */
    public AntecedentesPac() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        Shape _form = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, _form);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../img/corazon.png")).getImage());
        } catch (Exception e) {
        }
        Conexion _con = new Conexion();        
        cbMQ.setModel(_con.getvalues7());   
    }
    
    void cbMedQui(){
        Conexion _con = new Conexion();    
        cbMQ.setModel(_con.getvalues7());                         
        
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
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnt1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnt2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAnt3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cbMQ = new javax.swing.JComboBox<>();
        buttonRound1 = new org.edisoncor.gui.button.ButtonRound();
        jLabel6 = new javax.swing.JLabel();
        calMQ = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        buttonRound2 = new org.edisoncor.gui.button.ButtonRound();
        buttonIcon1 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(255, 0, 0));
        panelRectTranslucido1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelRectTranslucido1MouseDragged(evt);
            }
        });
        panelRectTranslucido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRectTranslucido1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Personales Patológicos:");

        txtAnt1.setColumns(20);
        txtAnt1.setRows(5);
        jScrollPane1.setViewportView(txtAnt1);

        txtAnt2.setColumns(20);
        txtAnt2.setRows(5);
        jScrollPane3.setViewportView(txtAnt2);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("No Patológicos:");

        txtAnt3.setColumns(20);
        txtAnt3.setRows(5);
        jScrollPane4.setViewportView(txtAnt3);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Familiares:");

        cbMQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbMQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbMQMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbMQMousePressed(evt);
            }
        });

        buttonRound1.setBackground(new java.awt.Color(51, 153, 255));
        buttonRound1.setText("NUEVO");
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Médico Quirúrgicos:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Fecha:");

        buttonRound2.setBackground(new java.awt.Color(51, 153, 255));
        buttonRound2.setText("COMPLETADO");
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });

        buttonIcon1.setBackground(new java.awt.Color(255, 0, 0));
        buttonIcon1.setText("buttonIcon1");
        buttonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon1ActionPerformed(evt);
            }
        });

        buttonIcon2.setBackground(new java.awt.Color(255, 255, 51));
        buttonIcon2.setText("buttonIcon1");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel2))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbMQ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(154, 154, 154)))
                                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(calMQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cbMQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calMQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCurves1.add(panelRectTranslucido1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonIcon1ActionPerformed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void panelRectTranslucido1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRectTranslucido1MousePressed
        _x=evt.getX();
        _y=evt.getY();
    }//GEN-LAST:event_panelRectTranslucido1MousePressed

    private void panelRectTranslucido1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRectTranslucido1MouseDragged
        Point _p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(_p.x-_x,_p.y-_y);
    }//GEN-LAST:event_panelRectTranslucido1MouseDragged

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        NuevoMQ NMQ = new NuevoMQ();
        NMQ.setVisible(true);
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void cbMQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMQMousePressed
        
    }//GEN-LAST:event_cbMQMousePressed

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        Antecedentes dts = new Antecedentes();
        Conexion _con = new Conexion();                
        DetalleMedQui DMQ = new DetalleMedQui();
        
        String _ant1 = txtAnt1.getText();
        String _ant2 = txtAnt2.getText();
        String _ant3 = txtAnt3.getText();
        String _medQui = cbMQ.getSelectedItem().toString();
        String _fec = new SimpleDateFormat("dd/MM/yyyy").format(calMQ.getDate());
        
        dts.setAnt1(_ant1);
        dts.setAnt2(_ant2);
        dts.setAnt3(_ant3);
        DMQ.setOperacion(_medQui);
        DMQ.setFecha(_fec);        
        
        if(_ant1.isEmpty() || _ant2.isEmpty() || _ant3.isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo", "Error",2);         
        }else{
            _con.insertarAnt(dts);                      
            _con.insertarDetalle(DMQ);
            Doctor _doc = new Doctor();
            _doc.cbMQ.setModel(_con.getvalues7()); 
            this.dispose();            
        }       
    }//GEN-LAST:event_buttonRound2ActionPerformed

    private void cbMQMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMQMouseEntered
        cbMedQui();
    }//GEN-LAST:event_cbMQMouseEntered

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
            java.util.logging.Logger.getLogger(AntecedentesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AntecedentesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AntecedentesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AntecedentesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AntecedentesPac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon buttonIcon1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private org.edisoncor.gui.button.ButtonRound buttonRound1;
    private org.edisoncor.gui.button.ButtonRound buttonRound2;
    private com.toedter.calendar.JDateChooser calMQ;
    private javax.swing.JComboBox<String> cbMQ;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private javax.swing.JTextArea txtAnt1;
    private javax.swing.JTextArea txtAnt2;
    private javax.swing.JTextArea txtAnt3;
    // End of variables declaration//GEN-END:variables
}
