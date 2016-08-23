package lang;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import beaver.Parser.Exception;

import lang.ast.ErrorMessage;
import lang.ast.Program;
import lang.ast.LangParser;
import lang.ast.LangScanner;

public class Interpreter{

  public static void main(String[] args){
    try{
      if (args.length == 1 || args.length == 2) {
        String filename = args[0];
        if(filename.indexOf('.') == -1){
          System.err.println("Unknown file");
          System.exit(1);
        }

        String extension = filename.substring(filename.indexOf('.'));
        if(!extension.equals(".go")){
          System.err.println("Unknown extension");
          System.exit(1);
        }

        LangScanner scanner = new LangScanner(new FileReader(filename));
        LangParser parser = new LangParser();
        Program program = (Program) parser.parse(scanner);

        if(args.length == 1){
          if(program.errors().isEmpty()){
            program.eval();
          } else {
            System.err.println("Compile-time errors found:");
            for(ErrorMessage err : program.errors()){
              System.err.println(err + " ");
            }
          }
        } else {
          if(program.errors().isEmpty()){
            String flag = args[1];
            if(flag.equals("ast")){
              System.out.println(program.dumpTree());
            } else {
              System.out.println("Unknown option");
            }
          }else {
            System.err.println("Compile-time errors found:");
            for(ErrorMessage err : program.errors()){
              System.err.println(err + " ");
            }
          }
        }
      } else {
        System.err.println("Argument Error");
        System.exit(1);
      }

    }catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace(System.err);
		} catch (Exception e) {
			e.printStackTrace();
    }
  }
}
