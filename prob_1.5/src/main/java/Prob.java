public class Prob {
    public static String input(String input) {

        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuffer buffer = new StringBuffer();
        int lastCount = 1;
        char lastChar = input.charAt(0);
        buffer.append(lastChar);

        for (int idx = 1; idx < input.length(); idx++) {
            if (lastChar == input.charAt(idx)) {
                lastCount++;
            } else {
                buffer.append(lastCount);
                lastChar = input.charAt(idx);
                lastCount = 1;
                buffer.append(lastChar);
            }

            if (buffer.length() >= input.length()) {
                return input;
            }
        }

        buffer.append(lastCount);


        return buffer.toString();
    }
}
