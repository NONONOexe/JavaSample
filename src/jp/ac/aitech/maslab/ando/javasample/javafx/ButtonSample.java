package jp.ac.aitech.maslab.ando.javasample.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ButtonSample extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("JavaFXButtonSample");
		stage.setWidth(240);
		stage.setHeight(120);

		// ラベルの設定
		Label lblMsg = new Label("Hello, JavaFX");
		lblMsg.setFont(new Font(12));

		// ボタンの設定
		Button btnOk = new Button("閉じる");
		btnOk.setPrefWidth(120);

		// イベントの設定
		// JavaFXApplicationはPlatform.exit()を呼び出すと終了する
		btnOk.setOnAction(event -> Platform.exit());

		// レイアウトの設定
		// VBox : 縦に並べるレイアウト, HBox : 横に並べるレイアウト
		// Pos.CENTER : 中心にコンポーネントを設定
		// setPadding : 余白を設定, setSpacing : 垂直方向の間隔を設定
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setSpacing(20.0);
		root.getChildren().addAll(lblMsg, btnOk);

		// シーンにラベルを設定
		stage.setScene(new Scene(root));
		stage.show();
	}
}
