package Array;

public class RectTesting {
    /**
     * Main Function
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        System.out.println(rectangle.intersection(new Rectangle(4, 3, 2, 1)));
        System.out.println(rectangle.isInside(2, 3));
        System.out.println(rectangle.union(new Rectangle(4, 3, 2, 1)));
    }
}
