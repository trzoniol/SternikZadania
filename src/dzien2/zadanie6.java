package dzien2;

public class zadanie6 {
	public static void main(String[] args) {
		int[][] values = {{3,8,16},{1,22,28,24},{3},{41,42}};
		
		int min;
		int max = 0;
		
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				if (values[i][j]>max) {
					max = values[i][j];
				}
				
			}
		}
		
		System.out.println(max);
		
		min = max;
		for (int[] is : values) {
			for (int i : is) {
				if(i<min)
					min = i;
			}
		}
		
		System.out.println(min);
	}
}
