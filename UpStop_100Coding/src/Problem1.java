/*
Problem Statement
One day Mary wanted to give a present to her friend, and she decided to give her
a beautiful bouquet of flowers, she started collecting the flowers for the bouquet
,she exactly needed 2 types of flowers. The total number of flowers should be ‘t’.
Now she starts collecting it from her garden. In her garden, there are ‘N’
types of flowers, and each type of flower are arranged in a queue in non-decreasing
order, e.g. 1, 3, 6, 15 and so on.

Now she wants your help to find which indexes of flowers she should collect.

Input Format
Each test case consists of two lines. The first one contains integers N and t — N
is the total types of flowers and t is the total number of flowers needed.
The second line contains n integers a1,a2,…,an — elements of the a array.

Output Format
Print a single line containing the indexes of flowers.

Constraints
2 <= N <= 10^4
1 <= a[i] <= 1000
2 <= t <= 2000
There is exactly one solution exist.

Sample Testcase 0
Testcase Input
7 5
1 2 2 4 5 7 10
Testcase Output
0 3

Explanation
Flowers at 0th and 3rd indexes sum up to the target only i.e. 1 + 4 = 5 .

Sample Testcase 1
Testcase Input
5 2
1 1 2 3 4
Testcase Output
0 1

Explanation
Flowers at 0th and 1st indexes sum up to the target only i.e. 1 + 1 = 2.
 */
public class Problem1 {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,4,5,7,10};
        int n=7;
        int t=5;
        int[]ans = solution2(n,t,arr);
        System.out.print("{");
        for (int an : ans) {
            System.out.print(an+" ");
        }
        System.out.print("}");
    }
    /* Approach 1 : Brute Force (initial approach)
       Time Complexity : 0(n2)
       Space Complexity : 0(1)
    * */
    public static int[] solution1(int n,int t,int[]arr)
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==t)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    /* Approach 2 : Two Pointer (if the array is sorted in lower to high order)
       Time Complexity : 0(n)
       Space Complexity : 0(1)
    */
    public static int[] solution2(int n,int t,int[]arr)
    {
        int i=0;
        int j=n-1;
        while(i!=j){
            if(arr[i]+arr[j]==t){
                return new int[]{i,j};
            }
            else if(arr[i]+arr[j]>t)
            {
                j--;
            }else{
                i++;
            }
        }
        return new int[]{0,0};
    }
}
