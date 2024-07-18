
public class Q14_removeAllOccurenceOfA {

    static void removeA(String s, int i) {
        // base case
        int n = s.length();
        if (i == n) {
            return;
        }

        // recursive work and self work
        if (s.charAt(i) != 'a') {
            System.out.print(s.charAt(i));

        }

        removeA(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "abcadpoa";
        // remove all occurence of a
        removeA(s, 0);
    }
}
