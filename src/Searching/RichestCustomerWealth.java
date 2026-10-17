package Searching;
// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
   public static void main(String[] args) {
       int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
       System.out.println("Maximum Wealth: "+ maximumWealth(accounts));
   }

    public static int maximumWealth(int[][] accounts) {
          int maxWealth = Integer.MIN_VALUE;

           for(int i=0; i<accounts.length; i++){
               int rowSum = 0;                                    // i = customer
                                                                  // j = account
               for(int j=0; j<accounts[i].length; j++){

                   rowSum = rowSum + accounts[i][j];
               }
               if(rowSum > maxWealth){
                   maxWealth = rowSum;
               }
           }
           return maxWealth;
    }

}