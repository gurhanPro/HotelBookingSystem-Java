/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

/**
 *
 * @author maxamed
 */
public class Booking {
    public static void bookIt(Staff staff,String r){
        
        System.out.println(staff.toString());
        
        FileWriterReader.writer(r, staff.toString());
        
    
    }
    public static void main(String[] args) {
        System.out.println("aqeela");
       String name = "aqeela";
       int len = name.length();
        System.out.println(len);
       
    }
}
