public class Main {

    public static void main(String[] args) {
        Clarinet clarinet = new Clarinet("red", 4, "jack");
        System.out.println(clarinet);
        System.out.println(clarinet.play());

        Saxaphone saxaphone = new Saxaphone("blue", 3,"jane");
        System.out.println(saxaphone);
        System.out.println(saxaphone.play());

        Flute flute = new Flute("yellow", 2, "john");
        System.out.println(flute);
        System.out.println(flute.play());
    }
}
