package ro.fasttrackit.exercise1;

/*Create an object Basket that holds the fruits.
a) find(String):boolean             - finds if received fruit is in the list and returns true/false
b) remove(String): boolean          - removes the received string, returns true/false if found
c) position(String):int             - returns the position on which the received fruit is in the basket
d) distinct(): Collection<String>   - returns an unique collection containing all fruits once
e) add(String)                      - adds a fruit to the basket
f) count():int                      - count the fruits
g) customCount():int                - count the fruits without using size method (use a loop control statement + counter)*/

public class Main {
	public static void main(String[] args) {
		Basket basket = new Basket();
		System.out.println(basket.find("lemon"));
		System.out.println(basket.remove("pear"));
		System.out.println(basket.position("banana"));
		System.out.println(basket.distinct());
		System.out.println(basket.addFruit());
		System.out.println(basket.count());
		System.out.println(basket.customCount());
	}
}
