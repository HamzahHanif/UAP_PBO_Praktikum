/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import static com.sun.deploy.config.JREInfo.clear;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import jdbc.BarangModel;

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
public class BarangController implements Initializable {
    

    @FXML
    private TextField barcodebarang;
    
    @FXML
    private Button btnData;

    @FXML
    private Button btnHapusbarang;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnKategori;
    
    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnProduk;

    @FXML
    private Button btnTambahbarang;

    @FXML
    private TextField diskonbarang;

    @FXML
    private TextField expiredbarang;

    @FXML
    private TextField hargabarang;

    @FXML
    private TextField jumlahbarang;

    @FXML
    private TextField kategoribarang;

    @FXML
    private TextField namabarang;

    @FXML
    private Text notif;
 
  

    @FXML
    void sendData(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Data.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnData.getScene().getWindow();
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
    void sendHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void addBarang(ActionEvent event) {
        BarangModel mkn= new BarangModel();
        double harga = Double.parseDouble(hargabarang.getText());
        int jumlah=Integer.parseInt(jumlahbarang.getText());
        double diskon=Double.parseDouble(diskonbarang.getText());
        Barang brg1= new Barang(namabarang.getText(),harga, jumlah,diskon,barcodebarang.getText(),expiredbarang.getText(),kategoribarang.getText());
        
        mkn.addbarang(brg1);
        
        notif.setText("Data Berhasil Dimasukkan");
        clear();   
    }
//
//    @FXML
//    void cancelBarang(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuBarang.fxml"));
//        Parent root = loader.load();
//        
//      
////        Stage stage = (Stage) btnKembali.getScene().getWindow();
////        stage.setScene(new Scene(root));
////        stage.setTitle("Cashier Machine");
//    }

    @FXML
    void deleteBarang(ActionEvent event) {
        BarangModel mkn= new BarangModel();
        double harga = Double.parseDouble(hargabarang.getText());
        int jumlah=Integer.parseInt(jumlahbarang.getText());
        double diskon=Double.parseDouble(diskonbarang.getText());
    
    
        Barang brg1= new Barang(namabarang.getText(),harga, jumlah,diskon,barcodebarang.getText(),expiredbarang.getText(),kategoribarang.getText());
        
        mkn.hapusBarang(brg1);
        
        notif.setText("Data Berhasil Dihapus");
        clear();
    }


    void initialize() {
        assert btnHapusbarang != null : "fx:id=\"btnHapusbarang\" was not injected: check your FXML file 'Barang.fxml'.";
        assert btnTambahbarang != null : "fx:id=\"btnTambahbarang\" was not injected: check your FXML file 'Barang.fxml'.";

    }

    @FXML
    void sendPenjualan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Penjualan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    


   void clear(){
    namabarang.clear();
    hargabarang.clear();
    jumlahbarang.clear();
    diskonbarang.clear();
    barcodebarang.clear();
    expiredbarang.clear();
    kategoribarang.clear();
    }
   
}
