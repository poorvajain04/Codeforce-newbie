import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long oddC=(n+1)/2;
        if(k<=oddC) System.out.println(2*k-1);
        else System.out.println(2*(k-oddC));
    }
}