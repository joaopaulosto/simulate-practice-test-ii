package question22;

public class Teste {

	public static void main(String[] args) {
		try{
			System.out.println(args[0]);
		}finally{
			System.out.println("An Exception was throwsn");
		}
		System.out.println("Out of Main");
	}

}
