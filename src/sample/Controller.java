package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Pane root;

    @FXML
    Slider slider;

    @FXML
    ColorPicker color;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Circle circle = new Circle(400, 300, 50);
        root.getChildren().add(circle);
    }

    public void drawCircle(MouseEvent event) {
        Circle circle = new Circle();
        circle.setCenterX(event.getX());
        circle.setCenterY(event.getY());
        circle.setRadius(slider.getValue());
        circle.setFill(color.getValue());
        circle.toBack();
        root.getChildren().add(circle);
    }
}
