import java.util.Scanner;
public class BladesofGlory {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double biggest_score = 0;
        double smallest_score = 10.1;
        double total_score = 0;
        double total_judge_scores = 7;
        for (int judge = 1; judge <= 9; judge++) {
            System.out.println("Please enter Judge #" + judge + "'s score: ");
            double score = input.nextDouble();
        // for loop written so it will ask user input 9 times for 9 judges and print which judge is giving the score
            while (score < 0 || score >10) {
                System.out.println("Please enter Judge #" + judge + "'s score: ");
                score = input.nextDouble();
            }
            // while loop is to validate that user input is between 0 to 10
            if (score > biggest_score) {
                biggest_score = score;
            }
            // if statement is to find biggest value out of all user inputs
            // if user input (score) is bigger than biggest_score then biggest_score will = score
            else if (score < smallest_score) {
                smallest_score = score;
            }
            // else statement is to find smallest value out of all user inputs
            // if user input is less than smallest score then smallest score = score
            total_score += score;
            // adds up all of the user input (score) together
        }
        double average_score = (total_score - biggest_score - smallest_score) / total_judge_scores;
        // total user input subtracted by biggest score and smallest score divided by 7 judge score will give the avg
        System.out.println("Your final score is " + average_score);

    }
}

// 1.) The name of the Russian female figure skater who performed a routine in 2018 Winter Olympics dressed as Sailor Moon
// Evgenia Medvedeva
// 2.) Axel is the only jump with a forward takeoff making it the hardest jump were you start taking off with outside
// edge and landing on opposite foot. Lutz jump is counter-rotated meaning rotation of the jump is opposite of it's entry
// The Salchow jump starts from back inside edge and lands on back outside edge of opposite foot
// 3.) Brian Boitano was the Olympic figure skater that was immortalized in a song in the film SOuth Park: Bigger,
// Longer and Uncut
