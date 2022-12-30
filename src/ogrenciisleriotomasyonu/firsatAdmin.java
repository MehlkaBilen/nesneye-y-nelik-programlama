
package ogrenciisleriotomasyonu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



class firsatAdmin extends JFrame implements ActionListener {
    JLabel konu = new JLabel("Konu:");
    JTextField konutxt = new JTextField(20);
    JButton gönder = new JButton("Gönder");
    JButton anamenu = new JButton("Anamenü");
    JTextArea yazilar = new JTextArea(15,56);
    JScrollPane scroll = new JScrollPane(yazilar,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    Font selam = new Font("selam",Font.BOLD,15);
    JPanel panel = new JPanel();
    firsatlar d;
    firsatAdmin() throws IOException{
        d = new firsatlar();
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("fırsatlar");
        
        this.add(scroll);
        this.add(panel);
        this.add(gönder);
        this.add(konu);
        this.add(konutxt);
        this.add(anamenu);
        
        yazilar.setLineWrap(true);
        yazilar.setFont(selam);

        scroll.setWheelScrollingEnabled(true);
        
        panel.add(scroll);
        panel.setBounds(0,0,700,310);
        
        anamenu.setVisible(true);
        anamenu.setBounds(500,500,125,75);
        anamenu.addActionListener(this);
        
        gönder.setVisible(true);
        gönder.setBounds(75,500,125,75);
        gönder.addActionListener(this);
        
        konu.setVisible(true);
        konu.setBounds(75,325,100,25);
        
        konutxt.setVisible(true);
        konutxt.setBounds(75,350,150,25);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==anamenu){
            this.dispose();
            new menuAdmin();
        }
        if(e.getSource()==gönder){
            String isimSoyisim = ((String)admin.isim.get(admin.i)) + " " + ((String)admin.surname.get(admin.i));
            try {
                JOptionPane.showMessageDialog(this,"fırsatlarınız üyelere sunulmuştur");
                d.DuyuruAl(yazilar.getText(),isimSoyisim , konutxt.getText());
                this.dispose();
                new firsatAdmin();
            } catch (IOException ex) {
                Logger.getLogger(firsatAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
