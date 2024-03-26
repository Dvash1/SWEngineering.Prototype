package il.cshaifasweng.OCSFMediatorExample.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;

import static il.cshaifasweng.OCSFMediatorExample.client.SimpleChatClient.loadFXML;

public class MainMenuController {
    @FXML
    private Button logout;
    @FXML
    private Button tasks_list;
    @FXML
    private Button button;
    @FXML
    private Label hi_label;
    @FXML
    private TextField ip_address;
    @FXML
    private AnchorPane mainmenuAnchor;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void showUsername(String username){
        hi_label.setText("Hello " + username);
    }
    @FXML
    void logout(ActionEvent event) throws IOException {
//        SceneManager.switchScene("login.fxml",event);
        scene = new Scene(loadFXML("login"), 434, 445);
        stage = (Stage) mainmenuAnchor.getScene().getWindow();
        stage.setScene(scene);
//        stage.setScene(scene);
    }
}