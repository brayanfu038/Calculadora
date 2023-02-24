package model;
import java.util.*;
public class Operation {
	ArrayList<String> history;
	ArrayList<Long>numberHistory;
	public Operation() {
		history = new ArrayList<String>();
	}
	public void addAdditionHistory(long x,long y) {
		
		numberHistory.add((x+y));
		history.add(x+"+"+y+"="+(x+y));
	}
	public void addSubstractHistory(long x, long y) {
		numberHistory.add((x-y));
		history.add(x+"-"+y+"="+(x-y));
	}
	public void addMultiplicateHistory(long x,long y) {
		numberHistory.add((x*y));
		history.add(x+"*"+y+"="+(x*y));
	}
	public void addDivideHistory(long x,long y) {
		numberHistory.add((x/y));
		history.add(x+"/"+y+"="+(x/y));
	}
	public void organizateOperation() {
		long temp;
		for (int i = 0; i < numberHistory.size(); i++) {
			for (int j = 0; j < numberHistory.size(); j++) {
				if(numberHistory.get(i)<numberHistory.get(j)) {
					temp = numberHistory.get(i);
					numberHistory.set(i, numberHistory.get(j));
					numberHistory.set(j, temp);
				}
			}
		}
	}
}
