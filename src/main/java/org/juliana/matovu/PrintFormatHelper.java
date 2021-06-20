package org.juliana.matovu;

public class PrintFormatHelper {
    public String reverse;


    public void setReverse(String reverse){
        this.reverse = reverse;
    }


    public void reverseString(){
        String reversed = "";
        for (int i = reverse.length() -1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(reverse.charAt(i)));
        }
        System.out.println(reversed);
    }

}
