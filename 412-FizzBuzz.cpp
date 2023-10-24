/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
//RUNTIME
/*
Runtime
            Details
            2ms
            Beats 61.28%of users with C++
Memory
            Details
            7.51MB
            Beats 88.94%of users with C++
*/
#include <vector>
#include <string>

class Solution {
public:
    std::vector<std::string> fizzBuzz(int n) {
        std::vector<std::string> vct;
        vct.reserve(n); // Reservar espacio para n elementos
        
        for(int i = 1; i <= n; i++) {
            std::string str = "";
            if (i % 3 == 0) {
                str += "Fizz";
            }
            if (i % 5 == 0) {
                str += "Buzz";
            }
            if (str.empty()) {
                str = std::to_string(i);
            }
            vct.push_back(str);
        }
        return vct;
    }
};
