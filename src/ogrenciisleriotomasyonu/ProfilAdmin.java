
package ogrenciisleriotomasyonu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static ogrenciisleriotomasyonu.üye.ID;
import static ogrenciisleriotomasyonu.üye.surname;
import static ogrenciisleriotomasyonu.admin.i;




class ProfilAdmin extends JFrame implements ActionListener{
    JLabel id = new JLabel("ID:");
    JLabel isim = new JLabel("İsim:");
    JLabel soyisim = new JLabel("Soyisim:");
    JLabel idtxt =  new JLabel((String) ID.get(i));
    JLabel isimtxt =  new JLabel((String) isim.getText());
    JLabel soyisimtxt =  new JLabel((String) surname.get(i));
    Font selam = new Font("selam", Font.ITALIC, 15);
    JButton anamenü = new JButton("Ana Menüye Dön");
    
    ProfilAdmin(){
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("admin Profil Penceresi");
        this.add(id);
        this.add(isim);
        this.add(soyisim);
        this.add(idtxt);
        this.add(isimtxt);
        this.add(soyisimtxt);
        this.add(anamenü);
        
        id.setVisible(true);
        id.setBounds(210,170,100,25);
        
        idtxt.setVisible(true);
        idtxt.setBounds(270,170,165,25);
        idtxt.setFont(selam);
        
        isim.setVisible(true);
        isim.setBounds(210,210,100,25);
        
        isimtxt.setVisible(true);
        isimtxt.setBounds(270,210,165,25);
        isimtxt.setFont(selam);
        
        soyisim.setVisible(true);
        soyisim.setBounds(210,250,100,25);
        
        soyisimtxt.setVisible(true);
        soyisimtxt.setBounds(270,250,165,25);
        soyisimtxt.setFont(selam);
        
        anamenü.setVisible(true);
        anamenü.addActionListener(this);
        anamenü.setBounds(455,550,150,65);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==anamenü){
            this.dispose();
            new menuAdmin();
        }
    }
}