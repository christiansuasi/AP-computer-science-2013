
public class ReverseArray {
	public static void main(String[]args){
		int[]arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		
		for(int j=0; j<arr.length/2;j++){
			int temp=arr[j];
			arr[j]=arr[arr.length-j-1];
			arr[arr.length-j-1]=temp;
		}
		
		
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
			
		}
		
		
	}
}
