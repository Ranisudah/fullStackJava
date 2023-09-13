package app1;
import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        //Decision Making
        //Switch Case 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num=in.nextInt();
        switch(num){
            case 1:{
                System.out.println("one");
                break;    
            }
            case 2:{
                System.out.println("two");
                break;
            }
            case 0:{
                System.out.println("zero");
                break;  
            }
        }
        System.out.println("Thank you");
        
      
    }
    
}
