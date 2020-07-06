package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller implements Initializable {
    String user = "Noah";
    String pass = "12";


    @FXML
    public TextField username;
    @FXML
    private PasswordField password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void dashBoardView(ActionEvent event) throws IOException {
        String name = username.getText();
        String passw = password.getText();
        if (name.isEmpty() || passw.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("nhap day du cac truong");
            alert.showAndWait();
        } else {
            if (name.equals(user) && passw.equals(pass)) {
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("appView/appMenu.fxml"));
                Parent dashboardView = loader.load();
                Scene scene = new Scene(dashboardView);
                stage.setScene(scene);

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("nhap thong tin khong dung");
                alert.showAndWait();
            }
        }
    }

    public void cancel(ActionEvent actionEvent) {
        username.setText("");
        password.setText("");
    }
}
