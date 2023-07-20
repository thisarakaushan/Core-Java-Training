package mypackage;

abstract class Salary{
	
public int getPF(int basic) {
		
		return 12*basic/100;
	}
	
	public int getHRA(int basic) {
		
		return 40*basic/100;
	}
	
	public abstract int getCA();
	
	public abstract int getSA();
	
}

public class AbstractionMethod extends Salary {
	
	public int getCA() {
		
		return 5000;
	}
	
	public int getSA() {
		
		return 10000;
	}

class  IBM extends Salary {
	
	public int getCA() {
		
		return 6000;
	}
	
	public int getSA() {
		
		return 8000;
	}
}

}
