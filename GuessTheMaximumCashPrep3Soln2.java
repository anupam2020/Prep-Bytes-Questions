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

public class GuessTheMaximumCashPrep3Soln2 {

    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),x=Integer.parseInt(s[2]),y=Integer.parseInt(s[3]);
            int max=n*(y-1)+x;
            int ans=1,i;
            for(i=2;i*i<=max;i++)
            if(max%i==0)
            {
                ans=i;
                while(max%i==0)
                max/=i;
            }
            if(max>=2) ans=Math.max(ans,max);
            sb.append("$ "+ans+"\n");
        }
        System.out.print(sb);
    }
}