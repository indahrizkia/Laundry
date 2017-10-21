/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plaundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
/**
 * FXML Controller class
 *
 * @author lenovo
 */

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button oke;
    @FXML
    private Button hapus;
    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField berat;
    @FXML
    private TextField telp;
    @FXML
    private TextField kembali;
    @FXML
    private RadioButton ck;
    @FXML
    private RadioButton cks;
    @FXML
    private RadioButton s;
    @FXML
    private TextArea TA;
    @FXML
    private TextField harga;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
           String Nama = nama.getText();
        String Alamat = alamat.getText();
        String Berat = berat.getText();
        String Telp = telp.getText();
        String Pilihan = "";     
        int har = 0;
        int hitung = Integer.parseInt(berat.getText());
        if (ck.isSelected()){
            Pilihan = "Cuci Kering";
            har = hitung*3000;}
        else if (cks.isSelected()){
            Pilihan = "Cuci Kering Setrika";
            har = hitung*4000;}
        else if (s.isSelected()){
            Pilihan = "Setrika";
            har = hitung*2500;}
        else {   Pilihan = "";}
        String Tanggal = kembali.getText();
        harga.setText(""+har);
        TA.setText("Nama Pelanggan : "+Nama+"\nAlamat Pelanggan : "+Alamat+"\nBerat Cucian : "+Berat+"\nNomor Telepon : "+Telp+
                "\nPilihan Paket Laundry : "+Pilihan+"\nTanggal Pengembalian : "+Tanggal);
        
        
        
        
        
    }

    @FXML
    private void delete(ActionEvent event) {
        TA.setText("");
        nama.setText("");
        alamat.setText("");
        berat.setText("");
        telp.setText("");
        ck.setSelected(false);
        cks.setSelected(false);
        s.setSelected(false);
        kembali.setText("");
        harga.setText("");
        
    }
    
}
