
package ogrenciisleriotomasyonu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static ogrenciisleriotomasyonu.ürünlerAdmin.*;


class ürünSecYeni extends JFrame implements ActionListener{
    ArrayList ürünler1 = new ArrayList<>();
    JButton geri = new JButton("Geri Dön");
    JButton kayıt = new JButton("Kaydet");
    JLabel ürünler = new JLabel("Dersler");
    JCheckBox ürün1 = new JCheckBox(" kazak", false);
    JCheckBox ürün2 = new JCheckBox("elbise", false);
    JCheckBox ürün3 = new JCheckBox("ceket", false);
    JCheckBox ürün4 = new JCheckBox("etek", false);
    JCheckBox ürün5 = new JCheckBox("canta", false);
    JCheckBox ürün6 = new JCheckBox("ayakkabı", false);
    JCheckBox ürün7 = new JCheckBox("yüzük", false);
    JCheckBox ürün8 = new JCheckBox("pantolon", false);
    JCheckBox ürün9 = new JCheckBox("ev esyayaları", false);
    JCheckBox ürün10 = new JCheckBox("teknolojik aletler", false);
    Font selam = new Font("selam", Font.BOLD, 15);
    String a = null,b = null,c = null,d = null;
    int e = 50;
    admin admin;
    ürünlerAdmin ürünlerAdmin;
    ürünSecYeni(){
        try {
            this.admin = new admin();
        } catch (IOException ex) {
            Logger.getLogger(ürünSecYeni.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.ürünlerAdmin = new ürünlerAdmin();
        } catch (IOException ex) {
            Logger.getLogger(ürünSecYeni.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Öğretim Üyesi Kayıt");
        this.add(ürünler);
        this.add(kayıt);
        this.add(geri);
        
        ürünler1.add(ürün1);
        ürünler1.add(ürün2);
        ürünler1.add(ürün3);
        ürünler1.add(ürün4);
        ürünler1.add(ürün5);
        ürünler1.add(ürün6);
        ürünler1.add(ürün7);
        ürünler1.add(ürün8);
        ürünler1.add(ürün9);
        ürünler1.add(ürün10);
        
        ürünler.setVisible(true);
        ürünler.setBounds(100,10,100,50);
        ürünler.setFont(selam);
        
        kayıt.setVisible(true);
        kayıt.setBounds(300,575,100,25);
        kayıt.addActionListener(this);
        
        geri.setVisible(true);
        geri.setBounds(300,610,100,25);
        geri.addActionListener(this);
        
        for(int j=0; j<ürünler1.size();j++){
            this.add((JCheckBox)ürünler1.get(j));
            ((JCheckBox)ürünler1.get(j)).setVisible(true);
            ((JCheckBox)ürünler1.get(j)).setBounds(100,e,150,50);
            e+=50;
        }
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == kayıt){
            for (int j = 0; j < ürünler1.size(); j++) {
                if (j < ürünler1.size() - 1) {
                    if (((JCheckBox) ürünler1.get(j)).isSelected()) {
                        ürünler1.add("t,");
                    } else {
                        ürünler1.add("f,");
                    }
                } else {
                    if (((JCheckBox) ürünler1.get(j)).isSelected()) {
                        ürünler1.add("t");
                    } else {
                        ürünler1.add("f");
                    }
                }
            }
            try {
                ürünlerAdmin.DersSecGecici();
                admin.kayıt(a, b, c, d);
                if(admin.kayıt){
                    ürünlerAdmin.DersSecOgretim(ürünler1);
                    JOptionPane.showMessageDialog(this, "Ders Seçme Başarılı!");
                    ürünler1.clear();
                }else{
                    
                }
                
            } catch (IOException ex) {
                Logger.getLogger(KayitOgrenci.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (admin.kayıt) {
                JOptionPane.showMessageDialog(this, "Kayıt Başarılı!");
            } else {
                JOptionPane.showMessageDialog(this, "Varolan ID ile kayıt olunamaz", "Kayıt Başarısız!", HEIGHT);
            }
            this.dispose();
            new menuYeniKisi();
        }
        if(e.getSource() == geri){
            this.dispose();
            new KayitAdmin();
        }
    }

    private static class KayitOgrenci {

        public KayitOgrenci() {
        }
    }
}
