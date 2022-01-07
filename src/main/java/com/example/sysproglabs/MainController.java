package com.example.sysproglabs;

import com.example.sysproglabs.model.SourceCodeRowModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML
    private Label welcomeText;
    @FXML
    private TableView<SourceCodeRowModel> sourceTextTable;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void initialize() {
        sourceTextTable.setEditable(true);
        List<SourceCodeRowModel> sourceCodeRowModelList = new ArrayList<>();

        sourceCodeRowModelList.add(new SourceCodeRowModel("LOOP", "ADD", "DI", "2"));
        sourceCodeRowModelList.add(new SourceCodeRowModel("LOOP", "ADD", "DI", "2"));
        sourceCodeRowModelList.add(new SourceCodeRowModel("LOOP", "ADD", "DI", "2"));
        sourceCodeRowModelList.add(new SourceCodeRowModel("LOOP", "ADD", "DI", "2"));

        ObservableList<SourceCodeRowModel> sourceCodeList = FXCollections.observableList(sourceCodeRowModelList);

        TableColumn<SourceCodeRowModel, String> labelCol = new TableColumn("Метка");
        labelCol.setCellValueFactory(new PropertyValueFactory<SourceCodeRowModel, String>("label"));
        labelCol.setCellFactory(TextFieldTableCell.forTableColumn());
        labelCol.setOnEditCommit(value -> {
            value.getTableView().getItems().get(value.getTablePosition().getRow())
                    .setLabel(value.getNewValue());
        });

        TableColumn<SourceCodeRowModel, String> commandCol = new TableColumn("Команда");
        commandCol.setCellValueFactory(new PropertyValueFactory<>("command"));
        commandCol.setCellFactory(TextFieldTableCell.forTableColumn());
        commandCol.setOnEditCommit(value -> {
            value.getTableView().getItems().get(value.getTablePosition().getRow())
                    .setCommand(value.getNewValue());
        });

        TableColumn<SourceCodeRowModel, String> operand1Col = new TableColumn("Операнд 1");
        operand1Col.setCellValueFactory(new PropertyValueFactory<>("operand1"));
        operand1Col.setCellFactory(TextFieldTableCell.forTableColumn());
        operand1Col.setOnEditCommit(value -> {
            value.getTableView().getItems().get(value.getTablePosition().getRow())
                    .setOperand1(value.getNewValue());
        });

        TableColumn<SourceCodeRowModel, String> operand2Col = new TableColumn("Операнд 2");
        operand2Col.setCellValueFactory(new PropertyValueFactory<>("operand2"));
        operand2Col.setCellFactory(TextFieldTableCell.forTableColumn());
        operand2Col.setOnEditCommit(value -> {
            value.getTableView().getItems().get(value.getTablePosition().getRow())
                    .setOperand2(value.getNewValue());
        });

        sourceTextTable.setItems(sourceCodeList);

        sourceTextTable.getColumns().addAll(labelCol, commandCol, operand1Col, operand2Col);
    }
}