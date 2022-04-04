package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public boolean contain3(int x){
        while(x != 0){
            if
        }
    }

    public String fizzBuzz(Integer number) {
        String result="";
        if(number%3 == 0){
            result+="fizz";
        }
        if(number%5 == 0){
            if(result != ""){
                result += " buzz";
            } else{
                result += "buzz";
            }
        }
        if(result == ""){
            result+=number;
        }
        return result;
    }

}


