/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.anindira.latihanmvc.controller;

import edu.anindira.latihanmvc.model.PelangganModel;
import edu.anindira.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Fitri
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
        
    }
   
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String telp = view.getTxttelp().getText();
        
        if (nama.equals("") && email.equals("") && telp.equals("")){
        
        }else {
            model.resetForm();
        }               
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String telp = view.getTxttelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (telp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp  Masih Kosong");
        } else{
            model.simpanForm();
                       
        }
        
    }
    
}
