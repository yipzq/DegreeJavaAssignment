/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Salesperson extends Staff {
    
    Salesperson(){
        
    }
    
    public void getNewStaffID() throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader("staffDetails.txt"));

            int lineCount = 0;

            while (br.readLine() != null) {
                lineCount++;
            }
            staffID = lineCount + 1;
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void createAccount(String username, String password, String name, String gender, String phoneNumber, String position) throws IOException{
        FileWriter fw = new FileWriter("staffDetails.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        outputFile.println(String.valueOf(staffID) + "," + username + "," + password + "," + name + "," + gender + "," + phoneNumber + "," + position);
        outputFile.close();
    }
    
    public void deleteAccount() throws IOException{
        ArrayList<String[]> arrayList = new ArrayList<>();
        String array[] = new String[0];
        for (var i : detailsList){
            if (i[0].equals(String.valueOf(staffID))){
                arrayList.add(array);
            } else{
                arrayList.add(i);
            }
        }
        FileWriter fw = new FileWriter("staffDetails.txt", false);
        PrintWriter outputFile = new PrintWriter(fw);
        for (var i : arrayList){
            if (i.length != 7){
                outputFile.println("");
            }else{
                outputFile.println(i[0] + "," + i[1] + "," + i[2] + "," + i[3] + "," + i[4] + "," + i[5] + "," + i[6]);
            }
        }
        outputFile.close();
    }
}
