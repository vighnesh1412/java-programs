import java.util.Scanner;
class Factorial{  
 public static void main(String args[])
 {  
  int i,fact=1;  
  int number;
  System.out.println("enter the number");
  Scanner s=new Scanner(System.in);
  number=s.nextInt();

  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  