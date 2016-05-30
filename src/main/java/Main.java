public class Main {
    public static void main(String[] args) {
        int bottleCount = 3;
        String bottles = "bottles";

        while (bottleCount > 0) {

            System.out.println(bottleCount + " " + bottles + " of beer on the wall");
            System.out.println(bottleCount + " " + bottles + " of beer");
            System.out.println("take one down");
            System.out.println("pass it around");
            bottleCount--;
            if (bottleCount == 1) {
                bottles = "bottle";
            }

            if (bottleCount == 0) {
                System.out.println("no more bottles of beer on the wall.");
            } else {
                System.out.println(bottleCount + " " + bottles + " of beer on the wall.");
            }

        }

    }
}
