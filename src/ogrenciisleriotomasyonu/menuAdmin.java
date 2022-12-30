
package ogrenciisleriotomasyonu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;


class menuAdmin extends JFrame implements ActionListener{
 
    JButton fırsat = new JButton("fıratlar");
    
    JButton anamenü = new JButton("Ana Menüye Dön");
    JButton çıkış = new JButton("Çıkış Yap");
    public menuAdmin(){
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Admin Ana Menü");
       
       
        this.add(fırsat);
        this.add(anamenü);
        this.add(çıkış);
        
        çıkış.setVisible(true);
        çıkış.addActionListener(this);
        çıkış.setBounds(255,550,175,100);
        
      
        
        fırsat.setVisible(true);
        fırsat.addActionListener(this);
        fırsat.setBounds(455,25,175,100);
        
        anamenü.setVisible(false);
        anamenü.addActionListener(this);
        anamenü.setBounds(330,510,135,75);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==anamenü){
                this.dispose();
                new menuAdmin();
        }
        if(e.getSource()==çıkış){
            this.dispose();
            üye.i=0;
            üye.ID.clear();
            new MyFramee();
        }
      
        
        if(e.getSource()==fırsat){
            this.dispose();
            try {
                new firsatAdmin();
            } catch (IOException ex) {
                Logger.getLogger(menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}