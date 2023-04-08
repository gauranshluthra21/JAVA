
import java.util.*;
public class conditions{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("you are an adult");
        }

        else if(age == 18){
            System.out.println("you are 18");
            }
        
        else {
            System.out.println("you are not an adult");
        }

    }
    
}
