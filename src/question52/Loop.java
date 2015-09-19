package question52;

public class Loop {

	public static void main(String[] args) {
		int arr[][] = {{3,2,1}, {5,4,2}, {0,8,7}};
		outer:for (int x = 0, k = 0; x < 3;x++){
			k = 0;
			inner: while(true){
				System.out.println(arr[x][k++]);
				if(k == 3) break;
			}
		}
	}

}
