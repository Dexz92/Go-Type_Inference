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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:24
 * @production IdentifierDeclarationStatement : {@link Statement} ::= <span class="component">{@link IdentifierDeclaration}</span> <span class="component">[Value:{@link Expression}]</span>;

 */
public class IdentifierDeclarationStatement extends Statement implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:194
   */
  public void eval(ActivationRecord actrec) throws ReturnStatement{
    actrec.put(getIdentifierDeclaration().uniqueName(), getValue().eval(actrec));
  }
  /**
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:159
   */
  private boolean noValueAssigned = false;
  /**
   * @declaredat ASTNode:1
   */
  public IdentifierDeclarationStatement() {
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
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public IdentifierDeclarationStatement(IdentifierDeclaration p0, Opt<Expression> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 2;
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
  public IdentifierDeclarationStatement clone() throws CloneNotSupportedException {
    IdentifierDeclarationStatement node = (IdentifierDeclarationStatement) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public IdentifierDeclarationStatement copy() {
    try {
      IdentifierDeclarationStatement node = (IdentifierDeclarationStatement) clone();
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
  public IdentifierDeclarationStatement fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public IdentifierDeclarationStatement treeCopyNoTransform() {
    IdentifierDeclarationStatement tree = (IdentifierDeclarationStatement) copy();
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
  public IdentifierDeclarationStatement treeCopy() {
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
   * Replaces the optional node for the Value child. This is the <code>Opt</code>
   * node containing the child Value, not the actual child!
   * @param opt The new node to be used as the optional node for the Value child.
   * @apilevel low-level
   */
  public void setValueOpt(Opt<Expression> opt) {
    setChild(opt, 1);
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
    return (Opt<Expression>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Value. This is the <code>Opt</code> node containing the child Value, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Value.
   * @apilevel low-level
   */
  public Opt<Expression> getValueOptNoTransform() {
    return (Opt<Expression>) getChildNoTransform(1);
  }
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
    boolean newDeclaration_value = true;

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
    String identifierName_value = getIdentifierDeclaration().getIdentifier();

    identifierName_visited = false;
    return identifierName_value;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:14
   * @apilevel internal
   */
  public String Define_uniqueName(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:18
      return idIndex() + getIdentifierDeclaration().getIdentifier();
    }
    else {
      return getParent().Define_uniqueName(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:103
   * @apilevel internal
   */
  public boolean Define_inExprOf(ASTNode caller, ASTNode child, IdentifierDeclaration decl) {
    if (caller == getValueOptNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:106
      return getIdentifierDeclaration() == decl;
    }
    else {
      return getParent().Define_inExprOf(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:7
   * @apilevel internal
   */
  public Type Define_linkedValueType(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:9
      return getValue().evaluatedType();
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
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:161
      {
      		if (getIdentifierDeclaration().getMutabilityStatus() instanceof Constant && !hasValue()) {
      			noValueAssigned = true;
      			return true;
      		}
      		boolean conflict = false;
      		Type assigningToType = getIdentifierDeclaration().getType();
      		Type valueType = getValue().evaluatedType();
      
      		if (assigningToType.sameTypeAs(unknownType()) || valueType.sameTypeAs(unknownType())) {
      			// Do nothing
      		} else if (assigningToType.sameTypeAs(inferredType())) {
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
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:180
      {
      		String message;
      		if(noValueAssigned){
      			message = "Must assign a starting value to constant";
      		} else {
      			String mutabilityStatus = getIdentifierDeclaration().getMutabilityStatus() instanceof Variable ? " variable" : " constant";
      			message = "Trying to assign " + getValue().evaluatedType() +
      							" to " + getIdentifierDeclaration().getType() + mutabilityStatus;
      		}
      		return message;
      	}
    }
    else {
      return getParent().Define_typeErrorMsg(this, caller);
    }
  }
}
