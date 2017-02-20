package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField one;
    @FXML
    TextField two;

    @FXML
    public void click(){

        System.out.println("username = "+one.getText());
        System.out.println("password = "+two.getText());
    }


}
