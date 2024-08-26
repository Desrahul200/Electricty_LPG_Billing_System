import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class calculate_bill extends JFrame implements ActionListener{
    
	private JPanel contentPane = new JPanel();
	JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    Choice c1,c2;
    JButton b1,b2;
    JPanel p;
    calculate_bill(){
        
        p = new JPanel();
        p.setBounds(0, 64, 634, 397);
        p.setBackground(Color.WHITE);
        
        l1 = new JLabel("Calculate Electricity Bill");
        l1.setBounds(176, 0, 298, 34);
        l2 = new JLabel("Meter No");
        l2.setBounds(189, 0, 121, 76);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setBackground(Color.WHITE);
        l3 = new JLabel("Units Cosumed");
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        l3.setBounds(164, 213, 158, 76);
        l5 = new JLabel("Month");
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        l5.setBounds(189, 115, 81, 76);
        
        
        
        t1 = new JTextField();
        t1.setBounds(332, 213, 302, 76);
        
        c1 = new Choice();
        c1.setBounds(332, 30, 302, 20);
        c1.add("1001");
        c1.add("1002");
        c1.add("1003");
        c1.add("1004");
        c1.add("1005");
        c1.add("1006");
        c1.add("1007");
        c1.add("1008");
        c1.add("1009");
        c1.add("1010");
        
        c2 = new Choice();
        c2.setBounds(332, 136, 302, 20);
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("May");
        c2.add("June");
        c2.add("July");
        c2.add("August");
        c2.add("September");
        c2.add("October");
        c2.add("November");
        c2.add("December");
        
        b1 = new JButton("Submit");
        b1.setBounds(0, 319, 302, 76);
        b2 = new JButton("Cancel");
        b2.setBounds(332, 319, 302, 76);
        
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
  
        
        
        
       l1.setFont(new Font("Dialog", Font.BOLD, 25));
        p.setLayout(null);
      
        
        
        p.add(l2);
        p.add(c1);
        p.add(l5);
        p.add(c2);
        p.add(l3);
        p.add(t1);
        p.add(b1);
        p.add(b2);
        getContentPane().setLayout(null);
        
        getContentPane().add(l1);
        getContentPane().add(p);
        
        JLabel l6 = new JLabel("New label");
        l6.setBounds(10, 11, 150, 297);
        Image img1= new ImageIcon(this.getClass().getResource("/hicon2.png")).getImage();
        l6.setIcon(new ImageIcon(img1));
        
	//	l6.setBounds(69, 63, 204, 176);
	//	contentPane.add(l6);
        p.add(l6);
        
        
   
        
        
      
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);        
        setSize(650,500);
        setLocation(350,220);
    }
    public void actionPerformed(ActionEvent ae){
        String a = c1.getSelectedItem();
        String b = t1.getText();
        String c = c2.getSelectedItem();
        
        int p1 = Integer.parseInt(b);
        
        int p2 = p1*7;
        int p3 = p2+50+12+102+20+50;
        
        String q = "insert into bill values('"+a+"','"+c+"','"+b+"','"+p3+"')";
        
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Bill Updated");
        }catch(Exception aee){
            aee.printStackTrace();
        }
        
        
    }
    
       
    public static void main(String[] args){
        calculate_bill c7 = new calculate_bill();
        c7.setVisible(true);
    }
}