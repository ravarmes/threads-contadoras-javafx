/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author rafael
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button buttonIniciarThread1;
    @FXML
    private Button buttonIniciarThread2;
    @FXML
    private Button buttonFinalizarThread1;
    @FXML
    private Button buttonFinalizarThread2;
    @FXML
    private Label labelProcessamentoThread1;
    @FXML
    private Label labelProcessamentoThread2;
    
    MinhaRunnable minhaThread1;
    MinhaRunnable minhaThread2;
    Thread t1;
    Thread t2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void handleButtonIniciarThread1(){
        minhaThread1 = new MinhaRunnable(labelProcessamentoThread1);
        t1 = new Thread(minhaThread1, "Thread 1");
        t1.start();
    }
    
    @FXML
    public void handleButtonIniciarThread2(){
        minhaThread2 = new MinhaRunnable(labelProcessamentoThread2);
        t2 = new Thread(minhaThread2, "Thread 2");
        t2.start();
    }
    
    @FXML
    public void handleButtonFinalizarThread1(){
        t1.stop();
    }
    
    @FXML
    public void handleButtonFinalizarThread2(){
        t2.stop();
    }
    
}
