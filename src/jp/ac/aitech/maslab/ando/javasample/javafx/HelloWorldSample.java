package jp.ac.aitech.maslab.ando.javasample.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorldSample extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// タイトルをHello, JavaFXに設定
		stage.setTitle("Hello, JavaFX");

		// ウィンドウサイズの設定
		stage.setWidth(540);
		stage.setHeight(220);

		// ラベルの設定
		Label lblMsg = new Label("Hello, JavaFX");
		lblMsg.setFont(new Font(80));

		// シーンにラベルを設定
		stage.setScene(new Scene(lblMsg));
		stage.show();
	}

	@Override
	public void init() throws Exception {
		// 初期化時の処理はここに書く
		System.out.println("初期化します");
	}

	@Override
	public void stop() throws Exception {
		// 終了時の処理はここに書く
		System.out.println("終了します。");
	}
}
