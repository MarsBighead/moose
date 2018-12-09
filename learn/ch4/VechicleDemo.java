class Vechicle {
	int passengeers;
	int fuelcap;
	int mpg; // fuel assumption in miles per gallon
}

class VechicleDemo {
	public static void main(String args[]){
		Vechicle minivan = new Vechicle();
		Vechicle sportcar = new Vechicle();
		int range,range1;

		minivan.passengeers = 7;
		minivan.fuelcap = 16;
		minivan.mpg =21;

		sportcar.passengeers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg =12;

		range = minivan.fuelcap * minivan.mpg;
		range1 = sportcar.fuelcap * sportcar.mpg;
		System.out.println("Minivan can carry "+ minivan.passengeers + " with a range of "+range);
		System.out.println("Sportcar can carry "+ sportcar.passengeers + " with a range of "+range1);

	}
}
