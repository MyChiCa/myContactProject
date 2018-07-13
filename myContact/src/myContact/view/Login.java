package myContact.view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contact.dao.UserDao;
import myContact.model.User;
import myContact.util.DbUtil;
import myContact.util.StringUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login extends JFrame {
	DbUtil dbUtil = new DbUtil();
	UserDao userDao = new UserDao();
	private JPanel contentPane;
	public static JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("\u7528\u6237\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JUserName = new JLabel("\u7528\u6237\u540D\uFF1A");
		JUserName.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\user.png"));
		JUserName.setBounds(102, 100, 75, 15);
		contentPane.add(JUserName);
		
		JLabel JPassword = new JLabel("\u5BC6\u7801\uFF1A");
		JPassword.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\password.png"));
		JPassword.setBounds(115, 153, 69, 23);
		contentPane.add(JPassword);
		
		textField = new JTextField();
		textField.setBounds(171, 97, 140, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 154, 140, 21);
		contentPane.add(passwordField);
		
		JButton JLogin = new JButton("\u767B\u5F55");
		JLogin.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\login.png"));
		JLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserName = textField.getText();
				String Password = new String(passwordField.getPassword());
				if(StringUtil.isEmpty(UserName)){
					JOptionPane.showMessageDialog(null,"用户名不能为空");
					return;
				}
				if(StringUtil.isEmpty(Password)){
					JOptionPane.showMessageDialog(null,"密码不能为空");
					return;
				}
				User user = new User(UserName,Password);
				Connection con = null;
				try {
					con = dbUtil.getCon();
					User currrentUser=userDao.login(con,user);
					if(currrentUser!=null){
						dispose();
						new MainFrame().setVisible(true);				
					}
					else{
						JOptionPane.showMessageDialog(null,"用户名或密码错误");
					}
				} catch (Exception e1) {
					//自动生成的 catch 块
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"登录失败");
				}finally{
					try{
						dbUtil.closeCon(con);
					}catch(Exception e2){
						e2.printStackTrace();
					}
				}	
			}
		});
		JLogin.setBounds(84, 213, 82, 23);
		contentPane.add(JLogin);
		setLocationRelativeTo(null);
		
		JButton JReset = new JButton("\u91CD\u7F6E");
		JReset.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\1067287.png"));
		JReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		JReset.setBounds(303, 213, 82, 23);
		contentPane.add(JReset);
		
		JLabel lblNewLabel = new JLabel("\u4E2A\u4EBA\u901A\u8BAF\u5F55");
		lblNewLabel.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\tele.png"));
		lblNewLabel.setFont(new Font("新宋体", Font.BOLD, 16));
		lblNewLabel.setBounds(158, 24, 151, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\Login.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 262);
		contentPane.add(lblNewLabel_1);
	}
}
