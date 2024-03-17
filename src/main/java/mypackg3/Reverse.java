package mypackg3;
public class Reverse {
public int reverse(int num) {
boolean isNoNegative = num < 0 ? true : false; 
if(isNoNegative) 
{ 
num= num * -1; //makes the number positive if the given number is negative 
} 
int reverse = 0; 
int lastDigit = 0; 
while (num>= 1) 
{ 
lastDigit = num % 10; // gives the last digit of the number 
reverse = reverse * 10 + lastDigit; 
num = num/ 10; // removes the last digit of the number 
} 
//makes the number negative 
return isNoNegative == true? reverse*-1 : reverse; 
}
}
