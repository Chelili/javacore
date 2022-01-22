public class Main {
    public static void main(String[] args) {

        Box<Orange> orangeBox =new Box<>();
        orangeBox.boxFruits.add(new Orange());
        orangeBox.boxFruits.add(new Orange());
        orangeBox.boxFruits.add(new Orange());


        Box<Orange> orangeBox2 =new Box<>();
        orangeBox2.boxFruits.add(new Orange());
        orangeBox2.boxFruits.add(new Orange());


        Box<Apple> appleBox = new Box<>();
        appleBox.boxFruits.add(new Apple());
        appleBox.boxFruits.add(new Apple());
        appleBox.boxFruits.add(new Apple());

        System.out.println(appleBox.boxFruits.size());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));

        System.out.println(orangeBox.getWeight() + " " + orangeBox2.getWeight());
        orangeBox.removeFruitsToAnotherBox(orangeBox2);
        System.out.println(orangeBox.getWeight() + " " + orangeBox2.getWeight());

    }
}
