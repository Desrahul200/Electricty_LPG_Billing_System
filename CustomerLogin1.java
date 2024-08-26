import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class CustomerLogin1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtcid;
	private JPasswordField txtcpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin1 frame = new CustomerLogin1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerLogin1() {
		super("Customer Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 400);
		setLocation(500,200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(221, 113, 113, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(221, 181, 92, 35);
		contentPane.add(lblNewLabel_1);
		
		txtcid = new JTextField();
		txtcid.setBounds(344, 115, 154, 35);
		contentPane.add(txtcid);
		txtcid.setColumns(10);
		
		txtcpass = new JPasswordField();
		txtcpass.setBounds(344, 183, 154, 35);
		contentPane.add(txtcpass);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img2= new ImageIcon(this.getClass().getResource("/User.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(29, 61, 185, 179);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent ae){
			        
			        try{        
			            conn c1 = new conn();
			            String a  = txtcid.getText();
			            String b  = txtcpass.getText();
			            String q  = "select * from cus_login where c_id = '"+a+"' and password = '"+b+"'";
			            ResultSet rs = c1.s.executeQuery(q);
			            if(rs.next())
			            {
			            	JOptionPane.showMessageDialog(null, "Login successfull");
			            	Project p1 = new Project();
							p1.setVisible(true);
			                
			            
	                    }
			            else
	                    {
			                JOptionPane.showMessageDialog(null, "Invalid login");
			     
			            
	                    }
			        }catch(Exception e){
			            e.printStackTrace();
			            System.out.println("error: "+e);
			        }
			    }
				
				
				
				
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(400, 262, 92, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustRegistration cus1= new CustRegistration();
				cus1.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(252, 262, 100, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("CUSTOMER LOGIN");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(221, 25, 178, 41);
		contentPane.add(lblNewLabel_3);
	}

}
