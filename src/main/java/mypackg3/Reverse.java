package mypackg3;

public class Reverse {
    public int reverse(int num) {
        boolean isNoNegative = num < 0 ? true : false; 
        if (isNoNegative) { 
            num = num * -1; // makes the number positive if the given number is negative 
        } 
        int reverse = 0; 
        int lastDigit = 0; 
        while (num >= 1) { 
            lastDigit = num % 10; // gives the last digit of the number 
            reverse = reverse * 10 + lastDigit; 
            num = num / 10; // removes the last digit of the number 
        } 
        // makes the number negative 
        return isNoNegative ? reverse * -1 : reverse; 
    }
    
    public static void main(String[] args) {
        Reverse reverseObj = new Reverse();
        
        // Test cases
        int num1 = 9876;
        int num2 = -6789;
        
        System.out.println("Reverse of " + num1 + " is: " + reverseObj.reverse(num1));
        System.out.println("Reverse of " + num2 + " is: " + reverseObj.reverse(num2));
    }
}
