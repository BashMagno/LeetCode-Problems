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
