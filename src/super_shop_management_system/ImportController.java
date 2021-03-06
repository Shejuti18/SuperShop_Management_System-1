
package super_shop_management_system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ImportController implements Initializable {

    @FXML
    private Button Back_btn;
    @FXML
    private TextField ProductName;
    @FXML
    private TextField Price;
    @FXML
    private TextField Quantity;
    @FXML
    private Button Submit_btn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Back_btn_Action(ActionEvent event)throws IOException {
        Parent After_Login = FXMLLoader.load(getClass().getResource("After_Login.fxml"));
        Scene src11 = new Scene (After_Login);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src11);
        app_primaryStage.show();
        
    }

    @FXML
    private void ProductName_Action(ActionEvent event) {
    }

    @FXML
    private void Price_Action(ActionEvent event) {
    }

    @FXML
    private void Quantity_Action(ActionEvent event) {
    }

    @FXML
    private void Submit_btn_Action(ActionEvent event) {
    }
    
}
