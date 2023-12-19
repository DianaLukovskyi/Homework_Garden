package garden;

public class Tree extends Plant {
    public Tree(String name, int height, int age) {
       super(name,height,age);

    }

    public void doSpring() {
        System.out.println(name + " has grown in Spring " + height);
    }

    public void doSummer() {
        System.out.println(name + " is not growing in Summer " + height);
    }

    public void doAutumn() {
        System.out.println(name + " is being cut in Autumn" + height);

    }

    public void doWinter() {
        System.out.println(name + "is dormant in Winter");
    }
}