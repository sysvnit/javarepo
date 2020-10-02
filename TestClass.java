
import java.lang.*;
import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int n=scan.nextInt();
            int k=scan.nextInt();
            int c=n/k;
            int l=k/2;
            if(c<=l){
                System.out.println(n);
                break;
            }
            if(k%2!=0){
                System.out.println(n%k);
                break;
            }
            int sum=0;
            for(int m=0;m<l;m++){
                sum+= c+m;
            }
            for(int m=0;m<l;m++){
                sum+= c-m-1;
            }
            System.out.println(sum);
            
            
        }

    }
}

