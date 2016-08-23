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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:4
 * @production ControlStatement : {@link Statement} ::= <span class="component">[ShortStatement:{@link Statement}]</span>;

 */
public abstract class ControlStatement extends Statement implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ControlStatement() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public ControlStatement(Opt<Statement> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 1;
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
  public ControlStatement clone() throws CloneNotSupportedException {
    ControlStatement node = (ControlStatement) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:49
   */
  @Deprecated
  public abstract ControlStatement fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:57
   */
  public abstract ControlStatement treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:65
   */
  public abstract ControlStatement treeCopy();
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
   * @apilevel internal
   */
  protected java.util.Set localLookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:49
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
        if (getShortStatement() instanceof IdentifierDeclarationStatement) {
          IdentifierDeclarationStatement stmt = (IdentifierDeclarationStatement) getShortStatement();
          if (stmt.getIdentifierDeclaration().toString().equals(name)) {
            return stmt.getIdentifierDeclaration();
          }
        }
        return UnknownDeclaration();
      }
    finally {
      localLookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:64
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
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:90
   * @apilevel internal
   */
  public IdentifierDeclaration Define_lookup(ASTNode caller, ASTNode child, String name) {
    int childIndex = this.getIndexOfChild(caller);
    {
        IdentifierDeclaration decl = localLookup(name);
        return !decl.isUnknown() ? decl : lookup(name);
      }
  }
}
