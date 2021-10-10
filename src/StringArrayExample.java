/* here's an example of working with arrays of strings. */

public class StringArrayExample {
    protected static String message = "The quick brown fox jumped over the lazy dog.";

    public static void loopExample() {
        /* recall that split() returns an array of Strings. */

        String[] words = message.split(" ");
        /* arrays have an instance variable called length         */
        int len = words.length;
        /* we access each element with the [] operator. Don't forget that the first element is 0!
         */
        System.out.println(words[0]);

        /* We can also iterate through an array with a for loop. */
        for(int i = 0; i < len; i++) {
            System.out.println(words[i]);
        }
    }

    /* but what if we get the end condition of the for loop wrong? */
    public static void badLoopExample() {

        String[] words = message.split(" ");
        /* arrays have an instance variable called length         */
        int len = words.length;

        /* We can also iterate through an array with a for loop. */
        for(int i = 0; i <= words.length; i++) { // <--- what's wrong here?
            System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        StringArrayExample.loopExample();
        StringArrayExample.badLoopExample();
    }

}
