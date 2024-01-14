package com.example.qrcode2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class QRCODEController {

    @FXML
    private Stage  stage;
    public void setStage(Stage stage){

        this.stage = stage;
    }
    @FXML
    private void oneNextPage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("qrcodepage.fxml"));
            Parent secondPage = fxmlLoader.load();
            Scene scene = new Scene(secondPage);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.setTitle("QRCODE GENE");
            newStage.show();
            stage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void onExit(){
        Stage currentStage = (Stage) stage.getScene().getWindow();
        currentStage.close();
    }

    private HistoriqueWindow historiqueWindow;
}