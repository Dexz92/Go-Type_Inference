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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:15
 * @production GlobalVariable : {@link Global} ::= <span class="component">{@link Expression}</span>;

 */
public class GlobalVariable extends Global implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public GlobalVariable() {
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
  public GlobalVariable(IdentifierDeclaration p0, Expression p1) {
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
  public GlobalVariable clone() throws CloneNotSupportedException {
    GlobalVariable node = (GlobalVariable) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public GlobalVariable copy() {
    try {
      GlobalVariable node = (GlobalVariable) clone();
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
  public GlobalVariable fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public GlobalVariable treeCopyNoTransform() {
    GlobalVariable tree = (GlobalVariable) copy();
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
  public GlobalVariable treeCopy() {
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
   * Replaces the IdentifierDeclaration child.
   * @param node The new node to replace the IdentifierDeclaration child.
   * @apilevel high-level
   */
  public void setIdentifierDeclaration(IdentifierDeclaration node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdentifierDeclaration child.
   * @return The current node used as the IdentifierDeclaration child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdentifierDeclaration")
  public IdentifierDeclaration getIdentifierDeclaration() {
    return (IdentifierDeclaration) getChild(0);
  }
  /**
   * Retrieves the IdentifierDeclaration child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdentifierDeclaration child.
   * @apilevel low-level
   */
  public IdentifierDeclaration getIdentifierDeclarationNoTransform() {
    return (IdentifierDeclaration) getChildNoTransform(0);
  }
  /**
   * Replaces the Expression child.
   * @param node The new node to replace the Expression child.
   * @apilevel high-level
   */
  public void setExpression(Expression node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expression child.
   * @return The current node used as the Expression child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expression")
  public Expression getExpression() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the Expression child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expression child.
   * @apilevel low-level
   */
  public Expression getExpressionNoTransform() {
    return (Expression) getChildNoTransform(1);
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:14
   * @apilevel internal
   */
  public String Define_uniqueName(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:17
      return "global_" + getIdentifierDeclaration().getIdentifier();
    }
    else {
      return getParent().Define_uniqueName(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:7
   * @apilevel internal
   */
  public Type Define_linkedValueType(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:10
      return getExpression().evaluatedType();
    }
    else {
      return getParent().Define_linkedValueType(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:92
      {
      		boolean conflict = false;
      		Type assigningToType = getIdentifierDeclaration().getType();
      		Type valueType = getExpression().evaluatedType();
      
      		if (assigningToType.sameTypeAs(unknownType()) || valueType.sameTypeAs(unknownType())) {
      			// Do nothing
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
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:108
      {
      		String mutabilityStatus = getIdentifierDeclaration().getMutabilityStatus() instanceof Variable ? " variable" : " constant";
      		return "Trying to assign " + getExpression().evaluatedType() +
      						" to global " + getIdentifierDeclaration().getType() + mutabilityStatus;
      	}
    }
    else {
      return getParent().Define_typeErrorMsg(this, caller);
    }
  }
}
