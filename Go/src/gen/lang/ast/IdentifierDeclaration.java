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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:58
 * @production IdentifierDeclaration : {@link Expression} ::= <span class="component">&lt;Identifier:String&gt;</span> <span class="component">MutabilityStatus:{@link MutableValue}</span>;

 */
public class IdentifierDeclaration extends Expression implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public IdentifierDeclaration() {
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
  public IdentifierDeclaration(Type p0, String p1, MutableValue p2) {
    setChild(p0, 0);
    setIdentifier(p1);
    setChild(p2, 1);
  }
  /**
   * @declaredat ASTNode:18
   */
  public IdentifierDeclaration(Type p0, beaver.Symbol p1, MutableValue p2) {
    setChild(p0, 0);
    setIdentifier(p1);
    setChild(p2, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:26
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public IdentifierDeclaration clone() throws CloneNotSupportedException {
    IdentifierDeclaration node = (IdentifierDeclaration) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:51
   */
  public IdentifierDeclaration copy() {
    try {
      IdentifierDeclaration node = (IdentifierDeclaration) clone();
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
   * @declaredat ASTNode:70
   */
  @Deprecated
  public IdentifierDeclaration fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public IdentifierDeclaration treeCopyNoTransform() {
    IdentifierDeclaration tree = (IdentifierDeclaration) copy();
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
   * @declaredat ASTNode:100
   */
  public IdentifierDeclaration treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:107
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Identifier == ((IdentifierDeclaration)node).tokenString_Identifier);    
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
   * Replaces the lexeme Identifier.
   * @param value The new value for the lexeme Identifier.
   * @apilevel high-level
   */
  public void setIdentifier(String value) {
    tokenString_Identifier = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_Identifier;
  /**
   */
  public int Identifierstart;
  /**
   */
  public int Identifierend;
  /**
   * JastAdd-internal setter for lexeme Identifier using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Identifier
   * @apilevel internal
   */
  public void setIdentifier(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setIdentifier is only valid for String lexemes");
    tokenString_Identifier = (String)symbol.value;
    Identifierstart = symbol.getStart();
    Identifierend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Identifier.
   * @return The value for the lexeme Identifier.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Identifier")
  public String getIdentifier() {
    return tokenString_Identifier != null ? tokenString_Identifier : "";
  }
  /**
   * Replaces the MutabilityStatus child.
   * @param node The new node to replace the MutabilityStatus child.
   * @apilevel high-level
   */
  public void setMutabilityStatus(MutableValue node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the MutabilityStatus child.
   * @return The current node used as the MutabilityStatus child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="MutabilityStatus")
  public MutableValue getMutabilityStatus() {
    return (MutableValue) getChild(1);
  }
  /**
   * Retrieves the MutabilityStatus child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the MutabilityStatus child.
   * @apilevel low-level
   */
  public MutableValue getMutabilityStatusNoTransform() {
    return (MutableValue) getChildNoTransform(1);
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
    String toString_value = getIdentifier();

    toString_visited = false;
    return toString_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean isMultiplyDeclared_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean isMultiplyDeclared() {
    if (isMultiplyDeclared_visited) {
      throw new RuntimeException("Circular definition of attr: isMultiplyDeclared in class: org.jastadd.ast.AST.SynDecl");
    }
    isMultiplyDeclared_visited = true;
    boolean isMultiplyDeclared_value = lookup(getIdentifier()) != this;

    isMultiplyDeclared_visited = false;
    return isMultiplyDeclared_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean evaluatedType_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:78
   */
  @ASTNodeAnnotation.Attribute
  public Type evaluatedType() {
    if (evaluatedType_visited) {
      throw new RuntimeException("Circular definition of attr: evaluatedType in class: org.jastadd.ast.AST.SynDecl");
    }
    evaluatedType_visited = true;
    try {
    		if (getType().sameTypeAs(inferredType())) {
    			return linkedValueType();
    		} else {
    			return getType();
    		}
    	}
    finally {
      evaluatedType_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isUnknown_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean isUnknown() {
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attr: isUnknown in class: org.jastadd.ast.AST.SynDecl");
    }
    isUnknown_visited = true;
    boolean isUnknown_value = false;

    isUnknown_visited = false;
    return isUnknown_value;
  }
  /**
   * @attribute inh
   * @aspect LinkedFunction
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:2
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
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:14
   */
  @ASTNodeAnnotation.Attribute
  public String uniqueName() {
    if (uniqueName_visited) {
      throw new RuntimeException("Circular definition of attr: uniqueName in class: org.jastadd.ast.AST.InhDecl");
    }
    uniqueName_visited = true;
    String uniqueName_value = getParent().Define_uniqueName(this, null);

    uniqueName_visited = false;
    return uniqueName_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean uniqueName_visited = false;
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:90
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
   * @attribute inh
   * @aspect Nameconflicts
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:114
   */
  @ASTNodeAnnotation.Attribute
  public boolean isVariable() {
    if (isVariable_visited) {
      throw new RuntimeException("Circular definition of attr: isVariable in class: org.jastadd.ast.AST.InhDecl");
    }
    isVariable_visited = true;
    boolean isVariable_value = getParent().Define_isVariable(this, null);

    isVariable_visited = false;
    return isVariable_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean isVariable_visited = false;
  /**
   * @attribute inh
   * @aspect Nameconflicts
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:115
   */
  @ASTNodeAnnotation.Attribute
  public boolean isFunction() {
    if (isFunction_visited) {
      throw new RuntimeException("Circular definition of attr: isFunction in class: org.jastadd.ast.AST.InhDecl");
    }
    isFunction_visited = true;
    boolean isFunction_value = getParent().Define_isFunction(this, null);

    isFunction_visited = false;
    return isFunction_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean isFunction_visited = false;
  /**
   * @attribute inh
   * @aspect Nameconflicts
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:128
   */
  @ASTNodeAnnotation.Attribute
  public int numberOfParameters() {
    if (numberOfParameters_visited) {
      throw new RuntimeException("Circular definition of attr: numberOfParameters in class: org.jastadd.ast.AST.InhDecl");
    }
    numberOfParameters_visited = true;
    int numberOfParameters_value = getParent().Define_numberOfParameters(this, null);

    numberOfParameters_visited = false;
    return numberOfParameters_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean numberOfParameters_visited = false;
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:7
   */
  @ASTNodeAnnotation.Attribute
  public Type linkedValueType() {
    if (linkedValueType_visited) {
      throw new RuntimeException("Circular definition of attr: linkedValueType in class: org.jastadd.ast.AST.InhDecl");
    }
    linkedValueType_visited = true;
    Type linkedValueType_value = getParent().Define_linkedValueType(this, null);

    linkedValueType_visited = false;
    return linkedValueType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean linkedValueType_visited = false;
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:41
   */
    if (isMultiplyDeclared()) {
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
    if (isMultiplyDeclared())
      collection.add(error("symbol '" + getIdentifier() + "' is already declared!"));
  }

}
