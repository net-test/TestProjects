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

    public int size;


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
