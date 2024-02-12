/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
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
    protected ArrayList<String[]> detailsList = new ArrayList<>(), approvedSOList = new ArrayList<>(), furnitureList = new ArrayList<>();
    
    protected String userType;
    protected String [] sales, oidDetails,calPrice;
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
    
    public void readASOFile2(){
        approvedSOList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("ApprovedSO.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                approvedSOList.add(details);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public void overwriteFile(String file, ArrayList<String[]> list, int lengthOfArray) throws IOException {
        FileWriter fw = new FileWriter(file, false);
        PrintWriter outputFile = new PrintWriter(fw);
        for (var details : list) {
            outputFile.print(details[0]);
            for (int i = 1; i < lengthOfArray; i++) {
                outputFile.print("," + details[i]);
            }
            outputFile.print("\n");
        }
        outputFile.close();
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
    
    public void readFurFile(){
        detailsList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("furniture.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                detailsList.add(details);
            }
            br.close();
        } catch (IOException e) {
            
        }
        
    }
    
    public ArrayList<String[]> getFDetails(){
        return detailsList;
    }
    
    
    
    public ArrayList<String[]> getDetailsList(){
        return detailsList;
    }
    
    public ArrayList<String[]> getApprovedSOList(){
        return approvedSOList;
    }
    
    
    public void getOrderID() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("session.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");
            orderID = Integer.parseInt(array[0]);
        }
        br.close();
    }
    
    public void setOrderID(int orderID ) {
        this.orderID = orderID;
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
    
    public String[] getoidDetails(){
        for (var details : detailsList){
            if (orderID == Integer.parseInt(details[0])){
                oidDetails = details;
                userType = oidDetails[7];
                return oidDetails;
            }
        }
        return null;
    }
    
    public String[] getOrderDetails(){
        for (var details : approvedSOList){
            if (orderID == Integer.parseInt(details[0])){
                oidDetails = details;
                return oidDetails;
            }
        }
        return null;
    }
    
    public void changeDetails(String value, int index){
        String[] updatedDetails = new String[oidDetails.length]; // Create a new array to store the updated details
        System.arraycopy(oidDetails, 0, updatedDetails, 0, oidDetails.length); // Copy elements from oidDetails to updatedDetails
        updatedDetails[index] = value; // Update the value at the specified index
        detailsList.set(orderID - 1, updatedDetails); // Update the detailsList with the modified details
    }

    public ArrayList<String[]> changeSODetails(String quantity, String coName, String status, String itemID){
        String price = null;
        oidDetails[3] = quantity;
        oidDetails[5] = coName;
        oidDetails[7] = status;
        readFurFile();
        furnitureList = detailsList;
        for (String[] furniture : furnitureList){
            if (itemID.equals(furniture[0])){
                price = furniture[3];
                break;
            }
        }
        int total = Integer.parseInt(quantity) * Integer.parseInt(price);
        oidDetails[4] = String.valueOf(total);
        approvedSOList.set(orderID - 1, oidDetails);
        return approvedSOList;
    }
    
}
    
   


    
    
