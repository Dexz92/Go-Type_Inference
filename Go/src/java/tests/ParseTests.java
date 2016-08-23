package tests;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ParseTests extends AbstractTestSuite {
	public ParseTests() {
		super("testfiles/parser");// where test input files are
	}

	@Test
	public void emptyMain() {
		testValidSyntax("emptyMain.go");
	}

	@Test
	public void extensiveHelpFunc() {
		testValidSyntax("extensiveHelpFunc.go");
	}

	@Test
	public void extensiveShortAssign() {
		testValidSyntax("extensiveShortAssign.go");
	}

	@Test
	public void ForTest(){
		testValidSyntax("for.go");
	}

	@Test
	public void helpFuncWithParam() {
		testValidSyntax("helpFuncWithParam.go");
	}

	@Test
	public void helpFuncWithParams() {
		testValidSyntax("helpFuncWithParams.go");
	}

	@Test
	public void ifTest(){
		testValidSyntax("if.go");
	}

	@Test
	public void incorrectVariableDeclaration(){
		testSyntaxError("incorrectVariableDeclaration.go");
	}

	@Test
	public void inferredVarToVarAssign() {
		testValidSyntax("inferredVarToVarAssign.go");
	}

	@Test
	public void simpleGlobalVariables() {
		testValidSyntax("simpleGlobalVariables.go");
	}

	@Test
	public void simpleHelpFunc() {
		testValidSyntax("simpleHelpFunc.go");
	}

	@Test
	public void simpleInferredVarAssign() {
		testValidSyntax("simpleInferredVarAssign.go");
	}

	@Test
	public void simpleVarAssign() {
		testValidSyntax("simpleVarAssign.go");
	}

	@Test
	public void varDeclaration() {
		testValidSyntax("varDeclaration.go");
	}

	@Test
	public void varToVarAssign() {
		testValidSyntax("varToVarAssign.go");
	}
}
