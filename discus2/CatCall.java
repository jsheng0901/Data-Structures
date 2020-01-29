public class CatCall{
	public static void main(String[] args) {
		Cat a = new Cat("Cream", "Meow!");
 	 	Cat b = new Cat("Tubbs", "Nyan!");
 	 	a.play();
 	 	b.play();
 	 	Cat.anger();
 	 	a.calm();
 	 	a.play();
 	 	b.play();
 	}
}

/** Nyan! I'm Cream the cat!
	Nyan! I'm Tubbs the cat!
	nyan! I'm Cream the cat!
	nyan! I'm Tubbs the cat!
	Becasue the static variable will share the same name for same class
	In here is a and b, thus "Nyan" in b will share to a. 
**/