/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yipzh
 */
public class Staff {
    protected int staffID, changes;
    protected String username, password, userType, phoneNumber;
    protected String[] verifiedUserDetails;
    protected ArrayList<String[]> detailsList = new ArrayList<>();
    
    Staff(){
        
    }
    
    Staff(String u, String pw){
        username = u;
        password = pw;
    }
    
    /*Staff(String phoneNumber, String username, int changes){
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.changes = changes;
    }*/
    
    public void readFile(){
        detailsList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("staffDetails.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                detailsList.add(details);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public Boolean verifyUser(){
        for (var details : detailsList){
            if (username.equals(details[1]) && password.equals(details[2])){
                verifiedUserDetails = details;
                userType = verifiedUserDetails[6];
                return true;
            }
        }
        return false;
    }
    
    public String getUserType(){
        return userType;
    }
    
    public String getCurrentDateTime(){
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the LocalDateTime object
        String formattedDateTime = currentDateTime.format(formatter);
        
        return formattedDateTime;
    }
    
    public void createSession() throws IOException{
        FileWriter fw = new FileWriter("session.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        int sessionID = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("session.txt"));

            int lineCount = 0;

            while (br.readLine() != null) {
                lineCount++;
            }
            sessionID = lineCount + 1;
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String loginDateTime = getCurrentDateTime();
        outputFile.println(sessionID + "," + loginDateTime + "," + verifiedUserDetails[0]);
        outputFile.close();
    }
    
    public void getStaffID() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("session.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] array = line.split(",");
            staffID = Integer.parseInt(array[2]);
        }
        br.close();
    }
    
    public void setStaffID(int staffID){
        this.staffID = staffID;
    }
    
    public String[] getVerifiedUserDetails(){
        for (var details : detailsList){
            if (staffID == Integer.parseInt(details[0])){
                verifiedUserDetails = details;
                userType = verifiedUserDetails[6];
                return verifiedUserDetails;
            }
        }
        return null;
    }
    
    public void changeDetails(String value, int index){
        verifiedUserDetails[index] = value;
        detailsList.set(staffID - 1, verifiedUserDetails);
    }
    
    public ArrayList<String[]> getDetailsList(){
        return detailsList;
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
    
    public Boolean checkOldPassword(String oldPassword){
        return oldPassword.equals(verifiedUserDetails[2]);
    }
}
