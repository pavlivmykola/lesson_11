package ua.lviv.lgs.task2;

import java.util.Comparator;

public class SortAuto implements Comparator<Auto>{

	@Override
	public int compare(Auto a0, Auto a1) {
		return a1.getHoursePower()-a0.getHoursePower();
	}

}
