class Vechicle {
	int passengeers;
	int fuelcap;
	int mpg; // fuel assumption in miles per gallon

	void range (){
		System.out.println("Range is " + fuelcap * mpg);
	}
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

		System.out.print("Minivan can carry "+ minivan.passengeers + ". "); 
		minivan.range();
		System.out.print("Sportcar can carry "+ sportcar.passengeers + ". ");
		sportcar.range();

	}
}
