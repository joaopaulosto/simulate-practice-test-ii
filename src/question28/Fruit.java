package question28;


import java.util.ArrayList;
import java.util.List;


public class Fruit {
	
	public static void main(String[] args) {
		List<Mango> mangoes = new ArrayList<Mango>();
		mangoes.add(new Mango());
		addFruits(mangoes);
		mangoes.add(new Mango());
		
		for(Mango m: mangoes){
			System.out.println(m.toString());
		}

	}
	private static void addFruits(List fruits){
		fruits.add(new Apple());
	}
	public String toString(){
		return "Fruit";
	}
}

