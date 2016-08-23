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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:21
 * @production If : {@link ControlStatement} ::= <span class="component">Cond:{@link Expression}</span> <span class="component">Body:{@link Block}</span> <span class="component">[Else:{@link Block}]</span>;

 */
public class If extends ControlStatement implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:177
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
    if (hasShortStatement()) {
      getShortStatement().eval(actrec);
    }
    if(getCond().eval(actrec).getBool() == true){
      getBody().eval(actrec);
    }else{
      if(hasElse()){
        getElse().eval(actrec);
      }
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public If() {
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
    children = new ASTNode[4];
    setChild(new Opt(), 0);
    setChild(new Opt(), 3);
  }
  /**
   * @declaredat ASTNode:15
   */
  public If(Opt<Statement> p0, Expression p1, Block p2, Opt<Block> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 4;
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
  public If clone() throws CloneNotSupportedException {
    If node = (If) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:49
   */
  public If copy() {
    try {
      If node = (If) clone();
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
  public If fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public If treeCopyNoTransform() {
    If tree = (If) copy();
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
  public If treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the optional node for the ShortStatement child. This is the <code>Opt</code>
   * node containing the child ShortStatement, not the actual child!
   * @param opt The new node to be used as the optional node for the ShortStatement child.
   * @apilevel low-level
   */
  public void setShortStatementOpt(Opt<Statement> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) ShortStatement child.
   * @param node The new node to be used as the ShortStatement child.
   * @apilevel high-level
   */
  public void setShortStatement(Statement node) {
    getShortStatementOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ShortStatement child exists.
   * @return {@code true} if the optional ShortStatement child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasShortStatement() {
    return getShortStatementOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ShortStatement child.
   * @return The ShortStatement child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Statement getShortStatement() {
    return (Statement) getShortStatementOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ShortStatement child. This is the <code>Opt</code> node containing the child ShortStatement, not the actual child!
   * @return The optional node for child the ShortStatement child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ShortStatement")
  public Opt<Statement> getShortStatementOpt() {
    return (Opt<Statement>) getChild(0);
  }
  /**
   * Retrieves the optional node for child ShortStatement. This is the <code>Opt</code> node containing the child ShortStatement, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ShortStatement.
   * @apilevel low-level
   */
  public Opt<Statement> getShortStatementOptNoTransform() {
    return (Opt<Statement>) getChildNoTransform(0);
  }
  /**
   * Replaces the Cond child.
   * @param node The new node to replace the Cond child.
   * @apilevel high-level
   */
  public void setCond(Expression node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Cond child.
   * @return The current node used as the Cond child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Cond")
  public Expression getCond() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the Cond child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Cond child.
   * @apilevel low-level
   */
  public Expression getCondNoTransform() {
    return (Expression) getChildNoTransform(1);
  }
  /**
   * Replaces the Body child.
   * @param node The new node to replace the Body child.
   * @apilevel high-level
   */
  public void setBody(Block node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Body child.
   * @return The current node used as the Body child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Body")
  public Block getBody() {
    return (Block) getChild(2);
  }
  /**
   * Retrieves the Body child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Body child.
   * @apilevel low-level
   */
  public Block getBodyNoTransform() {
    return (Block) getChildNoTransform(2);
  }
  /**
   * Replaces the optional node for the Else child. This is the <code>Opt</code>
   * node containing the child Else, not the actual child!
   * @param opt The new node to be used as the optional node for the Else child.
   * @apilevel low-level
   */
  public void setElseOpt(Opt<Block> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) Else child.
   * @param node The new node to be used as the Else child.
   * @apilevel high-level
   */
  public void setElse(Block node) {
    getElseOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Else child exists.
   * @return {@code true} if the optional Else child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasElse() {
    return getElseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Else child.
   * @return The Else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Block getElse() {
    return (Block) getElseOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * @return The optional node for child the Else child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Else")
  public Opt<Block> getElseOpt() {
    return (Opt<Block>) getChild(3);
  }
  /**
   * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Else.
   * @apilevel low-level
   */
  public Opt<Block> getElseOptNoTransform() {
    return (Opt<Block>) getChildNoTransform(3);
  }
  /**
   * @apilevel internal
   */
  protected boolean returnStatement_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:232
   */
  @ASTNodeAnnotation.Attribute
  public boolean returnStatement() {
    if (returnStatement_visited) {
      throw new RuntimeException("Circular definition of attr: returnStatement in class: org.jastadd.ast.AST.SynDecl");
    }
    returnStatement_visited = true;
    try {
    		if(hasElse()){
    			return getBody().returnStatement() && getElse().returnStatement();
    		}else{
    			return false;
    		}
    	}
    finally {
      returnStatement_visited = false;
    }
  }
}
