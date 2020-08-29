/*Guess the Maximum Cash
In a famous place of Bihar called Sonpur, visitors are interested in a game called Guess the Maximum Cash. The game contains a 
M
∗
N
 matrix in which each cell contains a box with a certain amount of cash. The organizer gives the audience row number and column number 
(
X
,
Y
)
 i.e location of a certain box and then place the boxes in a one-dimensional column-major order format in front of the audience. He says, "The box with maximum amount is present at the location which is denoted by the greatest Prime Factor of the new location on which box with coordinate 
(
X
,
Y
)
 is now present". The audience is very confused and asks for your help to the find location of the box with the maximum amount.

Input Format
The first line contains an integer 
T
, representing the number of test cases.
The next 
T
 line contains four space-separated integers 
M
,
N
,
X
,
Y
 representing the size of matrix 
(
M
∗
N
)
 and row and column number (
1
-based indexing).

Output Format
For each test case, print dollar symbol ($) followed by the desired location separated by space.

Constraints
1
<=
T
<=
1000

1
<=
M
,
N
<=
10
5

1
<=
X
,
Y
<=
10
3

Time Limit
1 second

Sample Test Case
Input
3
8 7 3 2
100 234 10 24
100000 34565 234 676

Output
$ 11
$ 11
$ 220589

Sample Test case explanation
T
=
1

M
=
8
,
N
=
7
,
X
=
3
,
Y
=
2

So location of the box is 
11
.
The greatest prime factor is 
11
.

T
=
2

M
=
100
,
N
=
234
,
X
=
10
,
Y
=
24

Location is 
2310

Greatest prime factor is 
11
.

T
=
3

M
=
100000
,
N
=
34565
,
X
=
234
,
Y
=
676

Location is 
67500234

Greatest prime factor is 
220589
.*/

import java.util.*;
import java.io.*;

public class GuessTheMaximumCashPrep3Soln1 {
  public static void main(String args[]) throws IOException {
    
    int i,t,m,n,x,y,loc,g,j;
    Scanner in=new Scanner(System.in);
    t=in.nextInt();
    while(t--!=0)
    {
      int[] prime=new int[100];
      m=in.nextInt();
      n=in.nextInt();
      x=in.nextInt();
      y=in.nextInt();
      loc=0;
      g=0;
      for(j=1;j<y;j++)
      {
        loc=loc+m;
      }
      loc=loc+x;
     // System.out.println(loc);
      j=0;
        while (loc%2==0) 
        { 
            prime[j++]=2;
            loc /= 2; 
        } 
  
  
        for ( i = 3; i <= Math.sqrt(loc); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (loc%i == 0) 
            { 
              prime[j++]=i;
                loc /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (loc > 2) 
            prime[j++]=loc;
            g=prime[0];
      for(i=1;i<j;i++)
      {
        if(g<prime[i])
        g=prime[i];
      }
      System.out.println("$ " +g);
    }
    
    
  }
}