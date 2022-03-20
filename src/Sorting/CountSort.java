package Sorting;

public class CountSort {
    void sort(int[] a,int pos)
    {
        int[] b=new int[a.length];
        int[] count=new int[10];
        for(int i=0;i<a.length;i++)
        {
            count[(a[i]/pos)%10]++;

        }
        for(int i=1;i<10;i++)
        {
            count[i]=count[i-1]+count[i];
//            System.out.print(count[i]+" ");
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--)
        {
            b[(--(count[(a[i] / pos )% 10]))]=a[i];

        }

        for(int i=0;i<b.length;i++)
        {
            a[i]=b[i];
        }

    }
}
