package com.example.qrcode2;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistoriqueWindow extends Stage {
    private TextArea historiqueTextArea;
    private VBox root;

    public HistoriqueWindow() {

        historiqueTextArea = new TextArea();
        historiqueTextArea.setEditable(false);
        Scene scene = new Scene(historiqueTextArea, 400, 300);
        setScene(scene);
        setTitle("Historique des QR Codes");
        historiqueTextArea.setStyle("-fx-font-family: Arial");

    }
    public void afficherHistorique(String historique){

        historiqueTextArea.setText(historique);
        historiqueTextArea.setOnMouseClicked(event -> {
            String selectedText = historiqueTextArea.getSelectedText();
            if(selectedText != null && selectedText.startsWith("URL: ")){
                String url = selectedText.substring(5);

            }
        });
    }

}
