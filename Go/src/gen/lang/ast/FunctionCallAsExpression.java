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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:18
 * @production FunctionCallAsExpression : {@link Expression} ::= <span class="component">{@link IdentifierUse}</span> <span class="component">Parameter:{@link Expression}*</span>;

 */
public class FunctionCallAsExpression extends Expression implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:212
   */
  public ValueContainer eval(ActivationRecord actrec){
    if(getIdentifierUse().getIdentifier().equals("print")){
      System.out.println(getParameter(0).eval(actrec));
    }else{
      ActivationRecord newRecord = new ActivationRecord();
      FunctionDeclaration function = (FunctionDeclaration)(getIdentifierUse().declaration().linkedFunction());
      for(int i = 0; i < getNumParameter(); ++i){
        newRecord.put(function.getParameter(i).uniqueName(), getParameter(i).eval(actrec));
      }
      if(getIdentifierUse().declaration() != null) {
        return getIdentifierUse().declaration().linkedFunction().eval(newRecord);
      }
    }
    return null;
  }
  /**
   * @declaredat ASTNode:1
   */
  public FunctionCallAsExpression() {
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
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  public FunctionCallAsExpression(Type p0, IdentifierUse p1, List<Expression> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public FunctionCallAsExpression clone() throws CloneNotSupportedException {
    FunctionCallAsExpression node = (FunctionCallAsExpression) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:47
   */
  public FunctionCallAsExpression copy() {
    try {
      FunctionCallAsExpression node = (FunctionCallAsExpression) clone();
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
   * @declaredat ASTNode:66
   */
  @Deprecated
  public FunctionCallAsExpression fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public FunctionCallAsExpression treeCopyNoTransform() {
    FunctionCallAsExpression tree = (FunctionCallAsExpression) copy();
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
   * @declaredat ASTNode:96
   */
  public FunctionCallAsExpression treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:103
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
   * Replaces the IdentifierUse child.
   * @param node The new node to replace the IdentifierUse child.
   * @apilevel high-level
   */
  public void setIdentifierUse(IdentifierUse node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the IdentifierUse child.
   * @return The current node used as the IdentifierUse child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdentifierUse")
  public IdentifierUse getIdentifierUse() {
    return (IdentifierUse) getChild(1);
  }
  /**
   * Retrieves the IdentifierUse child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdentifierUse child.
   * @apilevel low-level
   */
  public IdentifierUse getIdentifierUseNoTransform() {
    return (IdentifierUse) getChildNoTransform(1);
  }
  /**
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   */
  public void setParameterList(List<Expression> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * @return Number of children in the Parameter list.
   * @apilevel high-level
   */
  public int getNumParameter() {
    return getParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Parameter list.
   * @apilevel low-level
   */
  public int getNumParameterNoTransform() {
    return getParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameter list.
   * @apilevel high-level
   */
  public Expression getParameter(int i) {
    return (Expression) getParameterList().getChild(i);
  }
  /**
   * Check whether the Parameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameter() {
    return getParameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the Parameter list.
   * @param node The element to append to the Parameter list.
   * @apilevel high-level
   */
  public void addParameter(Expression node) {
    List<Expression> list = (parent == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addParameterNoTransform(Expression node) {
    List<Expression> list = getParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameter(Expression node, int i) {
    List<Expression> list = getParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Parameter")
  public List<Expression> getParameterList() {
    List<Expression> list = (List<Expression>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<Expression> getParameterListNoTransform() {
    return (List<Expression>) getChildNoTransform(2);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  public List<Expression> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<Expression> getParametersNoTransform() {
    return getParameterListNoTransform();
  }
  /**
   * @apilevel internal
   */
  protected boolean toString_visited = false;
  @ASTNodeAnnotation.Attribute
  public String toString() {
    if (toString_visited) {
      throw new RuntimeException("Circular definition of attr: toString in class: org.jastadd.ast.AST.SynDecl");
    }
    toString_visited = true;
    String toString_value = getIdentifierUse().toString();

    toString_visited = false;
    return toString_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean amountOfParamsMismatch_visited = false;
  /**
   * @attribute syn
   * @aspect Nameconflicts
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:133
   */
  @ASTNodeAnnotation.Attribute
  public boolean amountOfParamsMismatch() {
    if (amountOfParamsMismatch_visited) {
      throw new RuntimeException("Circular definition of attr: amountOfParamsMismatch in class: org.jastadd.ast.AST.SynDecl");
    }
    amountOfParamsMismatch_visited = true;
    try {
        return getNumParameter() != getIdentifierUse().declaration().numberOfParameters();
      }
    finally {
      amountOfParamsMismatch_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean evaluatedType_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:14
   */
  @ASTNodeAnnotation.Attribute
  public Type evaluatedType() {
    if (evaluatedType_visited) {
      throw new RuntimeException("Circular definition of attr: evaluatedType in class: org.jastadd.ast.AST.SynDecl");
    }
    evaluatedType_visited = true;
    try {
    		if (getIdentifierUse().declaration().isFunction()) {
    			return getIdentifierUse().declaration().linkedFunction().getReturnType();
    		} else {
    			return inferredType();
    		}
    	}
    finally {
      evaluatedType_visited = false;
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:116
   * @apilevel internal
   */
  public boolean Define_usedByFunction(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierUseNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:125
      return true;
    }
    else {
      return getParent().Define_usedByFunction(this, caller);
    }
  }
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:65
   */
    if (amountOfParamsMismatch()) {
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
    if (amountOfParamsMismatch())
      collection.add(error("Mismatch between number of requested and given parameters for function: "
				+ getIdentifierUse().getIdentifier() + " (Expected: " + getIdentifierUse().declaration().numberOfParameters() + " Given: " + getNumParameter() + ")"));
  }

}
