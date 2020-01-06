package hinhhoc;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        rectangle = new Rectangle(2, 3, "orange", true);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
    }

