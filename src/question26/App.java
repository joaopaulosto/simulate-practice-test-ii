package question26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {

	public static void main(String[] args) throws Exception {
		try(BufferedReader br= new BufferedReader(new FileReader("/var/www/html/sistemapedidos/index.html")); 
				BufferedWriter bw = new BufferedWriter(new FileWriter("foo.txt"))){
			System.out.println("File open");
			
		}
	}
}
