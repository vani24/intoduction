package javahackathon;

import java.util.Scanner;

public class PossibleSumOfCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : "); //inputting the number
        int n=scan.nextInt();
         
        int sum=0,c=0,j=0;
        for(int i=1;i<n;i++)
        {
            sum=i;
            j=i+1;



            while(sum<n)
            {
                sum=sum+j;
                j++;
            }


                if(sum==n)
                {
                    for(int k=i;k<j;k++)
                    {
                        if(k==i)
                            System.out.print(k);
                        else
                            System.out.print(" + "+k);
                    }
                 System.out.println();
                }
        }
    }



}

/*
 * Output:
 * 
Enter a number : 9
2 + 3 + 4
4 + 5
 */
