/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
public class cal {
     public static void main (String [] agrs){
        int [] [] marks={
            
                {89,90,87,78},
                {90,67,89,87},
                {57,87,79,90}
        };
        System.out.println("list of students and their marks");
        for(int x=0;x<marks.length;x++){
            System.out.println("student" + (x+1) + ": ");
            for(int y=0; y<marks[x].length; y++){
                System.out.print(marks[x] [y] + "");
                
            }
           System.out.print("\n");
           
        }
            
        }
    }
    

    

