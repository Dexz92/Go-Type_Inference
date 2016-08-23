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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:5
 * @production Expression : {@link ASTNode} ::= <span class="component">{@link Type}</span>;

 */
public abstract class Expression extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:249
   */
  public ValueContainer eval(ActivationRecord actrec){
    throw new RuntimeException("1");
  }
  /**
   * @declaredat ASTNode:1
   */
  public Expression() {
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
  public Expression(Type p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public Expression clone() throws CloneNotSupportedException {
    Expression node = (Expression) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:48
   */
  @Deprecated
  public abstract Expression fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:56
   */
  public abstract Expression treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public abstract Expression treeCopy();
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
   * @attribute syn
   * @aspect ToString
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:33
   */
  @ASTNodeAnnotation.Attribute
  public abstract String toString();
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:12
   */
  @ASTNodeAnnotation.Attribute
  public abstract Type evaluatedType();
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   */
  @ASTNodeAnnotation.Attribute
  public boolean typeConflict() {
    if (typeConflict_visited) {
      throw new RuntimeException("Circular definition of attr: typeConflict in class: org.jastadd.ast.AST.InhDecl");
    }
    typeConflict_visited = true;
    boolean typeConflict_value = getParent().Define_typeConflict(this, null);

    typeConflict_visited = false;
    return typeConflict_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean typeConflict_visited = false;
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:89
   */
  @ASTNodeAnnotation.Attribute
  public String typeErrorMsg() {
    if (typeErrorMsg_visited) {
      throw new RuntimeException("Circular definition of attr: typeErrorMsg in class: org.jastadd.ast.AST.InhDecl");
    }
    typeErrorMsg_visited = true;
    String typeErrorMsg_value = getParent().Define_typeErrorMsg(this, null);

    typeErrorMsg_visited = false;
    return typeErrorMsg_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean typeErrorMsg_visited = false;
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:51
   */
    if (typeConflict()) {
      {
        Program ref = (Program) (program());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
    super.collect_contributors_Program_errors();
  }
  protected void contributeTo_Program_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_Program_errors(collection);
    if (typeConflict())
      collection.add(error(typeErrorMsg()));
  }

}
