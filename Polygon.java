//package org.cnm.polygons;

/**
 * An abstract class for a convex polygon
 *
 * @author Kenneth Ingham
 * @author Justin Viola
 */
public abstract class Polygon extends Object { //abstract prevents you from doing "new polygon" so you cant create a new kind of polygon

    private double sideLength;
    private double interiorAngle; // the angle between sides on the inside of the polygon
    private int nSides;

    /**
     * Constructor for a polygon
     *
     * @param length the polygon side length
     * @param nSides the number of sides
     */
    public Polygon(double length, int nSides) {
        validateLength(length);
        sideLength = length;
        if (nSides <= 2) {
            throw new IllegalArgumentException(
                    String.format("Invalid number of sides %d must be >= 3", nSides));
        }
        this.nSides = nSides;
        interiorAngle = (nSides - 2.0) * 180.0 / nSides;
    }

    /**
     * ensure that length is > 0 or throw an IllegalArgumentException.
     *
     * @param length the polygon side length
     */
    private final void validateLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    String.format("Invalid polygon side length %f", length));
        }
    }

    /**
     * getter for side length
     *
     * @return the side length
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * getter for side angle
     *
     * @return the side angle
     */
    public double getInteriorAngleRadian() {
        return Math.PI * interiorAngle / 180.0;
    }

    /**
     * Getter for the interior angle instance variable.
     * @return the interior angle for the polygon
     */
    public double getInteriorAngleDegree() {
        return interiorAngle;
    }

    /**
     * getter for number of sides
     *
     * @return the number of sides
     */
    public int getNSides() {
        return nSides;
    }

    /**
     * setter for polygon side length.
     *
     * @param length the polygon side length
     */
    public void setSideLength(double length) {
        validateLength(length);
        sideLength = length;
    }

    /**
     * Calculate the area of the polygon
     *
     * @return the area
     */
    public abstract double area(); //abstract method must be there in all subclasses
    // could use this: https://www.wikihow.com/Find-the-Area-of-Regular-Polygons

    /**
     * Return a string representation of this object
     *
     * @return the string representation of this object
     */
    @Override // Object has a toString method.
    public String toString() {
        return String.format("A polygon with %d sides of length %f", nSides, sideLength);
    }

    /**
     * Compare with a different polygon for equality. Equality is the same
     * number of sides and side length.
     *
     * @param p the other polygon to compare to
     * @return if the two are equivalent
     */
    //@Override
    public boolean equals(Polygon p) {
        return nSides == p.nSides && sideLength == p.sideLength;
    }
}
