
package ogrenciisleriotomasyonu;

import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


class admin extends kişi implements User{
    static int i = 0;
    static boolean kayıt = true;
    static ArrayList ID = new ArrayList<>();
    static ArrayList password = new ArrayList<>();
    static ArrayList isim= new ArrayList<>();
    static ArrayList surname = new ArrayList<>();
    static ArrayList ürünler = new ArrayList<>();
    static File IDfile = new File("Admin ID.txt");
    static File passwordFile = new File(" Admin Şifre.txt");
    static File nameFile = new File("Admin İsim.txt");
    static File surNameFile = new File("Admin Soyisim.txt");
    static File ürünFile = new File("Admin ürün.txt");
    static String z = "\n";
    static String aldıalmadı = "f,f,f,f,f,f,f,f,f,f";
    admin()throws IOException{
        FileOutputStream out = new FileOutputStream(IDfile,true);
        FileOutputStream oat = new FileOutputStream(passwordFile,true);
        FileOutputStream oet = new FileOutputStream(nameFile,true);
        FileOutputStream oit = new FileOutputStream(surNameFile,true);
        FileOutputStream opt = new FileOutputStream(ürünFile,true);
        BufferedReader br4 = new BufferedReader(new FileReader(ürünFile));
        BufferedReader br2 = new BufferedReader(new FileReader("Admin İsim.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("Admin Soyisim.txt"));
        ürünler.clear();
        while (true) {
            String yazil = br4.readLine();
            if (yazil != null) {
                ürünler.add(yazil);
            } else {
                break;
            }
        }
        isim.clear();
        while (true) {
            String yazi1 = br2.readLine();
            if (yazi1 != null) {
                isim.add(yazi1);
            } else {
                break;
            }
        }
        surname.clear();
        while (true) {
            String yazi1 = br3.readLine();
            if (yazi1 != null) {
                surname.add(yazi1);
            } else {
                break;
            }

        }
    }
    @Override
    public boolean giriş(String a, String b) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Admin ID.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("Admin Şifre.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Admin İsim.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("Admin Soyisim.txt"));
        BufferedReader br4 = new BufferedReader(new FileReader(ürünFile));
        
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
        password.clear();
        while (true) {
	    String yazi1 = br3.readLine();
	    if (yazi1 != null) {
		password.add(yazi1);
	    }
            else{
                break;
            }
            
	}
        ürünler.clear();
        while(true){
            String yazil = br4.readLine();
            if (yazil != null){
                ürünler.add(yazil);
            }
            else
                break;
        }
        for(i=0;i<ID.size();i++){
            if(ID.get(i).equals(a)){
                if(password.get(i).equals(b)){
                    return true;
                }
            }
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
        FileOutputStream oit = new FileOutputStream(surNameFile,true);
        FileOutputStream opt = new FileOutputStream(ürünFile,true);
        FileOutputStream oşt = new FileOutputStream("Tüm IDler.txt",true);
        BufferedReader br = new BufferedReader(new FileReader("Tüm IDler.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader(ürünFile));
        BufferedReader br2 = new BufferedReader(new FileReader(IDfile));
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
        for(i=0;i<tümidler.size();i++)
        {
            if(tümidler.get(i).toString().equals(a))
            {       
                kayıt=false;
                break;
            }
        }
        if(kayıt==true){
            oat.write(b.getBytes());
            oat.write(z.getBytes());
            out.write(a.getBytes());
            out.write(z.getBytes());
            oet.write(c.getBytes());
            oet.write(z.getBytes());
            oit.write(d.getBytes());
            oit.write(z.getBytes());
            opt.write(aldıalmadı.getBytes());
            opt.write(z.getBytes());
            oşt.write(a.getBytes());
            oşt.write(z.getBytes());
        }
        ürünler.clear();
        while(true){
            String yazil = br1.readLine();
            if (yazil != null){
                ürünler.add(yazil);
            }
            else
                break;
        }
        while(true)
        {
            String yazi1 = br2.readLine();
	    if (yazi1 != null) {
		ID.add(yazi1);
	    }
            else{
                break;
            }
        }
        i = ID.size()-1;
        
        return kayıt;
    }
}