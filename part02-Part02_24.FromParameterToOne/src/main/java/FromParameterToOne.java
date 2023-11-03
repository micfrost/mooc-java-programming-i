

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }


    //   defined method is above or under the main method but in this class.
    public static void  printFromNumberToOne(int number) {

        while(number>=1) {
            System.out.println(number);
            number--;
        }

    }

}
