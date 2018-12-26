package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Random random = new Random();
		String [] material = {"шкіра","алькантара"};
		int x = random.nextInt(5)+2;
		int y = random.nextInt(5)+2;
		Auto [] [] array = new Auto[x][y];
		for (int i=0;i<x;i++) {
			for (int j=0;j<y;j++) {
				array[i][j] = new Auto(random.nextInt(100),random.nextInt(28)+1990, new Helm(random.nextInt(10)+20,material[random.nextInt(2)]), new Motor(random.nextInt(4)+4));
			}
		}
		Auto [] array1 = new Auto[x];
		for (int l=0;l<x;l++) {
			array1[l] = new Auto(random.nextInt(100),random.nextInt(28)+1990, new Helm(random.nextInt(10)+20,material[random.nextInt(2)]), new Motor(random.nextInt(4)+4));
			
		}

		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.deepToString(array1));
		Arrays.sort(array1);
		System.out.println(Arrays.deepToString(array1));
		Arrays.sort(array1, new SortAuto());
		System.out.println(Arrays.deepToString(array1));
	}

}
