/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CPCNewView.java
 *
 * Created on May 22, 2014, 8:49:49 PM
 */

package com.requirements.CPC;

import com.requirements.models.CPCData;

/**
 *
 * @author Gilberto
 */
public class CPCNewView extends javax.swing.JFrame {

    private CPCMainView parent;
    private boolean isEditOperation;
    private CPCData item;

    /** Creates new form CPCNewView */
    public CPCNewView() {
        initComponents();
    }

    public CPCNewView(CPCMainView parent, boolean isEditOperation) {
        initComponents();

        this.parent = parent;
        this.isEditOperation = isEditOperation;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();
        companyField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seguimiento de cobros - Nuevo");

        jLabel1.setText("Empresa");

        jLabel2.setText("Descripción");

        jLabel3.setText("Fecha de pago");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Importe");

        descriptionField.setColumns(20);
        descriptionField.setRows(5);
        jScrollPane1.setViewportView(descriptionField);

        saveButton.setText("Registrar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(jLabel1)
                    .add(jLabel2))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .add(dateField)
                    .add(phoneNumberField)
                    .add(amountField)
                    .add(companyField))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .add(cancelButton)
                .add(18, 18, 18)
                .add(saveButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(companyField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(dateField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(phoneNumberField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(amountField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(saveButton)
                    .add(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (isEditOperation) {
            this.item.setAmount(this.amountField.getText());
            this.item.setCompany(this.companyField.getText());
            this.item.setDescription(this.descriptionField.getText());
            this.item.setPaymentDate(this.dateField.getText());
            this.item.setPhoneNumber(this.phoneNumberField.getText());
            this.parent.updateUI();
            this.dispose();
        } else {
            CPCData itemToAdd = new CPCData();
            itemToAdd.setCompany(this.companyField.getText());
            itemToAdd.setDescription(this.descriptionField.getText());
            itemToAdd.setPhoneNumber(this.phoneNumberField.getText());
            itemToAdd.setPaymentDate(this.dateField.getText());
            itemToAdd.setAmount(this.amountField.getText());
            itemToAdd.setStatus("Pendiente");
            this.parent.addItem(itemToAdd);
            this.dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField companyField;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the item
     */
    public CPCData getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(CPCData item) {
        this.item = item;
        this.companyField.setText(item.getCompany());
        this.descriptionField.setText(item.getDescription());
        this.dateField.setText(item.getPaymentDate());
        this.phoneNumberField.setText(item.getPhoneNumber());
        this.amountField.setText(item.getAmount());
    }

}
