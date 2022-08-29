package by.olegyev.ocp17.classes;

/**
 * @link doc/classes.adoc
 */
public class TopLevelType {

	public void greetings() {
		System.out.println("Hello from Top-Level Public Type!");
	}

	public static void main(String[] args) {
		System.out.println("Hello from TopLevelType main!");

		TopLevelType topLevelType = new TopLevelType();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		topLevelType.greetings();
		packagePrivate.greetings();
		packagePrivateDuplicate.greetings();
	}

}

class PackagePrivate {

	public void greetings() {
		System.out.println("Hello from Package-Private!");
	}

	public static void main(String[] args) {
		System.out.println("Hello from PackagePrivate main!");

		TopLevelType topLevelType = new TopLevelType();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		topLevelType.greetings();
		packagePrivate.greetings();
		packagePrivateDuplicate.greetings();
	}

}

class PackagePrivateDuplicate {

	public void greetings() {
		System.out.println("Hello from Package-Private Duplicate!");
	}

	public static void main(String[] args) {
		System.out.println("Hello from PackagePrivateDuplicate main!");

		TopLevelType topLevelType = new TopLevelType();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		topLevelType.greetings();
		packagePrivate.greetings();
		packagePrivateDuplicate.greetings();
	}

}