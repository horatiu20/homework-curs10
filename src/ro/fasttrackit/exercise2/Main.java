package ro.fasttrackit.exercise2;

/*Create an objects that model bouquet of flowers. Each flower has to be unique. We don't care how the flowers are ordered.
a) getAll(): Collection<String>  - returns all the flowers
b) add(String)                   - adds a flower (remember to keep them unique)
c) remove(String)                - removes a flower*/

public class Main {
	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();
		bouquet.getAll();
		bouquet.addFlower();
		bouquet.removeFlower();
	}
}
