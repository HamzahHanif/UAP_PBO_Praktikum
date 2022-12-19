/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;


/**
 *
 * @author hamza
 */
import jdbc.MakananModel;
import db.DBHelper;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Uappbo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Cashier Machine");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        DBHelper.getConnection();
        
//        MakananModel mkn = new MakananModel();
//        Makanan mkn1= new Makanan("mi ayam",0.5,1,0.5,0,1);
//        
//        mkn.addmakanan(mkn1);
//        
//        ArrayList<Makanan> listMakanan = mkn.getmakanan();
//        
//        for(int i = 0;i < listMakanan.size(); i++){
//            System.out.println("nama_produk : " + listMakanan.get(i).getNama_produk());
//            System.out.println("Harga  : " + listMakanan.get(i).getHarga());
//            System.out.println("Jumlah : "+listMakanan.get(i).getJumlah());
//            System.out.println("Diskon  : " + listMakanan.get(i).getDiskon());
//            System.out.println("Id  : " + listMakanan.get(i).getId());
//            System.out.println("Daya Tahan  : " + listMakanan.get(i).getDaya_tahan());
//
//        }
        
    }
    
}