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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mcsee
 */
public class Officer {
    
    protected int orderID;
    protected int results;
    protected ArrayList<String[]> detailsList = new ArrayList<>();
    DefaultTableModel model;
    protected String [] sales;
    
    
    public void readFile(){
        detailsList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("ApproveSO.txt"));
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
    

    public void edit(){
        for (String[] details : detailsList){
            if (Integer.parseInt(details[0]) == orderID){
                details[7] = "approved";
            }    
        }       
    }
    
    public void reject(){
        for (String[] details : detailsList){
            if (Integer.parseInt(details[0]) == orderID){
                details[7] = "rejected";
            }    
        }       
    }
    
    
    public void search(int orderID) {
        boolean found = false;
        model.setRowCount(0);
        results = 0;

        for (String[] s : detailsList) {
            // Assuming orderID is stored as an integer in the details array
            if (Integer.parseInt(s[0]) == orderID) {
                sales = s;
                model.insertRow(model.getRowCount(), new Object[]{sales[0], sales[1], sales[2], sales[3]});
                found = true;
                results++;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Order ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void viewAll() {
        model.setRowCount(0);

        for (String[] details : detailsList) {
            if (details != null && details.length == 5) {
                model.insertRow(model.getRowCount(), new Object[]{details[0], details[1], details[2], details[3], details[4]});
            }
        }
    }

}


    
    
