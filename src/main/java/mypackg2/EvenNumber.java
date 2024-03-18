package mypackg2;

public class EvenNumber {

    public boolean Even(int num) {
        
        	if (num%2 == 0) {
        		return true;
        } else {
        	return false;
        }
    }
    
    public static void main(String[] args) {
        EvenNumber EvenObj = new EvenNumber();
        
        // Test cases
        int num1 = 17;
        
        if (EvenObj.Even(num1)==true) {
        	System.out.println(num1 + " is an Even Number!");
        }
        if (EvenObj.Even(num1)==false) {
        	System.out.println(num1 + " is an Odd Number!");
        }
    }
}