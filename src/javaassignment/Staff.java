/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yipzh
 */
public class Staff {
    protected String username, password, userType;
    protected String[] verifiedUserDetails;
    protected ArrayList<String[]> detailsList;
    
    Staff(String u, String pw){
        username = u;
        password = pw;
    }
    
    public void readFile(){
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
        for (String[] details : detailsList){
            if (username == details[1] && password == details[2]){
                verifiedUserDetails = details;
                userType = verifiedUserDetails[6];
                return true;
            }
        }
        return false;
    }
}
