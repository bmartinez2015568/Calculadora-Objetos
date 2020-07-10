/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bryanmartinez.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {  
    float dato1, dato2, resultado, acumulador;
    int op, acum;
    int aum = 2;
    boolean veri;
    float resultado2;
    @FXML Button btnMasMenos;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnMas;
    @FXML Button btnCero;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnMenos;
    @FXML Button btnMultiplicar;
    @FXML Button btnDividir;
    @FXML Button btnUnoDivididoX;
    @FXML Button btnC;
    @FXML Button btnCe;
    @FXML Button btnRaiz;
    @FXML Button btnCuadrado;
    @FXML Button btnPorcentaje;
    @FXML TextField txtResultado;
  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
      
        if(event.getSource()== btnCero)
        txtResultado.setText(txtResultado.getText()+ "0");
        else if(event.getSource()== btnUno)
        txtResultado.setText(txtResultado.getText()+ "1");
        else if (event.getSource()== btnDos) 
        txtResultado.setText(txtResultado.getText()+ "2");
        else if(event.getSource() == btnTres)
        txtResultado.setText(txtResultado.getText()+ "3");
        else if(event.getSource() == btnCuatro)
        txtResultado.setText(txtResultado.getText()+ "4");
        else if(event.getSource() == btnCinco)
        txtResultado.setText(txtResultado.getText()+ "5");
        else if(event.getSource() == btnSeis)
        txtResultado.setText(txtResultado.getText()+ "6");
        else if(event.getSource() == btnSiete)
        txtResultado.setText(txtResultado.getText()+ "7");
        else if(event.getSource() == btnOcho)
        txtResultado.setText(txtResultado.getText()+ "8");
        else if(event.getSource() == btnNueve)
        txtResultado.setText(txtResultado.getText()+ "9");
        else if(event.getSource() == btnMas){
            dato1 = Float.parseFloat(txtResultado.getText());
            txtResultado.setText("");
            op = 1;
        }else if(event.getSource() == btnMenos){
            dato1 = Float.parseFloat(txtResultado.getText());
            
            txtResultado.setText("");
            op = 2;
        }else if (event.getSource() == btnMultiplicar){
            dato1 = Float.parseFloat(txtResultado.getText());
            txtResultado.setText("");
            op = 3;
        }else if(event.getSource() == btnDividir){
            dato1 = Float.parseFloat(txtResultado.getText());
            txtResultado.setText("");
            op = 4;
        }else if(event.getSource() == btnRaiz){
            dato1 = Float.parseFloat(txtResultado.getText());
            
            op = 5;
        }else if(event.getSource() == btnCuadrado){
            dato1 = Float.parseFloat(txtResultado.getText());
            
            op = 6;
        }else if(event.getSource() == btnUnoDivididoX){
            dato1 = Float.parseFloat(txtResultado.getText());
            
            op = 7;
        }else if(event.getSource() == btnPunto){
            
        boolean tof = true;
        String validacion = txtResultado.getText();
        for (int i = 0; i < validacion.length(); i ++) { 
        if(validacion.substring(i, i+1).equals(".")){
            tof = false;
                }
        }   
        
            if (validacion.length() <= 0 ){
            txtResultado.setText(txtResultado.getText()+ "0.");
            }else if (validacion.length() > 0 && tof == true  ){
            txtResultado.setText(txtResultado.getText()+ ".");
                } 
        }
  
        else if(event.getSource() == btnCe){
        String ce = txtResultado.getText();
            if (ce.length() > 0){
            ce = ce.substring(0, ce.length()-1);
            txtResultado.setText(ce);
                 }
        }else if (event.getSource() == btnC){
        txtResultado.setText("");
        dato1 = 0;
        dato2 = 0;
        }else if (event.getSource() == btnPorcentaje){
               dato1 = Float.parseFloat(txtResultado.getText());
               txtResultado.setText("");
               op = 8;
        }else if(event.getSource() == btnMasMenos){
            dato1 = Float.parseFloat(txtResultado.getText());
            resultado = (dato1) * -1;
            txtResultado.setText(String.valueOf(resultado));
        }else if((event.getSource() == btnIgual)){
            dato2 = Float.parseFloat(txtResultado.getText());
            txtResultado.setText("");
            switch(op){
                case 1:
                    resultado = dato1 + dato2;
                    txtResultado.setText(String.valueOf(resultado));
                    break;
                    
                case 2:
                resultado = dato1- dato2;
                txtResultado.setText(String.valueOf(resultado));
                    break;
                case 3:
                resultado = dato1*dato2;
                txtResultado.setText(String.valueOf(resultado));
                break;
                
                case 4:
                resultado = dato1/dato2;
                txtResultado.setText(String.valueOf(resultado));
                break;
                
                case 5:
                resultado = (float)Math.sqrt(dato1);
                txtResultado.setText(String.valueOf(resultado));
                break;
                
                case 6:
                resultado = (float) Math.pow(dato1, 2);
                txtResultado.setText(String.valueOf(resultado));
                break;
                
                case 7:
                if (dato1 > 0 ){
                resultado = 1/dato1;
                txtResultado.setText(String.valueOf(resultado));
                }else if (dato1 == 0) {
                txtResultado.setText("No se puede dividir entre cero");    
                }
                break;
               
                case 8:
                    resultado = (dato1 * dato2)/ 100;
                    txtResultado.setText(String.valueOf(resultado));
                default:
            }
        }
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  
}