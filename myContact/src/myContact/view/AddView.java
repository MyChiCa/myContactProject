package myContact.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contact.dao.MyFriendsDao;
import myContact.model.Group;
import myContact.model.MyFriends;
import myContact.util.DbUtil;
import myContact.util.StringUtil;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AddView extends JFrame {

	private JPanel contentPane;
	private JTextField NameTextField;
	private JTextField TeleTextField;
	private JTextField QQTextField;
	private JTextField AgeTextField;
	private JTextField EmailTextField;
	private JTextField BirthTextField;
	private JTextField AddressTextField;
	public static JTextField GroupTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddView frame = new AddView();
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
	public AddView() {
		setResizable(false);
		setTitle("\u6DFB\u52A0\u8054\u7CFB\u4EBA");
		setBounds(100, 100, 451, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u59D3\u540D\uFF1A");
		label.setFont(new Font("新宋体", Font.PLAIN, 12));
		label.setBounds(21, 51, 54, 15);
		contentPane.add(label);
		
		NameTextField = new JTextField();
		NameTextField.setBounds(85, 48, 93, 21);
		contentPane.add(NameTextField);
		NameTextField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u53F7\u7801\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 12));
		label_1.setBounds(21, 98, 54, 15);
		contentPane.add(label_1);
		
		TeleTextField = new JTextField();
		TeleTextField.setBounds(85, 95, 93, 21);
		contentPane.add(TeleTextField);
		TeleTextField.setColumns(10);
		
		JLabel lblQq = new JLabel("QQ\u53F7\uFF1A");
		lblQq.setFont(new Font("宋体", Font.PLAIN, 12));
		lblQq.setBounds(21, 145, 54, 15);
		contentPane.add(lblQq);
		
		QQTextField = new JTextField();
		QQTextField.setBounds(85, 142, 93, 21);
		contentPane.add(QQTextField);
		QQTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 12));
		lblNewLabel.setBounds(21, 191, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u6027\u522B\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 12));
		label_2.setBounds(21, 237, 54, 15);
		contentPane.add(label_2);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(85, 188, 93, 21);
		contentPane.add(AgeTextField);
		AgeTextField.setColumns(10);
        
		JRadioButton ManRadioButton = new JRadioButton("\u7537");
		ManRadioButton.setFont(new Font("宋体", Font.PLAIN, 12));
		ManRadioButton.setBounds(76, 233, 46, 23);
		contentPane.add(ManRadioButton);
		
		JRadioButton WomanRadioButton = new JRadioButton("\u5973");
		WomanRadioButton.setFont(new Font("新宋体", Font.PLAIN, 12));
		WomanRadioButton.setBounds(124, 233, 54, 23);
		contentPane.add(WomanRadioButton);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(ManRadioButton);
        buttonGroup.add(WomanRadioButton);
		
		JLabel lblEmail = new JLabel("Email\uFF1A");
		lblEmail.setFont(new Font("宋体", Font.PLAIN, 12));
		lblEmail.setBounds(203, 51, 54, 15);
		contentPane.add(lblEmail);
		
		EmailTextField = new JTextField();
		EmailTextField.setBounds(244, 48, 154, 21);
		contentPane.add(EmailTextField);
		EmailTextField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u751F\u65E5\uFF1A");
		label_3.setFont(new Font("新宋体", Font.PLAIN, 12));
		label_3.setBounds(203, 98, 54, 15);
		contentPane.add(label_3);
		
		BirthTextField = new JTextField();
		BirthTextField.setBounds(244, 95, 154, 21);
		contentPane.add(BirthTextField);
		BirthTextField.setColumns(10);
		
		JLabel label_4 = new JLabel("\u5730\u5740\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 12));
		label_4.setBounds(203, 145, 54, 15);
		contentPane.add(label_4);
		
		AddressTextField = new JTextField();
		AddressTextField.setBounds(244, 142, 154, 21);
		contentPane.add(AddressTextField);
		AddressTextField.setColumns(10);
		
		JLabel label_5 = new JLabel("\u7EC4\u540D\uFF1A");
		label_5.setFont(new Font("新宋体", Font.PLAIN, 12));
		label_5.setBounds(203, 191, 54, 15);
		contentPane.add(label_5);
		
		GroupTextField = new JTextField();
		GroupTextField.setBounds(244, 188, 154, 21);
		contentPane.add(GroupTextField);
		GroupTextField.setColumns(10);
		
		JButton EnterButton = new JButton("\u786E\u8BA4");
		EnterButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\enter.png"));
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name =NameTextField.getText();
				String Tele =TeleTextField.getText();
				String QQ = QQTextField.getText();
				String Age = AgeTextField.getText();
				String Email = EmailTextField.getText();
				String Birth = BirthTextField.getText();
				String Address = AddressTextField.getText();
				String GroupName = GroupTextField.getText();
				if(StringUtil.isEmpty(Name)){
					JOptionPane.showMessageDialog(null,"姓名不能为空！");
					return ;
				}
				if(StringUtil.isEmpty(Tele)){
					JOptionPane.showMessageDialog(null,"号码不能为空！");
					return ;
				}
				if(StringUtil.isEmpty(GroupName)){
					JOptionPane.showMessageDialog(null,"组名不能为空！");
					return ;
				}
				String Sex = "";
				if(ManRadioButton.isSelected()){
					Sex = "男";
				}else if(WomanRadioButton.isSelected()){
					Sex = "女";
				}
				MyFriends myFriends = new MyFriends(Name,Age,Tele,Sex,Address,Email,Birth,QQ);
				String UserID = null;
				Connection con = null;
				try{
					con = DbUtil.getCon();
					int n = MyFriendsDao.AddMyFriendsDao(con,myFriends);
					if(n==1){
						JOptionPane.showMessageDialog(null,"添加成功！");
						dispose();
					}else{
						JOptionPane.showMessageDialog(null,"添加失败！");
					}}catch(Exception e1){
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,"添加失败！");
					}				
				}
		});
		EnterButton.setFont(new Font("宋体", Font.PLAIN, 12));
		EnterButton.setBounds(345, 233, 89, 23);
		contentPane.add(EnterButton);
		
		JButton EscButton = new JButton("\u53D6\u6D88");
		EscButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\return.png"));
		EscButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		EscButton.setFont(new Font("宋体", Font.PLAIN, 12));
		EscButton.setBounds(244, 233, 91, 23);
		contentPane.add(EscButton);
		
		JLabel label_6 = new JLabel("\u586B\u5199\u8054\u7CFB\u4EBA\u4FE1\u606F");
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(146, 10, 154, 31);
		contentPane.add(label_6);
		
		ManRadioButton.setSelected(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\add.jpg"));
		lblNewLabel_1.setBounds(0, 0, 445, 272);
		contentPane.add(lblNewLabel_1);
	}
}
