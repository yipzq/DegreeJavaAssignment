/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author yipzh
 */
public class DataValidation {
    
    DataValidation(){
        
    }
    
    public Boolean containsNumber(String input){
        // Regular expression to match any digit (0-9)
        String regex = ".*\\d.*";

        // Check if the input string matches the regular expression
        return input.matches(regex);
    }
    
    public Boolean containsOnlyNumbers(String input){
         // Regular expression to match only digits (0-9)
        String regex = "\\d+";

        // Check if the input string matches the regular expression
        return input.matches(regex);
    }
    
    public Boolean betweenCharacterLimit(int min, int max, String input){
        return min <= input.length() && input.length() <= max;
    }
    
    public String formatToTwoDecimalPlace(double input){
        String formattedNumber = String.format("%.2f", input);
        return formattedNumber;
    }
}