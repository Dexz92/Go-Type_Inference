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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:3
 * @production Statement : {@link ASTNode};

 */
public abstract class Statement extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:245
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
    throw new RuntimeException("1");
  }
  /**
   * @declaredat ASTNode:1
   */
  public Statement() {
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
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:15
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:21
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public Statement clone() throws CloneNotSupportedException {
    Statement node = (Statement) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:44
   */
  @Deprecated
  public abstract Statement fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:52
   */
  public abstract Statement treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:60
   */
  public abstract Statement treeCopy();
  /**
   * @apilevel internal
   */
  protected boolean newDeclaration_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean newDeclaration() {
    if (newDeclaration_visited) {
      throw new RuntimeException("Circular definition of attr: newDeclaration in class: org.jastadd.ast.AST.SynDecl");
    }
    newDeclaration_visited = true;
    boolean newDeclaration_value = false;

    newDeclaration_visited = false;
    return newDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean identifierName_visited = false;
  @ASTNodeAnnotation.Attribute
  public String identifierName() {
    if (identifierName_visited) {
      throw new RuntimeException("Circular definition of attr: identifierName in class: org.jastadd.ast.AST.SynDecl");
    }
    identifierName_visited = true;
    String identifierName_value = "";

    identifierName_visited = false;
    return identifierName_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean returnStatement_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean returnStatement() {
    if (returnStatement_visited) {
      throw new RuntimeException("Circular definition of attr: returnStatement in class: org.jastadd.ast.AST.SynDecl");
    }
    returnStatement_visited = true;
    boolean returnStatement_value = false;

    returnStatement_visited = false;
    return returnStatement_value;
  }
  /**
   * @attribute inh
   * @aspect LinkedFunction
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:3
   */
  @ASTNodeAnnotation.Attribute
  public FunctionDeclaration linkedFunction() {
    if (linkedFunction_visited) {
      throw new RuntimeException("Circular definition of attr: linkedFunction in class: org.jastadd.ast.AST.InhDecl");
    }
    linkedFunction_visited = true;
    FunctionDeclaration linkedFunction_value = getParent().Define_linkedFunction(this, null);

    linkedFunction_visited = false;
    return linkedFunction_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean linkedFunction_visited = false;
  /**
   * @attribute inh
   * @aspect UniqueNamesAndIndexes
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:10
   */
  @ASTNodeAnnotation.Attribute
  public String idIndex() {
    if (idIndex_visited) {
      throw new RuntimeException("Circular definition of attr: idIndex in class: org.jastadd.ast.AST.InhDecl");
    }
    idIndex_visited = true;
    String idIndex_value = getParent().Define_idIndex(this, null);

    idIndex_visited = false;
    return idIndex_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean idIndex_visited = false;
}
