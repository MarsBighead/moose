class Vechicle {
	int passengeers;
	int fuelcap;
	int mpg; // fuel assumption in miles per gallon

	int range (){
		//System.out.println("Range is " + fuelcap * mpg);
		return fuelcap * mpg;
	}
}

class VechicleDemo {
	public static void main(String args[]){
		Vechicle minivan = new Vechicle();
		Vechicle sportcar = new Vechicle();

		minivan.passengeers = 7;
		minivan.fuelcap = 16;
		minivan.mpg =21;

		sportcar.passengeers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg =12;

		System.out.println("Minivan can carry "+ minivan.passengeers + 
				" with range of " + minivan.range() + " miles."); 
		System.out.println("Sportcar can carry "+ sportcar.passengeers + 
				" with range of " + sportcar.range() + " miles."); 

	}
}
