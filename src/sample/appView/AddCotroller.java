package sample.appView;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AppMenuController;
import sample.Spend;
import sample.SpendManager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class AddCotroller implements Initializable {
    @FXML
    private  TextField nameObj;
    @FXML
    private  TextField contentObj;

    @FXML
    private  TextField moneyObj;

    @FXML
    private  TextField noteObj;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void okObj(ActionEvent event) throws IOException {
        Spend spend=new Spend();
        spend.setName(nameObj.getText());
        spend.setContent(contentObj.getText());
        spend.setMoney(Integer.parseInt(moneyObj.getText()));
        spend.setNote(noteObj.getText());
        SpendManager.add(spend);

    }

    public void backObj(ActionEvent event) throws IOException {
        Stage stage =(Stage)((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("appMenu.fxml"));
        Parent dashboardView1 = loader.load();
        Scene scene =new Scene(dashboardView1);
        stage.setScene(scene);
    }
}
