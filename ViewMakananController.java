/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import db.DBHelper;
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
public class ViewMakananController implements Initializable {
    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Makanan makanan = null;    
    
    
    @FXML
    private TableView<Makanan> TabelMakanan;

    @FXML
    private Button btnData;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnProduk;

    @FXML
    private Button btnrefresh;

    @FXML
    private TableColumn<Makanan, Integer> kolomdayatahan;

    @FXML
    private TableColumn<Makanan, Double> kolomdiskon;

    @FXML
    private TableColumn<Makanan, Double> kolomharga;

    @FXML
    private TableColumn<Makanan, Integer> kolomid;

    @FXML
    private TableColumn<Makanan, Integer> kolomjumlah;

    @FXML
    private TableColumn<Makanan, String> kolomnama;

    ObservableList<Makanan> MakananList = FXCollections.observableArrayList();
    @Override
    public void initialize (URL url, ResourceBundle rb){
        
        loadDate();
    }
    
    
    @FXML
    void getrefresh(ActionEvent event) {
        refreshTable();
    }
    
    private void refreshTable(){
         try {
            MakananList.clear();
            
            query = "SELECT * FROM `mkn`";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                MakananList.add(new  Makanan(
                        resultSet.getString("nama_produk"),
                        resultSet.getDouble("harga"),
                        resultSet.getInt("jumlah"),
                        resultSet.getDouble("diskon"),
                        resultSet.getInt("id"),
                        resultSet.getInt("daya_tahan")));
                TabelMakanan.setItems(MakananList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewMakananController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void loadDate() {
        
        connection = DBHelper.getConnection();
        refreshTable();
        
        kolomnama.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        kolomjumlah.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
        kolomid.setCellValueFactory(new PropertyValueFactory<>("id"));
        kolomharga.setCellValueFactory(new PropertyValueFactory<>("harga"));
        kolomdiskon.setCellValueFactory(new PropertyValueFactory<>("diskon"));
        kolomdayatahan.setCellValueFactory(new PropertyValueFactory<>("daya_tahan"));
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
    void sendProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir Indomerit");
    }
   
    
}
