/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import db.DBHelper;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hamza
 */

public class ViewBarangController implements Initializable {
    
    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Barang barang = null;

    @FXML
    private TableView<Barang> TabelBarang;

    @FXML
    private Button btnData;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnProduk;

    @FXML
    private Button btnrefresh;

    @FXML
    private TableColumn<Barang, String> kolombarcode;

    @FXML
    private TableColumn<Barang, Double> kolomdiskon;

    @FXML
    private TableColumn<Barang, String> kolomexpired;

    @FXML
    private TableColumn<Barang, Double> kolomharga;

    @FXML
    private TableColumn<Barang, Integer> kolomjumlah;

    @FXML
    private TableColumn<Barang, String> kolomkategori;

    @FXML
    private TableColumn<Barang, String> kolomnama;

    ObservableList<Barang> BarangList = FXCollections.observableArrayList();
    @Override
    public void initialize (URL url, ResourceBundle rb){
        
        loadDate();
    }
    
    private void loadDate() {
        
        connection = DBHelper.getConnection();
        refreshTable();
        
        kolomnama.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        kolomharga.setCellValueFactory(new PropertyValueFactory<>("harga"));
        kolomjumlah.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
        kolomdiskon.setCellValueFactory(new PropertyValueFactory<>("diskon"));
        kolombarcode.setCellValueFactory(new PropertyValueFactory<>("barcode"));
        kolomexpired.setCellValueFactory(new PropertyValueFactory<>("expired"));
        kolomkategori.setCellValueFactory(new PropertyValueFactory<>("kategori"));
    }
    
    private void refreshTable(){
         try {
            BarangList.clear();
            
            query = "SELECT * FROM `barang`";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                BarangList.add(new  Barang(
                        resultSet.getString("nama_produk"),
                        resultSet.getDouble("harga"),
                        resultSet.getInt("jumlah"),
                        resultSet.getDouble("diskon"),
                        resultSet.getString("barcode"),
                        resultSet.getString("expired"),
                        resultSet.getString("kategori")));
                TabelBarang.setItems(BarangList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewBarangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
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
    @FXML
    void getrefresh(ActionEvent event) {
        refreshTable();
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
    void sendHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnHome.getScene().getWindow();
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
}
