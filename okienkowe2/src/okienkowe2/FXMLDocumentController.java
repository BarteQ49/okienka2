/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okienkowe2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Student
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    int i=0;
    
    @FXML
    private void print1(ActionEvent event) {
        i=i+1;
        label.setText(""+i);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
