
package ogrenciisleriotomasyonu;

import java.io.*;
import java.util.ArrayList;



public class firsatlar {
    static ArrayList duyurular = new ArrayList<>();
    static ArrayList gönderenler = new ArrayList<>();
    static ArrayList alanlar = new ArrayList<>();
    static ArrayList duyurubasliklar = new ArrayList<>();
    File duyurufile = new File("fırsatlar.txt");
    File gönderenfile = new File("fırsat Gönderen.txt");
    File alanfile = new File("fırsat üye.txt");
    File duyurubasligifile = new File("fırsat Başlıkları.txt");
    static String[] alanstr;
    firsatlar()throws IOException{
        FileOutputStream out = new FileOutputStream(duyurufile,true);
        FileOutputStream oat = new FileOutputStream(gönderenfile,true);
        FileOutputStream oet = new FileOutputStream(alanfile,true);
        FileOutputStream ost = new FileOutputStream(duyurubasligifile,true);
        BufferedReader br = new BufferedReader(new FileReader(duyurufile));
        BufferedReader br1 = new BufferedReader(new FileReader(gönderenfile));
        BufferedReader br2 = new BufferedReader(new FileReader(alanfile));
        BufferedReader br3 = new BufferedReader(new FileReader(duyurubasligifile));
        
        duyurular.clear();
        while(true){
            String yazi = br.readLine();
	    if (yazi != null) {
		duyurular.add(yazi);
	    }
            else{
                break;
            }
        }
        gönderenler.clear();
        while(true){
            String yazi = br1.readLine();
	    if (yazi != null) {
		gönderenler.add(yazi);
	    }
            else{
                break;
            }
        }
        alanlar.clear();
        while(true){
            String yazi = br2.readLine();
	    if (yazi != null) {
		alanlar.add(yazi);
	    }
            else{
                break;
            }
        }
        duyurubasliklar.clear();
        while(true){
            String yazi = br3.readLine();
            if(yazi != null){
                duyurubasliklar.add(yazi);
            }
            else{
                break;
            }
        }
        
        
    }
    static void AlanDuyuruDegistirGecici()throws IOException{
        FileOutputStream obt = new FileOutputStream("fırsatlar Geçiçi.txt", true);
        PrintWriter writer = new PrintWriter("fırsatlar Geçiçi.txt");
        writer.print("");
        writer.close();
        for(int j = 0; j < alanstr.length; j++){
            if(j == alanstr.length - 1){
                obt.write(alanstr[j].getBytes());
            }
            else {
                obt.write(alanstr[j].getBytes());
                obt.write(",".getBytes());
            }
        }
    }
    static void AlanDuyuruDegistir()throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("fırsatlar Geçiçi.txt"));
        String yazil = br.readLine();
        alanlar.set(üye.i,yazil);
        PrintWriter writer = new PrintWriter("fırsat üye.txt");
        writer.print("");
        writer.close();
        FileOutputStream out = new FileOutputStream("fırsat üye.txt", true);
        for(int j = 0; j < alanlar.size(); j++){
            out.write(((String)alanlar.get(j)).getBytes());
            out.write("\n".getBytes());
        }
    }
    void DuyuruAl(String duyuru, String gönderen, String konu)throws IOException{
        FileOutputStream out = new FileOutputStream(duyurufile,true);
        FileOutputStream oat = new FileOutputStream(gönderenfile,true);
        FileOutputStream oet = new FileOutputStream(alanfile,true);
        FileOutputStream ost = new FileOutputStream(duyurubasligifile,true);
        
        out.write(duyuru.getBytes());
        out.write("\n".getBytes());
        oat.write(gönderen.getBytes());
        oat.write("\n".getBytes());
        ost.write(konu.getBytes());
        ost.write("\n".getBytes());
 
        if(duyurular.isEmpty()==false){
            PrintWriter writer = new PrintWriter(alanfile);
            writer.print("");
            writer.close();
            
            for(int j = 0; j < alanlar.size();j++){
                alanstr = ((String)alanlar.get(j)).split(",");
                for(int u = 0; u<alanstr.length+1;u++){
                    if(u != alanstr.length){
                        oet.write(alanstr[u].getBytes());
                        oet.write(",".getBytes());
                    }
                    else{
                        oet.write("f".getBytes());
                    }
                }
                oet.write("\n".getBytes());
            }
        }
    }
    static String[] alanstrdoldur(){
        alanstr = ((String)alanlar.get(üye.i)).split(",");
        return alanstr;
    }
}
