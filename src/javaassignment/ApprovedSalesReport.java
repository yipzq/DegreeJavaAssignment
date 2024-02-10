/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author yipzh
 */
public class ApprovedSalesReport {
    ArrayList<String[]> furnitureList = new ArrayList<>(), orderList = new ArrayList<>(), reportDetails = new ArrayList<>(), filteredReportDetails = new ArrayList<>(), filteredOrderList = new ArrayList<>();
    int[] furnitureQuantity, overallFurnitureQuantity;
    
    public void readFurnitureFile(){
        try  {
            BufferedReader br = new BufferedReader(new FileReader("furniture.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] furniture = line.split(",");
                furnitureList.add(furniture);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public void readApprovedSOFile(){
        try  {
            BufferedReader br = new BufferedReader(new FileReader("ApprovedSO.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] order = line.split(",");
                orderList.add(order);
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
    
    public ArrayList<String[]> getFurnitureList(){
        return furnitureList;
    }
    
    public void countOverallQuantity(){
        int length = furnitureList.size();
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = 0;
        }
        for (String[] order : orderList){
            int itemID = Integer.parseInt(order[2]);
            array[itemID - 1] = array[itemID - 1] + Integer.parseInt(order[3]);
        }
        overallFurnitureQuantity = array;
    }
    
    public void countQuantity(){
        int length = furnitureList.size();
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = 0;
        }
        for (String[] order : filteredOrderList){
            int itemID = Integer.parseInt(order[2]);
            array[itemID - 1] = array[itemID - 1] + Integer.parseInt(order[3]);
        }
        furnitureQuantity = array;
    }
    
    public ArrayList<String[]> generateReportDetails(){
        reportDetails.clear();
        int length = furnitureList.size();
        for (int i = 0; i < length; i++){
            String[] details = new String[4];
            String[] furniture = furnitureList.get(i);
            details[0] = furniture[0];
            details[1] = furniture[1];
            details[2] = furniture[3];
            details[3] = String.valueOf(overallFurnitureQuantity[i]);
            reportDetails.add(details);
        }
        return reportDetails;
    }
    
    public ArrayList<String[]> generateFilteredReportDetails(){
        filteredReportDetails.clear();
        int length = furnitureList.size();
        for (int i = 0; i < length; i++){
            String[] details = new String[4];
            String[] furniture = furnitureList.get(i);
            details[0] = furniture[0];
            details[1] = furniture[1];
            details[2] = furniture[3];
            details[3] = String.valueOf(furnitureQuantity[i]);
            filteredReportDetails.add(details);
        }
        return filteredReportDetails;
    }
    
    public void filterReportByMonthAndYear(int m, int y){
        filteredOrderList.clear();
        for (String[] order : orderList){
            // Create a formatter for the given pattern
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Parse the string to LocalDateTime
            LocalDateTime dateTime = LocalDateTime.parse(order[1], formatter);

            // Extract year and month
            int year = dateTime.getYear();
            int month = dateTime.getMonthValue();
            if (m == month && y == year){
                filteredOrderList.add(order);
            }
        }
    }
    
    public void filterReportByYear(int y){
        filteredOrderList.clear();
        for (String[] order : orderList){
            // Create a formatter for the given pattern
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Parse the string to LocalDateTime
            LocalDateTime dateTime = LocalDateTime.parse(order[1], formatter);

            // Extract year and month
            int year = dateTime.getYear();
            if (y == year){
                filteredOrderList.add(order);
            }
        }
    }
}
