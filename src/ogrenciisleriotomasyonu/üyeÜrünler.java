
package ogrenciisleriotomasyonu;

import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ogrenciisleriotomasyonu.esyalar;
import ogrenciisleriotomasyonu.ürünlerAdmin;
import ogrenciisleriotomasyonu.MainMenuüye;
import static ogrenciisleriotomasyonu.esyalar.*;
import static ogrenciisleriotomasyonu.ürünlerAdmin.*;

class üyeÜrünler extends JFrame implements ActionListener{
    static ArrayList ürünfiyatı  = new ArrayList<>();
    static ArrayList ürünlerim = new ArrayList<>();
    static ArrayList üyeler = new ArrayList<>();
    JCheckBox ürün1 = new JCheckBox("kazak",false);
    JCheckBox ürün2 = new JCheckBox("etek",false);
    JCheckBox ürün3 = new JCheckBox("elbise",false);
    JCheckBox ürün4 = new JCheckBox("ceket",false);
    JCheckBox ürün5 = new JCheckBox("ayakkabı",false);
    JCheckBox ürün6 = new JCheckBox("canta",false);
    JCheckBox ürün7 = new JCheckBox("yüzük",false);
    JCheckBox ürün8 = new JCheckBox("pantolon",false);
    JCheckBox ürün9 = new JCheckBox("teknolojik aletler",false);
    JCheckBox ürün10 = new JCheckBox("ev eşyaları",false);
    JLabel toplamFiyat = new JLabel();
    JLabel ürünfiyatı1 = new JLabel();
    JLabel ürünfiyatı2 = new JLabel();
    JLabel ürünfiyatı3 = new JLabel();
    JLabel ürünfiyatı4 = new JLabel();
    JLabel ürünfiyatı5 = new JLabel();
    JLabel ürünfiyatı6 = new JLabel();
    JLabel ürünfiyatı7 = new JLabel();
    JLabel ürünfiyatı8 = new JLabel();
    JLabel ürünfiyatı9 = new JLabel();
    JLabel ürünfiyatı10 = new JLabel();
    JLabel üyeler1 = new JLabel();
    JLabel üyeler2 = new JLabel();
    JLabel üyeler3 = new JLabel();
    JLabel üyeler4 = new JLabel();
    JLabel üyeler5 = new JLabel();
    JLabel üyeler6 = new JLabel();
    JLabel üyeler7 = new JLabel();
    JLabel üyeler8 = new JLabel();
    JLabel üyeler9 = new JLabel();
    JLabel üyeler10 = new JLabel();
    JLabel ürünler = new JLabel("Ürünler");
    JLabel ürünFiyati1 = new JLabel("ürün fiyatları");
    JLabel üyeler11 = new JLabel("kullanıcı"); 
    JButton kaydet = new JButton("Kaydet");
    JButton anamenü = new JButton("Ana Menü");
    Font selam = new Font("selam", Font.BOLD, 15);
    esyalar d = new esyalar();
    ürünlerAdmin Admin;
    int a = 50;
    int b = 50;
    int ToplamFiyat = 0;
    üyeÜrünler(){
//        esyalar.ArraylereAt();
        try {
            this.Admin = new ürünlerAdmin();
        } catch (IOException ex) {
            Logger.getLogger(üyeÜrünler.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Ürün Kataloğu");
        this.add(kaydet);
        this.add(anamenü);
        this.add(ürünler);
        this.add(ürünFiyati1);
        this.add(üyeler11);
        this.add(toplamFiyat);
       
        
        üyeler.clear();
        üyeler.add(üyeler1);
        üyeler.add(üyeler2);
        üyeler.add(üyeler3);
        üyeler.add(üyeler4);
        üyeler.add(üyeler5);
        üyeler.add(üyeler6);
        üyeler.add(üyeler7);
        üyeler.add(üyeler8);
        üyeler.add(üyeler9);
        üyeler.add(üyeler10);
        
        
        ürünlerim.clear();
        ürünlerim.add(ürün1);
        ürünlerim.add(ürün2);
        ürünlerim.add(ürün3);
        ürünlerim.add(ürün4);
        ürünlerim.add(ürün5);
        ürünlerim.add(ürün6);
        ürünlerim.add(ürün7);
        ürünlerim.add(ürün8);
        ürünlerim.add(ürün9);
        ürünlerim.add(ürün10);
        
        ürünfiyatı.clear();
        ürünfiyatı.add(ürünfiyatı1);
        ürünfiyatı.add(ürünfiyatı2);
        ürünfiyatı.add(ürünfiyatı3);
        ürünfiyatı.add(ürünfiyatı4);
        ürünfiyatı.add(ürünfiyatı5);
        ürünfiyatı.add(ürünfiyatı6);
        ürünfiyatı.add(ürünfiyatı7);
        ürünfiyatı.add(ürünfiyatı8);
        ürünfiyatı.add(ürünfiyatı9);
        ürünfiyatı.add(ürünfiyatı10);
        
        
        üyeler11.setVisible(true);
        üyeler11.setBounds(450,10,100,50);
        üyeler11.setFont(selam);
        
        ürünFiyati1.setVisible(true);
        ürünFiyati1.setBounds(265,10,100,50);
        ürünFiyati1.setFont(selam);
        
        ürünler.setVisible(true);
        ürünler.setBounds(125,10,100,50);
        ürünler.setFont(selam);
        
        anamenü.setVisible(true);
        anamenü.addActionListener(this);
        anamenü.setBounds(455,600,150,65);
        
        kaydet.setVisible(true);
        kaydet.addActionListener(this);
        kaydet.setBounds(95,600,150,65);
        
        for(int j = 0; j < ürünlerim.size(); j++){
            this.add((JCheckBox)ürünlerim.get(j));
            ((JCheckBox)ürünlerim.get(j)).setVisible(true);
            ((JCheckBox)ürünlerim.get(j)).setBounds(100,a,200,50);
            if(str[j].equals("t")){
                ((JCheckBox)ürünlerim.get(j)).setSelected(true);
            }
            else if(str[j].equals("f")){
                ((JCheckBox)ürünlerim.get(j)).setSelected(false);
            }
            if(((JCheckBox)ürünlerim.get(j)).isSelected()){
                ToplamFiyat = ToplamFiyat + parseInt(str2[j]);
            }
            a += 50;
        }
        for(int j=0; j<ürünfiyatı.size(); j++){
            this.add((JLabel)ürünfiyatı.get(j));
            ((JLabel)ürünfiyatı.get(j)).setVisible(true);
            ((JLabel)ürünfiyatı.get(j)).setBounds(300,b,100,50);
            ((JLabel)ürünfiyatı.get(j)).setText(str2[j]);
            this.add((JLabel)üyeler.get(j));
            ((JLabel)üyeler.get(j)).setVisible(true);
            ((JLabel)üyeler.get(j)).setBounds(450,b,100,50);
            ((JLabel)üyeler.get(j)).setText(ürünlerAdmin.arrstr2[j]);
            b += 50;
        }
        
        toplamFiyat.setVisible(true);
        toplamFiyat.setBounds(300,550,100,50);
        toplamFiyat.setText(String.valueOf(ToplamFiyat));
        toplamFiyat.setFont(selam);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == anamenü){
            this.dispose();
            new MainMenuüye();
        }
        
        if(e.getSource() == kaydet){
            ToplamFiyat=0;
            for(int j=0; j<ürünlerim.size();j++){
                if(((JCheckBox)ürünlerim.get(j)).isSelected()){
                ToplamFiyat = ToplamFiyat + parseInt(str2[j]);
            }
            }
            if(ToplamFiyat<200){
                JOptionPane.showMessageDialog(this, "En Az 200 liralık alışveriş yapabilirsiniz");
                this.dispose();
                new üyeÜrünler();
            }
        
            else{
                for(int j=0; j<ürünlerim.size(); j++){
                    if(j<ürünlerim.size()-1){
                        if(((JCheckBox)ürünlerim.get(j)).isSelected()){
                            esyalar.ürünler.add("t,");
                        }
                        else
                            esyalar.ürünler.add("f,");
                    }
                    else{
                        if(((JCheckBox)ürünlerim.get(j)).isSelected()){
                            esyalar.ürünler.add("t");
                        }
                        else
                            esyalar.ürünler.add("f");
                    }
                }
                try {
                    d.DersSec(esyalar.ürünler);
                    JOptionPane.showMessageDialog(this, "kıyafetleriniz sepetinize kaydedildi");
                    esyalar.ürünler.clear();
                    this.dispose();
                    new üyeÜrünler();

                } catch (IOException ex) {
                    Logger.getLogger(üyeÜrünler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }
}
}