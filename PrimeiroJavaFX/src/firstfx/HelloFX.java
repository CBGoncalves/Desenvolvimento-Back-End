package firstfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloFX extends Application{
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Image image = new Image(getClass().getResource("/firstfx/img/logo_sky.jpg").toExternalForm());
        ImageView imageView = new ImageView(image);
		imageView.setImage(image);
		imageView.setX(375);
		imageView.setY(130);
		imageView.setFitWidth(150);
		imageView.setFitHeight(150);
		
		TextField tf = new TextField();
		tf.setStyle("-fx-border-radius: 5; -fx-backgroud-radius: 5; -fx-border-width: 2" );
		tf.setLayoutX(306);
		tf.setLayoutY(300);
		tf.setPrefWidth(289);
		tf.setPrefHeight(33);
		
		TextField tf2 = new TextField();
		tf2.setStyle("-fx-border-radius: 5; -fx-backgroud-radius: 5; -fx-border-width: 2" );
		tf2.setLayoutX(306);
		tf2.setLayoutY(374);
		tf2.setPrefWidth(289);
		tf2.setPrefHeight(33);
		
		AnchorPane root = new AnchorPane(imageView);
		root.getChildren().add(tf);
		root.getChildren().add(tf2);
		
		Scene scene = new Scene(root, 900, 600);
		
		primaryStage.setTitle("Titulo da pagina");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
