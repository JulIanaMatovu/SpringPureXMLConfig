package org.juliana.matovu;

public class PrintService {
    private String palindrome;


    public void setPalindrome(String palindrome){
        this.palindrome = palindrome;
    }


    public void printString(){
        System.out.println("Hello " + palindrome + ", welcome to this app!");
    }

}
