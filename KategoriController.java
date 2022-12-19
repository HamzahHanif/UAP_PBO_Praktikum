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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hamza
 */
public class KategoriController implements Initializable {
  @FXML
    private Button btnData;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnHome;
    
    @FXML
    private Button btnKategori;

    @FXML
    private Button btnProduk;

    @FXML
    private Button btnTambah;

    @FXML
    private TextField fieldKategori;

    @FXML
    private Text notif;

    @FXML
    void deleteKategori(ActionEvent event) {

    }

    @FXML
    void sendData(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Data.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnData.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }

    @FXML
    void sendProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }

    @FXML
    void sendHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
    
        @FXML
    void sendTambah(ActionEvent event) throws IOException {

    }
    
    
        @FXML
    void sendKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Kategori.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnKategori.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
