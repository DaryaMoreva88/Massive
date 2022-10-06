import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int [] weight = new int [3];
        weight [0] = 1;
        int oneWeight = weight[0];
        System.out.println(oneWeight);
        weight [0] = 2;
        int twoWeight = weight[0];
        System.out.println(twoWeight);
        weight [0] = 3;
        int threeWeight = weight[0];
        System.out.println(threeWeight);
        double [] weightTwo = {1.57, 7.654, 9.986};
        weightTwo [0] = 1.57;
        double oneWeightTwo = weightTwo[0];
        System.out.println(oneWeightTwo);
        weightTwo [0] = 7.654;
        double twoWeightTwo = weightTwo[0];
        System.out.println(twoWeightTwo);
        weightTwo [0] = 9.986;
        double threeWeightTwo = weightTwo[0];
        System.out.println(threeWeightTwo);
        int [] garden = new int [3];
        garden [0] = 1;
        int oneGarden = garden [0];
        System.out.println(oneGarden);
        garden [0] = 3;
        int twoGarden = garden [0];
        System.out.println(twoGarden);
        garden [0] = 5;
        int threeGarden = garden [0];
        System.out.println(threeGarden);

        //Задание 2
        System.out.println("Задание 2");
        int [] weightA = new int [3];
        weightA [0] = 1;
        int oneWeightA = weightA[0];
        System.out.print(oneWeightA + ", ");
        weightA [0] = 2;
        int twoWeightA = weightA[0];
        System.out.print(twoWeightA+ ", ");
        weightA [0] = 3;
        int threeWeightA = weightA[0];
        System.out.print(threeWeightA);
        System.out.println();
        double [] weightTwoA = {1.57, 7.654, 9.986};
        weightTwoA [0] = 1.57;
        double oneWeightTwoA = weightTwoA[0];
        System.out.print(oneWeightTwoA + ", ");
        weightTwoA [0] = 7.654;
        double twoWeightTwoA = weightTwoA[0];
        System.out.print(twoWeightTwoA + ", ");
        weightTwoA [0] = 9.986;
        double threeWeightTwoA = weightTwoA[0];
        System.out.print(threeWeightTwoA);
        System.out.println();
        int [] gardenA = new int [3];
        gardenA [0] = 1;
        int oneGardenA = gardenA [0];
        System.out.print(oneGardenA + ", ");
        gardenA [0] = 3;
        int twoGardenA = gardenA [0];
        System.out.print(twoGardenA + ", ");
        gardenA [0] = 5;
        int threeGardenA = gardenA [0];
        System.out.println(threeGardenA);

        //Задание 3
        System.out.println("Задание 3");
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        for (int i = number.length -1; i >= 0; i--){
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        double [] numberA = new double [3];
        numberA [0] = 1.57;
        numberA [1] = 7.654;
        numberA [2] = 9.986;
        for (int i = numberA.length -1; i >= 0; i--){
            System.out.print(numberA[i] + ", ");}
            System.out.println();
        int [] numberB = new int [3];
        numberB [0] = 1;
        numberB [1] = 3;
        numberB [2] = 5;
        for (int i = numberB.length -1; i >= 0; i--){
            System.out.print(numberB[i] + ", ");
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        int [] number1 = new int [3];
        number1 [0] = 1;
        number1 [1] = 2;
        number1 [2] = 3;
        for (int i = 0; i < number1.length; i++){
            if (number1[i]%2 !=0)
            { number1[i]++;}
                System.out.print(number1[i] + " ");
        }

    }
}