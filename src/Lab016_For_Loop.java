public class Lab016_For_Loop {
    public static void main(String[] args) {
        String input = "meenal";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase(); // Make case-insensitive

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ((ch >= 'a' && ch <= 'z')) { // Check only alphabet characters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}