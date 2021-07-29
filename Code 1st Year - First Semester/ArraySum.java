import java.util.Scanner;
public class ArraySum {
    public static int sumArrayR1(int a[],int n){
        if(n==1){
            return 1;
        }
        else
            return sumArrayR1(a, n-1) + a[n-1];
    }
    public static void main(String args[]){
        int p[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner s = new Scanner(System.in);
        System.out.println(sumArrayR1(p,s.nextInt()));
    }
}