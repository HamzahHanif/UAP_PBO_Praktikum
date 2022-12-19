/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hamza
 */
public class DataController implements Initializable {
    @FXML
    private Button btnHome;
    @FXML
    private Button btnProduk;
    @FXML
    private Button btnKategori;
    @FXML
    private Button btnData;
    @FXML
    private Button btnrefresh;
    @FXML
    private Button btnviewbarang;
    @FXML
    private Button btnviewkategori;
    @FXML
    private Button btnviewmakanan;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void sendData(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Data.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnData.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void sendHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void sendKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Kategori.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnKategori.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void sendProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }


    @FXML
    private void sendviewbarang(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnviewbarang.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    private void sendviewkategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewKategori.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnviewkategori.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    private void sendviewmakanan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewMakanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnviewmakanan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
    
    @FXML
    private Button btnPenjualan;
    @FXML
    void sendPenjualan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Penjualan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
    
}
