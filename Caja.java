/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpoo.JFMEFECTIVO;
import proyectofinalpoo.JFMCREDITO;

/**
 *
 * @author Administrador
 */
public class Caja extends javax.swing.JFrame {
    public static  String Efectivocaja="2000";

  public Caja() {
        initComponents();
         setLocationRelativeTo(null);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGTIPOPAGO = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        JTFNOMBRE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLA = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        JRCREDITODEBITO = new javax.swing.JRadioButton();
        JRDEFECTIVO = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLBSUBTOTAL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JLBISV = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLBTOTAl = new javax.swing.JLabel();
        JSCANTIDAD = new javax.swing.JSpinner();
        JBAGREGAR = new javax.swing.JButton();
        JBELIMINAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Cliente :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 120, 46));
        getContentPane().add(JTFNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 290, 40));

        jLabel2.setText("Selecione Producto :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leche", "Arroz", "Maizena", "Café soluble", "Frijol", "Sopa" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 240, 40));

        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 40));

        JTABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "total"
            }
        ));
        jScrollPane1.setViewportView(JTABLA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 480, 190));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Pagar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 110, 50));

        BGTIPOPAGO.add(JRCREDITODEBITO);
        JRCREDITODEBITO.setText("Tarjeta de Credito o Debito");
        getContentPane().add(JRCREDITODEBITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        BGTIPOPAGO.add(JRDEFECTIVO);
        JRDEFECTIVO.setText("Efectivo ");
        JRDEFECTIVO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(JRDEFECTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciones tipo de pago ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 480, 50));

        jLabel5.setText("Subtotal:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 50, 30));

        JLBSUBTOTAL.setText("0");
        getContentPane().add(JLBSUBTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 100, 30));

        jLabel6.setText("Impuesto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, 40));

        JLBISV.setText("0");
        getContentPane().add(JLBISV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 100, 40));

        jLabel7.setText("Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 70, 40));

        JLBTOTAl.setText("0");
        getContentPane().add(JLBTOTAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 90, 30));
        getContentPane().add(JSCANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 40));

        JBAGREGAR.setText("Agregrar");
        JBAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAGREGARActionPerformed(evt);
            }
        });
        getContentPane().add(JBAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, 50));

        JBELIMINAR.setText("Eliminar ");
        JBELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBELIMINARActionPerformed(evt);
            }
        });
        getContentPane().add(JBELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 90, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/white-hair-Color-Palette-color-hex.com_.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBELIMINARActionPerformed
 DefaultTableModel model = (DefaultTableModel) JTABLA.getModel(); 
          int a = JTABLA.getSelectedRow(); 
          if (a<0){ 
                JOptionPane.showMessageDialog(null, 
                "Debe seleccionar una fila de la tabla" ); 
         }else {
int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar el registro? "); 
 if(JOptionPane.OK_OPTION==confirmar) {

                   model.removeRow(a); 

                   JOptionPane.showMessageDialog(null,"Registro Eliminado" );  
 }
          }
    }//GEN-LAST:event_JBELIMINARActionPerformed

    private void JBAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAGREGARActionPerformed
    DecimalFormat df = new DecimalFormat("#.00");
    int  precio=asignacioPrecios();
    double total=0;
    int cantidad=(Integer) JSCANTIDAD.getValue();
    String producto=jComboBox1.getSelectedItem().toString();
    total=precio*cantidad;
    Imprimir(producto, precio,cantidad, total);
    }//GEN-LAST:event_JBAGREGARActionPerformed

     
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(JRDEFECTIVO. isSelected()){
         JFMEFECTIVO ver =new JFMEFECTIVO ();
         ver.setVisible(true);
        JFMEFECTIVO.JLBPAGAR.setText(JLBTOTAl.getText());
         JFMEFECTIVO.JLBEFECTIVOCAJA.setText(Efectivocaja); 
       }  
         if(JRCREDITODEBITO. isSelected()){
         JFMCREDITO ver =new JFMCREDITO();
         ver.setVisible(true);
         JFMCREDITO.JLBNOMBRECLIENTE.setText(JTFNOMBRE.getText());
         JFMCREDITO.JLBTOTAL.setText(JLBTOTAl.getText());
          
       } 
         
    }//GEN-LAST:event_jButton1ActionPerformed
  private void Imprimir(String producto, double precio,double cantidad,double total){
    DefaultTableModel modelo=(DefaultTableModel) JTABLA.getModel(); 
    DecimalFormat df = new DecimalFormat("#.00");
        Object [] fila=new Object[4]; 
        fila[0]=producto; 
        fila[1]=precio; 
        fila[2]=cantidad; 
        fila[3]=df.format(total);
         modelo.addRow(fila); 
        JTABLA.setModel(modelo); 
        Imprimirtotale(total);
    }
  private void Imprimirtotale( double total1){
     double isv=0;
     double total2=0;
     String subtotal1=JLBSUBTOTAL.getText();
     DecimalFormat df = new DecimalFormat("#.00");
     String strinSubtotal= null;
     strinSubtotal=subtotal1.replace(',', '.');
     double subtotal = Double.parseDouble(strinSubtotal);
     subtotal=subtotal+total1;
     String StringSubtotal=String.valueOf(df.format(subtotal));
     JLBSUBTOTAL.setText(StringSubtotal);
     isv=subtotal*0.15;
     total2=isv+subtotal;
     String StringIsv=String.valueOf(df.format(isv));
     JLBISV.setText(StringIsv);
     String Stringtotal3=String.valueOf(df.format(total2));
     JLBTOTAl.setText(Stringtotal3);
  }
  
  private int asignacioPrecios(){
      int  precio=0;
      String producto=jComboBox1.getSelectedItem().toString();
       if("Leche".equals(producto)){ 
          precio=21;   
    }else if("Huevos".equals(producto)){ 
       precio=31; 
    }else if("Maizena".equals(producto)) {
            precio=6; 
    }else if("Arroz".equals(producto)){
            precio=1; 
    }else if("Café soluble".equals(producto)){
            precio=14; 
    }else if("Frijol".equals(producto)){
            precio=11; 
    }else if("Sopa".equals(producto)){
           precio=18;  
    }
       return precio;
  }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGTIPOPAGO;
    private javax.swing.JButton JBAGREGAR;
    private javax.swing.JButton JBELIMINAR;
    private javax.swing.JLabel JLBISV;
    private javax.swing.JLabel JLBSUBTOTAL;
    public static javax.swing.JLabel JLBTOTAl;
    private javax.swing.JRadioButton JRCREDITODEBITO;
    private javax.swing.JRadioButton JRDEFECTIVO;
    private javax.swing.JSpinner JSCANTIDAD;
    private javax.swing.JTable JTABLA;
    private javax.swing.JTextField JTFNOMBRE;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
