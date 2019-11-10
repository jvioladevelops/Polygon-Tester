

/**
 * A four-sided regular polygon
 *
 * @author Kenneth Ingham
 */
public class Square extends Polygon {

    /**
     * Square constructor sets nSides and calculates the interior angle.
     *
     * @param length
     */
    public Square(double length) {
        super(length, 4); // call Polygon's constructor
    }

    /**
     * Calculate the area of the square
     *
     * @return the area
     */
    @Override // Polygon has an area method.
    public double area() {
        return super.getSideLength() * super.getSideLength();
    }
}
