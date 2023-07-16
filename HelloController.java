package com.example.frank;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloController{

    @FXML
    private JFXButton add_goods;

    @FXML
    private TextField buying_txtfield;

    @FXML
    private TextField date_txtfield;

    @FXML
    private JFXButton issued_goods;

    @FXML
    private TextField product_idtextfield;

    @FXML
    private TextField quantity_txtfield;

    @FXML
    private TextField selling_txtfield;

    @FXML
    private JFXButton view_bills;

    @FXML
    private JFXButton view_goods;

    @FXML
    private JFXButton view_issuedgoods;

    @FXML
    private JFXButton view_vendors;

    @FXML
     void AddGood_Screen(ActionEvent event)   {
        System.out.println("this is clicked");
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tableview.fxml"));
            Parent parent_root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(parent_root));
            stage.show();

        }
        catch (Exception e){
            System.out.println("Cant Load Screen");
        }
    }

}

