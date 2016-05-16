/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author maxamed
 */
public class Room {
    private String doorColor;
    
    public void bookRoom(){}
    public static boolean availability( String room, String payload){
         String fileName = room;//"temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
               // System.out.println(line);
                //System.out.println(payload);
                if(line.length()>24){
               String halfLine = line.substring(0,24);
               String halfPayload = payload.substring(0,24);
                System.out.println(halfLine + "  "+ halfPayload);
               
               if(halfLine.equalsIgnoreCase(halfPayload))
               {
                   System.out.println("its working");
                   return false;
               }
                }
                
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        return true;}
    public static void main(String[] args) {
        System.out.println(availability("BlueRoom","payload"));
        
    }
}
