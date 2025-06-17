public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29, count = 0;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                count++;
                break;
            }
        }
        System.out.println(count == 0 ? "Prime" : "Not Prime");
    }
}
