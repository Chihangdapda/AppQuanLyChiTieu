package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.appView.AddCotroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppMenuController implements Initializable {

    @FXML
    private TableView<Spend> table;
    @FXML
    private TableColumn<Spend, String> nameColumn;
    @FXML
    private TableColumn<Spend, String> contentColumn;
    @FXML
    private TableColumn<Spend, Integer> moneyColumn;

    //    @FXML
//    private TableColumn<Spend,DatePicker>dateColumn;
    @FXML
    private TableColumn<Spend, String> noteColumn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Spend, String>("name"));
        contentColumn.setCellValueFactory(new PropertyValueFactory<Spend, String>("content"));
        moneyColumn.setCellValueFactory(new PropertyValueFactory<Spend, Integer>("money"));
        noteColumn.setCellValueFactory(new PropertyValueFactory<Spend, String>("note"));
        table.getItems().clear();
        table.getItems().addAll(SpendManager.getSpendList());
    }


    public void add(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("appView/appAdd.fxml"));
        Parent dashboardView = loader.load();
        Scene scene = new Scene(dashboardView);
        stage.setScene(scene);
    }

    public void delete(ActionEvent event) throws IOException {
       Spend selected = table.getSelectionModel().getSelectedItem();

       SpendManager.delete(selected);
    }

    public void search(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("appView/appAdd.fxml"));
        Parent dashboardView = loader.load();
        Scene scene = new Scene(dashboardView);
        stage.setScene(scene);
    }

    public void report(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("appView/appAdd.fxml"));
        Parent dashboardView = loader.load();
        Scene scene = new Scene(dashboardView);
        stage.setScene(scene);
    }

    public void edit(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("appView/appAdd.fxml"));
        Parent dashboardView = loader.load();
        Scene scene = new Scene(dashboardView);
        stage.setScene(scene);
    }



    public void logOut(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("appView/sampleapp.fxml"));
        Parent dashboardView = loader.load();
        Scene scene = new Scene(dashboardView);
        stage.setScene(scene);
    }


}
