/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import static com.sun.deploy.config.JREInfo.clear;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import jdbc.PenjualanModel;

/**
 * FXML Controller class
 *
 * @author hamza
 */
public class PenjualanController implements Initializable {
        
    String query = null;
    Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement;
    Penjualan pjl = null;
    private boolean update;
    int studentId;
    
    @FXML
    private Button btnData;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnHome;


    @FXML
    private Button btnProduk;

    @FXML
    private Button btnTambah;

    @FXML
    private TextField fieldharga;

    @FXML
    private TextField fieldjumlah;

    @FXML
    private TextField fieldstock;
    
    
    @FXML
    private Text notif;

    @FXML
    void addPenjualanproduk(ActionEvent event) {
        PenjualanModel penjualan= new PenjualanModel();
        int jumlahProduk=Integer.parseInt(fieldjumlah.getText());
        int harga=Integer.parseInt(fieldjumlah.getText());
        int stok=Integer.parseInt(fieldstock.getText());
    
        Penjualan penjualan1= new Penjualan(jumlahProduk,harga,stok);
        
        penjualan.addPenjualan(penjualan1);
        
        notif.setText("Data Berhasil Dimasukkan");
        clear();
    }

    @FXML
    void deletePenjualan(ActionEvent event) {
        PenjualanModel penjualan= new PenjualanModel();
        int jumlahProduk=Integer.parseInt(fieldjumlah.getText());
        int harga=Integer.parseInt(fieldjumlah.getText());
        int stok=Integer.parseInt(fieldstock.getText());
    
        Penjualan penjualan1= new Penjualan(jumlahProduk,harga,stok);
        
        penjualan.hapusPenjualan(penjualan1);
        
        notif.setText("Data Berhasil Dihapus");
        clear();
    }
    void clear(){
    fieldjumlah.clear();
    fieldharga.clear();
    fieldstock.clear();
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
    void initialize() {

        assert btnHapus != null : "fx:id=\"btnHapus\" was not injected: check your FXML file 'Penjualan.fxml'.";

        assert btnTambah != null : "fx:id=\"btnTambah\" was not injected: check your FXML file 'Penjualan.fxml'.";


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
}
