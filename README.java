import java.util.Scanner;
public class BladesofGlory {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    for (int judge = 1; judge <= 10; judge++) {
        System.out.println("Please enter Judge #" + judge + "'s score: ");
        double score = input.nextDouble();
        while (score < 0 || score >10) {
            System.out.println("Please enter Judge #" + judge + "'s score: ");
            score = input.nextDouble();
        }
        
        }
    }
}
