package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    @FXML
    private TextArea txtVelocita;
    
    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	long start,end;
    	start=System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	txtResult.setText(elenco.getElenco().toString());
    	txtParola.clear();
   
		end=System.nanoTime();
		
		txtVelocita.setText(""+(end-start)/(1e9)); 
		
		

    	
    	
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	long start,end;
    	start=System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	
    	end=System.nanoTime();
    	txtVelocita.setText(""+(end-start)/(1e9)); 
    }
    
    @FXML
    void hundleButton(ActionEvent event) {
    	long start,end;
    	start=System.nanoTime();
    	
    	elenco.cancella(txtParola.getText());
    	txtParola.clear();
    	txtResult.setText(elenco.getElenco().toString());

    	
    	end=System.nanoTime();
    	txtVelocita.setText(""+(end-start)/(1e9)); 
    }
    
    

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
