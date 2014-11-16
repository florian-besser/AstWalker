package visitor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;

final class WrongLogClassVisitor extends ASTVisitor {

	Set<String> types = new HashSet<String>();

	public boolean visit(TypeDeclaration node) {
		SimpleName name = node.getName();
		//System.out.println("Declaration of type '" + name + "' at line " + cu.getLineNumber(name.getStartPosition()));
		
		types.add(name.toString());
		return true;
	}

	public boolean visit(FieldDeclaration node) {
		String name = node.toString();
		//System.out.println("Declaration of field '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		if (name.contains("LOGGER") || name.contains("logger")) {
			boolean contained = false;
			for (String type : types) {
				if (name.contains(type)) {
					contained = true;
					break;
				}
			}
			
			if (contained) {
				//System.out.print("Probably OK: Class " + types + " with Field " + name);
			} else {
				System.out.print("Probably BAD: Class " + types + " with Field " + name);
			}
		}
		return true;
	}
}