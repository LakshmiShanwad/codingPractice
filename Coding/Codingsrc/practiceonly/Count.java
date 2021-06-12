package practiceonly;

public class Count {

	public static void main(String[] args) {
		
		//{1,0,0,1,1,0,1,0,1,3} 
		
		int a[] ={1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0} ;
		int temp = 0;
		 for(int i = 0 ;i< a.length;i++)
		 {
			 for(int j = i+1 ;j<a.length;j++)
			 {
				 if(a[i] ==0 && a[j]==1)
				 {
					 temp = a[i];
					 a[i]= a[j];
					 a[j]= temp;
				 }
			 }
		 }
		 for(int i=0;i<a.length;i++){
				System.out.print(a[i] + " ");
		
		
	}

}
}

