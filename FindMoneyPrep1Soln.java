/*Find Money
There is a straight path having 
N
 small boxes of size 
1
∗
1
. Each box contains a certain amount of money, Manish directly jumps to a certain box having value 
K
. Now as Manish is not good in maths help him, to find the total money on his left side and right side.

Note:- Consider the first occurrence of 
K
.

Input Format
First-line contains an integer 
T
, representing the number of test cases.
Next 
T
 lines contain two space-separated integers 
N
 and 
K
.
The next line contains 
N
 space-separated integers representing the amount of money in each box of size 
1
∗
1
.
Output Format
For each test case 
T
, print the desired output in a new line. If a box with money = 
K
 is not present print 
0
.
Constraints
1
<=
T
<=
1000

1
<=
N
,
K
<=
10
5

Time Limit
1 second

Example
Input
4
5 8
2 5 8 3 7
15 89
1 3 2 4 5 89 5 6 2 3 8 1 2 9 7
25 13
1 2 1 2 3 1 4 9 18 7 1 2 3 4 2 3 6 8 5 12 13 4 2 5 15
50 1999
1 2 1 2 3 1 4 9 18 7 1 2 3 4 2 3 6 8 5 12 13 4 2 5 15 1 2 1 2 3 1 4 9 18 7 1 2 3 4 2 3 6 8 5 12 13 4 2 5 15

Output
7 10
15 43
94 26
0

Sample test case explanation
For Input 
1

Since 
8
 is in the path so the sum of the left and right side is 
7
 and 
10
.
For Input 
2

Since 
89
 is in the path so the sum of the left and right side is 
15
 and 
43
.
For Input 
3

Since 
13
 is in the path so the sum of the left and right side is 
94
 and 
26
.
For Input 
4

Since 
1999
 is not in the path so 
0
.
*/

import java.io.*;
public class FindMoneyPrep1Soln {
  public static void main(String args[]) throws IOException {
    BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
	    String s = brr.readLine();
	    int tc = Integer.parseInt(s);
	    int n,k,s1=0,s2=0;
	    for(int i = 0;i<tc;i++){
	      int flag=0;
	      s = brr.readLine();
	      String st[] = s.split(" ",2);
     	n = Integer.parseInt(st[0]);
     	k = Integer.parseInt(st[1]);
     	int[] arr = new int[n];
     	   s = brr.readLine();
	       String stt[] = s.split(" ",n);
	       for(int j=0;j<n;j++){
	         arr[j]=Integer.parseInt(stt[j]);
	       }
	        for(int j=0;j<n;j++){
	          if(arr[j]==k) flag =1;
	         if(flag==0){
	           s1=s1+arr[j];
	         }
	         else
	         s2=s2+arr[j];
	       }
		   if(flag==1)
	       System.out.printf("%d %d\n",s1,s2-k);
	       else 
			   System.out.println(0);
			   flag=0;s1=0;s2=0;
     	
	    }
  }
}