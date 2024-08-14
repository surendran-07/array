package surendran01;

public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50};
		System.out.println("the elements of the array");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
			
		}
		System.out.println("sum of the variables"+sum);
	}

}
