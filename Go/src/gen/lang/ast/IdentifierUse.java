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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:57
 * @production IdentifierUse : {@link Expression} ::= <span class="component">&lt;Identifier:String&gt;</span>;

 */
public class IdentifierUse extends Expression implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:228
   */
  public ValueContainer eval(ActivationRecord actrec){
    return actrec.get(declaration().uniqueName());
  }
  /**
   * @declaredat ASTNode:1
   */
  public IdentifierUse() {
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
  public IdentifierUse(Type p0, String p1) {
    setChild(p0, 0);
    setIdentifier(p1);
  }
  /**
   * @declaredat ASTNode:17
   */
  public IdentifierUse(Type p0, beaver.Symbol p1) {
    setChild(p0, 0);
    setIdentifier(p1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 1;
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
  public IdentifierUse clone() throws CloneNotSupportedException {
    IdentifierUse node = (IdentifierUse) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:49
   */
  public IdentifierUse copy() {
    try {
      IdentifierUse node = (IdentifierUse) clone();
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
  public IdentifierUse fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public IdentifierUse treeCopyNoTransform() {
    IdentifierUse tree = (IdentifierUse) copy();
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
  public IdentifierUse treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Identifier == ((IdentifierUse)node).tokenString_Identifier);    
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
  protected boolean declaration_visited = false;
  @ASTNodeAnnotation.Attribute
  public IdentifierDeclaration declaration() {
    if (declaration_visited) {
      throw new RuntimeException("Circular definition of attr: declaration in class: org.jastadd.ast.AST.SynDecl");
    }
    declaration_visited = true;
    IdentifierDeclaration declaration_value = lookup(getIdentifier());

    declaration_visited = false;
    return declaration_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean isCircular_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean isCircular() {
    if (isCircular_visited) {
      throw new RuntimeException("Circular definition of attr: isCircular in class: org.jastadd.ast.AST.SynDecl");
    }
    isCircular_visited = true;
    boolean isCircular_value = inExprOf(declaration());

    isCircular_visited = false;
    return isCircular_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean evaluatedType_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:74
   */
  @ASTNodeAnnotation.Attribute
  public Type evaluatedType() {
    if (evaluatedType_visited) {
      throw new RuntimeException("Circular definition of attr: evaluatedType in class: org.jastadd.ast.AST.SynDecl");
    }
    evaluatedType_visited = true;
    try {
    		return declaration().evaluatedType();
    	}
    finally {
      evaluatedType_visited = false;
    }
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:87
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
   * @aspect CircularDefinitions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:103
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
   * @attribute inh
   * @aspect Nameconflicts
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:116
   */
  @ASTNodeAnnotation.Attribute
  public boolean usedByFunction() {
    if (usedByFunction_visited) {
      throw new RuntimeException("Circular definition of attr: usedByFunction in class: org.jastadd.ast.AST.InhDecl");
    }
    usedByFunction_visited = true;
    boolean usedByFunction_value = getParent().Define_usedByFunction(this, null);

    usedByFunction_visited = false;
    return usedByFunction_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean usedByFunction_visited = false;
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:36
   */
    if (declaration().isUnknown()) {
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
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:46
   */
    if (isCircular()) {
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
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:56
   */
    if (declaration() != UnknownDeclaration() && (declaration().isVariable() && usedByFunction())) {
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
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:60
   */
    if (declaration().isFunction() && !usedByFunction()) {
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
    if (declaration().isUnknown())
      collection.add(error("symbol '" + getIdentifier() + "' is not declared"));
    if (isCircular())
      collection.add(error("the definition of symbol '" + getIdentifier() + "' is circular"));
    if (declaration() != UnknownDeclaration() && (declaration().isVariable() && usedByFunction()))
      collection.add(error("Variable being used as function: " + getIdentifier()));
    if (declaration().isFunction() && !usedByFunction())
      collection.add(error("Function being used as variable: " + getIdentifier()));
  }

}
