import java.util.Scanner;
public class primenums {
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter firstnumber");
        int start= s.nextInt();
        System.out.println("enter the second number");
        int end=s.nextInt();
        System.out.println("list of numbers between"+start+"and"+end);
        for(int i=start;i<=end;i++){
            if(isprimenums(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isprimenums(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
