
package ioo;

import java.io.*;


public class Ioo {

    
    public static void main(String[] args) {
        File ahmed = new File ("C:/Documents and Settings/ahmed samir/Desktop/amed/ahmed/");
        ahmed.mkdirs();
        File mp3 = new File (ahmed,"mp3.mp3");
        try {
            mp3.createNewFile();
        File amrsong = new File ("C:/Documents and Settings/ahmed samir/Desktop/Amr.Diab.Ahla.W.Ahla.2016.ArabSeed.CoM/02 - Waadtak.mp3");
        System.out.println(amrsong.toURI());
         FileInputStream stream1 = new FileInputStream (amrsong); 
            FileOutputStream outstream = new FileOutputStream (mp3);
            int read;
            byte []buff = new byte[1024*1024];
            while((read=stream1.read(buff) )>0)
            outstream.write(buff, 0, read);
            outstream.flush();
            outstream.close();
            stream1.close();
            File txt = new File ("C:/Documents and Settings/ahmed samir/Desktop/java1.txt");
            File txt2 =new File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (7).txt");
            FileInputStream txtins= new FileInputStream (txt);
            DataInputStream txtd = new DataInputStream (txtins);
            String ss;
            FileOutputStream txtos= new FileOutputStream (txt2);
            DataOutputStream dataout = new DataOutputStream (txtos);
            
                    while ((ss=txtd.readLine())!=null)
                    {System.out.println(ss);
            dataout.writeUTF(ss);}
           dataout.flush();
            dataout.close();
            txtos.flush();
            txtos.close();
            txtd.close();
            txtins.close();
            FileReader read1= new FileReader (txt);
            BufferedReader read2 = new BufferedReader (read1); 
            FileWriter write = new FileWriter (txt2);
            PrintWriter Write2 = new PrintWriter (write,true);
            
                  while(read2.ready()) 
                  {
                      System.out.println(read2.readLine());
                      Write2.println(read2.readLine());
                  }
            
                
                    
            
            
            
            
            
        }catch (IOException ex) {
            ex.printStackTrace();
        }
     
        
      
        
        
    }
    
}
