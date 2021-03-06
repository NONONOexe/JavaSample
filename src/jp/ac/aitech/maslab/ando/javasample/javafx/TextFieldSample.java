package jp.ac.aitech.maslab.ando.javasample.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldSample extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// フレームの設定
		stage.setTitle("JavaFXTextFieldSample");
		stage.setWidth(240);
		stage.setHeight(160);

		// ラベルとテキストフィールドの準備
		TextField textField = new TextField();
		Label label = new Label();

		// LabelとTextFieldを結合する
		label.textProperty().bind(textField.textProperty());

		// レイアウトの設定
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setSpacing(20.0);
		root.getChildren().addAll(textField, label);

		stage.setScene(new Scene(root));
		stage.show();
	}
}
