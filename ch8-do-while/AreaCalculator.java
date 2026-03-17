public class AreaCalculator {
    public static void main(String[] args) {
        int area = 0;
        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        r1.setHeight(4);
        area = r1.calculateArea();
        System.out.println("Rectangle Area: " + area);
    }
}