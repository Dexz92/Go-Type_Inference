package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.HashSet;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:84
 */
public class ReturnStatement extends Exception {
  
    private ValueContainer valueContainer;

  

    public ReturnStatement() {
      super();
    }

  

    public ReturnStatement(ValueContainer value) {
      super();
      valueContainer = value;
    }

  

    public ReturnStatement(String message) {
        super(message);
    }

  

    public boolean hasValue() {
      return valueContainer != null;
    }

  

    public ValueContainer getValue() {
      return valueContainer;
    }


}
