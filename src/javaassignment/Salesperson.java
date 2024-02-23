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
    
    private int id, salesOrderID;
    private String[] modifiedOrderDetails;
    private ArrayList<String[]> arrayList = new ArrayList<>(), furnitureList = new ArrayList<>(), orderList = new ArrayList<>();
    
    Salesperson(){
        
    }
    
    public int getNewID(String file) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            int lineCount = 0;

            while (br.readLine() != null) {
                lineCount++;
            }
            id = lineCount + 1;
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public void createAccount(String username, String password, String name, String gender, String phoneNumber, String position) throws IOException{
        FileWriter fw = new FileWriter("staffDetails.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        outputFile.println(String.valueOf(staffID) + "," + username + "," + password + "," + name + "," + gender + "," + phoneNumber + "," + position);
        outputFile.close();
    }
    
    public void deleteOrder() throws IOException{
        ArrayList<String[]> aL = new ArrayList<>();
        String array[] = new String[0];
        for (var i : orderList){
            if (i[0].equals(String.valueOf(salesOrderID))){
                aL.add(array);
            } else{
                aL.add(i);
            }
        }
        FileWriter fw = new FileWriter("salesOrder.txt", false);
        PrintWriter outputFile = new PrintWriter(fw);
        for (var i : aL){
            if (i.length != 8){
                outputFile.println("");
            }else{
                outputFile.println(i[0] + "," + i[1] + "," + i[2] + "," + i[3] + "," + i[4] + "," + i[5] + "," + i[6] + "," + i[7]);
            }
        }
        outputFile.close();
    }
    
    public void readFile(String file){
        arrayList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                arrayList.add(array);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public void readFurnitureFile(){
        furnitureList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("furniture.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                furnitureList.add(array);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public void readSalesOrderFile(){
        orderList.clear();
        try  {
            BufferedReader br = new BufferedReader(new FileReader("salesOrder.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                orderList.add(array);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public ArrayList<String[]> getArrayList(){
        return arrayList;
    }
    
    public ArrayList<String[]> getFurnitureList(){
        return furnitureList;
    }
    
    public void generateOrder(int itemID, int quantity, int total, String payer) throws IOException{
        FileWriter fw = new FileWriter("salesOrder.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        int orderID = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("salesOrder.txt"));

            int lineCount = 0;

            while (br.readLine() != null) {
                lineCount++;
            }
            orderID = lineCount + 1;
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String orderCreated = getCurrentDateTime();
        outputFile.println(orderID + "," + orderCreated + "," + itemID + "," + quantity + "," + total + "," + payer + "," + staffID + ",pending");
        outputFile.close();
    }
    
    public ArrayList<String[]> generateSalesOrderTableDetails(){
        arrayList.clear();
        for (String[] order : orderList){
            if (order.length == 8){
                String[] details = new String[10];
                int itemID = Integer.parseInt(order[2]);
                details[0] = order[0];//order id
                details[1] = order[1];//date
                details[2] = order[2];//item id
                details[3] = furnitureList.get(itemID - 1)[1];//furniture name
                details[4] = order[3];//quantity
                details[5] = furnitureList.get(itemID - 1)[3];//price
                details[6] = order[4];//total
                details[7] = order[5];//client name
                details[8] = order[6];//staff id
                details[9] = order[7];//status
                arrayList.add(details);
            }
        }
        return arrayList;
    }
    
    public void setOrderID(int orderID){
        this.salesOrderID = orderID;
    }
    
    public void modifyOrder(int fid, String quantity, String client, String price){
        int total = Integer.parseInt(quantity) * Integer.parseInt(price);
        for (String[] order : orderList){
            if (order.length == 8){
                if (salesOrderID == Integer.parseInt(order[0])){
                    order[2] = String.valueOf(fid);
                    order[3] = quantity;
                    order[4] = String.valueOf(total);
                    order[5] = client;
                    modifiedOrderDetails = order;
                    break;
                }
            }
        }
        orderList.set(salesOrderID - 1, modifiedOrderDetails);
    }
    
    public ArrayList<String[]> getOrderList(){
        return orderList;
    }
    
    public int returnStaffID(){
        return staffID;
    }
}
