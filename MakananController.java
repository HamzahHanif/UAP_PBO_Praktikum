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
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import jdbc.MakananModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author hamza
 */
public class MakananController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnPenjualan;
    
    @FXML
    private Button btnProduk;
    
    @FXML
    private Button btnMakanan;
    
    @FXML
    private Button btnData;

    @FXML
    private Button btnHapusMakanan;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnKategori;

    @FXML
    private Button btnTambahMakanan;

    @FXML
    private TextField fielddayatahan;

    @FXML
    private TextField fielddiskon;

    @FXML
    private TextField fieldharga;

    @FXML
    private TextField fieldid;

    @FXML
    private TextField fieldjumlah;

    @FXML
    private TextField fieldnamamakanan;

    @FXML
    private Text notif;

    
    @FXML
    void addMakanan(ActionEvent event) {
        MakananModel mkn= new MakananModel();
        double harga = Double.parseDouble(fieldharga.getText());
        int jumlah=Integer.parseInt(fieldjumlah.getText());
        double diskon=Double.parseDouble(fielddiskon.getText());
        int id=Integer.parseInt(fieldid.getText());
        int daya_tahan=Integer.parseInt(fielddayatahan.getText());
    
        Makanan mkn1= new Makanan(fieldnamamakanan.getText(), harga, jumlah, diskon, id, daya_tahan);
        
        mkn.addmakanan(mkn1);
        
        notif.setText("Data Berhasil Dimasukkan");
        clear();
    }

    @FXML
    void deleteMakanan(ActionEvent event) {
        MakananModel mkn= new MakananModel();
        double harga = Double.parseDouble(fieldharga.getText());
        int jumlah=Integer.parseInt(fieldjumlah.getText());
        double diskon=Double.parseDouble(fielddiskon.getText());
        int id=Integer.parseInt(fieldid.getText());
        int daya_tahan=Integer.parseInt(fielddayatahan.getText());
    
        Makanan mkn1= new Makanan(fieldnamamakanan.getText(),harga, jumlah,diskon,id,daya_tahan);
        
        mkn.hapusmakanan(mkn1);
        
         notif.setText("Data Berhasil Dihapus");
         clear();
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
    void sendMakanan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Makanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnMakanan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
    
    
    @FXML
    void sendData(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Data.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnData.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }

//    @FXML
//    void sendKategori(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Kategori.fxml"));
//        Parent root = loader.load();
//        
//      
//        Stage stage = (Stage) btnKategori.getScene().getWindow();
//        stage.setScene(new Scene(root));
//        stage.setTitle("Cashier Machine");
//    }

    @FXML
    void sendProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
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
    
}
