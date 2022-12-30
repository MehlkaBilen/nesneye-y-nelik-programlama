
package ogrenciisleriotomasyonu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;





class üye extends kişi implements User{
    static int i = 0;
    static boolean kayıt = false;
    static ArrayList ID = new ArrayList<>();
    static ArrayList password = new ArrayList<>();
    static ArrayList isim= new ArrayList<>();
    static ArrayList surname= new ArrayList<>();
    static ArrayList dersler_ogrenci = new ArrayList<>();
    static ArrayList harfnotu_ogrenci = new ArrayList<>();
    static ArrayList arasinav_ogrenci = new ArrayList<>();
    static ArrayList final_ogrenci = new ArrayList<>();
    static File IDfile = new File("Öğrenci ID.txt");
    static File passwordFile = new File("Öğrenci Şifre.txt");
    static File nameFile = new File("Öğrenci İsim.txt");
    static File surnameFile = new File("Öğrenci Soyisim.txt");
    static File harfnotfile = new File("Öğrenci Harf Notları.txt");
    static File arasınavfile = new File("Öğrenci Ara Sınavlar.txt");
    static File finalfile = new File("Öğrenci Finaller.txt");
    static File dersfile = new File("Öğrenci Ders.txt");
    static String z = "\n";
    static String notlar = "-,-,-,-,-,-,-,-,-,-";
    static String aldıalmadı = "f,f,f,f,f,f,f,f,f,f";
    firsatlar d;
    
    @Override
    public boolean giriş(String a, String b) throws IOException{
        FileOutputStream out = new FileOutputStream(IDfile,true);
        FileOutputStream oat = new FileOutputStream(passwordFile,true);
        FileOutputStream oet = new FileOutputStream(nameFile,true);
        FileOutputStream oit = new FileOutputStream(surnameFile,true);
        FileOutputStream oot = new FileOutputStream(harfnotfile,true);
        FileOutputStream opt = new FileOutputStream(dersfile,true);
        FileOutputStream ost = new FileOutputStream(arasınavfile,true);
        FileOutputStream okt = new FileOutputStream(finalfile,true);
        BufferedReader br = new BufferedReader(new FileReader(IDfile));
        BufferedReader br1 = new BufferedReader(new FileReader(passwordFile));
        BufferedReader br2 = new BufferedReader(new FileReader(nameFile));
        BufferedReader br3 = new BufferedReader(new FileReader(surnameFile));
        BufferedReader br4 = new BufferedReader(new FileReader(dersfile));
        BufferedReader br5 = new BufferedReader(new FileReader(harfnotfile));
        BufferedReader br6 = new BufferedReader(new FileReader(arasınavfile));
        BufferedReader br7 = new BufferedReader(new FileReader(finalfile));
        
        ID.clear();
        while (true) {
	    String yazi = br.readLine();
	    if (yazi != null) {
		ID.add(yazi);
	    }
            else{
                break;
            }
	}
        password.clear();
        while (true) {
	    String yazi1 = br1.readLine();
	    if (yazi1 != null) {
		password.add(yazi1);
	    }
            else{
                break;
            }
            
	}
        isim.clear();
        while (true) {
	    String yazi1 = br2.readLine();
	    if (yazi1 != null) {
		isim.add(yazi1);
	    }
            else{
                break;
            }
            
	}
        surname.clear();
        while (true) {
	    String yazi1 = br3.readLine();
	    if (yazi1 != null)
		surname.add(yazi1);
            else
                break;           
	}
        dersler_ogrenci.clear();
        while(true){
            String yazi1 = br4.readLine();
            if (yazi1 != null)
                dersler_ogrenci.add(yazi1);
            else
                break;
        }
        harfnotu_ogrenci.clear();
        while(true){
            String yazi1 = br5.readLine();
            if (yazi1 != null)
                harfnotu_ogrenci.add(yazi1);
            else
                break;
        }
        arasinav_ogrenci.clear();
        while(true){
            String yazi1 = br6.readLine();
            if (yazi1 != null)
                arasinav_ogrenci.add(yazi1);
            else
                break;
        }
        final_ogrenci.clear();
        while(true){
            String yazi1 = br7.readLine();
            if (yazi1 != null)
                final_ogrenci.add(yazi1);
            else
                break;
        }
        
        for(i=0;i<ID.size();i++){
            if(ID.get(i).equals(a))
                if(password.get(i).equals(b))
                    return true;
        }
        return false;
    }
    
    public boolean şifreDeğiştir(String şifre, String şifrey) throws IOException{
        if (password.get(i).equals(şifre)) {
            password.set(i, şifrey);
            PrintWriter writer = new PrintWriter(passwordFile);
            writer.print("");
            writer.close();
            FileOutputStream oat = new FileOutputStream(passwordFile, true);
            for (int j = 0; j < password.size(); j++) {
                oat.write(password.get(j).toString().getBytes());
                oat.write(z.getBytes());
                }
            return true;
            }
        return false;
    }
    @Override
    public boolean kayıt(String a,String b, String c, String d) throws IOException{
        kayıt = true;
        ID.clear();
        FileOutputStream out = new FileOutputStream(IDfile,true);
        FileOutputStream oat = new FileOutputStream(passwordFile,true);
        FileOutputStream oet = new FileOutputStream(nameFile,true);
        FileOutputStream oit = new FileOutputStream(surnameFile,true);
        FileOutputStream oot = new FileOutputStream(harfnotfile,true);
        FileOutputStream opt = new FileOutputStream(dersfile,true);
        FileOutputStream ost = new FileOutputStream(arasınavfile,true);
        FileOutputStream okt = new FileOutputStream(finalfile,true);
        FileOutputStream oşt = new FileOutputStream("Tüm IDler.txt",true);
        FileOutputStream oqt = new FileOutputStream("fırsat üye.txt",true);
        BufferedReader br = new BufferedReader(new FileReader("Tüm IDler.txt"));
        ArrayList tümidler = new ArrayList<>();
        tümidler.clear();
        while(true)
        {
            String yazi1 = br.readLine();
	    if (yazi1 != null) {
		tümidler.add(yazi1);
	    }
            else{
                break;
            }
        }
        for(int j=0;j<tümidler.size();j++)
        {
            if(tümidler.get(j).toString().equals(a))
            {
                kayıt=false;
                break;
                
            }
        }
        
        new firsatlar();
        
            if(kayıt==true){
                oat.write(b.getBytes());
                oat.write(z.getBytes());
                out.write(a.getBytes());
                out.write(z.getBytes());
                oet.write(c.getBytes());
                oet.write(z.getBytes());
                oit.write(d.getBytes());
                oit.write(z.getBytes());
                oot.write(notlar.getBytes());
                oot.write(z.getBytes());
                opt.write(aldıalmadı.getBytes());
                opt.write(z.getBytes());
                ost.write(notlar.getBytes());
                ost.write(z.getBytes());
                okt.write(notlar.getBytes());
                okt.write(z.getBytes());
                oşt.write(a.getBytes());
                oşt.write(z.getBytes());
            }
        if(firsatlar.duyurular.isEmpty()){ 
            if(kayıt==true){
                oqt.write("f".getBytes());
                oqt.write(z.getBytes());
            }
        }
        else{
            if(kayıt==true){
                for(int j = 0; j<firsatlar.duyurular.size();j++){
                    if(j<firsatlar.duyurular.size()-1){
                        oqt.write("f".getBytes());
                        oqt.write(",".getBytes());
                    }
                    else{
                        oqt.write("f".getBytes());
                    }
                }
                oqt.write(z.getBytes());
            }
        }
            
            
        return kayıt;
    }
}
