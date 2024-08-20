public class StringCalculator {

    public int add(String input) {
        if (!input.isEmpty() && !input.contains(","))
            return Integer.parseInt(input);

        return 0;
    }
}
