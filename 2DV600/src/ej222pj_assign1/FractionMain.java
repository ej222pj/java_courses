/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name FractionMain.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 6 sep 2016 : @time 17:40:04
 *
 */
public class FractionMain {
	
    public static void main(String args[]) throws Exception
    {
        Fraction frac = new Fraction(2,6);
        Fraction frac2 = new Fraction(2, 4);
        System.out.println(frac.toString());
        System.out.println(frac2.toString());
        System.out.println("Is it equal: " + frac.isEqualTo(frac2));

        Fraction addedFrac = frac.add(frac2);
        System.out.println("Addition: " + addedFrac.toString());
        System.out.println("Negative: " + addedFrac.isNegative());
        Fraction subFrac = frac.subtract(frac2);
        System.out.println("Subtraction: " + subFrac.toString());
        System.out.println("Negative: " + subFrac.isNegative());
        Fraction multiplyFrac = frac.multiply(frac2);
        System.out.println("Multiplication: " + multiplyFrac.toString());
        Fraction divideFrac = frac.divide(frac2);
        System.out.println("Division: " + divideFrac.toString());
    }
}
