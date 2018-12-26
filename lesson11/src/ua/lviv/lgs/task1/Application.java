package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Random random = new Random();
		Integer [] arrayOfInt = {random.nextInt(1000),random.nextInt(1000),random.nextInt(1000),random.nextInt(1000),random.nextInt(1000),
				random.nextInt(1000),random.nextInt(1000),random.nextInt(1000),random.nextInt(1000),random.nextInt(1000),random.nextInt(1000)};
		System.out.println(Arrays.toString(arrayOfInt));
		Arrays.sort(arrayOfInt);
		System.out.println(Arrays.toString(arrayOfInt));
		Arrays.sort(arrayOfInt, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrayOfInt));
	}


}
