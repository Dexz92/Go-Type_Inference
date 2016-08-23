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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:23
 * @production Assignment : {@link Statement} ::= <span class="component">{@link IdentifierUse}</span> <span class="component">Value:{@link Expression}</span>;

 */
public class Assignment extends Statement implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:190
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
    actrec.put(getIdentifierUse().declaration().uniqueName(), getValue().eval(actrec));
  }
  /**
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:127
   */
  private boolean assigningToConstant = false;
  /**
   * @declaredat ASTNode:1
   */
  public Assignment() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public Assignment(IdentifierUse p0, Expression p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
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
  public Assignment clone() throws CloneNotSupportedException {
    Assignment node = (Assignment) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public Assignment copy() {
    try {
      Assignment node = (Assignment) clone();
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
  public Assignment fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Assignment treeCopyNoTransform() {
    Assignment tree = (Assignment) copy();
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
  public Assignment treeCopy() {
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
   * Replaces the IdentifierUse child.
   * @param node The new node to replace the IdentifierUse child.
   * @apilevel high-level
   */
  public void setIdentifierUse(IdentifierUse node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdentifierUse child.
   * @return The current node used as the IdentifierUse child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdentifierUse")
  public IdentifierUse getIdentifierUse() {
    return (IdentifierUse) getChild(0);
  }
  /**
   * Retrieves the IdentifierUse child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdentifierUse child.
   * @apilevel low-level
   */
  public IdentifierUse getIdentifierUseNoTransform() {
    return (IdentifierUse) getChildNoTransform(0);
  }
  /**
   * Replaces the Value child.
   * @param node The new node to replace the Value child.
   * @apilevel high-level
   */
  public void setValue(Expression node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Value child.
   * @return The current node used as the Value child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Value")
  public Expression getValue() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the Value child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Value child.
   * @apilevel low-level
   */
  public Expression getValueNoTransform() {
    return (Expression) getChildNoTransform(1);
  }
  /**
   * @attribute inh
   * @aspect CircularDefinitions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:104
   */
  @ASTNodeAnnotation.Attribute
  public boolean inExprOf(IdentifierDeclaration decl) {
    Object _parameters = decl;
    if (inExprOf_IdentifierDeclaration_visited == null) inExprOf_IdentifierDeclaration_visited = new java.util.HashSet(4);
    if (inExprOf_IdentifierDeclaration_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: inExprOf in class: org.jastadd.ast.AST.InhDecl");
    }
    inExprOf_IdentifierDeclaration_visited.add(_parameters);
    boolean inExprOf_IdentifierDeclaration_value = getParent().Define_inExprOf(this, null, decl);

    inExprOf_IdentifierDeclaration_visited.remove(_parameters);
    return inExprOf_IdentifierDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set inExprOf_IdentifierDeclaration_visited;
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierUseNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:129
      {
      		boolean conflict = false;
      		Type assigningToType = getIdentifierUse().declaration().getType();
      		Type valueType = getValue().evaluatedType();
      
      		if (assigningToType.sameTypeAs(unknownType()) || valueType.sameTypeAs(unknownType())) {
      			// Do nothing
      		} else if (getIdentifierUse().declaration().getMutabilityStatus() instanceof Constant){
      			conflict = true;
      			assigningToConstant = true;
      		}	else if (assigningToType.sameTypeAs(inferredType())) {
      			conflict = valueType.sameTypeAs(mismatchedType()) || !(valueType.sameTypeAs(intType()) || valueType.sameTypeAs(boolType()) || valueType.sameTypeAs(floatType()));
      		} else if (!assigningToType.sameTypeAs(valueType)) {
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
    if (caller == getIdentifierUseNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:147
      {
      		String message;
      		if(assigningToConstant){
      			message = "Trying to assign a new value to a constant";
      		} else {
      			String mutabilityStatus = getIdentifierUse().declaration().getMutabilityStatus() instanceof Variable ? " variable" : " constant";
      			message = "Trying to assign " + getValue().evaluatedType() +
      							" to " + getIdentifierUse().declaration().getType() + mutabilityStatus;
      		}
      		return message;
      	}
    }
    else {
      return getParent().Define_typeErrorMsg(this, caller);
    }
  }
}
