import java.util.Scanner;
public class Attendance{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your Attendance Percentage:");
int att = scanner.nextInt();
if(att >= 75){
  System.out.println("Your are eligible for exam");
    if(att >= 90){
       System.out.println("Your will get Extra 5 marks");
     }
}
  else{
    System.out.println("Your aren't eligible for exam");
  }
scanner.close();
}
}

