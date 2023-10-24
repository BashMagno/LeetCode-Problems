/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 

Constraints:

1 <= n <= 104
 */
//RUNTIME
 /* 
Runtime
            Details
            1ms
            Beats 99.91%of users with Java
Memory
            Details
            44.48MB
            Beats 72.10%of users with Java
 */
import java.util.ArrayList;
import java.util.List;

class Fizz
{
    public static List<String> fizzBuzz(int n) 
    {

        List<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                list.add("FizzBuzz");
            }else if(i % 3 == 0)
            {
                list.add("Fizz");
            }else if(i % 5 == 0)
            {
                list.add("Buzz");
            }else{
            list.add(""+i+"");
            }
        }
        return list;
        
    }
}