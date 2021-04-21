package ro.fasttrackit.exercise1;

import java.util.*;
import java.util.stream.Collectors;

public class Basket {
	public final List<String> fruits = new ArrayList<>(List.of("apple", "banana", "orange", "pear"));

	public boolean find(String fruit) {
		for (String myFruit : fruits) {
			if (fruit.equals(myFruit)) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String fruit) {
		for (String myFruit : fruits) {
			if (fruit.equals(myFruit)) {
				fruits.remove(fruit);
				return true;
			}
		}
		return false;
	}

	public int position(String fruit) {
		return fruits.indexOf(fruit);
	}

	public List<String> distinct() {
		List<String> distinctElements = fruits.stream().distinct().collect(Collectors.toList());
		return distinctElements;
	}

	public List<String> addFruit() {
		fruits.add(0, "avocado");
		return fruits;
	}

	public int count() {
		return fruits.size();
	}

	public int customCount() {
		int customCounter = 0;
		for (int i = 0; i < fruits.size(); i++) {
			customCounter++;
		}
		return customCounter;
	}
}