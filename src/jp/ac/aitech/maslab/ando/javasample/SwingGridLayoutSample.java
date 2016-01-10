package jp.ac.aitech.maslab.ando.javasample;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class SwingGridLayoutSample {

	public static final int ROWS = 5;// 行数
	public static final int COLS = 5;// 列数

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("GridLayoutSample");
		jFrame.setSize(400, 400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// GridLayoutを設定
		jFrame.setLayout(new GridLayout(ROWS, COLS));

		// コンポーネントの設定
		for (int col = 0; col < COLS; col++) {
			for (int row = 0; row < ROWS; row++) {
				String coord = String.format("(%d, %d)", row, col);
				JLabel label = new JLabel(coord, JLabel.CENTER);
				label.setBorder(new LineBorder(Color.BLACK));
				jFrame.add(label);
			}
		}

		jFrame.setVisible(true);
	}

}
