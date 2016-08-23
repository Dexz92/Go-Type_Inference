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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:10
 * @production Global : {@link ASTNode} ::= <span class="component">{@link IdentifierDeclaration}</span>;

 */
public abstract class Global extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Global() {
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
  public Global(IdentifierDeclaration p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public Global clone() throws CloneNotSupportedException {
    Global node = (Global) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:48
   */
  @Deprecated
  public abstract Global fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:56
   */
  public abstract Global treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public abstract Global treeCopy();
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
}
