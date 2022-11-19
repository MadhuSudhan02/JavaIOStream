package com.bridgelabz;
import java.io.* ;
public class CopyToFile {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\madhu sudhan\\Desktop\\Text\\output-copy.txt"));
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\madhu sudhan\\Desktop\\Text\\output.txt"));
            String s ;
            while ((s= br.readLine()) != null){
                bw.write(s +"\n");
            }
            bw.close();
            br.close();
        }
        catch(IOException e){
        e.printStackTrace();
        }
    }
}

