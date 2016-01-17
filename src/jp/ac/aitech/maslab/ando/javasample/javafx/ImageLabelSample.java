package jp.ac.aitech.maslab.ando.javasample.javafx;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImageLabelSample extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// フレームの設定
		stage.setTitle("JavaFXImageLabelSample");
		stage.setWidth(240);
		stage.setHeight(240);

		// ラベルの設定
		Label lblMsg = new Label("テキストの表示例");
		Label lblImg = new Label();

		// イメージファイルの読み込み
		// ラベルの背景にイメージを設定
		Image img = new Image(Paths.get("img/icon.png").toUri().toString());
		BackgroundImage bimg = new BackgroundImage(img, null, null, null, null);
		Background bg = new Background(bimg);
		lblImg.setMinSize(img.getWidth(), img.getHeight());
		lblImg.setBackground(bg);

		// レイアウトの設定
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setSpacing(20.0);
		root.getChildren().addAll(lblMsg, lblImg);

		stage.setScene(new Scene(root));
		stage.show();
	}
}
