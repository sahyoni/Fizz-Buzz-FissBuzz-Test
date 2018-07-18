public class FizzBuzz {

    public static String getResult(long score) {

        if (score % 15 == 0) {
            return "fizzbuzz";
        } else if (score % 5 == 0) {
            return "buzz";
        } else if (score % 3 == 0) {
            return "fizz";
        } else {
            return String.valueOf(score);
        }
    }
}
