package myContact.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CallView2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CallView frame = new CallView();
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
	public CallView2() {
		setResizable(false);
		setBounds(100, 100, 436, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("\u6B63\u5728\u62E8\u53F7");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 28));
		label.setBounds(144, 107, 193, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel(". . .");
		label_1.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		label_1.setBounds(251, 129, 54, 15);
		contentPane.add(label_1);
		
		JLabel NumLabel = new JLabel("");
		NumLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 22));
		NumLabel.setBounds(155, 74, 128, 23);
		contentPane.add(NumLabel);
		NumLabel.setText(ManagerView.MyTeleText.getText());
			
		JButton button = new JButton("\u53D6\u6D88");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(133, 219, 172, 30);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\8c9b9ddaeea25171a3e2c643db3e4780_\u770B\u56FE\u738B.jpg"));
		lblNewLabel.setBounds(0, 0, 433, 302);
		contentPane.add(lblNewLabel);
	}
}
