public class compareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isPositive(-9));


    }

    public static boolean isEven(int number){
        return number % 2== 0;


    }
    public static boolean isPositive(int number){
        return number > 0;


    }


}
