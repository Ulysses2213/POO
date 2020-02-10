/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb05;
import javax.swing.JOptionPane;
import cb05.beans.EntradaSalidaBeans;
import cb05.ConB1B2;

/**
 *
 * @author gem2u
 */
public class EntradaSalida extends javax.swing.JFrame {

    /**
     * Creates new form EntradaSalida
     */
    public EntradaSalida() {
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

        lbTituloBN = new javax.swing.JLabel();
        lbB1 = new javax.swing.JLabel();
        cbB1 = new javax.swing.JComboBox<>();
        lbMensajeDigitos = new javax.swing.JLabel();
        lbResultadoDigitosPermitidos = new javax.swing.JLabel();
        lbMensajeNumero = new javax.swing.JLabel();
        tfEntradaNumero = new javax.swing.JTextField();
        lbMensajeResultado = new javax.swing.JLabel();
        lbB2 = new javax.swing.JLabel();
        cbB2 = new javax.swing.JComboBox<>();
        btCalcular = new javax.swing.JButton();
        btTerminar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbResultadoFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(442, 342));
        setMinimumSize(new java.awt.Dimension(442, 342));
        setResizable(false);

        lbTituloBN.setText("<html><center>ENTRE BASES NUMERICAS</center><br>B1 es la base fuente y B2 es la base destino</html>");

        lbB1.setText("Elija la Base 1");

        cbB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        cbB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbB1ActionPerformed(evt);
            }
        });

        lbMensajeDigitos.setText("Digitos Permitidos:");

        lbMensajeNumero.setText("Escriba el numero a convertir:");

        lbMensajeResultado.setText("Resultado:");

        lbB2.setText("Elija la Base 2");

        cbB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        cbB2.setSelectedIndex(1);
        cbB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbB2ActionPerformed(evt);
            }
        });

        btCalcular.setText("CALCULAR");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        btTerminar.setText("TERMINAR");
        btTerminar.setMaximumSize(new java.awt.Dimension(102, 31));
        btTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTerminarActionPerformed(evt);
            }
        });

        btCancelar.setText("CANCELAR");
        btCancelar.setMaximumSize(new java.awt.Dimension(102, 31));
        btCancelar.setMinimumSize(new java.awt.Dimension(102, 31));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbB1)
                                .addGap(18, 18, 18)
                                .addComponent(cbB1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbMensajeDigitos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbResultadoDigitosPermitidos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbMensajeResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbResultadoFinal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbMensajeNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbB2)
                                .addGap(18, 18, 18)
                                .addComponent(cbB2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbTituloBN)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbTituloBN)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbResultadoDigitosPermitidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbB1)
                                .addComponent(cbB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbMensajeDigitos)))
                        .addGap(29, 29, 29)
                        .addComponent(lbMensajeNumero))
                    .addComponent(tfEntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbB2)
                    .addComponent(cbB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMensajeResultado)
                    .addComponent(lbResultadoFinal))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // TODO add your handling code here:
        String entrada = tfEntradaNumero.getText();
        int numero = Integer.parseInt(entrada);
        
        EntradaSalidaBeans esNumero = new EntradaSalidaBeans(); 
        esNumero.setEntradaNumero(numero);
        
        ConB1B2 resultado = new ConB1B2();
        lbResultadoFinal.setText(resultado.hacerCalculo());
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTerminarActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_btTerminarActionPerformed

    private void cbB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbB1ActionPerformed
        // TODO add your handling code here:
        String valorCB1 = (String) cbB1.getSelectedItem();
        int valorB1 = Integer.parseInt(valorCB1);
        String valorCB2 = (String) cbB2.getSelectedItem();
        int valorB2 = Integer.parseInt(valorCB2);
        EntradaSalidaBeans esB1 = new EntradaSalidaBeans();
        esB1.setB1(valorB1);
        validarBox(valorB1, valorB2);
        switch(valorB1){
            case 2:{
                lbResultadoDigitosPermitidos.setText("0 - 1");
            }break;
            case 3:{
                lbResultadoDigitosPermitidos.setText("0 - 2");
            }break;
            case 4:{
                lbResultadoDigitosPermitidos.setText("0 - 3");
            }break;
            case 5:{
                lbResultadoDigitosPermitidos.setText("0 - 4");
            }break;
            case 6:{
                lbResultadoDigitosPermitidos.setText("0 - 5");
            }break;
            case 7:{
                lbResultadoDigitosPermitidos.setText("0 - 6");
            }break;
            case 8:{
                lbResultadoDigitosPermitidos.setText("0 - 7");
            }break;
            case 9:{
                lbResultadoDigitosPermitidos.setText("0 - 8");
            }break;
            case 10:{
                lbResultadoDigitosPermitidos.setText("0 - 9");
            }break;
            case 11:{
                lbResultadoDigitosPermitidos.setText("0-9 | A ");
            }break;
            case 12:{
                lbResultadoDigitosPermitidos.setText("0-9 | A-B");
            }break;
            case 13:{
                lbResultadoDigitosPermitidos.setText("0-9 | A-C");
            }break;
            case 14:{
                lbResultadoDigitosPermitidos.setText("0-9 | A-D");
            }break;
            case 15:{
                lbResultadoDigitosPermitidos.setText("0-9 | A-E");
            }break;
            case 16:{
                lbResultadoDigitosPermitidos.setText("0-9 | A-F");
            }break;
        }
    }//GEN-LAST:event_cbB1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        cbB1.setSelectedIndex(0);//Reset al B1
        cbB2.setSelectedIndex(1);//Reset al B2
        lbResultadoDigitosPermitidos.setText(" ");//Borrar el resultado de los digitos permitidos
        tfEntradaNumero.setText(" ");//Borrar la entrada del numero
        lbResultadoFinal.setText(" ");//Borrar el resultado final
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbB2ActionPerformed
        // TODO add your handling code here:
        String valorCB1 = (String) cbB1.getSelectedItem();
        int valorB1 = Integer.parseInt(valorCB1);
        String valorCB2 = (String) cbB2.getSelectedItem();
        int valorB2 = Integer.parseInt(valorCB2);
        
        EntradaSalidaBeans esB2 = new EntradaSalidaBeans();
        esB2.setB2(valorB2);
        
        validarBox(valorB1, valorB2);   
    }//GEN-LAST:event_cbB2ActionPerformed

    public void validarBox(int valorB1, int valorB2){ 
        if(valorB1 == valorB2){
            JOptionPane.showMessageDialog(null, "Las bases son iguales, por favor, elija correctamente");
            cbB1.setSelectedIndex(0);
            cbB2.setSelectedIndex(1);
        }
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
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btTerminar;
    private javax.swing.JComboBox<String> cbB1;
    private javax.swing.JComboBox<String> cbB2;
    private javax.swing.JLabel lbB1;
    private javax.swing.JLabel lbB2;
    private javax.swing.JLabel lbMensajeDigitos;
    private javax.swing.JLabel lbMensajeNumero;
    private javax.swing.JLabel lbMensajeResultado;
    private javax.swing.JLabel lbResultadoDigitosPermitidos;
    private javax.swing.JLabel lbResultadoFinal;
    private javax.swing.JLabel lbTituloBN;
    private javax.swing.JTextField tfEntradaNumero;
    // End of variables declaration//GEN-END:variables
}
