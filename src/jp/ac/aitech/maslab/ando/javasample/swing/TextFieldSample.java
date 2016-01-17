package jp.ac.aitech.maslab.ando.javasample.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldSample {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("SwingTextFieldSample");
		jFrame.setSize(400, 400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// BoarderLayoutを設定
		jFrame.setLayout(new BorderLayout());

		// コンテナの用意
		JPanel mainPanel = new JPanel();
		JPanel inputPanel = new JPanel();

		// コンポーネントの用意
		JTextField textField = new JTextField(20);
		JButton button = new JButton("Done");

		// ボタンにイベントの設定
		button.addActionListener(new SampleActionListener(mainPanel, textField));

		// 入力用のパネルを設定
		inputPanel.setLayout(new BorderLayout());
		inputPanel.add(textField, BorderLayout.CENTER);
		inputPanel.add(button, BorderLayout.EAST);

		// コンポーネントを設定
		jFrame.add(mainPanel, BorderLayout.CENTER);
		jFrame.add(inputPanel, BorderLayout.SOUTH);

		jFrame.setVisible(true);
	}

}

class SampleActionListener implements ActionListener {

	JPanel panel;
	JTextField textField;

	public SampleActionListener(JPanel panel, JTextField textField) {
		this.panel = panel;
		this.textField = textField;
	}

	// ボタンを押したらテキストフィールドに入力されている色にメインパネルの背景を変更する
	@Override
	public void actionPerformed(ActionEvent e) {
		String colorName = textField.getText();
		this.chengeBackGroundColor(colorName);
	}

	private void chengeBackGroundColor(String colorName) {
		Color c = panel.getBackground();
		switch (colorName) {
		case "RED":
			c = Color.RED;
			break;
		case "BLUE":
			c = Color.BLUE;
			break;
		case "GREEN":
			c = Color.GREEN;
			break;
		case "YELLOW":
			c = Color.YELLOW;
			break;
		case "PINK":
			c = Color.PINK;
			break;
		case "BLACK":
			c = Color.BLACK;
			break;
		default:
			break;
		}
		panel.setBackground(c);
	}
}
