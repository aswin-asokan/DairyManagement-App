/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dairymanagement;

import java.awt.Color;
import java.sql.*;

/**
 *
 * @author aswin
 */
public class Dashboard extends javax.swing.JFrame {

    int availP, availS;
    int sum0, sum1, sum2, avail0, avail1;
    int sum3, sum4, sum5, avail2, avail3;
    int sum6, sum7, sum8, avail4, avail5;
    int sum9, sum10, sum11, avail6, avail7;
    int sum12, sum13, sum14, avail8, avail9;
    int sum15, sum16, sum17, avail10, avail11;
    int sum18, sum19, sum20, avail12, avail13;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        getCountP();
        getCountS();
        getCountSa();
        dateP();
        dateS();
        SoldCow();
        SoldGoat();
        SoldBuffalo();
        SoldButter();
        SoldGhee();
        SoldCheese();
        SoldCream();
        AMountP();
        AMountS();
        AvailCow();
        AvailGoat();
        AvailBuffalo();
        AvailButter();
        AvailGhee();
        AvailCheese();
        AvailCream();
    }

    public void getCountP() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select count(*) from Purchases";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String count = rs.getString("count(*)");
                SumP.setText(count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getCountS() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select count(*) from Staffs";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String count = rs.getString("count(*)");
                SumS.setText(count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getCountSa() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select count(*) from Sales";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String count = rs.getString("count(*)");
                SumSa.setText(count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AMountP() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select count(*) from Purchases";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                availP = Integer.parseInt(rs.getString("count(*)"));
            }
            if (availP != 0) {
                String sql1 = "Select sum(Amount) from Purchases";
                Statement st1 = con.createStatement();
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                ResultSet rs1 = pstmt1.executeQuery();
                if (rs1.next()) {
                    int Sum = Integer.parseInt(rs1.getString("sum(Amount)"));
                    if (Sum != 0) {
                        PurAmount.setText(String.valueOf(Sum));
                    } else {
                        PurAmount.setText("0");
                    }
                }
            } else {
                PurAmount.setText("0");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AMountS() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select count(*) from Sales";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                availS = Integer.parseInt(rs.getString("count(*)"));
            }
            if (availS != 0) {
                String sql1 = "Select sum(Amount) from Sales";
                Statement st1 = con.createStatement();
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                ResultSet rs1 = pstmt1.executeQuery();
                if (rs1.next()) {
                    int Sum = Integer.parseInt(rs1.getString("sum(Amount)"));
                    if (Sum != 0) {
                        SalAmount.setText(String.valueOf(Sum));
                    } else {
                        SalAmount.setText("0");
                    }
                }
            } else {
                SalAmount.setText("0");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dateP() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "SELECT Date FROM Purchases LIMIT 1";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String D = rs.getNString("Date");
                date.setText(D);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dateS() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "SELECT Date FROM Sales LIMIT 1";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String D = rs.getNString("Date");
                date1.setText(D);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldCow() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Milk : Cow\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Cow.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldGoat() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Milk : Goat\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Goat.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldBuffalo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Milk : Buffalo\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Buffalo.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldButter() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Butter\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Butter.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldGhee() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Ghee\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Ghee.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldCheese() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Cheese\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Cheese.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SoldCream() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql = "Select sum(Quantity) from Sales where MilkType=\"Cream\"";
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String Sum = rs.getString("sum(Quantity)");
                Cream.setText(Sum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AvailCow() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Milk : Cow\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail0 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail0 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Milk : Cow\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum0 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Milk : Cow\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail1 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail1 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Milk : Cow\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum1 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum2 = sum0 - sum1;
                    String sql="UPDATE Quantity SET Sum='"+sum2+"' WHERE Product=\"Milk : Cow\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum2 != 0) {
                        TCow.setText("In Stock");
                    } else {
                        TCow.setForeground(Color.red);
                        TCow.setText("Out of Stock");
                    }
                } else {
                    TCow.setText("In Stock");
                }
            } else {
                TCow.setForeground(Color.red);
                TCow.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AvailGoat() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Milk : Goat\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail2 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail2 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Milk : Goat\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum3 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Milk : Goat\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail3 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail3 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Milk : Goat\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum4 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum5 = sum3 - sum4;
                    String sql="UPDATE Quantity SET Sum='"+sum5+"' WHERE Product=\"Milk : Goat\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum5 != 0) {
                        TGoat.setText("In Stock");
                    } else {
                        TGoat.setForeground(Color.red);
                        TGoat.setText("Out of Stock");
                    }
                } else {
                    TGoat.setText("In Stock");
                }
            } else {
                TGoat.setForeground(Color.red);
                TGoat.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AvailBuffalo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Milk : Buffalo\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail4 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail4 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Milk : Buffalo\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum6 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Milk : Buffalo\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail5 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail5 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Milk : Buffalo\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum7 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum8 = sum6 - sum7;
                    String sql="UPDATE Quantity SET Sum='"+sum8+"' WHERE Product=\"Milk : Buffalo\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum8 != 0) {
                        TBuffalo.setText("In Stock");
                    } else {
                        TBuffalo.setForeground(Color.red);
                        TBuffalo.setText("Out of Stock");
                    }
                } else {
                    TBuffalo.setText("In Stock");
                }
            } else {
                TBuffalo.setForeground(Color.red);
                TBuffalo.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AvailButter() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Butter\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail6 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail6 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Butter\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum9 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Butter\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail7 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail7 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Butter\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum10 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum11 = sum9 - sum10;
                    String sql="UPDATE Quantity SET Sum='"+sum11+"' WHERE Product=\"Butter\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum11 != 0) {
                        TButter.setText("In Stock");
                    } else {
                        TButter.setForeground(Color.red);
                        TButter.setText("Out of Stock");
                    }
                } else {
                    TButter.setText("In Stock");
                }
            } else {
                TButter.setForeground(Color.red);
                TButter.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void AvailGhee() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Ghee\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail8 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail8 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Ghee\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum12 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Ghee\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail9 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail9 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Ghee\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum13 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum14 = sum12 - sum13;
                    String sql="UPDATE Quantity SET Sum='"+sum14+"' WHERE Product=\"Ghee\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum11 != 0) {
                        TGhee.setText("In Stock");
                    } else {
                        TGhee.setForeground(Color.red);
                        TGhee.setText("Out of Stock");
                    }
                } else {
                    TGhee.setText("In Stock");
                }
            } else {
                TGhee.setForeground(Color.red);
                TGhee.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void AvailCheese() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Cheese\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail10 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail10 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Cheese\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum15 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Cheese\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail11 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail11 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Cheese\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum16 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum17 = sum15 - sum16;
                    String sql="UPDATE Quantity SET Sum='"+sum17+"' WHERE Product=\"Cheese\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum17 != 0) {
                        TCheese.setText("In Stock");
                    } else {
                        TCheese.setForeground(Color.red);
                        TCheese.setText("Out of Stock");
                    }
                } else {
                    TCheese.setText("In Stock");
                }
            } else {
                TCheese.setForeground(Color.red);
                TCheese.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void AvailCream() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dairymanagement", "root", "");
            String sql1 = "Select count(*) from Purchases where MilkType=\"Cream\"";
            Statement st1 = con.createStatement();
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
            if (rs1.next()) {
                avail12 = Integer.parseInt(rs1.getString("count(*)"));
            }
            if (avail12 != 0) {
                String sql2 = "Select sum(Quantity) from Purchases where MilkType=\"Cream\"";
                Statement st2 = con.createStatement();
                PreparedStatement pstmt2 = con.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    sum18 = Integer.parseInt(rs2.getString("sum(Quantity)"));
                }
                String sql3 = "Select count(*) from Sales where MilkType=\"Cream\"";
                Statement st3 = con.createStatement();
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    avail13 = Integer.parseInt(rs3.getString("count(*)"));
                }
                if (avail13 != 0) {
                    String sql4 = "Select sum(Quantity) from Sales where MilkType=\"Cream\"";
                    Statement st4 = con.createStatement();
                    PreparedStatement pstmt4 = con.prepareStatement(sql4);
                    ResultSet rs4 = pstmt4.executeQuery();
                    if (rs4.next()) {
                        sum19 = Integer.parseInt(rs4.getString("sum(Quantity)"));
                    }
                    sum20 = sum18 - sum19;
                    String sql="UPDATE Quantity SET Sum='"+sum20+"' WHERE Product=\"Cream\"";
                    Statement st=con.createStatement();
                    int rs=st.executeUpdate(sql);
                    if (sum20 != 0) {
                        TCream.setText("In Stock");
                    } else {
                        TCream.setForeground(Color.red);
                        TCream.setText("Out of Stock");
                    }
                } else {
                    TCream.setText("In Stock");
                }
            } else {
                TCream.setForeground(Color.red);
                TCream.setText("Not Available");
            }

        } catch (Exception e) {
            System.out.println(e);
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
        Logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        SumP = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SumS = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SumSa = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        TCow = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Cow = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TGoat = new javax.swing.JLabel();
        Goat = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TBuffalo = new javax.swing.JLabel();
        Buffalo = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TButter = new javax.swing.JLabel();
        Butter = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TGhee = new javax.swing.JLabel();
        Ghee = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        TCheese = new javax.swing.JLabel();
        Cheese = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        TCream = new javax.swing.JLabel();
        Cream = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        SalAmount = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        PurAmount = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 250, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setBackground(new java.awt.Color(254, 254, 254));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LOGOUT (1).png"))); // NOI18N
        Logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 150, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/home (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 100));

        jPanel4.setBackground(new java.awt.Color(62, 68, 71));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/purchasesi (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/staffi (1).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Salesi.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/reportD (1).png"))); // NOI18N
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 80, 668));

        jPanel3.setBackground(new java.awt.Color(249, 250, 253));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/purchase (1).png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/purg.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Total Purchases :");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel10.setText("Starts From ");

        date.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        SumP.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        SumP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SumP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SumP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/staff (1).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/staffg (1).png"))); // NOI18N

        SumS.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        SumS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setText("Total Staffs :");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel13.setText("Supporting you from the very Beginning");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SumS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SumS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sales (1).png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/salg.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setText("Total Sales :");

        SumSa.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        SumSa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel14.setText("Starts From ");

        date1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        date1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SumSa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SumSa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(249, 250, 253));
        jPanel8.setPreferredSize(new java.awt.Dimension(751, 35));

        TCow.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TCow.setForeground(new java.awt.Color(51, 153, 255));
        TCow.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel28.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("1");

        jLabel35.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Milk : Cow");

        Cow.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Cow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(TCow, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(Cow, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(TCow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel28))
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(249, 250, 253));

        jLabel19.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("2");

        jLabel29.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Milk : Goat");

        TGoat.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TGoat.setForeground(new java.awt.Color(51, 153, 255));
        TGoat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Goat.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Goat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(TGoat, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Goat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addComponent(TGoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Goat, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(249, 250, 253));

        jLabel20.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("3");

        jLabel30.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Milk : Buffalo");

        TBuffalo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TBuffalo.setForeground(new java.awt.Color(51, 153, 255));
        TBuffalo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Buffalo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Buffalo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(TBuffalo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Buffalo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addComponent(TBuffalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Buffalo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(249, 250, 253));

        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("4");

        jLabel31.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Butter");

        TButter.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TButter.setForeground(new java.awt.Color(51, 153, 255));
        TButter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Butter.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Butter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(TButter, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Butter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addComponent(TButter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Butter, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(249, 250, 253));

        jLabel22.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("5");

        jLabel32.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Ghee");

        TGhee.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TGhee.setForeground(new java.awt.Color(51, 153, 255));
        TGhee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Ghee.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Ghee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(TGhee, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Ghee, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addComponent(TGhee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ghee, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(249, 250, 253));

        jLabel23.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("6");

        jLabel33.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Cheese");

        TCheese.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TCheese.setForeground(new java.awt.Color(51, 153, 255));
        TCheese.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Cheese.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Cheese.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(TCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addComponent(TCheese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Cheese, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(249, 250, 253));

        jLabel24.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("7");

        jLabel34.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Cream");

        TCream.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        TCream.setForeground(new java.awt.Color(51, 153, 255));
        TCream.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Cream.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Cream.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TCream, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Cream, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addComponent(TCream, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Cream, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel17.setText("No.");

        jLabel25.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel25.setText("Product Name");

        jLabel26.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel26.setText("Status");

        jLabel27.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel27.setText("Sold");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel17)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        jPanel9.getAccessibleContext().setAccessibleDescription("");
        jPanel10.getAccessibleContext().setAccessibleDescription("");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Profit.png"))); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/profitg.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel44.setText("Purchases :");

        SalAmount.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        SalAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel45.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel45.setText("₹");

        jLabel46.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel46.setText("Sales :");

        jLabel47.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel47.setText("₹");

        PurAmount.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        PurAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hint.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PurAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel47)
                                .addGap(5, 5, 5)
                                .addComponent(SalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 11, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PurAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 1350, 660));

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

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        Login log1 = new Login();
        log1.show();
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Purchases pur = new Purchases();
        pur.show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        Staffs sta = new Staffs();
        sta.show();
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        Sales sale = new Sales();
        sale.show();
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseClicked
        // TODO add your handling code here:
        Report rep = new Report();
        rep.show();
        dispose();
    }//GEN-LAST:event_ReportMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buffalo;
    private javax.swing.JLabel Butter;
    private javax.swing.JLabel Cheese;
    private javax.swing.JLabel Cow;
    private javax.swing.JLabel Cream;
    private javax.swing.JLabel Ghee;
    private javax.swing.JLabel Goat;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel PurAmount;
    private javax.swing.JLabel Report;
    private javax.swing.JLabel SalAmount;
    private javax.swing.JLabel SumP;
    private javax.swing.JLabel SumS;
    private javax.swing.JLabel SumSa;
    private javax.swing.JLabel TBuffalo;
    private javax.swing.JLabel TButter;
    private javax.swing.JLabel TCheese;
    private javax.swing.JLabel TCow;
    private javax.swing.JLabel TCream;
    private javax.swing.JLabel TGhee;
    private javax.swing.JLabel TGoat;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

}
