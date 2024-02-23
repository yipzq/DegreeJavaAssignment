/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaassignment.Salesperson;

/**
 *
 * @author Joshua
 */
public class Furniture {
    void addOrders(int i, String f, String c, double p, String oc, String d, String sd){
        try {
            FileWriter fw = new FileWriter("furniture.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
             pw.println(i+","+f+","+c+","+p+","+oc+","+d+","+sd);
            
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Salesperson.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    void editOrders(String o, String n){
        File f = new File("furniture.txt");
        String oldcontent = "";
        try {
            BufferedReader reader = new BufferedReader (new FileReader(f));
            //Reading and adding all the lines into oldcontent
            String line = reader.readLine();
            while (line != null){
                oldcontent = oldcontent + line + System.lineSeparator();
                line = reader.readLine();
            }
            //Replacing the old data with new data in oldcontent, assigning this new values into newcontent
            String newcontent = oldcontent.replaceAll(o, n);
            FileWriter writer = new FileWriter(f);
            writer.write(newcontent);
            
            reader.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Salesperson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Salesperson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
