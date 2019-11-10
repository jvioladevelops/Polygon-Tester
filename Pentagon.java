

/**
 * A five-sided regular polygon
 *
 * @author Justin Viola
 */

 public class Pentagon extends Polygon {
    float a =5;
/**
     * Pentagon constructor sets nSides and calculates the interior angle.
     *
     * @param length
     */
    public Pentagon (double length) {
        super(length, 5); // call Polygon's constructor
    }

/**
     * Calculate the area of the Pentagon
     *
     * @return the area
     */
    @Override // Polygon has an area method.
    public double area() {
        return (double) Math.sqrt(super.getSideLength() * (super.getSideLength() + 2 
        * (Math.sqrt(super.getSideLength()))) * a * a ) /4;
    }
/**
     * Return a string representation of this object
     *
     * @return the string representation of this object
     */
    @Override // Polygon has a toString method.
    public String toString() {
        return String.format("A pentagon with %d sides of length %f", 5 , super.getSideLength());
    }   
 }
