public class risk {
    
}

import java.util.Scanner;
public class Sumdigit {
    
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter any number:");

int num = input.nextInt();
int sum=0;
int n = num;
while(n!=0){
int remainder = n%10;
sum = sum + remainder;
n= n/10;

}
    
System.out.print("sum of digit: "+sum);





}
}
