/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oop.assignment.dao.productDAO;
import oop.assignment.dao.supplierDAO;
import oop.assignment.repository.ProductRepository;
import oop.assignment.repository.SupplierRepository;


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private ProductRepository productRepository;
    
    private SupplierRepository supplierRepository;
    
    private List<String> supplierNames = new ArrayList<>();

    private Map<String, Integer> supplierSelection = new HashMap<>();
    
    public MainFrame() {
        initComponents();
        productRepository = new ProductRepository();
        supplierRepository = new SupplierRepository();
        initSupplierSelection();
    }

    private void initSupplierSelection() {
        List<supplierDAO> suppliers = supplierRepository.getListSupplier();
        for (supplierDAO s : suppliers) {
            if (s.isIsActive() == false) {
                continue;
            }
            this.supplierNames.add(s.getName());
        }

        for (supplierDAO s : suppliers) {
            if (s.isIsActive() == false) {
                continue;
            }
            supplierSelection.put(s.getName(), s.getId());
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

        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jbtSearch = new javax.swing.JButton();
        jbtAll = new javax.swing.JButton();
        New = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        SKU = new javax.swing.JLabel();
        jtxtSKU = new javax.swing.JTextField();
        Supplier = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Quantity = new javax.swing.JLabel();
        jtxtQuantity = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        jtxtPrice = new javax.swing.JTextField();
        jbtCreate = new javax.swing.JButton();
        jbtUpdate = new javax.swing.JButton();
        jbtRemove = new javax.swing.JButton();
        jbtReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtSearch.setText("Search");
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jbtAll.setText("All");
        jbtAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAllActionPerformed(evt);
            }
        });

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtSearch)
                .addGap(18, 18, 18)
                .addComponent(jbtAll)
                .addGap(18, 18, 18)
                .addComponent(New)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSearch)
                    .addComponent(jbtAll)
                    .addComponent(New))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "SKU", "Supplier", "Quantity", "Price"
            }
        ));
        productTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                productTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ID.setText("ID");

        jtxtID.setEnabled(false);

        Name.setText("Name");

        SKU.setText("SKU");

        Supplier.setText("Supplier");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Quantity.setText("Quantity");

        Price.setText("Price");

        jbtCreate.setText("Create");
        jbtCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCreateActionPerformed(evt);
            }
        });

        jbtUpdate.setText("Update");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        jbtRemove.setText("Remove");
        jbtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveActionPerformed(evt);
            }
        });

        jbtReset.setText("Reset");
        jbtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtID)
                            .addComponent(jtxtName)
                            .addComponent(jtxtSKU)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtQuantity)
                            .addComponent(jtxtPrice)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtReset, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtID)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SKU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUpdate)
                    .addComponent(jbtRemove))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCreate)
                    .addComponent(jbtReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
        
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel(supplierNames.toArray());
        jComboBox1.setModel(comboBoxModel);
        jbtResetActionPerformed(evt);
    }//GEN-LAST:event_NewActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jbtAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAllActionPerformed
        // TODO add your handling code here:
        List<productDAO> proList = productRepository.listProduct();
        showProductTable(proList);
    }//GEN-LAST:event_jbtAllActionPerformed

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        // TODO add your handling code here:
        String searchTxt = txtSearch.getText();
        List<productDAO> proList = productRepository.searchProduct(searchTxt);
        showProductTable(proList);
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jbtCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCreateActionPerformed
        // TODO add your handling code here:
        if (check()){
            String name = jtxtName.getText();
            String sku  = jtxtSKU.getText();
            int supplierID = supplierSelection.get(jComboBox1.getSelectedItem().toString());
            int qty = Integer.parseInt(jtxtQuantity.getText());
            double price = Double.parseDouble(jtxtPrice.getText());
        
            productDAO pDAO = new productDAO(name, sku, supplierID, qty, price);
            productRepository.createProduct(pDAO);
        
            List<productDAO> proList = productRepository.listProduct();
            showProductTable(proList);
        }
        
    }//GEN-LAST:event_jbtCreateActionPerformed

    private void jbtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetActionPerformed
        // TODO add your handling code here:
        jtxtName.setText("");
        jtxtSKU.setText("");
        jComboBox1.setSelectedIndex(0);
        jtxtQuantity.setText("");
        jtxtPrice.setText("");
    }//GEN-LAST:event_jbtResetActionPerformed

    
    private void productTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_productTableAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_productTableAncestorAdded

    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
        // TODO add your handling code here:
        if (check()){
            int id = Integer.parseInt(jtxtID.getText());
            String name = jtxtName.getText();
            String sku  = jtxtSKU.getText();
            int supplierID = supplierSelection.get(jComboBox1.getSelectedItem().toString());
            int qty = Integer.parseInt(jtxtQuantity.getText());
            double price = Double.parseDouble(jtxtPrice.getText());
        
            productDAO pDAO = new productDAO(id,name, sku, supplierID, qty, price);
            productRepository.updateProduct(pDAO);
        
            List<productDAO> proList = productRepository.listProduct();
            showProductTable(proList);
        }
    }//GEN-LAST:event_jbtUpdateActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int row= productTable.getSelectedRow();
        
        jtxtID.setText(model.getValueAt(row, 0).toString());
        jtxtName.setText(model.getValueAt(row, 1).toString());
        jtxtSKU.setText(model.getValueAt(row,2).toString());
        String supplierSelectName  = model.getValueAt(row, 3).toString();
        jtxtQuantity.setText(model.getValueAt(row, 4).toString());
        jtxtPrice.setText(model.getValueAt(row, 5).toString());
        
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel(supplierNames.toArray());
        jComboBox1.setModel(comboBoxModel);
        jComboBox1.setSelectedItem(supplierSelectName);
    }//GEN-LAST:event_productTableMouseClicked

    private void jbtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtxtID.getText());
        productRepository.removeProduct(id);
        
        List<productDAO> proList = productRepository.listProduct();
        showProductTable(proList);
    }//GEN-LAST:event_jbtRemoveActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Name;
    private javax.swing.JButton New;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel SKU;
    private javax.swing.JLabel Supplier;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAll;
    private javax.swing.JButton jbtCreate;
    private javax.swing.JButton jbtRemove;
    private javax.swing.JButton jbtReset;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextField jtxtQuantity;
    private javax.swing.JTextField jtxtSKU;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void showProductTable(List<productDAO> proList) {
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        for(productDAO product : proList){
            model.addRow(new Object[]{product.getId(),product.getName(),product.getSku(),product.getSupplierName(),
                                      product.getQuantity(),product.getPrice()});
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    private boolean check(){
        if (jtxtName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "chua nhap ten");
            jtxtName.requestFocus();
            return false;
        }
        
        if (jtxtSKU.getText().equals("")){
            JOptionPane.showMessageDialog(this,"chua nhap ma SKU");
            jtxtSKU.requestFocus();
            return false;
        }
        
        if (jtxtQuantity.getText().equals("")){
            JOptionPane.showMessageDialog(this,"chua nhap so luong");
            jtxtQuantity.requestFocus();
            return false;
        }
        
        if (jtxtPrice.getText().equals("")){
            JOptionPane.showMessageDialog(this,"chua nhap gia");
            jtxtPrice.requestFocus();
            return false;
        }
        return true;
    }
    
}