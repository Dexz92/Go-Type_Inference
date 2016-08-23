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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:25
 * @production Return : {@link Statement} ::= <span class="component">[Value:{@link Expression}]</span>;

 */
public class Return extends Statement implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:198
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
      if (hasValue()) {
      throw new ReturnStatement(getValue().eval(actrec));
    } else {
      throw new ReturnStatement();
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public Return() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Return(Opt<Expression> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public Return clone() throws CloneNotSupportedException {
    Return node = (Return) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public Return copy() {
    try {
      Return node = (Return) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public Return fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Return treeCopyNoTransform() {
    Return tree = (Return) copy();
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
   * @declaredat ASTNode:94
   */
  public Return treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:101
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the optional node for the Value child. This is the <code>Opt</code>
   * node containing the child Value, not the actual child!
   * @param opt The new node to be used as the optional node for the Value child.
   * @apilevel low-level
   */
  public void setValueOpt(Opt<Expression> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Value child.
   * @param node The new node to be used as the Value child.
   * @apilevel high-level
   */
  public void setValue(Expression node) {
    getValueOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Value child exists.
   * @return {@code true} if the optional Value child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasValue() {
    return getValueOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Value child.
   * @return The Value child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expression getValue() {
    return (Expression) getValueOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Value child. This is the <code>Opt</code> node containing the child Value, not the actual child!
   * @return The optional node for child the Value child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Value")
  public Opt<Expression> getValueOpt() {
    return (Opt<Expression>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Value. This is the <code>Opt</code> node containing the child Value, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Value.
   * @apilevel low-level
   */
  public Opt<Expression> getValueOptNoTransform() {
    return (Opt<Expression>) getChildNoTransform(0);
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
    boolean returnStatement_value = true;

    returnStatement_visited = false;
    return returnStatement_value;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    if (caller == getValueOptNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:200
      {
      		Type expectedReturnType = linkedFunction().getReturnType();
      		return !getValue().evaluatedType().sameTypeAs(expectedReturnType);
      	}
    }
    else {
      return getParent().Define_typeConflict(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:89
   * @apilevel internal
   */
  public String Define_typeErrorMsg(ASTNode caller, ASTNode child) {
    if (caller == getValueOptNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:205
      {
      		Type expectedReturnType = linkedFunction().getReturnType();
      		return "Trying to return " + getValue().evaluatedType() +
      						" in " + expectedReturnType + " function";
      	}
    }
    else {
      return getParent().Define_typeErrorMsg(this, caller);
    }
  }
}
