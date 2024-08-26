import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class customer_details extends JFrame implements ActionListener{
 
    JTable t1;
    JButton b1;
    String x[] = {"First Name","Last Name","Email","Mob_No", "DOB","Gender","Address","State","City","Meter_No"};
    String y[][] = new String[20][11];
    int i=0, j=0;
    customer_details(){
        super("Customer Details");
        setSize(1200,650);
        setLocation(200,200);
        
        try{
            conn c1  = new conn();
            String s1 = "select * from cust_details;";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("c_fname");
                y[i][j++]=rs.getString("c_lname");
                y[i][j++]=rs.getString("c_email");
                y[i][j++]=rs.getString("c_mob_no");
                y[i][j++]=rs.getString("c_dob");
                y[i][j++]=rs.getString("c_gender");
                y[i][j++]=rs.getString("c_address");
                y[i][j++]=rs.getString("c_state");
                y[i][j++]=rs.getString("c_city");
                y[i][j++]=rs.getString("c_meter_no");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new customer_details().setVisible(true);
    }
    
}