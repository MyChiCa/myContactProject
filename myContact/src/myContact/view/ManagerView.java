package myContact.view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import Contact.dao.MyFriendsDao;
import myContact.model.Group;
import myContact.model.MyFriends;
import myContact.util.DbUtil;
import myContact.util.StringUtil;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class ManagerView extends JFrame {
	DbUtil dbUtil = new DbUtil();
	MyFriendsDao myFriendsDao = new MyFriendsDao();
	

	private JPanel contentPane;
	public static JTable AllTable;
	public static JTextField QueryTextField;
	public static JTextField MyTeleText;
	private JTextField NameTextField;
	private JTextField TeleTextField;
	private JTextField QQTextField;
	private JTextField EmailTextField;
	private JTextField AddressTextField;
	private JTextField BirthTextField;
	private JTextField AgeTextField;
	public static JTextField GroupNameTextField;
	private JTextField IDTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerView frame = new ManagerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}
	
	public void Hide(){
	DefaultTableColumnModel dcm = (DefaultTableColumnModel)AllTable.getColumnModel(); 
    dcm.getColumn(5).setMinWidth(5);
    dcm.getColumn(5).setMaxWidth(5);
    dcm.getColumn(6).setMinWidth(6);
    dcm.getColumn(6).setMaxWidth(6);
    dcm.getColumn(9).setMinWidth(9);
    dcm.getColumn(9).setMaxWidth(9);
	}
	
	public void fillTable(){
		DefaultTableModel dtm = (DefaultTableModel) AllTable.getModel();
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet rs = MyFriendsDao.myFriendsList(con);
			while(rs.next()){
				Vector v = new Vector();
				v.add(rs.getString("Name"));
				v.add(rs.getString("Tele"));
				v.add(rs.getString("QQ"));
				v.add(rs.getString("Email"));
				v.add(rs.getString("Address"));
				v.add(rs.getString("Age"));
				v.add(rs.getString("Birth"));
				v.add(rs.getString("Sex"));
				v.add(rs.getString("GroupName"));
				v.add(rs.getString("ID"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		Hide();
	}

	public void fillTable1(){
		DefaultTableModel dtm = (DefaultTableModel) AllTable.getModel();
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet rs = MyFriendsDao.QueryMyFriendsDao(con);
			while(rs.next()){
				Vector v = new Vector();
				v.add(rs.getString("Name"));
				v.add(rs.getString("Tele"));
				v.add(rs.getString("QQ"));
				v.add(rs.getString("Email"));
				v.add(rs.getString("Address"));
				v.add(rs.getString("Age"));
				v.add(rs.getString("Birth"));
				v.add(rs.getString("Sex"));
				v.add(rs.getString("GroupName"));
				v.add(rs.getString("ID"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
	}
	public void fillTable2(){
		DefaultTableModel dtm = (DefaultTableModel) AllTable.getModel();
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet rs = MyFriendsDao.QueryMyFriendsDao1(con);
			while(rs.next()){
				Vector v = new Vector();
				v.add(rs.getString("Name"));
				v.add(rs.getString("Tele"));
				v.add(rs.getString("QQ"));
				v.add(rs.getString("Email"));
				v.add(rs.getString("Address"));
				v.add(rs.getString("Age"));
				v.add(rs.getString("Birth"));
				v.add(rs.getString("Sex"));
				v.add(rs.getString("GroupName"));
				v.add(rs.getString("ID"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
	}
	public void fillTable3(){
		DefaultTableModel dtm = (DefaultTableModel) AllTable.getModel();
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet rs = MyFriendsDao.QueryMyFriendsDao2(con);
			while(rs.next()){
				Vector v = new Vector();
				v.add(rs.getString("Name"));
				v.add(rs.getString("Tele"));
				v.add(rs.getString("QQ"));
				v.add(rs.getString("Email"));
				v.add(rs.getString("Address"));
				v.add(rs.getString("Age"));
				v.add(rs.getString("Birth"));
				v.add(rs.getString("Sex"));
				v.add(rs.getString("GroupName"));
				v.add(rs.getString("ID"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
	}

	/**
	 * Create the frame.
	 */
	public ManagerView() {
		setResizable(false);
		setTitle("\u68C0\u7D22\u8868");
		
		setBounds(100, 100, 527, 688);
		//setSize(500,550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JRadioButton ManRadioButton = new JRadioButton("\u7537");
		ManRadioButton.setBounds(416, 512, 47, 23);
		contentPane.add(ManRadioButton);
		
		JRadioButton WomanRadioButton = new JRadioButton("\u5973");
		WomanRadioButton.setBounds(464, 512, 47, 23);
		contentPane.add(WomanRadioButton);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(ManRadioButton);
        buttonGroup.add(WomanRadioButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(102, 58, 398, 343);
		contentPane.add(scrollPane);
		
		AllTable = new JTable();
		AllTable.setBackground(SystemColor.controlLtHighlight);
		AllTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int row = AllTable.getSelectedRow();
				MyTeleText.setText((String) AllTable.getValueAt(row,1));
				NameTextField.setText((String) AllTable.getValueAt(row,0));
				TeleTextField.setText((String) AllTable.getValueAt(row,1));
				QQTextField.setText((String) AllTable.getValueAt(row,2));
				EmailTextField.setText((String) AllTable.getValueAt(row,3));
				AddressTextField.setText((String) AllTable.getValueAt(row,4));
				AgeTextField.setText((String) AllTable.getValueAt(row,5));
				BirthTextField.setText((String) AllTable.getValueAt(row,6));
				GroupNameTextField.setText((String) AllTable.getValueAt(row,8));
				IDTextField.setText((String) AllTable.getValueAt(row,9));
				if("男".equals((String) AllTable.getValueAt(row,7))){
				ManRadioButton.setSelected(true);
				}else if("女".equals((String) AllTable.getValueAt(row,7))){
					WomanRadioButton.setSelected(true);
				}
			}
		});
		AllTable.setForeground(new Color(0, 0, 0));
		scrollPane.setViewportView(AllTable);
		AllTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u6635\u79F0", "\u7535\u8BDD", "QQ", "Email", "\u5730\u5740", "\u5E74\u9F84", "\u751F\u65E5", "\u6027\u522B", "\u5C0F\u7EC4", "ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		AllTable.getColumnModel().getColumn(0).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(0).setMinWidth(68);
		AllTable.getColumnModel().getColumn(1).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(1).setMinWidth(86);
		AllTable.getColumnModel().getColumn(2).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(2).setMinWidth(82);
		AllTable.getColumnModel().getColumn(2).setMaxWidth(121);
		AllTable.getColumnModel().getColumn(3).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(3).setMinWidth(86);
		AllTable.getColumnModel().getColumn(4).setPreferredWidth(102);
		AllTable.getColumnModel().getColumn(4).setMinWidth(86);
		AllTable.getColumnModel().getColumn(5).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(5).setMinWidth(86);
		AllTable.getColumnModel().getColumn(6).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(6).setMinWidth(86);
		AllTable.getColumnModel().getColumn(7).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(7).setMinWidth(86);
		AllTable.getColumnModel().getColumn(8).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(8).setMinWidth(86);
		AllTable.getColumnModel().getColumn(9).setPreferredWidth(95);
		AllTable.getColumnModel().getColumn(9).setMinWidth(86);
		
		JLabel label = new JLabel("\u67E5\u8BE2\u4FE1\u606F\u9762\u677F");
		label.setFont(new Font("宋体", Font.PLAIN, 22));
		label.setBounds(183, 21, 181, 39);
		contentPane.add(label);
		
		JButton ADDButton = new JButton("\u6DFB\u52A0");
		ADDButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\add.png"));
		ADDButton.setContentAreaFilled(false);
		ADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddView().setVisible(true);
			}
		});
		ADDButton.setBounds(18, 212, 85, 23);
		contentPane.add(ADDButton);
		
		JButton DELETEButton = new JButton("\u5220\u9664");
		DELETEButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\1128280.png"));
		DELETEButton.setContentAreaFilled(false);
		DELETEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  String Tele = MyTeleText.getText();
			  if(StringUtil.isEmpty(Tele)){
				  JOptionPane.showMessageDialog(null,"请选择要删除的记录！");
				  return;
			  }
			  int n = JOptionPane.showConfirmDialog(null,"确定删除这条记录吗？");
			  if (n == 0){
				  Connection con = null;
				  try{
				  con = dbUtil.getCon();
				  int deleteNum = myFriendsDao.DeleteMyFriends(con,Tele);
				  if(deleteNum == 1){
					  JOptionPane.showMessageDialog(null,"删除成功！");
						MyTeleText.setText("");
						NameTextField.setText("");
						TeleTextField.setText("") ;
						QQTextField.setText("");
						EmailTextField.setText("");
						AddressTextField.setText("");
						AgeTextField.setText("");
						BirthTextField.setText("");
						GroupNameTextField.setText("");
						IDTextField.setText("");
						ManRadioButton.setSelected(true);
				  }
				  else{
					  JOptionPane.showMessageDialog(null,"删除失败！");
				  }
				  }catch(Exception e1){
					  e1.printStackTrace();
				  }
			  }
			}
		});
		DELETEButton.setBounds(18, 281, 85, 23);
		contentPane.add(DELETEButton);
		
		JButton EXITButton = new JButton("\u8FD4\u56DE");
		EXITButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\return.png"));
		EXITButton.setContentAreaFilled(false);
		EXITButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		EXITButton.setBounds(10, 629, 85, 23);
		contentPane.add(EXITButton);
		
		JComboBox SelectButton = new JComboBox();
		SelectButton.setModel(new DefaultComboBoxModel(new String[] {"姓名","号码","组名"}));
		SelectButton.setToolTipText("");
		SelectButton.setBounds(183, 414, 61, 23);
		contentPane.add(SelectButton);
		
		QueryTextField = new JTextField();
		QueryTextField.setBounds(265, 415, 93, 21);
		contentPane.add(QueryTextField);
		QueryTextField.setColumns(10);
		
		JButton QueryButton = new JButton("\u67E5\u8BE2");
		QueryButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\query1.png"));
		QueryButton.setContentAreaFilled(false);
		QueryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel) AllTable.getModel();
				 while(model.getRowCount()>0){
				      model.removeRow(model.getRowCount()-1);
				 }
				if(SelectButton.getSelectedItem().toString()=="姓名"){
					fillTable1();
			}
				if(SelectButton.getSelectedItem().toString()=="号码"){	
					fillTable2();
			}
				if(SelectButton.getSelectedItem().toString()=="组名"){	
					fillTable3();
			}
			}
		});
		QueryButton.setBounds(386, 414, 88, 23);
		contentPane.add(QueryButton);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(20, 10, 501, 50);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(18, 58, 456, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(18, 404, 503, 42);
		contentPane.add(separator_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(18, 10, 93, 395);
		contentPane.add(separator_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(102, 10, 1, -16);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(102, 10, 9, 395);
		contentPane.add(separator_5);
		
		JButton ThrouthButton = new JButton("\u6D4F\u89C8");
		ThrouthButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\1132439.png"));
		ThrouthButton.setContentAreaFilled(false);
		ThrouthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel) AllTable.getModel();
				 while(model.getRowCount()>0){
				      model.removeRow(model.getRowCount()-1);
				 }
				fillTable();
			}
		});
		ThrouthButton.setBounds(18, 148, 85, 23);
		contentPane.add(ThrouthButton);
		
		MyTeleText = new JTextField();
		MyTeleText.setBounds(348, 33, 93, 21);
		contentPane.add(MyTeleText);
		MyTeleText.setColumns(10);
		
		JButton RetNewButton = new JButton("\u5237\u65B0");
		RetNewButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\\u5237\u65B0.png"));
	    RetNewButton.setContentAreaFilled(false);
		RetNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AllTable.getModel()!=null){
				DefaultTableModel model =(DefaultTableModel) AllTable.getModel();
				 while(model.getRowCount()>0){
				      model.removeRow(model.getRowCount()-1);
				 }
				fillTable();
			}
			}
		});
		RetNewButton.setBounds(18, 83, 85, 23);
		contentPane.add(RetNewButton);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setBounds(18, 456, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u7535\u8BDD\uFF1A");
		label_2.setBounds(18, 497, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("QQ\uFF1A");
		label_3.setBounds(27, 541, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Email\uFF1A");
		label_4.setBounds(18, 584, 47, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u6027\u522B\uFF1A");
		label_5.setBounds(380, 516, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u5730\u5740\uFF1A");
		label_6.setBounds(216, 456, 41, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u751F\u65E5\uFF1A");
		label_7.setBounds(216, 497, 41, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u5E74\u9F84\uFF1A");
		label_8.setBounds(216, 541, 41, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\u7EC4\u540D\uFF1A");
		label_9.setBounds(216, 584, 41, 15);
		contentPane.add(label_9);
		
		
		NameTextField = new JTextField();
		NameTextField.setColumns(10);
		NameTextField.setBounds(59, 453, 102, 21);
		contentPane.add(NameTextField);
		
		TeleTextField = new JTextField();
		TeleTextField.setColumns(10);
		TeleTextField.setBounds(59, 494, 102, 21);
		contentPane.add(TeleTextField);
		
		QQTextField = new JTextField();
		QQTextField.setColumns(10);
		QQTextField.setBounds(59, 538, 102, 21);
		contentPane.add(QQTextField);
		
		EmailTextField = new JTextField();
		EmailTextField.setColumns(10);
		EmailTextField.setBounds(59, 581, 102, 21);
		contentPane.add(EmailTextField);
		
		AddressTextField = new JTextField();
		AddressTextField.setColumns(10);
		AddressTextField.setBounds(256, 453, 102, 21);
		contentPane.add(AddressTextField);
		
		BirthTextField = new JTextField();
		BirthTextField.setColumns(10);
		BirthTextField.setBounds(256, 494, 102, 21);
		contentPane.add(BirthTextField);
		
		AgeTextField = new JTextField();
		AgeTextField.setColumns(10);
		AgeTextField.setBounds(256, 538, 102, 21);
		contentPane.add(AgeTextField);
		
		GroupNameTextField = new JTextField();
		GroupNameTextField.setColumns(10);
		GroupNameTextField.setBounds(256, 581, 102, 21);
		contentPane.add(GroupNameTextField);
		
		JButton UpdateButton = new JButton("\u786E\u8BA4\u4FEE\u6539");
		UpdateButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\enter.png"));
		UpdateButton.setContentAreaFilled(false);
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String Name = NameTextField.getText();
				  String Tele = TeleTextField.getText();
				  String QQ = QQTextField.getText();
				  String Email = EmailTextField.getText();
				  String Address = AddressTextField.getText();
				  String Age = AgeTextField.getText();
				  String Birth = BirthTextField.getText();
				  String GroupName =GroupNameTextField.getText();
				  String ID = IDTextField.getText();
				  String Sex = "";
					if(ManRadioButton.isSelected()){
						Sex = "男";
					}else if(WomanRadioButton.isSelected()){
						Sex = "女";
					}
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
				   String Tele1 = MyTeleText.getText();
			      if(StringUtil.isEmpty(Tele1)){
			    	  JOptionPane.showMessageDialog(null, "请选择修改的联系人！");
			      }
			      MyFriends myFriends = new MyFriends(Name,Age,Tele,Sex,Address,Email,Birth,QQ,ID);
			      Group group = new Group(Tele,GroupName);
			      int n = JOptionPane.showConfirmDialog(null,"确定修改这条记录吗？");
				  if (n == 0){
					  Connection con = null;
					  try{
					  con = dbUtil.getCon();
					  int UpdateNum = myFriendsDao.UpdateMyFriendsDao(con,myFriends,group);
					  if(UpdateNum == 1){
						  JOptionPane.showMessageDialog(null,"修改成功！");
					  }
					  else{
						  JOptionPane.showMessageDialog(null,"修改失败！");
					  }
					  }catch(Exception e1){
						  e1.printStackTrace();
						  JOptionPane.showMessageDialog(null,"修改失败！");
					  }finally{
						  try{
							  dbUtil.closeCon(con);
						  }catch(Exception e1){
							  e1.printStackTrace();
						  }
					  }
				  }
			}
		});
		UpdateButton.setBounds(386, 629, 114, 23);
		contentPane.add(UpdateButton);
		
		JLabel lblId = new JLabel("ID\uFF1A");
		lblId.setBounds(422, 456, 41, 15);
		contentPane.add(lblId);
		
		IDTextField = new JTextField();
		IDTextField.setBounds(460, 453, 47, 21);
		contentPane.add(IDTextField);
		IDTextField.setColumns(10);
		
		JButton CallButton = new JButton("\u62E8\u6253");
		CallButton.setContentAreaFilled(false);
		CallButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(StringUtil.isEmpty(TeleTextField.getText())){
					JOptionPane.showMessageDialog(null,"号码不能为空！");
					return;
				}
				new CallView2().setVisible(true);
			}
		});
		CallButton.setBounds(451, 32, 60, 23);
		contentPane.add(CallButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\59fcc09ec8e1feeef2f300ceeb7a6411_\u770B\u56FE\u738B.jpg"));
		lblNewLabel.setBounds(0, 0, 521, 660);
		contentPane.add(lblNewLabel);
	} 
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
