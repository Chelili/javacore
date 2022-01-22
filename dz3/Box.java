import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> boxFruits;

    public Box() {
        this.boxFruits = new ArrayList<>();
    }

    public double getWeight() {
        if (boxFruits.isEmpty())
            return 0;
        else {
            return boxFruits.size() * boxFruits.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> anotherBox) {
        if (this.getWeight() == anotherBox.getWeight()) {
            return true;
            } else {
            return false;
    }
        }

        public void removeFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.boxFruits.addAll(this.boxFruits);
        this.boxFruits.clear();
        }
    }



