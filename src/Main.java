import objects.Dog;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setColor("Red");
        System.out.println("Dog color is "+dog.getColor());

        String set = dog.color = "black";
        String get = dog.color;
        System.out.println("Set Color from variable: "+set);
        System.out.println("Get Color from variable: "+get);

        System.out.println(dog.getColor());
    }
}