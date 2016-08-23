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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:34
 * @production Equal : {@link Condition};

 */
public class Equal extends Condition implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:295
   */
  public ValueContainer binaryOperation(ValueContainer left, ValueContainer right, String type) {
    if (type.equals("int")) {
      return new ValueContainer(left.getInt() == right.getInt());
    } else if (type.equals("float")) {
      return new ValueContainer(left.getFloat() == right.getFloat());
    } else {
      return new ValueContainer(left.getBool() == right.getBool());
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public Equal() {
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
    children = new ASTNode[3];
  }
  /**
   * @declaredat ASTNode:13
   */
  public Equal(Type p0, Expression p1, Expression p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public Equal clone() throws CloneNotSupportedException {
    Equal node = (Equal) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public Equal copy() {
    try {
      Equal node = (Equal) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public Equal fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public Equal treeCopyNoTransform() {
    Equal tree = (Equal) copy();
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
   * @declaredat ASTNode:95
   */
  public Equal treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
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
   * Replaces the Left child.
   * @param node The new node to replace the Left child.
   * @apilevel high-level
   */
  public void setLeft(Expression node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Left child.
   * @return The current node used as the Left child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Left")
  public Expression getLeft() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the Left child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Left child.
   * @apilevel low-level
   */
  public Expression getLeftNoTransform() {
    return (Expression) getChildNoTransform(1);
  }
  /**
   * Replaces the Right child.
   * @param node The new node to replace the Right child.
   * @apilevel high-level
   */
  public void setRight(Expression node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Right child.
   * @return The current node used as the Right child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Right")
  public Expression getRight() {
    return (Expression) getChild(2);
  }
  /**
   * Retrieves the Right child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Right child.
   * @apilevel low-level
   */
  public Expression getRightNoTransform() {
    return (Expression) getChildNoTransform(2);
  }
  /**
   * @apilevel internal
   */
  protected boolean operation_visited = false;
  @ASTNodeAnnotation.Attribute
  public String operation() {
    if (operation_visited) {
      throw new RuntimeException("Circular definition of attr: operation in class: org.jastadd.ast.AST.SynDecl");
    }
    operation_visited = true;
    String operation_value = "==";

    operation_visited = false;
    return operation_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set allowedType_Type_visited;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:50
   */
  @ASTNodeAnnotation.Attribute
  public boolean allowedType(Type t) {
    Object _parameters = t;
    if (allowedType_Type_visited == null) allowedType_Type_visited = new java.util.HashSet(4);
    if (allowedType_Type_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: allowedType in class: org.jastadd.ast.AST.SynDecl");
    }
    allowedType_Type_visited.add(_parameters);
    try {
    		return t.sameTypeAs(intType()) || t.sameTypeAs(floatType()) || t.sameTypeAs(boolType());
    	}
    finally {
      allowedType_Type_visited.remove(_parameters);
    }
  }
}
