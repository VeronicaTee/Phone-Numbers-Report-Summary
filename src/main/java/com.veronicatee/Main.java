package com.veronicatee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        final long startTime = System.currentTimeMillis();

        ArrayList<String> str = new ArrayList<>();

        int mtnNos = 0;
        int airtelNos = 0;
        int gloNos = 0;
        int nineMobileNos = 0;
        int mtelNos = 0;


        FileReader fr = new FileReader("./src/phoneNumbers.txt");
        BufferedReader reader = new BufferedReader(fr);

        String line = "";

        while((line = reader.readLine()) != null) {
            str.add(line);
        }
        reader.close();

        for(String s: str){
            if (s.startsWith("0703") || s.startsWith("0706") || s.startsWith("0803") || s.startsWith("0806") || s.startsWith("0810") || s.startsWith("0813") || s.startsWith("0814") || s.startsWith("0816")|| s.startsWith("0903") || s.startsWith("0906") || s.startsWith("0913") || s.startsWith("0916") || s.startsWith("07025")|| s.startsWith("07026")|| s.startsWith("0704")) {
                mtnNos++;
            }
            else if (s.startsWith("0701")|| s.startsWith("0708") || s.startsWith("0802") || s.startsWith("0808") || s.startsWith("0812") || s.startsWith("0901") || s.startsWith("0902") || s.startsWith("0904") || s.startsWith("0907") || s.startsWith("0912")) {
                airtelNos++;
            }
            else if (s.startsWith("0705")|| s.startsWith("0805") || s.startsWith("0807") || s.startsWith("0811") || s.startsWith("0815")|| s.startsWith("0905") || s.startsWith("0915")) {
                gloNos++;
            }
            else if (s.startsWith("0809")|| s.startsWith("0817") || s.startsWith("0818") || s.startsWith("0909") || s.startsWith("0908")) {
                nineMobileNos++;
            }
            else if (s.startsWith("0804")) {
                mtelNos++;
            }
            else {
                System.out.println("No match");
            }
        }

        System.out.println("Given a text file of a million phone numbers, here is the summary report of total number of phone numbers for each service provider: ");
        System.out.println("Mtn numbers : " + mtnNos);
        System.out.println("Airtel numbers : " + airtelNos);
        System.out.println("Glo numbers : " + gloNos);
        System.out.println("9mobile numbers : " + nineMobileNos);
        System.out.println("Mtel numbers : " + mtelNos);

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time is: " + (endTime - startTime));

    }
}
