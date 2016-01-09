package jp.ac.aitech.maslab.ando.javasample;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class SwingBoarderLayoutSample {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("BoarderLayoutSample");
		jFrame.setSize(400, 400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// BoarderLayoutを設定
		jFrame.setLayout(new BorderLayout());

		// コンポーネントの用意
		JLabel north = new JLabel("NORTH", JLabel.CENTER);
		JLabel south = new JLabel("SOUTH", JLabel.CENTER);
		JLabel east = new JLabel("EAST", JLabel.CENTER);
		JLabel west = new JLabel("WEST", JLabel.CENTER);
		JLabel center = new JLabel("CENTER", JLabel.CENTER);

		// 境界線（Boarder）を描画
		north.setBorder(new LineBorder(Color.RED));
		south.setBorder(new LineBorder(Color.RED));
		east.setBorder(new LineBorder(Color.RED));
		west.setBorder(new LineBorder(Color.RED));
		center.setBorder(new LineBorder(Color.RED));

		// 第二パラメタで場所を指定
		jFrame.add(north, BorderLayout.NORTH);
		jFrame.add(south, BorderLayout.SOUTH);
		jFrame.add(east, BorderLayout.EAST);
		jFrame.add(west, BorderLayout.WEST);
		jFrame.add(center, BorderLayout.CENTER);

		jFrame.setVisible(true);
	}

}
