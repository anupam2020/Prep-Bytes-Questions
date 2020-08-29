/*Wierd State
There are 
N
 states that are located in a straight line. Each state is at war with its next and previous state.
You are the tax collector of the states. You go to collect taxes from a range of states.
The starting state is always friendly and you collect tax 
=
 number of states visited * tax amount of that state.
But when you visit the next state or 
(
i
+
1
)
t
h
 state they become hostile and take away (number of states visited * tax amount of that state) amount from you, then the next state i.e 
(
i
+
2
)
 is friendly and 
(
i
+
3
)
 is hostile and so on.
You are bound to collect taxes in increasing order of indices, i.e. 
i
, 
(
i
+
1
)
, 
(
i
+
2
)
 and so on.

You are given an array of tax amount of 
N
 states. You are also given 
q
 queries.
Queries are of two types:
Update the tax amount of a state.
Find the tax that should be collected from state 
l
 to state 
r
(both inclusive 
1
 based indexing).

Input format
The first line contains 
T
, denoting the number of test cases.
For each test case
The first line contains 
N
, the number of states, and 
q
 the number of queries.
The second line contains 
N
 space-separated integers.
The next 
q
 lines contain a character 
Q
 for query and 
U
 for update followed by two numbers 
x
 and 
y
,
If it is update then update 
x
t
h
 element to 
y
.
If it is a query then find the tax that should be collected from state 
x
 to state 
y
.

Output format
For each test case: for each 
Q
 operation print the tax that will be collected on a new line.

Constraints
1
<=
T
<=
100

1
<=
N
,
q
<=
10
5

1
<=
a
[
i
]
<=
100

Time Limit
3 second

Example
Input
1
3 2
4 5 5
U 1 7
Q 1 2

Output
-3

Explanation
Intitally the array is 
[
4
,
5
,
5
]
.
Update 
4
 to 
7
.
so array becomes 
[
7
,
5
,
5
]

So the tax collected is  
7
−
5
∗
2
 = 
−
3
.*/

import java.util.Scanner;
class WeirdPrep2Soln
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long ans = 0;
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = sc.nextInt();
            for(int i = 0 ; i < q ; i++){
                if (sc.next().equals("U"))
                    arr[sc.nextInt()-1] = sc.nextInt();
                else{
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    int count =  1;
                    for(int j = start-1  ;j<end ; j++ ){
                        if ((count&1)==1){
                            ans+=count*arr[j];
                        }
                        else
                            ans-=count*arr[j];
                        count++;
                    }
                    System.out.println(ans);
                    ans = 0 ;
                }
            }
        }

    }
}