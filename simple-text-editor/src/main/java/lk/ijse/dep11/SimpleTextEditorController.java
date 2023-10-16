package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

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
