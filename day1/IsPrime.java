package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9, i, j, count;

		  for (i = 1; i <= n; i++) {
		   count = 0;
		   for (j = 1; j <= i ; j++) {
		    if (i % j == 0) {
		     count++;
		     //break;
		    }
		   }

		   if (count == 2) {
		    System.out.println("Prime Number :" +i);
		   }
		   else if (count != 2) {
			    System.out.println("Non-Prime Number :" +i);
		  }
	}
  }
}
		  
	


