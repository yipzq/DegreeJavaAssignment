/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcsee
 */
public class Officer {
    
    protected int orderID ,results;
    protected ArrayList<String[]> detailsList = new ArrayList<>();
    protected String userType;
    protected String [] sales, verifiedUserDetails;
//
    
    public void readASOFile(){
        detailsList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("ApprovedSO.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                detailsList.add(details);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public void readFile(){
        detailsList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("salesOrder.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                detailsList.add(details);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public ArrayList<String[]> getDetailsList(){
        return detailsList;
    }
    
    public void getOrderID(int orderID ) {
        this.orderID = orderID;
    }
    
    public void overwriteFile(String file, ArrayList<String[]> list, int lengthOfArray) throws IOException{
        FileWriter fw = new FileWriter(file, false);
        PrintWriter outputFile = new PrintWriter(fw);
        for (var details : list){
            outputFile.print(details[0]);
            for (int i = 1; i < lengthOfArray; i++){
                outputFile.print("," + details[i]);
            }
            outputFile.print("\n");
        }
        outputFile.close();
    }
    
    public void appendToFile(String fileName, List<String> newData) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // Join the elements in newData into a single comma-separated string
            String line = String.join(",", newData);

            // Append the new line to the file
            writer.write(line);
            writer.newLine();  // Add a new line after each entry
        }
    }
    

    public void edit(){
        for (String[] details : detailsList){
            if (Integer.parseInt(details[0]) == orderID){
                details[7] = "Approved";
            }    
        }       
    }
    
    public void reject(){
        for (String[] details : detailsList){
            if (Integer.parseInt(details[0]) == orderID){
                details[7] = "Rejected";
            }    
        }       
    }
    
    public String[] getVerifiedUserDetails(){
        for (var details : detailsList){
            if (orderID == Integer.parseInt(details[0])){
                verifiedUserDetails = details;
                userType = verifiedUserDetails[7];
                return verifiedUserDetails;
            }
        }
        return null;
    }
    
    public void changeDetails(String value, int index){
        verifiedUserDetails[index] = value;
        detailsList.set(orderID - 1, verifiedUserDetails);
    }
   
}



    
    
