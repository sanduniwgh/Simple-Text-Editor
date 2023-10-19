package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.DataFormat;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;
import java.io.*;

public class SimpleTextEditorController {

    public AnchorPane root;
    @FXML
    private MenuItem menuAboutUs;

    @FXML
    private MenuItem menuCopy;

    @FXML
    private MenuItem menuCut;

    @FXML
    private MenuItem menuExit;

    @FXML
    private MenuItem menuNew;

    @FXML
    private MenuItem menuOpen;

    @FXML
    private MenuItem menuPaste;

    @FXML
    private MenuItem menuPrint;

    @FXML
    private MenuItem menuSave;

    @FXML
    private MenuItem menuSaveAs;

    @FXML
    private MenuItem menuSelectAll;

    @FXML
    private MenuItem menuUserGuide;

    @FXML
    void menuAboutUsOnAction(ActionEvent event)throws Exception {




    }

    @FXML
    void menuCutOnAction(ActionEvent event) {

    }

    @FXML
     void menuExitOnAction(ActionEvent event) {
      Stage stage=(Stage)root.getScene().getWindow();
      stage.close();
    }

    @FXML
    void menuNewOnAction(ActionEvent event) throws Exception{
        AnchorPane mainRoot= FXMLLoader.load(getClass().getResource("/view/SimpleTextEditor.fxml"));
        Scene mainScene= new Scene(mainRoot);
        Stage newStage =new Stage();
        newStage.setScene(mainScene);

        newStage.sizeToScene();
        newStage.centerOnScreen();
        newStage.setTitle("Simple Text Editor");

        FadeTransition fade = new FadeTransition(Duration.millis(200),mainRoot);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();
        newStage.show();

    }

    @FXML
    void menuOpenOnAction(ActionEvent event) {

    }

    @FXML
    void menuPasteOnAction(ActionEvent event) {

    }

    @FXML
    void menuPrintOnAction(ActionEvent event) {

    }

    @FXML
    void menuSaveAsOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        fileChooser.setInitialFileName("Untitled Document1");

        File file = fileChooser.showSaveDialog(root.getScene().getWindow());

        if (file != null) {
            saveTextFile(file);
        }
    }

    private void saveTextFile(File file) {
        HTMLEditor htmlEditor =(HTMLEditor) root.getChildren().get(1);
        String content = htmlEditor.getHtmlText();


        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            String normalText= htmlConvertToText(content);
            writer.write(normalText);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private String htmlConvertToText(String hcontent) {
        return hcontent.replaceAll("\\<.*?\\>","");
    }

    @FXML
    void menuSaveOnAction(ActionEvent event) {

    }

    @FXML
    void menuSelectAllOnAction(ActionEvent event) {

    }

    @FXML
    void menuUserGuideOnAction(ActionEvent event) {

    }

    @FXML
    void mnuCopyOnAction(ActionEvent event) {

    }

}
