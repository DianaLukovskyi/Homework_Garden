package garden;

public class Garden {
    public static void main(String[] args) {
        Flower flower = new Flower("Tulip ", 30, 1);
        Tree tree = new Tree("Pine", 60, 1);

        System.out.println(flower.name + "has height " + flower.height + "is" +
                flower.age + "year old");
        System.out.println(tree.name + "has height " + tree.height + "is"
                + tree.age + "year old");

    }

    static void growPlants(Plant... plants) {
        for (int year = 1; year <= 2; year++) {
            System.out.println("Growing plants for year " + year);
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();


            }


        }
    }
}
