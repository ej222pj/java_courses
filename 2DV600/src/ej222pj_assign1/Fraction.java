/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Fraction.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 6 sep 2016 : @time 18:31:53
 *
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int n, int d) throws Exception {
        setNumerator(n);
        setDenominator(d);
        this.simplify();
    }
    
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public boolean isNegative(){
        return (((double)this.numerator / (double)this.denominator) < 0);
    }

    public Fraction add(Fraction fract) throws Exception{
        int numerator = 0;
        int denominator = 0;
        try{
        	numerator = ((fract.numerator * this.denominator)) + (this.numerator * fract.denominator);
        	denominator = (this.denominator * fract.denominator);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction fract) throws Exception{
        Fraction frac = new Fraction(((
        		this.getNumerator() * fract.getDenominator()) -
                (fract.getNumerator() * this.getDenominator())),
                (this.getDenominator() * fract.getDenominator()));

        return frac;
    }

    public Fraction multiply(Fraction fract) throws Exception {
        Fraction frac = new Fraction(((this.getNumerator() * 1) *
                (1 * this.getDenominator())),
                (this.getDenominator() * fract.getDenominator()));

        return frac;
    }

    public Fraction divide(Fraction fract) throws Exception{
        Fraction frac = new Fraction((this.getNumerator() * fract.getDenominator()), (this.getDenominator() * fract.getNumerator()));

        return frac;
    }
    
    public boolean isEqualTo(Fraction fract){
        return this.getDenominator() * fract.getNumerator() == this.getNumerator() * fract.getDenominator();
    }
    
    public String toString(){
        return "Fraction: " + this.getNumerator() + "/" + this.getDenominator();
    }

    public void simplify(){
        int numerator = this.getNumerator();
        int denominator = this.getDenominator();
        
        while(denominator != 0){
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        this.numerator /= numerator;
        this.denominator /= numerator;
    }

    private void setNumerator(int numerator){
        this.numerator = numerator;
    }

    private void setDenominator(int denominator) throws Exception {
        try{
            if(denominator == 0){
                throw new Exception("Denominator cannot be zero!");
            }
            this.denominator = denominator;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}