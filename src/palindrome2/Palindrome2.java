/*
 * @Henry Huang
 * Palindrome2.java
 * Feb 20,2019
 * This program is designed to count the number of palindrome in the sentence that 
 * the user has input.
 */
package palindrome2;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sentence = JOptionPane.showInputDialog("Words that are the same forwards and backwards"
                + "are called palindromes." + "\nThis program determines if the "
                + "are palindromes." + "\n\n Enter a sentence(do not include a puntuation mark):");
        System.out.println(sentence);
        
        String words[] = sentence.split(" ");
        for (String w:words)
        {
             System.out.println(w);
        }
       
        
    }
    
}
