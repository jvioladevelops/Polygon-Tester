

/**
 * Test the polygon code
 *
 * @author Justin Viola 
 */
public class PolygonTest {

    public static void main(String args[]) {
        Polygon poly; // demonstrating polymorphism
        Pentagon pent = new Pentagon(5.0);
        //Polygon p2 = new Polygon(5.0, 4); polygon is an abstract class cant use same name

        System.out.printf("The area of a pentagon with side %f is %f\n",
                pent.getSideLength(), pent.area());
        poly = pent;
        System.out.printf("Accessing pentagon through poly, area is %f\n",
                poly.area());

        // Polymorphism in general
        Object obj;
        Integer i = 42;
        obj = i;
        System.out.printf("Accessing Integer through obj, string '%s'\n",
                obj.toString());

        // Error testing

        try {
            ErrorTestPolygon et = new ErrorTestPolygon(1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ErrorTestPolygon caused IllegalArgumentException");
            System.out.println(e.getMessage());
        }
    }
}
