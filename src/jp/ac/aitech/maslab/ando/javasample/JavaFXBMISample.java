package jp.ac.aitech.maslab.ando.javasample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXBMISample extends Application {

	TextField textFieldH = new TextField();
	TextField textFieldW = new TextField();
	Label lblBMI = new Label("BMI");

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("JavaFXBMISample");
		stage.setWidth(200);
		stage.setHeight(155);

		// 身長のラベルとテキストフィールド
		Label lblH = new Label(" 身長(cm):");
		textFieldH.setPrefWidth(80);

		// 身長のコンポーネントのレイアウト
		HBox boxH = new HBox();
		boxH.getChildren().addAll(lblH, textFieldH);

		// 体重のラベルとテキストフィールド
		Label lblW = new Label(" 体重(kg):");
		textFieldW.setPrefWidth(80);

		// 体重のコンポーネントのレイアウト
		HBox boxW = new HBox();
		boxW.getChildren().addAll(lblW, textFieldW);

		// [計算]ボタン
		Button btnGo = new Button("計算");

		// [計算]ボタンのイベントの設定
		btnGo.setOnAction(event -> updateValue(stage));

		// Pos.TOP_CENTER : 上に詰めて中央揃え
		VBox root = new VBox();
		root.setAlignment(Pos.TOP_CENTER);
		root.setPadding(new Insets(5, 5, 5, 5));
		root.setSpacing(5.0);
		root.getChildren().addAll(boxH, boxW, btnGo, lblBMI);

		// シーンにラベルを設定
		stage.setScene(new Scene(root));
		stage.show();
	}

	// BMI値を計算する
	void updateValue(Stage stage) {
		String sh = textFieldH.getText();
		String sw = textFieldW.getText();
		double h = Double.parseDouble(sh.trim());
		double w = Double.parseDouble(sw.trim());
		double bmi = 10000.0 * w / (h * h);
		lblBMI.setText(String.format("BMI=%5.2f", bmi));
	}
}
