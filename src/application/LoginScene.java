package application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class LoginScene {

 public  Scene getLoginScene() {
	 BorderPane root = new BorderPane();
	 VBox formContainer = new VBox();
	 VBox titleContainer = new VBox();
	 titleContainer.setId("titleContainer");
	 VBox formContent = new VBox();
	 formContent.setId("formContent");
	 StackPane buttonContainer= new StackPane(); 
	 
	 //form title
	 Label title = new Label("LOGIN");
	 title.setId("title");
	 Label title2 = new Label("Please login here");
	 title2.setId("title2");
	 titleContainer.getChildren().addAll(title,title2);
	 
	 //form content	 
	 Label uname = new Label("Username");
	 TextField unameTextField = new TextField();
	 Label pass = new Label("Password");
	 PasswordField passField = new PasswordField();
	 formContent.getChildren().addAll(uname,unameTextField,pass,passField);
	 
	 Button submit = new Button("Submit");
	 submit.setId("submit");
	 buttonContainer.getChildren().add(submit);	 
	 
	//add form content to formcontainer
	formContainer.getChildren().addAll(titleContainer, formContent, buttonContainer);
	formContainer.setId("formContainer");
	
	//add form container to the layout root
	root.setCenter(formContainer);
	root.setId("root");
	 
	 //add the layout root to the scene
	 Scene loginScene = new Scene(root, 500, 400);
	 return loginScene; 
 }

}
