import java.util.ArrayList;
import java.util.List;

public class HelloWord {
	private String bimat;
	protected String hoibimat;
	public String khongbimat;
	
	

	public static void main(String args[]){
		int[] arrayTest = {-1,2,3,4,5,3,9};
		List<Integer> arrayX = new ArrayList<Integer>();
		if(arrayTest.length==0){
			System.out.println("mang rong");
		}else{
			int maxArray = arrayTest[0];
			int minArray = arrayTest[0];
			MaxMinElement(arrayTest, maxArray, minArray);
			System.out.println("Max: "+maxArray);
			System.out.println("Min: "+minArray);
			System.out.println("So phan tu chan: "+ countElementChan(arrayTest));
			// show phan tu giong x
			arrayX= getPhantuX(2, arrayTest);
			if(arrayX.size()==0){
				System.out.println("Khong co phan tu x");
			}else{
				System.out.println("Cac phan tu x la: ");
			}
		}
		
		
	}
	
	
	public static void MaxMinElement(int[] array, int max, int min){
		int lenght = array.length;
		
		for(int i=1; i<lenght; i++){
			if(array[i]>max) max= array[i];
			if(array[i]<min) min= array[i];
		}
		
	}
	
	public static int countElementChan(int[] array){
		int count =0;
		for(int i=0; i<array.length; i++){
			if(array[i]%2==0) count++;
		}
		return count;
	}
	
	public static List<Integer> getPhantuX(int x, int[] array){
		List<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0; i<array.length; i++){
			if(array[i] == x) arrayList.add(i);
		}
		return arrayList;
	}
}




