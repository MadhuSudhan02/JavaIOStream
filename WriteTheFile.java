package com.bridgelabz;
import java.io.* ;

public class WriteTheFile {
    public static void main(String[] args) {
        //using object bufferwriter ,we need to pass a file writer to buffer object
        String[] names = { "madhu" , "ullas" , "syed" , "nitesh"} ;
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\madhu sudhan\\Desktop\\Text\\output.txt"));
            bw.write("Welcome to file io \n");
            bw.write("I am madhu sudhan S") ;
            for (String name : names){
                bw.write(name+"\n") ;
            }
            bw.close();
        }
        catch(Exception e){
            return ;
        }

        //reading a file
//        try {
//            BufferedReader br = new BufferedReader(
//                    new FileReader("C:\\Users\\madhu sudhan\\Desktop\\Text\\output.txt"));
//            String s;
//            while((s=br.readLine()) != null){
//                System.out.println(s);
//            }
//            br.close();
//        }
//        catch(Exception e) {
//            return;
//        }
    }
}
