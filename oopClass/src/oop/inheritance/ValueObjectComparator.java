package oop.inheritance;

import java.util.Comparator;

public class ValueObjectComparator implements Comparator<ValueObject>{

	@Override
	public int compare(ValueObject o1, ValueObject o2) {
		if(o1.isFlag() == o2.isFlag()) {
			return(o1.getValue() < o2.getValue()) ? -1 : ((o1.getValue() == o2.getValue()) ? 0 : 1);
		}
		else {
			return o1.isFlag() ? -1 : 1;
		}
	}

}
