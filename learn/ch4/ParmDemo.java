class ChkNum {
	//return true if x is even
	boolean isEven(int x){
		if (x%2==0) return true;
		else return false;
	}
}

class Factor {
	//return true if x is even
	boolean isFactor(int a, int b){
		if (b%a==0) return true;
		else return false;
	}
}
class ParmDemo{
	public static void main(String args[]){
		ChkNum e = new ChkNum();
		Factor x = new Factor();

		if (e.isEven(10)) System.out.println("10 is isEven.");
		if (e.isEven(9)) System.out.println("9 is isEven.");
		if (e.isEven(8)) System.out.println("8 is isEven.");

		if (x.isFactor(2, 20)) System.out.println("2 is fator of 20.");
		if (x.isFactor(3, 20)) System.out.println("this won't be displayed.");
	}
}
