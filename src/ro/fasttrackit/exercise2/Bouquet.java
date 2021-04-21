package ro.fasttrackit.exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bouquet {
	public final Set<String> flowers = new HashSet<>(List.of("rose", "tulip", "lily", "lavender"));

	public Set<String> getAll() {
		return flowers;
	}

	public Set<String> addFlower(String flower) {
		flowers.add(flower);
		return flowers;
	}

	public Set<String> removeFlower() {
		flowers.remove("lily");
		return flowers;
	}
}
