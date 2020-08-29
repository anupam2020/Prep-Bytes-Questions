/*Playing with Bits
You are given a number 
N
 denoting the number of digits. You need to take any number 
X
 with 
N
 number of digits and perform the following operations:

Find the binary representation 
K
 of each digit and concatenate them.
Note: Represent each digit with 
4
 binary bits.
i.e 
9
=
1001
 ,
2
=
0010
(can have leading zeroes).

After the concatenation of binary representation of each digit of the number 
X
, we get corresponding decimal number 
R
, remove the last 
N
 digits from it.

For example, take 
X
=
597
 for 
N
=
3

1. we get concatenated binary representation 
K
 as 
010110010111
 (since 
5
=
0101
, 
9
=
1001
, 
7
=
0111
)
2. we get 
R
=
178
 (
010110010
) after removal of last 
N
 (i.e 
3
) bits.

Find such integer 
X
 of length 
N
 that 
R
 (as a decimal number) is maximum possible. If there are multiple valid 
X
 then find the minimum one.

Input Format
The first line contains a single integer 
T
 denoting the number of test cases.
The first line of each test case contains the single integer 
N
.
Output Format
For each test case on a new line output, the minimum integer 
X
 of length 
N
 such that number 
R
 is maximum possible.
Constraints
1
<=
T
<=
1000

1
<=
N
<=
10
5

The sum of 
N
 over all test cases does not exceed 
2
∗
10
5
.

Time Limit
1 second

Examples
Input
2
1
3

Output
8
998

Sample Test case Explanation
In the First test case (with 
N
=
1
), if 
X
=
8
 then 
K
=
1000
. By deleting last 
1
 bits we will obtain 
R
=
100
, which is maximum.

In the Second test case (with 
N
=
3
), if 
X
=
998
 then 
K
=
100110011000
. By deleting the last 
3
 bits we will obtain 
R
=
100110011
, which is maximum.

NOTE: in first case with 
X
=
9
 also we get same 
R
=
100
 but since 
8
<
9
 output is 
8
.

Contest ended. This problem is moved to the practice section.
Practice Problem
All Submissions
  
*/

import java.util.*;
import java.io.*;

public class PlayingWithBitsPrep5Soln1 {
  public static void main(String args[]) throws IOException {
    BufferedReader abc=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(abc.readLine());
    while(T-->0){
      int n=Integer.parseInt(abc.readLine());
      int qu=n/4;
      int rm=n%4;
      int res[]=new int[n];
      Arrays.fill(res,0);
      for(int i=n;i>qu;i--)
        res[n-i]=9;
      if(rm>0){
        res[n-qu-1]=8;
      }
      for(int i=0;i<n;i++)
      System.out.print(res[i]);
      System.out.println();
    }
    System.out.println();
  }
}