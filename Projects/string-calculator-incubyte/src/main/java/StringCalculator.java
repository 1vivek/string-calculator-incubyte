public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty())
            return 0;
        int sum = 0;
        String[] numbers = input.split(",|\\n");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
