/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author bryan
 */
public class PantallaController implements Initializable {
    
    @FXML private TextField txtMessage;
    @FXML private Button bttChange;
    @FXML private Label labMessage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML public void showMessage(ActionEvent event){
        labMessage.setText(txtMessage.getText());
    }
    
}
