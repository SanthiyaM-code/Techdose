package MathAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeFrom1toN {
    public static void findAllPrime(int n)
    {
        boolean[] isConsonant = new boolean[n+1];

        for(int i=2;i*i<=n;i++)
        {
            for(int j=i*i; j<=n;j=j+i)
            {
                if(isConsonant[j]==false)
                {
                    isConsonant[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(isConsonant[i]==false)
                System.out.print(i+" ");
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        findAllPrime(n);
    }
}
