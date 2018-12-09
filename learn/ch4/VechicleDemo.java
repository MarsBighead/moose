class Vechicle {
	int passengeers;
	int fuelcap;
	int mpg; // fuel assumption in miles per gallon

	Vechicle(int p, int f, int m) {
		passengeers = p;
		fuelcap = f;
		mpg = m;
	}
	int range (){
		//System.out.println("Range is " + fuelcap * mpg);
		return fuelcap * mpg;
	}

	//Compute fuel needed for a give distance.
	double fuelneeded(int miles){
		return (double) miles/mpg;
	}
}

class VechicleDemo {
	public static void main(String args[]){
		Vechicle minivan = new Vechicle(7, 16, 21);
		Vechicle sportcar = new Vechicle(2, 14, 12);

		int dist = 252;


		System.out.println("Minivan can carry "+ minivan.passengeers + 
				" with range of " + minivan.range() + " miles."); 
		
		System.out.println("To go "+ dist + " miles minivan needs " + 
				minivan.fuelneeded(dist) + " gallons of fuel."); 

		System.out.println("Sportcar can carry "+ sportcar.passengeers + 
				" with range of " + sportcar.range() + " miles."); 
		
		System.out.println("To go "+ dist + " miles minivan needs " + 
				sportcar.fuelneeded(dist) + " gallons of fuel."); 


	}
}
