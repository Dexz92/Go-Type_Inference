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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:64
 */
public class ActivationRecord extends java.lang.Object {
  
    private LinkedHashMap<String, ValueContainer> records;

  

    public ActivationRecord(){
      records = new LinkedHashMap<String, ValueContainer>();
    }

  

    public void put(String name, ValueContainer container){
      records.put(name, container);
    }

  

    public ValueContainer get(String name){
      return records.get(name);
    }

  

    public Set<Entry<String, ValueContainer>> entrySet() {
      return records.entrySet();
    }


}
