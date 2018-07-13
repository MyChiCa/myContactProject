package myContact.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import myContact.util.StringUtil;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;

public class MainFrame extends JFrame {
	static JTextField CallTextField;

	/**
	 * Launch the application.
	 */
	public static void  main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("\u901A\u8BAF\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setSize(450,500);
		setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu_1 = new JMenu("\u7BA1\u7406\u8054\u7CFB\u4EBA");
		menu_1.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\manager.png"));
		menu_1.setFont(new Font("新宋体", Font.PLAIN, 12));
		menuBar.add(menu_1);
		
		JMenuItem ManagerItem = new JMenuItem("\u7BA1\u7406\u8054\u7CFB\u4EBA");
		ManagerItem.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\manage.png"));
		ManagerItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ManagerView().setVisible(true);
			}
		});
		ManagerItem.setFont(new Font("宋体", Font.PLAIN, 12));
		menu_1.add(ManagerItem);
		
		JMenuItem AddButton = new JMenuItem("\u6DFB\u52A0\u8054\u7CFB\u4EBA");
		AddButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\add.png"));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddView().setVisible(true);
			}
		});
		AddButton.setFont(new Font("新宋体", Font.PLAIN, 12));
		menu_1.add(AddButton);
		
		JMenu menu_2 = new JMenu("\u6CE8\u9500\u767B\u5F55");
		menu_2.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\540108.png"));
		menu_2.setFont(new Font("新宋体", Font.PLAIN, 12));
		menuBar.add(menu_2);
		
		JMenuItem ChangeButton = new JMenuItem("\u5207\u6362\u7528\u6237");
		ChangeButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\change.png"));
		ChangeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login().setVisible(true);
			}
		});
		ChangeButton.setFont(new Font("新宋体", Font.PLAIN, 12));
		menu_2.add(ChangeButton);
		
		JMenuItem ExitButton = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		ExitButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\exit.png"));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitButton.setFont(new Font("新宋体", Font.PLAIN, 12));
		menu_2.add(ExitButton);
		
		JMenu menu_3 = new JMenu("\u5E2E\u52A9");
		menu_3.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\1142200.png"));
		menu_3.setFont(new Font("新宋体", Font.PLAIN, 12));
		menuBar.add(menu_3);
		
		JMenuItem AboutButton = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		AboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AboutView().setVisible(true);
			}
		});
		AboutButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\direct.png"));
		AboutButton.setFont(new Font("新宋体", Font.PLAIN, 12));
		menu_3.add(AboutButton);
		
		JMenuItem TeachButton = new JMenuItem("\u7528\u6237\u6307\u5357");
		TeachButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GuideView().setVisible(true);
			}
		});
		TeachButton.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\1107446.png"));
		TeachButton.setFont(new Font("新宋体", Font.PLAIN, 12));
		menu_3.add(TeachButton);
		
		JMenuItem menuItem_1 = new JMenuItem("");
		menuBar.add(menuItem_1);
		getContentPane().setLayout(null);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button8.setBounds(178, 270, 45, 23);
		getContentPane().add(button8);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button6.setBounds(263, 224, 45, 23);
		getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button7.setBounds(91, 270, 45, 23);
		getContentPane().add(button7);
		
		Button DelButton = new Button("\u00D7");
		DelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText("");
			}
		});
		DelButton.setBounds(306, 132, 45, 29);
		getContentPane().add(DelButton);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button5.setBounds(178, 224, 45, 23);
		getContentPane().add(button5);
		
		JButton button11 = new JButton("#");
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button11.setBounds(263, 314, 45, 23);
		getContentPane().add(button11);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button9.setBounds(263, 270, 45, 23);
		getContentPane().add(button9);
		
		CallTextField = new JTextField();
		CallTextField.setColumns(10);
		CallTextField.setBounds(108, 126, 181, 35);
		getContentPane().add(CallTextField);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button0.setBounds(180, 314, 45, 23);
		getContentPane().add(button0);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button3.setBounds(263, 178, 45, 23);
		getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button4.setBounds(91, 224, 45, 23);
		getContentPane().add(button4);
		
		JButton button10 = new JButton("*");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button10.setBounds(91, 314, 45, 23);
		getContentPane().add(button10);
		
		JButton button1 = new JButton("1");
		button1.setFont(UIManager.getFont("Panel.font"));
		button1.setForeground(Color.BLACK);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button1.setBounds(91, 178, 45, 23);
		getContentPane().add(button1);
		
		JButton Callbutton = new JButton("\u62E8\u6253");
		Callbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(StringUtil.isEmpty(CallTextField.getText())){
					JOptionPane.showMessageDialog(null,"号码不能为空！");
					return;
				}
				dispose();
				new CallView().setVisible(true);
			}
		});
		Callbutton.setBounds(135, 368, 137, 23);
		getContentPane().add(Callbutton);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallTextField.setText( CallTextField.getText()+e.getActionCommand());
			}
		});
		button2.setBounds(178, 178, 45, 23);
		getContentPane().add(button2);
		
		JLabel label = new JLabel("\u62E8\u53F7");
		label.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\564706.png"));
		label.setFont(new Font("宋体", Font.PLAIN, 22));
		label.setBounds(135, 66, 117, 50);
		getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(49, 34, 339, 357);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\5d6030bf8c56e4e1ad3bd8cd44494ff8.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 441);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SZ\\Desktop\\\u901A\u8BAF\u5F55.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 441);
		lblNewLabel.setOpaque(false);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setOpaque(true);
	}
}
