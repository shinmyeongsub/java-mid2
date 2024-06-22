package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        System.out.println();
        int hashCode = hashCode("AB");
        System.out.println(hashCode);

        // hashIndex
        System.out.println("hashIndex = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex = " + hashIndex(hashCode("AB")));
        System.out.println("hashIndex = " + hashIndex(hashCode("BA")));
    }

    static int hashCode(String str) {
        // AB -> 65 + 66
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
