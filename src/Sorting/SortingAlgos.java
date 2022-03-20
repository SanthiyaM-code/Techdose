package Sorting;

public class SortingAlgos {
    public  static  void  main(String[] args)
    {
        int[] a = {21, 2, 43, 25, 876, 3456, 90,31,41};
        RadixSort radixSort=new RadixSort();
        radixSort.sort(a);
//        CountSort cs=new CountSort();
//        cs.sort(a,1);
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }


}
