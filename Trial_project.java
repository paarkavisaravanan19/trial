/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trial_project;
import javax.swing.*;
/**
 *
 * @author Paarkavi Saravanan
 */
public class Trial_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int comp=(int)(Math.random()*100+1);
        int user=0;
       System.out.println("the correct guess would be "+comp);
       int count=1;
       while(user!=comp)
       {
           String response=JOptionPane.showInputDialog(null,"Enter the guess between 1 to 100","GUESS NUMBER TO TELL YOUR FORTUNE TODAY",3);
           user=Integer.parseInt(response);
           JOptionPane.showMessageDialog(null,""+ determineGuess(user,comp,count));
           count++;
       }
        if(count>=0)
       {
           
           JOptionPane.showMessageDialog(null ,"YOUR FORTUNE TODAY::"+ fortune(count));
           
       }
      
      
        
        
    }

    public static String determineGuess(int user,int comp,int count)
    {
        if(user <=0 || user>100)
        {
            return "your guess is invalid";
        }
        else if(user==comp)
        {
            return "Correct!!\nTotal Guesses : "+count;
        }
        else if(user>comp)
        {
            return "your guess is too high,try again.\nTry number:"+count;
        }
        else if(user<comp)
        {
            return "your guess is too low,try again..\ntry number:"+count;
        }
        else
        {
            return "your guess is incorrect\nTry number" +count;
        }
     
      
        
    }
    
    public static String fortune(int count)
    {
     if(count==0)
     {
         return "May health hapiness and prosperity always be with you!!!Have a great day ahead!!Good luck to u!!";
         
     }
     else if(count==1)
     {
         return "the day u decide to do it is ur lucky day!!Best of luck!!";
     }
     else if(count==2)
     {
         return "May fortune always be your side to guide you through your darkest and brightest days";
     }
     else if(count==3)
     {
         return "Believe in yourself!!and go aheaad";
     }
     else if(count==4)
     {
         return "when nothing goes right,go left and sleep!!!:)))";
     }
     else
     {
         return "better luck !!Next Time";
     }
             
    }
}



