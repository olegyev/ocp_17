package by.olegyev.ocp17.classes;

import by.olegyev.ocp17.classes.TopLevelType; // redundant since in the same package
import by.olegyev.ocp17.classes.PackagePrivate; // redundant since in the same package
import by.olegyev.ocp17.classes.PackagePrivateDuplicate; // redundant since in the same package

/**
 * @link doc/classes.adoc
 */
public class AccessTopLevelType {

	public static void main(String[] args) {
		System.out.println("Hello from AccessTopLevelType main!");

		TopLevelType topLevelType = new TopLevelType();
		PackagePrivate packagePrivate = new PackagePrivate();
		PackagePrivateDuplicate packagePrivateDuplicate = new PackagePrivateDuplicate();

		topLevelType.greetings();
		packagePrivate.greetings();
		packagePrivateDuplicate.greetings();
	}

}