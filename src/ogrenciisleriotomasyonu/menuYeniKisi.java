
package ogrenciisleriotomasyonu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class menuYeniKisi extends JFrame implements ActionListener{
    JButton ogretim_kayit = new JButton("Yeni Kişi Kayıt");
   
    JButton anamenü = new JButton("Ana Menüye Dön");
    JButton çıkış = new JButton("Çıkış Yap");
    public menuYeniKisi(){
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Personel Ana Menü");
        this.add(ogretim_kayit);
     
        this.add(anamenü);
        this.add(çıkış);
        
        çıkış.setVisible(true);
        çıkış.addActionListener(this);
        çıkış.setBounds(255,550,175,100);
        
        ogretim_kayit.setVisible(true);
        ogretim_kayit.addActionListener(this);
        ogretim_kayit.setBounds(255,200,175,100);
        
     
        anamenü.setVisible(false);
        anamenü.addActionListener(this);
        anamenü.setBounds(330,510,135,75);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource()==ogretim_kayit){
            this.dispose();
            new KayitAdmin();
        }
       
        if(e.getSource()==anamenü){
            this.dispose();
            new menuYeniKisi();
        }
        if(e.getSource()==çıkış){
            this.dispose();
            üye.i=0;
            üye.ID.clear();
            new MyFramee();
        }
    }
}