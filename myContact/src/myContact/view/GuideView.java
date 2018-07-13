package myContact.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GuideView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuideView frame = new GuideView();
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
	public GuideView() {
		setResizable(false);
		setBounds(100, 100, 459, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u901A\u8BAF\u5F55");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		lblNewLabel.setBounds(152, 0, 217, 37);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u9996\u5148\u7528\u7CFB\u7EDF\u63D0\u4F9B\u7684\u8D26\u6237\u548C\u5BC6\u7801\u767B\u5F55\u901A\u8BAF\u5F55\u754C\u9762");
		label.setBounds(10, 47, 332, 22);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("\u5230\u4E3B\u754C\u9762\uFF0C\u53EF\u4EE5\u8FDB\u884C\u6839\u636E\u8F93\u5165\u7684\u53F7\u7801\u62E8\u53F7\uFF0C\u4E3B\u754C\u9762\u63D0\u4F9B\u7BA1\u7406\u8054\u7CFB\u4EBA\u529F\u80FD\u5757");
		lblNewLabel_1.setBounds(10, 95, 428, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6B64\u5916\u8FD8\u6709\u5207\u6362\u7528\u6237\uFF0C\u9000\u51FA\u7CFB\u7EDF\u6309\u94AE");
		lblNewLabel_2.setBounds(10, 142, 234, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5E0C\u671B\u7528\u6237\u5728\u4F7F\u7528\u7684\u8FC7\u7A0B\u4E2D\u5411\u6211\u4EEC\u63D0\u51FA\u5B9D\u8D35\u7684\u610F\u89C1\uFF0C\u6211\u4EEC\u4E00\u5B9A\u865A\u5FC3\u542C\u53D6\u5E76\u4E14\u53CA");
		lblNewLabel_3.setBounds(10, 188, 438, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_1 = new JLabel("\u65F6\u6539\u8FDB\uFF0C\u8C22\u8C22\uFF01");
		label_1.setBounds(10, 226, 159, 15);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\\u6570\u636E\u5E93\u7528\u56FE\u6807\\guide.jpg"));
		lblNewLabel_4.setBounds(0, 0, 454, 262);
		contentPane.add(lblNewLabel_4);
		setLocationRelativeTo(null);
	}
}
