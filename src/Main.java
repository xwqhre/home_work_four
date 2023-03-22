public class Main {
    public static void main(String[] args) {

        int number[] = {2,10, 11, 4, 55, 5990, 88192, 22, 102};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0){
                System.out.println(number[i]);
            }
        }
    }
}