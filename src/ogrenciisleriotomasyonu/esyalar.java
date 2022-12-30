
package ogrenciisleriotomasyonu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ogrenciisleriotomasyonu.üye.*;

class esyalar {
    static ArrayList ürünler = new ArrayList<>();
    static ArrayList ürünfiyati = new ArrayList<>();
    static ArrayList güncelFiyat = new ArrayList<>();
    static ArrayList indirimliFiyat = new ArrayList<>();
    static File ürünfiyatıFile = new File("ürün fiyatları.txt");
    static File ürünFile = new File("ürünler.txt");
    static String[] str = new String[10];
    static String[] str2 = new String[10];
    static String[] str3 = new String[10];
    static String[] str4 = new String[10];
    static String[] str5 = new String[10];
    private static int j;
            
    esyalar(){
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(ürünfiyatıFile));
            String yazil = br1.readLine();
            str2 = yazil.split(",");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(esyalar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(esyalar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean DersSec(ArrayList a)throws IOException{
        
        dersler_ogrenci.set(üye.i, a.get(0));
        PrintWriter writer = new PrintWriter(üye.dersfile);
        writer.print("");
        writer.close();
        FileOutputStream out = new FileOutputStream(üye.dersfile, true);
        for (int j = 0; j < dersler_ogrenci.size(); j++) {
            out.write(dersler_ogrenci.get(j).toString().getBytes());
            out.write(üye.z.getBytes());
        }
        String[] str = ((String)dersler_ogrenci.get(üye.i)).split(",");
        return true;
    }
    public void DersSecGecici()throws IOException{
        FileOutputStream out = new FileOutputStream(dersfile, true);
        PrintWriter writer = new PrintWriter(dersfile);
        writer.print("");
        writer.close();
        for (int j = 0; j < ürünler.size(); j++) {
            out.write(ürünler.get(j).toString().getBytes());
        }
        ürünler.clear();
        BufferedReader br1 = new BufferedReader(new FileReader("Dersler.txt"));
        while(true){
            String yazi1 = br1.readLine();
            if (yazi1 != null){
                ürünler.add(yazi1);
            }
            else
                break;
        }   
    }
    static public void NotlarGirildi(int k)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("güncel fiyatlar.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("indirimli fiyatlar.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("ürünler.txt"));
        PrintWriter writer = new PrintWriter(dersfile);
        writer.print("");
        writer.close();
        FileOutputStream out = new FileOutputStream(dersfile, true);
        for(int j=0; j<str3.length;j++){
            if(j<str3.length-1){
                out.write(str3[j].getBytes());
                out.write(",".getBytes());
            }
            else
                out.write(str3[j].getBytes());
        }
        urunlerim.class.toString();
        PrintWriter writer2 = new PrintWriter("güncel fiyatlar.txt");
        writer2.print("");
        writer2.close();
        FileOutputStream oat = new FileOutputStream("indirimli fiyatlar.txt", true);
       // for(int j=0; j=<urunlerim.class.toString();j++){
         //   oat.write(urunlerim.class.toString().getBytes());
           // oat.write("\n".getBytes());
       // }
        writer.print("");
        writer.close();
        for(int j=0; j<str4.length;j++){
            if(j<str4.length - 1){
                out.write(str4[j].getBytes());
                out.write(",".getBytes());
            }
            else
                out.write(str4[j].getBytes());
        }
        urunlerim.class.toString();
        PrintWriter writer3 = new PrintWriter("indirimli fiyatlar.txt");
        writer3.print("");
        writer3.close();
        FileOutputStream oet = new FileOutputStream("indirimli fiyatlar.txt", true);
       // for(int j=0;j<urunlerim.class.toString();j++){
         //   oet.write(urunlerim.class.toString().getBytes());
          // /7 oet.write("\n".getBytes());
        //}
    }
    static public void ArraylereAt(){
        str = ((String)dersler_ogrenci.get(üye.i)).split(",");
        str3 = ((String)arasinav_ogrenci.get(üye.i)).split(",");
        str4 = ((String)indirimliFiyat.get(üye.i)).split(",");
        str5 = ((String)harfnotu_ogrenci.get(üye.i)).split(",");
    }

}
