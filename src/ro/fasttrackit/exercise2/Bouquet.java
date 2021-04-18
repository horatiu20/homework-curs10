package ro.fasttrackit.exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bouquet {
	public final Set<String> flowers = new HashSet<>(List.of("rose", "tulip", "lily", "lavender"));

	public void getAll() {
		System.out.println(flowers);
	}

	public void addFlower() {
		flowers.add("daisy");
		System.out.println(flowers);
	}

	public void removeFlower() {
		flowers.remove("lily");
		System.out.println(flowers);
	}
}
