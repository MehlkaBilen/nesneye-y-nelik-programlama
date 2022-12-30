
package ogrenciisleriotomasyonu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.*;
import static ogrenciisleriotomasyonu.esyalar.*;


public class üyeÜrünListesi extends JFrame implements ActionListener{
    ArrayList ürünler = new ArrayList<>();
    ArrayList fiyat = new ArrayList<>();
    ArrayList indirimliFiyat = new ArrayList<>();
    ArrayList AlısverisÜyesi = new ArrayList<>();
    JLabel konu = new JLabel("Ürünler");
    JLabel ürün1 = new JLabel("kazak");
    JLabel ürün2 = new JLabel("etek");
    JLabel ürün3 = new JLabel("elbise");
    JLabel ürün4 = new JLabel("ceket");
    JLabel ürün5 = new JLabel("ayakkabı");
    JLabel ürün6 = new JLabel("canta");
    JLabel ürün7 = new JLabel("yüzük");
    JLabel ürün8 = new JLabel("pantolon");
    JLabel ürün9 = new JLabel("teknolojik aletler");
    JLabel ürün10 = new JLabel("ev eşyaları");
    JLabel fiyat1= new JLabel("eski fiyat");
    JLabel fiyat2 = new JLabel();
    JLabel fiyat3 = new JLabel();
    JLabel fiyat4 = new JLabel();
    JLabel fiyat5 = new JLabel();
    JLabel fiyat6 = new JLabel();
    JLabel fiyat7 = new JLabel();
    JLabel fiyat8 = new JLabel();
    JLabel fiyat9 = new JLabel();
    JLabel fiyat10 = new JLabel();
    JLabel fiyat11 = new JLabel();
    JLabel İndirimliFiyat = new JLabel("indirimli fiyat");
    JLabel İndirimliFiyat1 = new JLabel();
    JLabel İndirimliFiyat2 = new JLabel();
    JLabel İndirimliFiyat3 = new JLabel();
    JLabel İndirimliFiyat4 = new JLabel();
    JLabel İndirimliFiyat5 = new JLabel();
    JLabel İndirimliFiyat6 = new JLabel();
    JLabel İndirimliFiyat7 = new JLabel();
    JLabel İndirimliFiyat8 = new JLabel();
    JLabel İndirimliFiyat9 = new JLabel();
    JLabel İndirimliFiyat10 = new JLabel();
    JLabel AlısverisUyesi = new JLabel("indirim tarihi");
    JLabel AlısverisUyesi1 = new JLabel();
    JLabel AlısverisUyesi2 = new JLabel();
    JLabel AlısverisUyesi3 = new JLabel();
    JLabel AlısverisUyesi4 = new JLabel();
    JLabel AlısverisUyesi5 = new JLabel();
    JLabel AlısverisUyesi6 = new JLabel();
    JLabel AlısverisUyesi7 = new JLabel();
    JLabel AlısverisUyesi8 = new JLabel();
    JLabel AlısverisUyesi9 = new JLabel();
    JLabel AlısverisUyesi10 = new JLabel();
    JButton anamenu = new JButton("Ana Menü");
    Font selam = new Font("selam", Font.BOLD, 15);
    esyalar d = new esyalar();
    int a = 50;
    üyeÜrünListesi(){
        esyalar.ArraylereAt();
        this.setVisible(true);
        this.setSize(700,725);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("indirimli ürünler");
        this.add(konu);
        this.add(fiyat1);
        this.add(İndirimliFiyat);
        this.add(AlısverisUyesi);
        this.add(anamenu);
        
        ürünler.clear();
        ürünler.add(ürün1);
        ürünler.add(ürün2);
        ürünler.add(ürün3);
        ürünler.add(ürün4);
        ürünler.add(ürün5);
        ürünler.add(ürün6);
        ürünler.add(ürün7);
        ürünler.add(ürün8);
        ürünler.add(ürün9);
        ürünler.add(ürün10);
        
        fiyat.clear();
        fiyat.add(fiyat1);
        fiyat.add(fiyat2);
        fiyat.add(fiyat3);
        fiyat.add(fiyat4);
        fiyat.add(fiyat5);
        fiyat.add(fiyat6);
        fiyat.add(fiyat7);
        fiyat.add(fiyat8);
        fiyat.add(fiyat9);
        fiyat.add(fiyat10);
        
        indirimliFiyat.clear();
        indirimliFiyat.add(İndirimliFiyat1);
        indirimliFiyat.add(İndirimliFiyat2);
        indirimliFiyat.add(İndirimliFiyat3);
        indirimliFiyat.add(İndirimliFiyat4);
        indirimliFiyat.add(İndirimliFiyat5);
        indirimliFiyat.add(İndirimliFiyat6);
        indirimliFiyat.add(İndirimliFiyat7);
        indirimliFiyat.add(İndirimliFiyat8);
        indirimliFiyat.add(İndirimliFiyat9);
        indirimliFiyat.add(İndirimliFiyat10);
        
        AlısverisÜyesi.clear();
        AlısverisÜyesi.add(AlısverisUyesi1);
        AlısverisÜyesi.add(AlısverisUyesi2);
        AlısverisÜyesi.add(AlısverisUyesi3);
        AlısverisÜyesi.add(AlısverisUyesi4);
        AlısverisÜyesi.add(AlısverisUyesi5);
        AlısverisÜyesi.add(AlısverisUyesi6);
        AlısverisÜyesi.add(AlısverisUyesi7);
        AlısverisÜyesi.add(AlısverisUyesi8);
        AlısverisÜyesi.add(AlısverisUyesi9);
        AlısverisÜyesi.add(AlısverisUyesi10);
        
        konu.setVisible(true);
        konu.setBounds(50,10,100,50);
        konu.setFont(selam);
        
        fiyat1.setVisible(true);
        fiyat1.setBounds(200,10,100,50);
        fiyat1.setFont(selam);
        
        İndirimliFiyat.setVisible(true);
        İndirimliFiyat.setBounds(350,10,100,50);
        İndirimliFiyat.setFont(selam);
        
        AlısverisUyesi.setVisible(true);
        AlısverisUyesi.setBounds(550,10,100,50);
        AlısverisUyesi.setFont(selam);
        
        anamenu.setVisible(true);
        anamenu.addActionListener(this);
        anamenu.setBounds(275,600,150,65);
        
        for(int j=0; j<ürünler.size();j++){
            if(str[j].equals("t")){
                this.add((JLabel)ürünler.get(j));
                this.add((JLabel)fiyat.get(j));
                this.add((JLabel)indirimliFiyat.get(j));
                this.add((JLabel)AlısverisÜyesi.get(j));
                
                
                ((JLabel)ürünler.get(j)).setVisible(true);
                ((JLabel)fiyat.get(j)).setVisible(true);
                ((JLabel)indirimliFiyat.get(j)).setVisible(true);
                ((JLabel)AlısverisÜyesi.get(j)).setVisible(true);
                ((JLabel)ürünler.get(j)).setBounds(50,a,100,50);
                ((JLabel)fiyat.get(j)).setBounds(230,a,100,50);
                ((JLabel)indirimliFiyat.get(j)).setBounds(365,a,100,50);
                ((JLabel)AlısverisÜyesi.get(j)).setBounds(580,a,100,50);
                ((JLabel)fiyat.get(j)).setText(str3[j]);
                ((JLabel)indirimliFiyat.get(j)).setText(str4[j]);
                ((JLabel)AlısverisÜyesi.get(j)).setText(str5[j]);
                
                if(((JLabel)fiyat.get(j)).getText().equals("-")||((JLabel)indirimliFiyat.get(j)).getText().equals("-")){
                    
                }else{
                    System.out.println("Yaren İBİŞ");
                }
          
                a+=50;  
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == anamenu){
            this.dispose();
            new MainMenuüye();
        }
    }
}
