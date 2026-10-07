package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        //syntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

       for(int i=0;i<5;i++){
           list.add(sc.nextInt());
       }
        System.out.print(list+" ");
       list.set(2,3);   //   similar to arr[2]=3
         System.out.println(list);
    }
}
