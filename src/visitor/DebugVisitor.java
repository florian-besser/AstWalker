package visitor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BlockComment;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CharacterLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Comment;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;

final class DebugVisitor extends ASTVisitor {

	Set<String> types = new HashSet<String>();
	private CompilationUnit cu;
	
	public DebugVisitor(CompilationUnit cu) {
		this.cu = cu;
	}

	public boolean visit(AnnotationTypeDeclaration node) {
		SimpleName name = node.getName();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(name.getStartPosition()));
		return true;
	}

	public boolean visit(AnnotationTypeMemberDeclaration node) {
		SimpleName name = node.getName();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(name.getStartPosition()));
		return true;
	}

	public boolean visit(AnonymousClassDeclaration node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}
	
	public boolean visit(ArrayAccess node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(ArrayCreation node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(ArrayInitializer node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(ArrayType node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(AssertStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(Assignment node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(Block node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		return true;
	}

	public boolean visit(BlockComment node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
	
	public boolean visit(BooleanLiteral node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
	
	public boolean visit(BreakStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
	
	public boolean visit(CastExpression node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
	
	public boolean visit(CatchClause node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
	
	public boolean visit(CharacterLiteral node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
	
	public boolean visit(ClassInstanceCreation node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(Comment node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(CompilationUnit node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(ConditionalExpression node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(ConstructorInvocation node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(ContinueStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(DoStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(EmptyStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(EnhancedForStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	public boolean visit(EnumConstantDeclaration node) {
		SimpleName name = node.getName();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(name.getStartPosition()));
		
		return true;
	}

	public boolean visit(EnumDeclaration node) {
		SimpleName name = node.getName();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(name.getStartPosition()));
		
		return true;
	}

	public boolean visit(ExpressionStatement node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}

	//TODO

	public boolean visit(TypeDeclaration node) {
		SimpleName name = node.getName();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(name.getStartPosition()));
		
		return true;
	}

	public boolean visit(FieldDeclaration node) {
		String name = node.toString();
		System.out.println(node.getClass().getName() + " '" + name + "' at line " + cu.getLineNumber(node.getStartPosition()));
		
		return true;
	}
}