package com.example.sysproglabs;

import com.example.sysproglabs.model.SourceCodeModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML
    private Label welcomeText;
    @FXML
    private TableView<SourceCodeModel> sourceTextTable;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void initialize() {
        List<SourceCodeModel> sourceCodeModelList = new ArrayList<>();

        sourceCodeModelList.add(new SourceCodeModel("LOOP", "ADD", "DI", "2"));
        sourceCodeModelList.add(new SourceCodeModel("LOOP", "ADD", "DI", "2"));
        sourceCodeModelList.add(new SourceCodeModel("LOOP", "ADD", "DI", "2"));
        sourceCodeModelList.add(new SourceCodeModel("LOOP", "ADD", "DI", "2"));

        ObservableList<SourceCodeModel> sourceCodeModels = FXCollections.observableList(sourceCodeModelList);

        sourceTextTable.setItems(sourceCodeModels);

    }
}