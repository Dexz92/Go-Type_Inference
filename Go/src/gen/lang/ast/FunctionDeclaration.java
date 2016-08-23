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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:14
 * @production FunctionDeclaration : {@link Global} ::= <span class="component">Parameter:{@link IdentifierDeclaration}*</span> <span class="component">ReturnType:{@link Type}</span> <span class="component">Body:{@link Block}</span>;

 */
public class FunctionDeclaration extends Global implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:136
   */
  public ValueContainer eval(ActivationRecord actrec){
    if(getBody().getNumStatement() > 0) {

      try{
          getBody().eval(actrec);
      }catch(ReturnStatement rs){
        if (rs.hasValue()) {
        actrec.put("return", rs.getValue());
        }
      }
    }

    return actrec.get("return");
  }
  /**
   * @declaredat ASTNode:1
   */
  public FunctionDeclaration() {
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
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public FunctionDeclaration(IdentifierDeclaration p0, List<IdentifierDeclaration> p1, Type p2, Block p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:41
   */
  public FunctionDeclaration clone() throws CloneNotSupportedException {
    FunctionDeclaration node = (FunctionDeclaration) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:48
   */
  public FunctionDeclaration copy() {
    try {
      FunctionDeclaration node = (FunctionDeclaration) clone();
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
   * @declaredat ASTNode:67
   */
  @Deprecated
  public FunctionDeclaration fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public FunctionDeclaration treeCopyNoTransform() {
    FunctionDeclaration tree = (FunctionDeclaration) copy();
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
   * @declaredat ASTNode:97
   */
  public FunctionDeclaration treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:104
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
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   */
  public void setParameterList(List<IdentifierDeclaration> list) {
    setChild(list, 1);
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
  public IdentifierDeclaration getParameter(int i) {
    return (IdentifierDeclaration) getParameterList().getChild(i);
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
  public void addParameter(IdentifierDeclaration node) {
    List<IdentifierDeclaration> list = (parent == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addParameterNoTransform(IdentifierDeclaration node) {
    List<IdentifierDeclaration> list = getParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameter(IdentifierDeclaration node, int i) {
    List<IdentifierDeclaration> list = getParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Parameter")
  public List<IdentifierDeclaration> getParameterList() {
    List<IdentifierDeclaration> list = (List<IdentifierDeclaration>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<IdentifierDeclaration> getParameterListNoTransform() {
    return (List<IdentifierDeclaration>) getChildNoTransform(1);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  public List<IdentifierDeclaration> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<IdentifierDeclaration> getParametersNoTransform() {
    return getParameterListNoTransform();
  }
  /**
   * Replaces the ReturnType child.
   * @param node The new node to replace the ReturnType child.
   * @apilevel high-level
   */
  public void setReturnType(Type node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the ReturnType child.
   * @return The current node used as the ReturnType child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ReturnType")
  public Type getReturnType() {
    return (Type) getChild(2);
  }
  /**
   * Retrieves the ReturnType child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ReturnType child.
   * @apilevel low-level
   */
  public Type getReturnTypeNoTransform() {
    return (Type) getChildNoTransform(2);
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
  protected java.util.Set localLookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public IdentifierDeclaration localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: localLookup in class: org.jastadd.ast.AST.SynDecl");
    }
    localLookup_String_visited.add(_parameters);
    try {
        for (IdentifierDeclaration param : getParameters()) {
          if (param.getIdentifier().equals(name)) {
            return param;
          }
        }
    
        return UnknownDeclaration();
      }
    finally {
      localLookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean returnStatement_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:219
   */
  @ASTNodeAnnotation.Attribute
  public boolean returnStatement() {
    if (returnStatement_visited) {
      throw new RuntimeException("Circular definition of attr: returnStatement in class: org.jastadd.ast.AST.SynDecl");
    }
    returnStatement_visited = true;
    try {
    		return getBody().returnStatement();
    	}
    finally {
      returnStatement_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean deadCode_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:244
   */
  @ASTNodeAnnotation.Attribute
  public boolean deadCode() {
    if (deadCode_visited) {
      throw new RuntimeException("Circular definition of attr: deadCode in class: org.jastadd.ast.AST.SynDecl");
    }
    deadCode_visited = true;
    try {
    		Block body = getBody();
    		for (int i = 0; i < body.getNumStatement(); ++i) {
    			if(body.getStatement(i).returnStatement() && i < body.getNumStatement() - 1){
    					return true;
    			}
    		}
    		return false;
    	}
    finally {
      deadCode_visited = false;
    }
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:46
   */
  @ASTNodeAnnotation.Attribute
  public IdentifierDeclaration lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookup in class: org.jastadd.ast.AST.InhDecl");
    }
    lookup_String_visited.add(_parameters);
    IdentifierDeclaration lookup_String_value = getParent().Define_lookup(this, null, name);

    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set lookup_String_visited;
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:2
   * @apilevel internal
   */
  public FunctionDeclaration Define_linkedFunction(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return this;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:10
   * @apilevel internal
   */
  public String Define_idIndex(ASTNode caller, ASTNode child) {
    if (caller == getBodyNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:11
      return "";
    }
    else {
      return getParent().Define_idIndex(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:14
   * @apilevel internal
   */
  public String Define_uniqueName(ASTNode caller, ASTNode child) {
    if (caller == getParameterListNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:20
      int index = caller.getIndexOfChild(child);
      return getParameter(index).getIdentifier();
    }
    else if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:19
      return getIdentifierDeclaration().getIdentifier();
    }
    else {
      return getParent().Define_uniqueName(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:90
   * @apilevel internal
   */
  public IdentifierDeclaration Define_lookup(ASTNode caller, ASTNode child, String name) {
    if (caller == getBodyNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:41
      {
          IdentifierDeclaration decl = localLookup(name);
          return !decl.isUnknown() ? decl : lookup(name);
        }
    }
    else if (caller == getParameterListNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:36
      int childIndex = caller.getIndexOfChild(child);
      {
          IdentifierDeclaration decl = localLookup(name);
          return !decl.isUnknown() ? decl : lookup(name);
        }
    }
    else {
      return getParent().Define_lookup(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:114
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:119
      return false;
    }
    else {
      return getParent().Define_isVariable(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:122
      return true;
    }
    else {
      return getParent().Define_isFunction(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:128
   * @apilevel internal
   */
  public int Define_numberOfParameters(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:131
      return getNumParameter();
    }
    else {
      return getParent().Define_numberOfParameters(this, caller);
    }
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    if (caller == getIdentifierDeclarationNoTransform()) {
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:192
      {
      		return getIdentifierDeclaration().getIdentifier().equals("main") && !getReturnType().sameTypeAs(voidType());
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
      // @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:196
      {
      		return "Main function should be void";
      	}
    }
    else {
      return getParent().Define_typeErrorMsg(this, caller);
    }
  }
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:71
   */
    if (!returnStatement() && !getReturnType().sameTypeAs(voidType()) && !getIdentifierDeclaration().typeConflict()) {
      {
        Program ref = (Program) (program());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:76
   */
    if (deadCode()) {
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
    if (!returnStatement() && !getReturnType().sameTypeAs(voidType()) && !getIdentifierDeclaration().typeConflict())
      collection.add(error("Function " + getIdentifierDeclaration().getIdentifier() + "() missing return statement"));
    if (deadCode())
      collection.add(error("Function " + getIdentifierDeclaration().getIdentifier() + "() contains dead code"));
  }

}
