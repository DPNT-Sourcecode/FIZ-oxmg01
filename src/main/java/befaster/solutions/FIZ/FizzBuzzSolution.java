package befaster.solutions.FIZ;

public class FizzBuzzSolution {
    public boolean equal(int x) {
        int aux = x % 10;
        x /= 10;
        while (x != 0) {
            if (x % 10 != aux)
                return false;
            x /= 10;
        }
        return true;
    }

    public boolean isdelux(int x) {
        return x > 10 && equal(x);
    }

    public boolean contain3(int x) {
        while (x != 0) {
            if (x % 10 == 3)
                return true;
            x /= 10;
        }
        return false;
    }

    public boolean contain5(int x) {
        while (x != 0) {
            if (x % 10 == 5)
                return true;
            x /= 10;
        }
        return false;
    }

    public String fizzBuzz(Integer number) {
        String result = "";
        if (number % 3 == 0 || contain3(number)) {
            result += "fizz";
        }
        if (number % 5 == 0 || contain5(number)) {
            if (result != "") {
                result += " buzz";
            } else {
                result += "buzz";
            }
        }

        if (isdelux(number)) {
            if (result != "") {
                result += " deluxe";
            } else {
                result += "deluxe";
            }
        }

        if (result == "") {
            result += number;
        }
        return result;
    }

}

