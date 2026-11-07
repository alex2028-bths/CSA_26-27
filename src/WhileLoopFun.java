public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {
        while(number > 0) {
            System.out.println(number%10);
            number /= 10;
        }
    }

    public int countLetter(String word, String letter) {
        int count = 0;
        while(word.indexOf(letter) > -1) {
            count++;
            word = word.substring(word.indexOf(letter)+1);
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int count = 0;
        if(number > threshold) {
            return 0;
        }
        while(number <= threshold) {
            number *= 2;
            count++;
        }
        return count - 1;
    }

    public boolean isPrime(int number) {
       int count = 2;
       if(number == 1) {
           return false;
       }
        while(count < number) {
            if(number % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }
}
