package be_study.exp;

public class Exp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		
		arr = null;		///NullPointerException
		arr[5] = 10;	/// 이 줄만 썼을때 ArrayIndexOutOfBoundsException
		
		
		// ArrayIndexOutOfBoundsException //빨간줄 안떠
		// NullPointerException	
		
		
		try {
			int n = 10 / 0;
			//arr = null;		///NullPointerException
			arr[5] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOUtOfBoundsException catch block");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException catch block");
		} catch (Exception e) {
			System.out.println("위에 ");
		}
		
		
	}

}
