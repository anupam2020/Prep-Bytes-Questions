/*Forming teams
Various Inter-college quiz competitions are going to be organized. You want to form the strongest possible teams representing your college this time. There are 
N
 students who are shortlisted for forming the teams and the skill of 
i
t
h
 student is 
a
i
. You want to form no more than 
K
 teams in such a way that the number of students in each team is maximum. But if you put more students in one team and very less in other then that configuration will lead to unbalanced team formation. So, in order to form balanced teams you have to form teams in such a manner that the skill of each pair of the student in one team differs by no more than 
5
.
Note that teams are independent of each other, it means that the difference between the skills of two students from two different teams does not matter.
It is possible that some students are not a part of any team.

Your task is to print the maximum total possible students we can accommodate in no more than 
K
 teams.

Input format
The first line of the input contains two integers 
N
 and 
K
.
The next line contains 
N
 positive integers where each integer 
a
i
 denotes skill of 
i
t
h
 student.

Output format
Output the maximum total number of students in no more than 
K
 teams.

Constraints
1
<=
N
,
k
<=
10
3

0
<=
a
i
<=
10
6

Time Limit
1 second

Example
Input
5 2
15 2 15 1 15

Output
5

Explanation-
In the sample, it is possible to take all the students. One possible way is- take student 
2
 and 
4
 in team 
1
 and student 
1
,
3
,
5
 in team 
2
. So total students we can take is 
2
+
3
=
5
.

Contest ended. This problem is moved to the practice section.
Practice Problem
All Submissions

  */

import java.util.*;
import java.io.*;

class Team{
    int min = 0;
    int max = 0;

    Team(int min, int max){
        this.min = min;
        this.max = max;
    }
}

public class FormingTeamsPrep4Soln{
    public static int[] nextArray(FastReader sc1, int n){
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc1.nextInt();
        }
        return arr;
    }

    public static void main(String[] args){
        FastReader sc1 = new FastReader();
        StringBuilder sb = new StringBuilder();
        
        int n = sc1.nextInt();
        int k = sc1.nextInt();
        int[] arr = nextArray(sc1, n);
        Arrays.sort(arr);

        int[] teams = new int[n];
        int[] size = new int[n];
        int ini = 0;

        for(int i=0; i<n; i++){
            if(i == 0){
                teams[ini] = arr[i];
                size[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams[ini-1] > 5){
                    teams[ini] = arr[i];
                    size[ini] = 1;
                    ini++;
                }
                else{
                    size[ini-1]++;
                }
            }
        }

        Arrays.sort(size);

        int members = 0;
        int res = 0;
        for(int i=n-1; i>=n-k; i--){
            members += size[i];
            //System.out.println("Size : "+size[i]);
        }
        res = Math.max(res, members);

        int[] teams1 = new int[n];
        int[] size1 = new int[n];
        ini = 0;

        for(int i=0; i<1; i++){
            if(i == 0){
                teams1[ini] = arr[i];
                size1[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams1[ini-1] > 5){
                    teams1[ini] = arr[i];
                    size1[ini] = 1;
                    ini++;
                }
                else{
                    size1[ini]++;
                }
            }
        }
        for(int i=1; i<n; i++){
            if(i == 1){
                teams1[ini] = arr[i];
                size1[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams1[ini-1] > 5){
                    teams1[ini] = arr[i];
                    size1[ini] = 1;
                    ini++;
                }
                else{
                    size1[ini]++;
                }
            }
        }

        Arrays.sort(size1);

        int members1 = 0;

        for(int i=n-1; i>=n-k; i--){
            members1 += size1[i];
        }
        res = Math.max(res, members1);


        int[] teams2 = new int[n];
        int[] size2 = new int[n];
        ini = 0;

        for(int i=0; i<2; i++){
            if(i == 0){
                teams2[ini] = arr[i];
                size2[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams2[ini-1] > 5){
                    teams2[ini] = arr[i];
                    size2[ini] = 1;
                    ini++;
                }
                else{
                    size2[ini]++;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(i == 2){
                teams2[ini] = arr[i];
                size2[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams2[ini-1] > 5){
                    teams2[ini] = arr[i];
                    size2[ini] = 1;
                    ini++;
                }
                else{
                    size2[ini]++;
                }
            }
        }

        Arrays.sort(size2);

        int members2 = 0;

        for(int i=n-1; i>=n-k; i--){
            members2 += size2[i];
        }
        res = Math.max(res, members2);


        int[] teams3 = new int[n];
        int[] size3 = new int[n];
        ini = 0;

        for(int i=0; i<3; i++){
            if(i == 0){
                teams3[ini] = arr[i];
                size3[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams3[ini-1] > 5){
                    teams3[ini] = arr[i];
                    size3[ini] = 1;
                    ini++;
                }
                else{
                    size3[ini]++;
                }
            }
        }
        for(int i=3; i<n; i++){
            if(i == 3){
                teams3[ini] = arr[i];
                size3[ini] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams3[ini-1] > 5){
                    teams3[ini] = arr[i];
                    size3[ini] = 1;
                    ini++;
                }
                else{
                    size3[ini]++;
                }
            }
        }

        Arrays.sort(size3);

        int members3 = 0;

        for(int i=n-1; i>=n-k; i--){
            members3 += size3[i];
        }
        res = Math.max(res, members3);



        int[] teams4 = new int[n];
        int[] size4 = new int[n];
        int ini4 = 0;

        for(int i=0; i<4; i++){
            if(i == 0){
                teams4[ini4] = arr[i];
                size4[ini4] = 1;
                ini4++;
            }
            else{
                if(arr[i] - teams4[ini4-1] > 5){
                    teams4[ini4] = arr[i];
                    size4[ini4] = 1;
                    ini4++;
                }
                else{
                    size4[ini4]++;
                }
            }
        }
        for(int i=4; i<n; i++){
            if(i == 4){
                teams4[ini4] = arr[i];
                size4[ini4] = 1;
                ini++;
            }
            else{
                if(arr[i] - teams4[ini4-1] > 5){
                    teams4[ini4] = arr[i];
                    size4[ini4] = 1;
                    ini4++;
                }
                else{
                    size4[ini4]++;
                }
            }
        }

        Arrays.sort(size4);

        int members4 = 0;

        for(int i=n-1; i>=n-k; i--){
            members4 += size4[i];
        }
        res = Math.max(res, members4);

        System.out.print(res);
    }

    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
