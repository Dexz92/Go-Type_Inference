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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:20
 * @production For : {@link ControlStatement} ::= <span class="component">[Cond:{@link Expression}]</span> <span class="component">[{@link Assignment}]</span> <span class="component">Body:{@link Block}</span>;

 */
public class For extends ControlStatement implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:155
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
    if (hasShortStatement()) {
      getShortStatement().eval(actrec);
    }

    if (hasCond()) {
      while(getCond().eval(actrec).getBool() == true){
        getBody().eval(actrec);
        if (hasAssignment()) {
          getAssignment().eval(actrec);
        }
      }
    } else {
      while(true) {
        getBody().eval(actrec);
        if (hasAssignment()) {
          getAssignment().eval(actrec);
        }
      }
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public For() {
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
    setChild(new Opt(), 1);
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:16
   */
  public For(Opt<Statement> p0, Opt<Expression> p1, Opt<Assignment> p2, Block p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public For clone() throws CloneNotSupportedException {
    For node = (For) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:50
   */
  public For copy() {
    try {
      For node = (For) clone();
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
   * @declaredat ASTNode:69
   */
  @Deprecated
  public For fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public For treeCopyNoTransform() {
    For tree = (For) copy();
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
   * @declaredat ASTNode:99
   */
  public For treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:106
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
   * Replaces the optional node for the Cond child. This is the <code>Opt</code>
   * node containing the child Cond, not the actual child!
   * @param opt The new node to be used as the optional node for the Cond child.
   * @apilevel low-level
   */
  public void setCondOpt(Opt<Expression> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Cond child.
   * @param node The new node to be used as the Cond child.
   * @apilevel high-level
   */
  public void setCond(Expression node) {
    getCondOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Cond child exists.
   * @return {@code true} if the optional Cond child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasCond() {
    return getCondOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Cond child.
   * @return The Cond child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expression getCond() {
    return (Expression) getCondOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Cond child. This is the <code>Opt</code> node containing the child Cond, not the actual child!
   * @return The optional node for child the Cond child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Cond")
  public Opt<Expression> getCondOpt() {
    return (Opt<Expression>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Cond. This is the <code>Opt</code> node containing the child Cond, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Cond.
   * @apilevel low-level
   */
  public Opt<Expression> getCondOptNoTransform() {
    return (Opt<Expression>) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Assignment child. This is the <code>Opt</code>
   * node containing the child Assignment, not the actual child!
   * @param opt The new node to be used as the optional node for the Assignment child.
   * @apilevel low-level
   */
  public void setAssignmentOpt(Opt<Assignment> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Assignment child.
   * @param node The new node to be used as the Assignment child.
   * @apilevel high-level
   */
  public void setAssignment(Assignment node) {
    getAssignmentOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Assignment child exists.
   * @return {@code true} if the optional Assignment child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasAssignment() {
    return getAssignmentOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Assignment child.
   * @return The Assignment child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Assignment getAssignment() {
    return (Assignment) getAssignmentOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Assignment child. This is the <code>Opt</code> node containing the child Assignment, not the actual child!
   * @return The optional node for child the Assignment child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Assignment")
  public Opt<Assignment> getAssignmentOpt() {
    return (Opt<Assignment>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Assignment. This is the <code>Opt</code> node containing the child Assignment, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Assignment.
   * @apilevel low-level
   */
  public Opt<Assignment> getAssignmentOptNoTransform() {
    return (Opt<Assignment>) getChildNoTransform(2);
  }
  /**
   * Replaces the Body child.
   * @param node The new node to replace the Body child.
   * @apilevel high-level
   */
  public void setBody(Block node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Body child.
   * @return The current node used as the Body child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Body")
  public Block getBody() {
    return (Block) getChild(3);
  }
  /**
   * Retrieves the Body child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Body child.
   * @apilevel low-level
   */
  public Block getBodyNoTransform() {
    return (Block) getChildNoTransform(3);
  }
  /**
   * @apilevel internal
   */
  protected boolean evaluatedType_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:22
   */
  @ASTNodeAnnotation.Attribute
  public Type evaluatedType() {
    if (evaluatedType_visited) {
      throw new RuntimeException("Circular definition of attr: evaluatedType in class: org.jastadd.ast.AST.SynDecl");
    }
    evaluatedType_visited = true;
    try {
    		return getCond().evaluatedType();
    	}
    finally {
      evaluatedType_visited = false;
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    if (caller == getCondOptNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:114
      {
      			boolean conflict = false;
      			Type valueType = getCond().evaluatedType();
      			if(!valueType.sameTypeAs(boolType())){
      				conflict = true;
      			}
      			return conflict;
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
    if (caller == getCondOptNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:123
      {
      		return "Expected type boolType but got " + getCond().evaluatedType();
      	}
    }
    else {
      return getParent().Define_typeErrorMsg(this, caller);
    }
  }
}
