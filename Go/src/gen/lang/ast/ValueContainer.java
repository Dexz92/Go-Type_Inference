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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:6
 */
public class ValueContainer extends java.lang.Object {
  
    private int intValue;

  
    private float floatValue;

  
    private boolean boolValue;

  
    private String type;

  

    public ValueContainer(int value) {
      intValue = value;
      floatValue = (float) value;
      type = "int";
    }

  

    public ValueContainer(float value) {
      floatValue = value;
      intValue = (int) value;
      type = "float";
    }

  

    public ValueContainer(boolean value) {
       boolValue = value;
       type = "bool";
     }

  

     public int getInt() { return intValue; }

  

     public float getFloat() { return floatValue; }

  

     public boolean getBool() { return boolValue; }

  

     public String getType() { return type; }

  

     public void setValue(int value) {
       intValue = value;
       floatValue = (float) value;
     }

  

     public void setValue(float value) {
       floatValue = value;
       intValue = (int) value;
     }

  

     public void setValue(boolean value) {
       boolValue = value;
     }

  

     public String toString() {
       String stringRepresentation;
       if (type.equals("int")) {
         stringRepresentation = Integer.toString(intValue);
       } else if (type.equals("float")) {
         stringRepresentation = Float.toString(floatValue);
       } else {
         stringRepresentation = Boolean.toString(boolValue);
       }
       return stringRepresentation;
     }


}
