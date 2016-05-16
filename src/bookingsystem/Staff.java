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
public class Staff {
    String name;
    String date;
    String time;
    

    public Staff(String datename ,  String time, String name) {
        this.date = datename;
        this.time = time;
        this.name = name;
    }

    @Override
    public String toString() {
        return date + " "+ time + " "+name+"" ;
    }

    

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Staff staff = new Staff("ziyaad","19911001","13:00");
        System.out.println(staff.toString());
    }
}
