public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        int intArray = weight[0];
        int intArray2 = weight[1];
        int intArray3 = weight[2];
        double[] doubleNum = {1.57, 7.654, 9.9986};
        double num1 = doubleNum[0];
        double num2 = doubleNum[1];
        double num3 = doubleNum[2];
        int[] birthdays = new int[3];
        birthdays[0] = 13;
        birthdays[1] = 27;
        birthdays[2] = 3;
        int birth = birthdays[0];
        int birth2 = birthdays[1];
        int birth3 = birthdays[2];

        //Task 2
        System.out.println(intArray + ", " + intArray2 + ", " + intArray3);
        System.out.println(num1 + ", " + num2 + ", " + num3);
        System.out.println(birth + ", " + birth2 + ", " + birth3);

        //Task 3
        System.out.println(intArray3 + ", " + intArray2 + ", " + intArray);
        System.out.println(num3 + ", " + num2 + ", " + num1);
        System.out.println(birth3 + ", " + birth2 + ", " + birth);

        //Task 4
        int[] Numbers = new int[]{1, 2, 3};
        int numbersArray1 = Numbers[0];
        int numbersArray2 = Numbers[1];
        int numbersArray3 = Numbers[2];
        for (int i = 0; i < 3; i++) {
            numbersArray1 = numbersArray1 + 1;
            numbersArray3 = numbersArray3 + 1;
            System.out.println(numbersArray1 + ", " + numbersArray2 + ", " + numbersArray3);
        }


    }
    }