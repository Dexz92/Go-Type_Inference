/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.13 */
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
 * @ast node
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:51
 * @production Float64 : {@link Value};

 */
public class Float64 extends Value implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:236
   */
  public ValueContainer eval(ActivationRecord actrec){
    return new ValueContainer(Float.parseFloat(getValue()));
  }
  /**
   * @declaredat ASTNode:1
   */
  public Float64() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  public Float64(Type p0, String p1) {
    setChild(p0, 0);
    setValue(p1);
  }
  /**
   * @declaredat ASTNode:17
   */
  public Float64(Type p0, beaver.Symbol p1) {
    setChild(p0, 0);
    setValue(p1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:42
   */
  public Float64 clone() throws CloneNotSupportedException {
    Float64 node = (Float64) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:49
   */
  public Float64 copy() {
    try {
      Float64 node = (Float64) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:68
   */
  @Deprecated
  public Float64 fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public Float64 treeCopyNoTransform() {
    Float64 tree = (Float64) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:98
   */
  public Float64 treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Value == ((Float64)node).tokenString_Value);    
  }
  /**
   * Replaces the Type child.
   * @param node The new node to replace the Type child.
   * @apilevel high-level
   */
  public void setType(Type node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Type child.
   * @return The current node used as the Type child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Type")
  public Type getType() {
    return (Type) getChild(0);
  }
  /**
   * Retrieves the Type child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Type child.
   * @apilevel low-level
   */
  public Type getTypeNoTransform() {
    return (Type) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme Value.
   * @param value The new value for the lexeme Value.
   * @apilevel high-level
   */
  public void setValue(String value) {
    tokenString_Value = value;
  }
  /**
   * JastAdd-internal setter for lexeme Value using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Value
   * @apilevel internal
   */
  public void setValue(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setValue is only valid for String lexemes");
    tokenString_Value = (String)symbol.value;
    Valuestart = symbol.getStart();
    Valueend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Value.
   * @return The value for the lexeme Value.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Value")
  public String getValue() {
    return tokenString_Value != null ? tokenString_Value : "";
  }
  /**
   * @apilevel internal
   */
  protected boolean evaluatedType_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:66
   */
  @ASTNodeAnnotation.Attribute
  public Type evaluatedType() {
    if (evaluatedType_visited) {
      throw new RuntimeException("Circular definition of attr: evaluatedType in class: org.jastadd.ast.AST.SynDecl");
    }
    evaluatedType_visited = true;
    try {
    		return floatType();
    	}
    finally {
      evaluatedType_visited = false;
    }
  }
}
