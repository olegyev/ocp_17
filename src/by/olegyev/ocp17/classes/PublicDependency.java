package by.olegyev.ocp17.classes;

/**
 * @link doc/classes.adoc
 */
public class PublicDependency {

	public void greetings() {
		System.out.println("Hello from Top-Level Public Type!");
	}

	public static void main(String[] args) {
		System.out.println("Hello from TopLevelType main!");

		PublicDependency publicDependency = new PublicDependency();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		publicDependency.greetings();
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

		PublicDependency publicDependency = new PublicDependency();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		publicDependency.greetings();
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

		PublicDependency publicDependency = new PublicDependency();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		publicDependency.greetings();
		packagePrivate.greetings();
		packagePrivateDuplicate.greetings();
	}

}