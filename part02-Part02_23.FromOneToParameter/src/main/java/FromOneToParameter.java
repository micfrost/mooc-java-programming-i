

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }

//   defined method is above or under the main method but in this class.
    public static void  printUntilNumber(int number) {
        int i = 1;

        while(i<=number) {
            System.out.println(i);
            i++;
        }

    }

}
