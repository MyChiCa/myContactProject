package myContact.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutView frame = new AboutView();
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
	public AboutView() {
		setResizable(false);
		setBounds(100, 100, 441, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7248 \u672C \u53F7\uFF1A  Version_DOS4.0");
		lblNewLabel.setBounds(108, 69, 161, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u65E5  \u671F    \uFF1A   2017-06-07");
		lblNewLabel_1.setBounds(108, 185, 219, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7CFB\u7EDF\u540D\u79F0\uFF1A  \u4E2A\u4EBA\u901A\u8BAF\u5F55");
		lblNewLabel_2.setBounds(101, 54, 148, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5355   \u4F4D   \uFF1A  \u4FE1\u606F\u79D1\u5B66\u4E0E\u6280\u672F\u5B66\u9662   \u8BA1\u7B97\u673A156\u73ED");
		lblNewLabel_3.setBounds(108, 125, 293, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5236 \u4F5C \u8005\uFF1A  \u5E84\u6893\u4F73");
		lblNewLabel_4.setBounds(108, 102, 161, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5B66   \u53F7   \uFF1A  201510224634");
		lblNewLabel_5.setBounds(108, 153, 255, 27);
		contentPane.add(lblNewLabel_5);
		
		JButton button = new JButton("\u5173\u95ED");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainFrame();
			}
		});
		button.setBounds(361, 229, 63, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\Version.jpg"));
		lblNewLabel_6.setBounds(0, 0, 434, 262);
		contentPane.add(lblNewLabel_6);
		setLocationRelativeTo(null);
	}
}
