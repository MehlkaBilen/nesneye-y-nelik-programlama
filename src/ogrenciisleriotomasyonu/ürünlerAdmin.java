
package ogrenciisleriotomasyonu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static ogrenciisleriotomasyonu.admin.i;
import static ogrenciisleriotomasyonu.admin.ürünler;


public class ürünlerAdmin {
    static ArrayList ürünler = new ArrayList<>();
    static File ürünFile = new File("ürünler.txt");
    static String[] arrstr = new String[10];
    static String[] arrstr2 = new String[10];
    int k=0;
    ürünlerAdmin()throws IOException{
        for(int j=0; j<arrstr.length;j++){
            arrstr2[j] = "-";
        }
        admin hoca = new admin();
        for(k=0;k<admin.ürünler.size();k++){
            arrstr = ((String)ürünler.get(k)).split(",");
            for(int l=0; l<arrstr.length;l++){
                if(arrstr[l].equals("t")){
                    arrstr2[l] = (((String)admin.isim.get(k))+" "+((String)admin.surname.get(k)));
                }
            }
        }
//        arrstr = ((String)dersler_ogretim.get(i)).split(",");
    }
    public void DersSecGecici()throws IOException{
        PrintWriter writer = new PrintWriter(ürünFile);
        writer.print("");
        writer.close();
        FileOutputStream out = new FileOutputStream(ürünFile, true);
        for (int j = 0; j < ürünler.size(); j++) {
            out.write(ürünler.get(j).toString().getBytes());
        }
        ürünler.clear();
        BufferedReader br1 = new BufferedReader(new FileReader(ürünFile));
        while(true){
            String yazi1 = br1.readLine();
            if (yazi1 != null){
                ürünler.add(yazi1);
            }
            else
                break;
        }
    }
    public boolean DersSecOgretim(ArrayList a)throws IOException{
        ürünler.set(admin.i, ürünler.get(0));
        PrintWriter writer = new PrintWriter(admin.ürünFile);
        writer.print("");
        writer.close();
        FileOutputStream out = new FileOutputStream(admin.ürünFile, true);
        for (int j = 0; j < ürünler.size(); j++) {
            out.write(ürünler.get(j).toString().getBytes());
            out.write(admin.z.getBytes());
        }
        return true;
    }
    public static String[] arrstrdoldur(){
        arrstr = ((String)ürünler.get(i)).split(",");
        return arrstr;
    }
}
