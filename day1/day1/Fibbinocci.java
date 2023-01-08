package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			      int firstNum, secNum, sum, i, n;
			      n = 11;
			      firstNum = 0;
			      secNum = 1;
			      System.out.print(firstNum+" "+secNum);
			      for(i = 1; i <= n; i++) {
			         sum = firstNum + secNum;
			         System.out.print(" ");
			         System.out.print(sum);
			         firstNum = secNum;
			         secNum = sum;
	      }
	   }
	}
	

