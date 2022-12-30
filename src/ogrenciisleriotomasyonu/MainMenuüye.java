
package ogrenciisleriotomasyonu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class MainMenuüye extends JFrame implements ActionListener{
    JButton kisisel = new JButton("Profil");
    JButton AlısverisYapma = new JButton("Alışveris Yapma");
    JButton Fırsatlar = new JButton("Fırsatlar");
    JButton ürünFiyatları = new JButton("Ürün Fİyatları");
    JButton anamenü = new JButton("Ana Menüye Dön");
    JButton çıkış = new JButton("Çıkış Yap");
    public MainMenuüye(){
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("üye Ana Menü");
        this.add(kisisel);
        this.add(AlısverisYapma);
        this.add(ürünFiyatları);
        this.add(Fırsatlar);
        this.add(anamenü);
        this.add(çıkış);
        
        çıkış.setVisible(true);
        çıkış.addActionListener(this);
        çıkış.setBounds(255,550,175,100);
        
        kisisel.setVisible(true);
        kisisel.addActionListener(this);
        kisisel.setBounds(55,25,175,100);
        
        AlısverisYapma.setVisible(true);
        AlısverisYapma.addActionListener(this);
        AlısverisYapma.setBounds(55,200,175,100);
        
        ürünFiyatları.setVisible(true);
        ürünFiyatları.addActionListener(this);
        ürünFiyatları.setBounds(55,375,175,100);
        
        Fırsatlar.setVisible(true);
        Fırsatlar.addActionListener(this);
        Fırsatlar.setBounds(455,25,175,100);
   
        anamenü.setVisible(false);
        anamenü.addActionListener(this);
        anamenü.setBounds(330,510,135,75);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kisisel){
            this.dispose();
            new Profilüye();
        }
        if(e.getSource()==AlısverisYapma){
            this.dispose();
            new üyeÜrünler();
        }
        if(e.getSource()==ürünFiyatları){
            this.dispose();
            new üyeÜrünListesi();
        }
        if(e.getSource()==anamenü){
                this.dispose();
                new MainMenuüye();
        }
        if(e.getSource()==çıkış){
            this.dispose();
            üye.i=0;
            üye.ID.clear();
            new MyFramee();
        }
        if(e.getSource()==Fırsatlar){
            this.dispose();
            try {
                new firsatÜye();
            } catch (IOException ex) {
                Logger.getLogger(MainMenuüye.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}