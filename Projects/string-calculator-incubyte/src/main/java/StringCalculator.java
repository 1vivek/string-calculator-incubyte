public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty())
            return 0;
        int sum = 0;
        String negativeNumbers = "";
        String[] numbers = input.split(",|\\n|//|;");
        for (String number : numbers) {
            if (!number.isEmpty()) {
                int positiveNum = Integer.parseInt(number);
                if (positiveNum >= 0) {
                    sum += positiveNum;
                } else {
                    negativeNumbers += number.concat(",");
                }
            }
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed " + negativeNumbers.substring(0, negativeNumbers.length() - 1));
        }
        return sum;
    }
}
