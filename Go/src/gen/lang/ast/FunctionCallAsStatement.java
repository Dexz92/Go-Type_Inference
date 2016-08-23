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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:17
 * @production FunctionCallAsStatement : {@link Statement} ::= <span class="component">{@link FunctionCallAsExpression}</span>;

 */
public class FunctionCallAsStatement extends Statement implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:151
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
    getFunctionCallAsExpression().eval(actrec);
  }
  /**
   * @declaredat ASTNode:1
   */
  public FunctionCallAsStatement() {
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
  public FunctionCallAsStatement(FunctionCallAsExpression p0) {
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
  public FunctionCallAsStatement clone() throws CloneNotSupportedException {
    FunctionCallAsStatement node = (FunctionCallAsStatement) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public FunctionCallAsStatement copy() {
    try {
      FunctionCallAsStatement node = (FunctionCallAsStatement) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public FunctionCallAsStatement fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public FunctionCallAsStatement treeCopyNoTransform() {
    FunctionCallAsStatement tree = (FunctionCallAsStatement) copy();
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
   * @declaredat ASTNode:93
   */
  public FunctionCallAsStatement treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the FunctionCallAsExpression child.
   * @param node The new node to replace the FunctionCallAsExpression child.
   * @apilevel high-level
   */
  public void setFunctionCallAsExpression(FunctionCallAsExpression node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the FunctionCallAsExpression child.
   * @return The current node used as the FunctionCallAsExpression child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="FunctionCallAsExpression")
  public FunctionCallAsExpression getFunctionCallAsExpression() {
    return (FunctionCallAsExpression) getChild(0);
  }
  /**
   * Retrieves the FunctionCallAsExpression child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the FunctionCallAsExpression child.
   * @apilevel low-level
   */
  public FunctionCallAsExpression getFunctionCallAsExpressionNoTransform() {
    return (FunctionCallAsExpression) getChildNoTransform(0);
  }
}
