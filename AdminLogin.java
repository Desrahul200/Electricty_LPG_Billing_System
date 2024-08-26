
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

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtadname;
	private JPasswordField txtadpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		super("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 450);
		setLocation(500,200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(209, 133, 133, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(209, 205, 133, 46);
		contentPane.add(lblNewLabel_1);
		
		txtadname = new JTextField();
		txtadname.setBounds(366, 135, 167, 46);
		contentPane.add(txtadname);
		txtadname.setColumns(10);
		
		txtadpass = new JPasswordField();
		txtadpass.setBounds(366, 207, 167, 46);
		contentPane.add(txtadpass);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				
				try{        
			            conn c1 = new conn();
			            String a  = txtadname.getText();
			            String b  = txtadpass.getText();
			            String q  = "select * from ad_login where username = '"+a+"' and password = '"+b+"'";
			            ResultSet rs = c1.s.executeQuery(q);
			            if(rs.next()){
			            	JOptionPane.showMessageDialog(null, "Login successfull");
			            	 Project p1 = new Project();
							 p1.setVisible(true);
			                
			            
	}else{
			                JOptionPane.showMessageDialog(null, "Invalid login");
			     
			            }
			        }catch(Exception e){
			            e.printStackTrace();
			            System.out.println("error: "+e);
			        }
			    }
			
				
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(233, 314, 121, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1= new ImageIcon(this.getClass().getResource("/Admin.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(27, 112, 172, 196);
		contentPane.add(lblNewLabel_2);
	}
}
