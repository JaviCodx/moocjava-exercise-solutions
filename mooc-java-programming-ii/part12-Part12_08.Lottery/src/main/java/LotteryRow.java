
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    
    private ArrayList<Integer> numbers;
    
    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }
    
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
    
    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random randomNumber = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        
        while (this.numbers.size() < 7) {
            
            int random = randomNumber.nextInt(40) + 1;
            if (!this.containsNumber(random)) {
                this.numbers.add(random);
            }
            
        }
        
    }
    
    public boolean containsNumber(int number) {
        
        if (this.numbers.contains(number)) {
            return true;
        }
        
        return false;
    }
}
