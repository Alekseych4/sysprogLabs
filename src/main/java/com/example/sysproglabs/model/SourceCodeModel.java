package com.example.sysproglabs.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SourceCodeModel {
    private StringProperty label;
    private StringProperty command;
    private StringProperty operand1;
    private StringProperty operand2;

    public String getLabel() {
        return label.get();
    }

    public StringProperty labelProperty() {
        return label;
    }

    public String getCommand() {
        return command.get();
    }

    public StringProperty commandProperty() {
        return command;
    }

    public String getOperand1() {
        return operand1.get();
    }

    public StringProperty operand1Property() {
        return operand1;
    }

    public String getOperand2() {
        return operand2.get();
    }

    public StringProperty operand2Property() {
        return operand2;
    }

    public SourceCodeModel(String label, String command, String operand1, String operand2) {
        this.label = new SimpleStringProperty(this, "метка", label);
        this.command = new SimpleStringProperty(this, "команда", command);
        this.operand1 = new SimpleStringProperty(this, "операнд1", operand1);
        this.operand2 = new SimpleStringProperty(this, "операнд2", operand2);
    }

}
