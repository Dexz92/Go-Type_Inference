package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lang.ast.ErrorMessage;
import lang.ast.Program;

import java.util.Set;

/**
 * Tests AST dumping
 * @author Jesper Öqvist <jesper.oqvist@cs.lth.se>
 */
@RunWith(Parameterized.class)
public class TestInterpreter extends AbstractParameterizedTest {
	/**
	 * Directory where test files live
	 */
	private static final String TEST_DIR = "testfiles/interpreter";

	/**
	 * Construct a new JastAdd test
	 * @param testFile filename of test input file
	 */
	public TestInterpreter(String testFile) {
		super(TEST_DIR, testFile);
	}

	/**
	 * Run the JastAdd test
	 */
	@Test
	public void runTest() throws Exception {
    PrintStream out = System.out;
		Program program = (Program) parse(inFile);
		StringBuilder sb = new StringBuilder();

		Set<ErrorMessage> errors = program.errors();
		if(!errors.isEmpty()){
			for(ErrorMessage m : program.errors()){
				sb.append(m).append("\n");
			}
			compareOutput(sb.toString(), outFile, expectedFile);
			return;
		}else{

			try {
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						System.setOut(new PrintStream(baos));
						program.eval();
						compareOutput(baos.toString(), outFile, expectedFile);

			} catch(RuntimeException e){
				compareOutput(e.getMessage(), outFile, expectedFile);
			} catch(Exception e){
				fail(e.getMessage());
			} finally {
						System.setOut(out);
			}
		}

}

	@SuppressWarnings("javadoc")
	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return getTestParameters(TEST_DIR);
	}
}
