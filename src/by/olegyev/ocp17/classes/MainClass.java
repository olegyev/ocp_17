package by.olegyev.ocp17.classes;

import by.olegyev.ocp17.classes.external.ExternalDependency;

/**
 * @link doc/classes.adoc
 */
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello from AccessTopLevelType main!");

		PublicDependency publicDependency = new PublicDependency();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		publicDependency.greetings();
		packagePrivate.greetings();
		packagePrivateDuplicate.greetings();

		ExternalDependency externalDependency = new ExternalDependency();
		externalDependency.greetings();
	}

}