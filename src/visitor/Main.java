package visitor;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class Main {

	public static void main(String[] args) throws IOException {
		parseFilesInDir();
	}

	// loop directory to get file list
	private static void parseFilesInDir() throws IOException {
		File root = new File("/home/sam/workspace/sam/src/");
		
		Collection<File> files = FileUtils.listFiles(root, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		for (File f : files) {
			if (f.isFile()) {
				parse(FileUtils.readFileToString(f));
			}
		}
	}

	// use ASTParse to parse string
	private static void parse(String str) {
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(str.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);

		cu.accept(new DebugVisitor(cu));
		cu.accept(new WrongLogClassVisitor());

	}
}