package resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape= new Shape[2];
        shape[1]= new Square(10);
        shape[2]=new Circle(12);
        System.out.println("truoc:  ");
        for (Shape s:shape) {
            System.out.println(s.toString());
        }
        double percent=Math.random()*100+1;
        for (int i=0;i<shape.length;i++){
        }
    }

}
