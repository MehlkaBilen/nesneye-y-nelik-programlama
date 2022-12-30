
package ogrenciisleriotomasyonu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


class firsatÜye extends JFrame implements ActionListener{
    ArrayList buttons = new ArrayList<>();
    ArrayList isims = new ArrayList<>();
    ArrayList konus = new ArrayList<>();
    JButton anamenu = new JButton("Anamenü");
    int a = 50;
    firsatlar firsat;
    int m = 0;
    Font selam = new Font("selam",Font.BOLD,18);
    Font selam2 = new Font("selam",Font.BOLD,15);
    firsatÜye() throws IOException{
        firsat = new firsatlar();
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Fırsatlar");
        this.add(anamenu);
        
        anamenu.setVisible(true);
        anamenu.setBounds(500,600,125,75);
        anamenu.addActionListener(this);
        
        if(firsatlar.duyurular.isEmpty()==false){
            for(int j = 0;j<firsatlar.alanstrdoldur().length;j++){
                if(firsatlar.alanstrdoldur()[j].equals("f")){

                    JButton button = new JButton("BAS");
                    JLabel isim = new JLabel("hi");
                    JLabel konu = new JLabel("indirim günü");
                    button.setBounds(500,a,100,50);
                    konu.setBounds(300,a,100,50);
                    isim.setBounds(100,a,200,50);
                    konu.setVisible(true);
                    isim.setVisible(true);
                    button.setVisible(true);
                    konu.setText((String)firsatlar.duyurubasliklar.get(j));
                    isim.setText((String)firsatlar.gönderenler.get(j));
                    this.add(konu);
                    this.add(isim);
                    buttons.add(button);
                    this.add((JButton)buttons.get(m));
                    ((JButton)buttons.get(m)).addActionListener(this);
                    a+=100;
                    m++;
                    if(m>4){
                        break;
                    }
                }
            }
        }    
            
        if(m==0){
            JLabel yok = new JLabel("Herhangi Bir Fırsat Bulunmamaktadır");
            this.add(yok);
            yok.setVisible(true);
            yok.setFont(selam);
            yok.setBounds(200,300,300,50);
        }
        m=0;
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == anamenu){
            this.dispose();
            new MainMenuüye();
        }
        if(firsatlar.duyurular.isEmpty()==false){
            for(int j=0;j<firsatlar.alanstrdoldur().length;j++){
                if(firsatlar.alanstrdoldur()[j].equals("f")){
                    if(e.getSource() == (JButton)buttons.get(m)){       
                        firsatlar.alanstrdoldur()[j] = "t";
                        this.dispose();
                        try {
                            firsatlar.AlanDuyuruDegistirGecici();
                            firsatlar.AlanDuyuruDegistir();
                            new firsatÜye();
                        } catch (IOException ex) {
                            Logger.getLogger(firsatÜye.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JFrame duyurupenceresi = new JFrame((String)firsatlar.duyurubasliklar.get(j));
                        final JTextArea duyuruyazi = new JTextArea(1,2);
                        JScrollPane scroll = new JScrollPane(duyuruyazi,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                        duyuruyazi.setLineWrap(true);
                        duyuruyazi.setText((String)firsatlar.duyurular.get(j));
                        duyuruyazi.setFont(selam2);
                        duyuruyazi.setEditable(false);
                        duyurupenceresi.setVisible(true);
                        duyurupenceresi.setSize(400,400);
                        duyurupenceresi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        duyurupenceresi.setLocationRelativeTo(null);
                        duyurupenceresi.setResizable(false);
                        duyurupenceresi.add(scroll);
                        scroll.setVisible(true);
                    }
                    m++;
                    if (m > 4) {
                        break;
                    }
                }    
            }
        }
    }
}
