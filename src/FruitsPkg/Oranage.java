
//These are fruits
package FruitsPkg;

import java.util.Random;

public class Oranage {
    public Oranage() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;


    public double getDistance()
    {
        Random random = null;
        try {
            random = new Random();
        } catch (Exception e) {
            e.printStackTrace();
        }

        double nextDouble = random.nextDouble();

        //System.out(nextDouble


        return nextDouble;
    }
}
