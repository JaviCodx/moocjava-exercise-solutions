
public class Statistics {

    private int count, sum;
    
    

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        
        
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
        
    }

    public double average() {
        
        double average = (double)this.sum / this.count;
        if (this.sum == 0) {
            return 0;
        } else {
        return average;
        }
    }
}
