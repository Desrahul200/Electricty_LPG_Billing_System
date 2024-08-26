import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class CustRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField txtfname;
	private JTextField txtlname;
	private JTextField txtmob;
	private JTextField txtemail;
	private JTextField txtdob;
	private JTextField txtadd;
	private JTextField txtstate;
	private JTextField txtcity;
	private JTextField txtcid;
	private JTextField txtcpass;
	private JTextField txtcmetno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustRegistration frame = new CustRegistration();
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
	public CustRegistration() {
		super("Customer Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 750, 650);
		setLocation(500,100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(71, 49, 94, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(367, 49, 84, 34);
		contentPane.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(71, 94, 116, 34);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(367, 94, 53, 34);
		contentPane.add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfBirth.setBounds(71, 139, 94, 34);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(367, 139, 64, 34);
		contentPane.add(lblGender);
		
		final JComboBox cboxgender = new JComboBox();
		cboxgender.setModel(new DefaultComboBoxModel(new String[] {"Male ", "Female", "Uncertain"}));
		cboxgender.setBounds(460, 147, 104, 22);
		contentPane.add(cboxgender);
		
		txtfname = new JTextField();
		txtfname.setBounds(195, 58, 139, 20);
		contentPane.add(txtfname);
		txtfname.setColumns(10);
		
		txtlname = new JTextField();
		txtlname.setBounds(460, 58, 139, 20);
		contentPane.add(txtlname);
		txtlname.setColumns(10);
		
		txtmob = new JTextField();
		txtmob.setBounds(195, 103, 139, 20);
		contentPane.add(txtmob);
		txtmob.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(460, 103, 139, 20);
		contentPane.add(txtemail);
		
		txtdob = new JTextField();
		txtdob.setBounds(195, 148, 139, 20);
		contentPane.add(txtdob);
		txtdob.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(71, 184, 71, 34);
		contentPane.add(lblNewLabel_1);
		
		txtadd = new JTextField();
		txtadd.setBounds(195, 184, 252, 81);
		contentPane.add(txtadd);
		txtadd.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("State");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(112, 285, 53, 22);
		contentPane.add(lblNewLabel_2);
		
		txtstate = new JTextField();
		txtstate.setColumns(10);
		txtstate.setBounds(195, 288, 139, 19);
		contentPane.add(txtstate);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCity.setBounds(393, 279, 53, 34);
		contentPane.add(lblCity);
		
		txtcity = new JTextField();
		txtcity.setColumns(10);
		txtcity.setBounds(460, 288, 139, 20);
		contentPane.add(txtcity);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(81, 329, 106, 34);
		contentPane.add(lblNewLabel_3);
		
		txtcid = new JTextField();
		txtcid.setColumns(10);
		txtcid.setBounds(195, 338, 139, 22);
		contentPane.add(txtcid);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(367, 329, 84, 34);
		contentPane.add(lblNewLabel_4);
		
		txtcpass = new JTextField();
		txtcpass.setColumns(10);
		txtcpass.setBounds(460, 338, 139, 20);
		contentPane.add(txtcpass);
		
		JLabel lblNewLabel_5 = new JLabel("Sign Up Page");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(305, 11, 128, 36);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("CREATE ACCOUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn;
				PreparedStatement ps,ps1;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url= "jdbc:mysql://localhost:3306/demo";
					String user= "root";
					String password= "12345";
					String query1 = "insert into cus_login(c_id, password) values(?,?);";
					String query= "insert into cust_details(c_fname , c_lname , c_email , c_mob_no , c_dob , c_gender , c_address , c_state, c_city , c_meter_no, c_id ) values(?,?,?,?,?,?,?,?,?,?,?);";
					
					
					
					conn = DriverManager.getConnection(url, user, password);
					
					
					ps1= conn.prepareStatement(query1);
					ps1.setString(1, txtcid.getText());
					ps1.setString(2, txtcpass.getText());
					
					ps1.executeUpdate();
					ps= conn.prepareStatement(query);
					
					ps.setString(1, txtfname.getText());
					ps.setString(2, txtlname.getText());
					ps.setString(3, txtemail.getText());
					ps.setString(4, txtmob.getText());
					ps.setString(5, txtdob.getText());
					ps.setString(6, cboxgender.getSelectedItem().toString());
					ps.setString(7, txtadd.getText());
					ps.setString(8, txtstate.getText());
					ps.setString(9, txtcity.getText());
					ps.setString(10, txtcmetno.getText());
					ps.setString(11, txtcid.getText());
					ps.executeUpdate();
					
					
					JOptionPane.showMessageDialog(null, "Registration Successful");
					
					
					
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(254, 500, 197, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Meter No");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(81, 389, 84, 22);
		contentPane.add(lblNewLabel_6);
		
		txtcmetno = new JTextField();
		txtcmetno.setBounds(195, 391, 139, 34);
		contentPane.add(txtcmetno);
		txtcmetno.setColumns(10);
	}
}
