package quadratic;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Olivetti = new Scanner(System.in);
		double a;
		double b;
		double c;
		double[] roots = new double[2];
		
		//get values a,b,c
		 System.out.println("Please enter a value for a:");
		 a = Olivetti.nextDouble();
		 System.out.println("Please enter a value for b:");
		 b = Olivetti.nextDouble(); //
		 System.out.println("Please enter a value for c:"); 
		 c = Olivetti.nextDouble();
				
		//create Quadratic instance
		Quadratic Solver = new Quadratic(a,b,c);
//		System.out.println(Solver.getA());
//		System.out.println(Solver.getB());
//		System.out.println(Solver.getC());
		//get roots array 
		//for (int i = 0; i < roots.length; i++) {
		roots = Solver.computeRealRoots();
		//}
		//Format output for user
		if (Solver.hasRealRoots()) {
			//real roots
			System.out.println("You have entered the following coefficients: a = " + a + ", b = " + b +	", and c = " + c + ".\n" +
								"The discriminant is " + Solver.getDiscriminant() + ".\n" +
								"The solution has real roots x1 =" + roots[0] + " and x2 = " + roots[1] + ".\n" +
								"The slope (m) at x1 = " + Solver.slopeAtX(roots[0]) + " and the slope at x2 = " + Solver.slopeAtX(roots[1]) + ". \n" +
								"The equation is " + Solver);
		}
		else {
			//complex roots
			System.out.println("You have entered the following coefficients: a = " + a + ", b = " + b +	", and c = " + c + ".\n" +
								"The discriminant is complex number. \n" /* + Solver.getDiscriminant() + ".\n" */ +
								"The solution has complex roots" /*+ roots[0] + " and x2 = " + roots[1] */ + ".\n" +
								//"The slope (m) at x1 = " + Solver.slopeAtX(roots[0]) + " and the slope at x2 = " + Solver.slopeAtX(roots[1]) + ". \n" +
								"The equation is " + Solver);
		
		}
		
		
		//clean up
		Olivetti.close();
	}

}
