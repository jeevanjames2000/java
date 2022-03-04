class construct{
    int s1;
    int s2;
    int result;
public construct(){
    s1=2;
    s2=4;
    result=s1+s2;
}
public construct(int n){
    s1=n;
}
public static void main(String[] args){
    
    construct obj =new construct(5);
    System.out.println(obj.s1);
}
}