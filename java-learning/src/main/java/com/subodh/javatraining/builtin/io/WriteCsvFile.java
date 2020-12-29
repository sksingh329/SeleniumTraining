package com.subodh.javatraining.builtin.io;

import java.io.*;

public class WriteCsvFile {
    public static void main(String[] args) throws IOException {
        String directoryPath = System.getProperty("user.dir");
        String fileName = directoryPath+"/java-learning/src/main/resources/files/readText.csv";
        File f = new File(fileName);
        /*
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter writer =  new BufferedWriter(fw);
        for(int i=0;i<4;i++){
            for(int j =0; j<3;j++){
                int num = (int) (Math.random()*100);
                writer.write(num+",");
            }
            writer.newLine();
        }
        writer.close(); */

        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);
        for(int i=0;i<4;i++){
            System.out.println(reader.readLine());
            reader.readLine();
        }
        //System.out.println(reader.readLine());
        //System.out.println(reader.read());
        //System.out.println(reader.readLine());
        reader.close();
}
}
