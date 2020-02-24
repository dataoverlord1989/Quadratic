package quadratic;

public class Quadratic {
	private double a;
	private double b;
	private double c;
	private boolean isNegDisc = true;
	
	/**
     * No-Args Constructor
	 */
	public Quadratic() {
		// set default values
		a = 1;
		b = 0;
		c = 0;
	}
	public Quadratic(double a,double b, double c) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
		
			
	}
	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		this.c = c;
	}
	/**
	 * @return the discriminant
	 */
	public double getDiscriminant() {
		double disc;
		disc = Math.sqrt((Math.pow(b, 2) - (4.0*a*c)));
		if (disc > 0) {
			isNegDisc = false;
		}
		return disc;
	}
	/**
	 * @return the solution has real roots
	 */
	public boolean hasRealRoots() {
		if (!isNegDisc) 
			return true;
		else
			return false;
	}	
	/**
	 * @return the solution has complex roots
	 */
	public boolean hasComplexRoots() {
		if (!isNegDisc)
			return false;
		else
			return true;
	}
	/**
	 * @return the roots as array of doubles
	 */
	public double[] computeRealRoots() {
		//get roots
		double x1 = 0;
		double x2 = 0;
		double[] roots = new double[2];
		//solve for first root
		x1 =  (-b + getDiscriminant())/(2.0 * a);
		//solve for second root
		x2 = (-b - getDiscriminant())/(2.0 * a);
		roots[0] = x1;
		roots[1] = x2;
		return roots;
				
	}
	/**
	 * @return the slope at X
	 */
	public double slopeAtX(double x) {
		//calculate slope at x
		return ((2 * a * x) + b); 
				
	}
	@Override
	public String toString() {
		return ( "x1,x2 = (((-)" + b + " +- SQRT((" + b + "*" + b + ") - (4*" + a + "*" + c +")))/" + "(2*" + a + ")");
	}
	

}
