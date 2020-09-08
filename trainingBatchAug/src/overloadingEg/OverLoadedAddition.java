package overloadingEg;

public class OverLoadedAddition {
	
	public int add(int n1  , int n2) {
		return n1+n2;
	}
	
	public double add(double n1 , double n2) {
		return n1+n2;
	}
	
	public int add(int ...n) {
		int add =0;
		for (int i = 0; i < n.length; i++) {
			add =add+n[i];
		}
		return add;
	}
	public double add(double ...n) {
		double add =0;
		for (int i = 0; i < n.length; i++) {
			add =add+n[i];
		}
		return add;
	}

}
