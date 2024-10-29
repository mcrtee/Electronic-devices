package com.example.electronicdevice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class HelloController {
    @FXML
    public Button addButton;
    @FXML
    public Button removeButton;
    @FXML
    public TabPane deviceTabPane;
    public ToggleGroup deviceGroup;
    @FXML
    RadioButton Laptop;
    @FXML
    RadioButton Smartphone;

    @FXML
    RadioButton Tablet;
    @FXML private TextField smartphoneNameField;
    @FXML private TextField smartphonePriceField;
    @FXML private TextField smartphoneWeightField;
    @FXML private TextField screenSizeField;
    @FXML private TextField cameraResolutionField;

    // Fields for Laptop
    @FXML private TextField laptopNameField;
    @FXML private TextField laptopPriceField;
    @FXML private TextField laptopWeightField;
    @FXML private TextField ramSizeField;
    @FXML private TextField processorTypeField;

    // Fields for Tablet
    @FXML private TextField tabletNameField;
    @FXML private TextField tabletPriceField;
    @FXML private TextField tabletWeightField;
    @FXML private TextField batteryLifeField;
    @FXML private CheckBox hasStylusField;
    @FXML
    ListView<Device> listView;
    @FXML
    Label label;
    ObservableList<Device> devices = FXCollections.observableArrayList();

    public HelloController() {
    }

    @FXML
    public void initialize() {
        listView.setItems(devices);
    }


    @FXML
    void onAddClick() {
        try {
            if (Smartphone.isSelected()) {
                Smartphone sm = new Smartphone();
                sm.setName(smartphoneNameField.getText());

                sm.setType(DeviceType.SMARTPHONE);
                sm.setPrice(Double.parseDouble(smartphonePriceField.getText()));
                sm.setWeight(Double.parseDouble(smartphoneWeightField.getText()));
                sm.setScreenSize(Double.parseDouble(screenSizeField.getText()));
                sm.setCameraResolution(Double.parseDouble(cameraResolutionField.getText()));
                devices.add(sm);
            }
            else if (Laptop.isSelected()) {
                Laptop lp = new Laptop();
                lp.setName(laptopNameField.getText());

                lp.setType(DeviceType.LAPTOP);
                lp.setPrice(Double.parseDouble(laptopPriceField.getText()));
                lp.setWeight(Double.parseDouble(laptopWeightField.getText()));
                lp.setRamSize(Integer.parseInt(ramSizeField.getText()));
                lp.setProcessorType(processorTypeField.getText());

                devices.add(lp);
            }
            else if (Tablet.isSelected()) {
                Tablet tb = new Tablet();
                tb.setName(tabletNameField.getText());

                tb.setType(DeviceType.TABLET);
                tb.setPrice(Double.parseDouble(tabletPriceField.getText()));
                tb.setWeight(Double.parseDouble(tabletWeightField.getText()));
                tb.setBatteryLife(Double.parseDouble(batteryLifeField.getText()));
                tb.setHasStylus(Boolean.parseBoolean(hasStylusField.getText()));

                devices.add(tb);
            } clearFields();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format!");
        }
        }

    private void clearFields() {
        // Clear all input fields after adding a device
        smartphoneNameField.clear();
        smartphonePriceField.clear();
        smartphoneWeightField.clear();
        screenSizeField.clear();
        cameraResolutionField.clear();

        laptopNameField.clear();
        laptopPriceField.clear();
        laptopWeightField.clear();
        ramSizeField.clear();
        processorTypeField.clear();

        tabletNameField.clear();
        tabletPriceField.clear();
        tabletWeightField.clear();
        batteryLifeField.clear();
        hasStylusField.setSelected(false);
    }
    @FXML
    public void onListClicked() {
        int id = listView.getSelectionModel().getSelectedIndex();
        if (id >= 0) { // Check if an item is selected
            label.setText(devices.get(id).toString());
        } else {
            label.setText("No device selected.");
        }
    }

    @FXML
    public void onRemoveClick() {
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }
}


