import java.util.Scanner;
public class primenum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number:");
        int n= s.nextInt();
        if(isprimenum(n)){
            System.out.println(n+"is a prime");
        }else{
            System.out.println(n+"is not prime");
        }
        }
        public static boolean isprimenum(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    
}
