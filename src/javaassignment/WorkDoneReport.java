/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author yipzh
 */
public class WorkDoneReport extends ApprovedSalesReport{
    @Override
    public void readApprovedSOFile(){
        try  {
            BufferedReader br = new BufferedReader(new FileReader("ApprovedSO.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] order = line.split(",");
                if (order[7].equals("Work done") || order[7].equals("Work Done")){
                    orderList.add(order);
                }
            }
            br.close();
        } catch (IOException e) {
            
        }
    }
}
