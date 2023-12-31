/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dairymanagement;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aswin
 */
public class Sales extends javax.swing.JFrame {
    int sum;
    String Product;
    String pn2a;

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
        fetch();
        clear();
        Availability();
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
        Logout1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Home1 = new javax.swing.JLabel();
        Add1 = new javax.swing.JLabel();
        Update1 = new javax.swing.JLabel();
        Delete1 = new javax.swing.JLabel();
        Bill = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        Quantity2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Rate2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Date2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalesTable = new javax.swing.JTable();
        type = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout1.setBackground(new java.awt.Color(254, 254, 254));
        Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LOGOUT (1).png"))); // NOI18N
        Logout1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });
        jPanel1.add(Logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 150, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sales.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 100));

        jPanel4.setBackground(new java.awt.Color(62, 68, 71));

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/home.png"))); // NOI18N
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });

        Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/insert.png"))); // NOI18N
        Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add1MouseClicked(evt);
            }
        });

        Update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/update.png"))); // NOI18N
        Update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update1MouseClicked(evt);
            }
        });

        Delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/delete.png"))); // NOI18N
        Delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete1MouseClicked(evt);
            }
        });

        Bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bill (1).png"))); // NOI18N
        Bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Update1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Home1)
                .addGap(18, 18, 18)
                .addComponent(Add1)
                .addGap(18, 18, 18)
                .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 80, 668));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/DealerName.png"))); // NOI18N

        DName.setBackground(new java.awt.Color(254, 254, 254));
        DName.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        DName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Product.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Quantity.png"))); // NOI18N

        Quantity2.setBackground(new java.awt.Color(254, 254, 254));
        Quantity2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quantity2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Rate.png"))); // NOI18N

        Rate2.setBackground(new java.awt.Color(254, 254, 254));
        Rate2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Rate2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Date.png"))); // NOI18N

        Date2.setBackground(new java.awt.Color(254, 254, 254));
        Date2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Date2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Date2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Date2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Date2FocusLost(evt);
            }
        });
        Date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date2ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText(" Note : Use format DD/MM/YYYY for date");

        SalesTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SalesTable.setFont(new java.awt.Font("Ubuntu Light", 0, 22)); // NOI18N
        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dealer Id", "DealerName", "Product", "Quantity", "Rate", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SalesTable.setRowHeight(24);
        SalesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SalesTable);

        type.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milk : Cow", "Milk : Goat", "Milk : Buffalo", "Butter", "Ghee", "Cheese", "Cream", "Select the Product" }));
        type.setSelectedIndex(7);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Quantity2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rate2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rate2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 1360, 660));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        // TODO add your handling code here:
        Dashboard dash=new Dashboard();
        dash.show();
        dispose();
    }//GEN-LAST:event_Home1MouseClicked

    private void Date2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Date2FocusGained

    }//GEN-LAST:event_Date2FocusGained

    private void Date2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Date2FocusLost

    }//GEN-LAST:event_Date2FocusLost

    private void Date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date2ActionPerformed
    private void Availability(){
        String Product=(String) type.getSelectedItem();
        System.out.println(Product);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement","root","");
            String sql="select Sum from Quantity where Product='"+Product+"'";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                 sum = Integer.parseInt(rs.getString(sql));
                 System.out.println(sum);
                 System.out.println("if");
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void SalesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1=(DefaultTableModel)SalesTable.getModel();
        int index=SalesTable.getSelectedRow();
        DName.setText(d1.getValueAt(index, 1).toString());
        if(d1.getValueAt(index,2).toString().equals("Milk : Cow")){
            type.setSelectedIndex(0);
        }
        else if(d1.getValueAt(index,2).toString().equals("Milk : Goat")){
            type.setSelectedIndex(1);
        }
        else if(d1.getValueAt(index,2).toString().equals("Milk : Buffalo")){
            type.setSelectedIndex(2);
        }
        else if(d1.getValueAt(index,2).toString().equals("Butter")){
            type.setSelectedIndex(3);
        }
        else if(d1.getValueAt(index,2).toString().equals("Ghee")){
            type.setSelectedIndex(4);
        }
        else if(d1.getValueAt(index,2).toString().equals("Cheese")){
            type.setSelectedIndex(5);
        }
        else{
            type.setSelectedIndex(6);
        }
        Quantity2.setText(d1.getValueAt(index, 3).toString());
        Rate2.setText(d1.getValueAt(index, 4).toString());
        Date2.setText(d1.getValueAt(index, 6).toString());
    }//GEN-LAST:event_SalesTableMouseClicked
    
    private void Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add1MouseClicked

        
        if(type.getSelectedItem()=="Select the Product" || DName.getText().isEmpty() || Quantity2.getText().isEmpty() || Rate2.getText().isEmpty() || Date2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Select and fill all the fields");
        }
        else{
            String DealerName=DName.getText();
            Product=(String) type.getSelectedItem();
            int Quantity=Integer.parseInt(Quantity2.getText());
            int Rate=Integer.parseInt(Rate2.getText());
            int Amount=Rate*Quantity;
            String Date=Date2.getText();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement","root","");
                Statement stmt = con.createStatement();
                String sql1="SELECT * FROM Sales WHERE DealerName='"+DealerName+"' AND MilkType='"+Product+"' AND Quantity='"+Quantity+"' AND Rate='"+Rate+"' AND Amount='"+Amount+"' AND Date='"+Date+"' ";
                ResultSet rs1 = stmt.executeQuery(sql1);
                if(rs1.next())
                {
                    JOptionPane.showMessageDialog(null, "Entry Already Exists");
                    clear();
                }
                else
                {
                    String sql="INSERT INTO Sales(DealerName,MilkType,Quantity,Rate,Amount,Date) VALUES('"+DealerName+"','"+Product+"','"+Quantity+"','"+Rate+"','"+Amount+"','"+Date+"');";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if(rs==1){
                        JOptionPane.showMessageDialog(this,"Data Added");
                        fetch();
                        clear();
                    }
                }

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_Add1MouseClicked

    private void Update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update1MouseClicked
        // TODO add your handling code here:
        if(type.getSelectedItem()=="Select the Product" || DName.getText().isEmpty() || Quantity2.getText().isEmpty() || Rate2.getText().isEmpty() || Date2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Select and fill all the fields");
        }
        else{
            try{
                DefaultTableModel d1=(DefaultTableModel)SalesTable.getModel();
                int index=Integer.parseInt(d1.getValueAt(SalesTable.getSelectedRow(),0).toString());
                String DealerName=DName.getText();
                String MilkType=(String) type.getSelectedItem();
                int Quantity=Integer.parseInt(Quantity2.getText());
                int Rate=Integer.parseInt(Rate2.getText());
                int Amount=Rate*Quantity;
                String Date=Date2.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement","root","");
                String sql="update Sales set DealerName='"+DealerName+"',MilkType='"+MilkType+"',Quantity='"+Quantity+"',Rate='"+Rate+"',Amount='"+Amount+"',Date='"+Date+"' where Id='"+index+"'";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.executeUpdate(sql);
                fetch();
                clear();
                JOptionPane.showMessageDialog(null, "Updated");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_Update1MouseClicked

    private void Delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete1MouseClicked
        // TODO add your handling code here:
        try{
            DefaultTableModel d1=(DefaultTableModel)SalesTable.getModel();
            int index=Integer.parseInt(d1.getValueAt(SalesTable.getSelectedRow(),0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement","root","");
            String sql="DELETE FROM Sales WHERE Id='"+index+"'";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate(sql);
            fetch();
            clear();
            JOptionPane.showMessageDialog(null, "Deleted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_Delete1MouseClicked

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        // TODO add your handling code here:
        Login log1=new Login();
        log1.show();
        dispose();
    }//GEN-LAST:event_Logout1ActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
        String Product=(String) type.getSelectedItem();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement","root","");
            String sql="select Sum from Quantity where Product='"+Product+"'";
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                sum=Integer.parseInt(rs.getString("Sum"));
            }
            if(Product == "Select the Product")
            {
                type.getSelectedItem();
            }
            else if(sum == 0){
                JOptionPane.showMessageDialog(this,"Product not available");
                type.setSelectedIndex(7);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_typeActionPerformed
     private static void printAsTextFile(String content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the bill content to the text file
            writer.write(content);
            
            System.out.println("Bill saved as text file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving bill as text file: " + e.getMessage());
        }
    }
     private void printFile() throws AWTException{
         String filePath = System.getProperty("user.home")+"/Documents/bill.txt";  // Replace with the actual file path

        // Create a File object for the file to be printed
        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        try {
            // Open the file using the default application associated with the file type
            Desktop.getDesktop().open(file);

            // Delay for a few seconds to allow the file to open
            Thread.sleep(2000);

            // Create a Robot instance
            Robot robot = new Robot();

            // Simulate key presses for Ctrl+P
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Delay for a few seconds to allow the print dialog to open
            Thread.sleep(2000);

            // Simulate key press for Enter to confirm printing
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            System.out.println("File sent to printer for printing.");
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Error during delay: " + e.getMessage());
        } catch (AWTException e) {
            System.out.println("Error creating Robot instance: " + e.getMessage());
        }
     }
    private void BillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillMouseClicked
        String DealerName="";
        String MilkType="";
        int Quantity=0;
        int Rate=0;
        int Amount=0;
        String Date="";
        if(type.getSelectedItem()=="Select the Product" || DName.getText().isEmpty() || Quantity2.getText().isEmpty() || Rate2.getText().isEmpty() || Date2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Select and fill all the fields");
        }
        else{
            try{
                DefaultTableModel d1=(DefaultTableModel)SalesTable.getModel();
                int index=Integer.parseInt(d1.getValueAt(SalesTable.getSelectedRow(),0).toString());
                DealerName=DName.getText();
                MilkType=(String) type.getSelectedItem();
                Quantity=Integer.parseInt(Quantity2.getText());
                Rate=Integer.parseInt(Rate2.getText());
                Amount=Rate*Quantity;
                Date=Date2.getText();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        String billContent = "----------------------------------------Bill Amount----------------------------------------\nDealer Name: "+DealerName+"\nDate: "+Date+"\nProduct: "+MilkType+"\nQuantity: "+Quantity+"\nRate: "+Rate+"\n-------------------------------------------------------------------------------------------\nTotal Amount: "+Amount+"\n-------------------------------------------------------------------------------------------\n";
        String filePath = System.getProperty("user.home")+"/Documents/bill.txt";
        printAsTextFile(billContent, filePath);
        try {
            printFile();
        } catch (AWTException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BillMouseClicked

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Bill;
    private javax.swing.JTextField DName;
    private javax.swing.JTextField Date2;
    private javax.swing.JLabel Delete1;
    private javax.swing.JLabel Home1;
    private javax.swing.JButton Logout1;
    private javax.swing.JTextField Quantity2;
    private javax.swing.JTextField Rate2;
    private javax.swing.JTable SalesTable;
    private javax.swing.JLabel Update1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    private void fetch() {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement","root","");
           String sql="select * from Sales";
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           DefaultTableModel d1=(DefaultTableModel)SalesTable.getModel();
           d1.setRowCount(0);
           while(rs.next())
           {
               Vector v2=new Vector();
                    v2.add(rs.getString("Id"));
                    v2.add(rs.getString("DealerName"));
                    v2.add(rs.getString("MilkType"));
                    v2.add(rs.getString("Quantity"));
                    v2.add(rs.getString("Rate"));
                    v2.add(rs.getString("Amount"));
                    v2.add(rs.getString("Date"));
               d1.addRow(v2);
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }

    private void clear() {
        DName.setText("");
        Quantity2.setText("");
        Rate2.setText("");
        Date2.setText("");
        type.setSelectedIndex(7);
    }

    void add(Type type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
