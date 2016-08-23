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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:59
 * @production UnknownDeclaration : {@link IdentifierDeclaration};

 */
public class UnknownDeclaration extends IdentifierDeclaration implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public UnknownDeclaration() {
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
  public UnknownDeclaration(Type p0, String p1, MutableValue p2) {
    setChild(p0, 0);
    setIdentifier(p1);
    setChild(p2, 1);
  }
  /**
   * @declaredat ASTNode:18
   */
  public UnknownDeclaration(Type p0, beaver.Symbol p1, MutableValue p2) {
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
  public UnknownDeclaration clone() throws CloneNotSupportedException {
    UnknownDeclaration node = (UnknownDeclaration) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:51
   */
  public UnknownDeclaration copy() {
    try {
      UnknownDeclaration node = (UnknownDeclaration) clone();
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
  public UnknownDeclaration fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public UnknownDeclaration treeCopyNoTransform() {
    UnknownDeclaration tree = (UnknownDeclaration) copy();
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
  public UnknownDeclaration treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:107
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Identifier == ((UnknownDeclaration)node).tokenString_Identifier);    
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
  protected boolean isUnknown_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean isUnknown() {
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attr: isUnknown in class: org.jastadd.ast.AST.SynDecl");
    }
    isUnknown_visited = true;
    boolean isUnknown_value = true;

    isUnknown_visited = false;
    return isUnknown_value;
  }
}
