class Vechicle {
	int passengeers;
	int fuelcap;
	int mpg; // fuel assumption in miles per gallon
}

class VechicleDemo {
	public static void main(String args[]){
		Vechicle minivan = new Vechicle();
		int range;
		minivan.passengeers = 7;
		minivan.fuelcap = 16;
		minivan.mpg =21;

		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry "+ minivan.passengeers + " with a range of "+range);

	}
}
