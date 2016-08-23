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
 * @production ASTNode;

 */
public class ASTNode<T extends ASTNode> extends beaver.Symbol implements Cloneable, Iterable<T> {
  /**
   * @aspect DumpTree
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/DumpTree.jrag:6
   */
  private String DUMP_TREE_INDENT = "  ";
  /**
   * @aspect DumpTree
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/DumpTree.jrag:8
   */
  public String dumpTree() {
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		dumpTree(new PrintStream(bytes));
		return bytes.toString();
	}
  /**
   * @aspect DumpTree
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/DumpTree.jrag:14
   */
  public void dumpTree(PrintStream out) {
		dumpTree(out, 0);
		out.flush();
	}
  /**
   * @aspect DumpTree
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/DumpTree.jrag:19
   */
  public void dumpTree(PrintStream out, int indent) {
		for (int i = 0; i < indent; i++) {
			out.print(DUMP_TREE_INDENT);
		}
		out.println(getClass().getSimpleName());
		for (ASTNode child: this) {
			child.dumpTree(out, indent+1);
		}
	}
  /**
   * @aspect Errors
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:22
   */
  protected ErrorMessage error(String message) {
		return new ErrorMessage(message, getLine(getStart()));
	}
  /**
   * @declaredat ASTNode:1
   */
  public ASTNode() {
    super();
    init$Children();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:11
   */
  public void init$Children() {
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:16
   */
  private int childIndex;
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  public int getIndexOfChild(ASTNode node) {
    if (node == null) {
      return -1;
    }
    if (node.childIndex < numChildren && node == children[node.childIndex]) {
      return node.childIndex;
    }
    for(int i = 0; children != null && i < children.length; i++) {
      if (children[i] == node) {
        node.childIndex = i;
        return i;
      }
    }
    return -1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public static final boolean generatedWithCacheCycle = true;
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public static final boolean generatedWithComponentCheck = false;
  /**
   * Parent pointer
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  protected ASTNode parent;
  /**
   * Child array
   * @apilevel low-level
   * @declaredat ASTNode:56
   */
  protected ASTNode[] children;
  /**
   * @apilevel internal
   * @declaredat ASTNode:62
   */
  private static ASTNode$State state = new ASTNode$State();
  /**
   * @apilevel internal
   * @declaredat ASTNode:67
   */
  public final ASTNode$State state() {
    return state;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public T getChild(int i) {

    // No rewrites
    ASTNode child = getChildNoTransform(i);
    return (T) child;

  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:85
   */
  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   * @declaredat ASTNode:92
   */
  public final T getChildNoTransform(int i) {
    if (children == null) {
      return null;
    }
    T child = (T)children[i];
    return child;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:102
   */
  protected int numChildren;
  /**
   * @apilevel low-level
   * @declaredat ASTNode:107
   */
  protected int numChildren() {
    return numChildren;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:114
   */
  public int getNumChild() {
    return numChildren();
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   * @declaredat ASTNode:122
   */
  public final int getNumChildNoTransform() {
    return numChildren();
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:128
   */
  public void setChild(ASTNode node, int i) {
    if (children == null) {
      children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if (i >= numChildren) {
      numChildren = i+1;
    }
    if (node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:148
   */
  public void insertChild(ASTNode node, int i) {
    if (children == null) {
      children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if (i < children.length) {
        System.arraycopy(children, i, c, i+1, children.length-i);
        for(int j = i+1; j < c.length; ++j) {
          if (c[j] != null) {
            c[j].childIndex = j;
          }
        }
      }
      children = c;
    }
    numChildren++;
    if (node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:175
   */
  public void removeChild(int i) {
    if (children != null) {
      ASTNode child = (ASTNode) children[i];
      if (child != null) {
        child.parent = null;
        child.childIndex = -1;
      }
      // Adding a check of this instance to make sure its a List, a move of children doesn't make
      // any sense for a node unless its a list. Also, there is a problem if a child of a non-List node is removed
      // and siblings are moved one step to the right, with null at the end.
      if (this instanceof List || this instanceof Opt) {
        System.arraycopy(children, i+1, children, i, children.length-i-1);
        children[children.length-1] = null;
        numChildren--;
        // fix child indices
        for(int j = i; j < numChildren; ++j) {
          if (children[j] != null) {
            child = (ASTNode) children[j];
            child.childIndex = j;
          }
        }
      } else {
        children[i] = null;
      }
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:204
   */
  public ASTNode getParent() {
    return (ASTNode) parent;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:210
   */
  public void setParent(ASTNode node) {
    parent = node;
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:260
   */
  public java.util.Iterator<T> iterator() {
    return new java.util.Iterator<T>() {
      private int counter = 0;
      public boolean hasNext() {
        return counter < getNumChild();
      }
      public T next() {
        if (hasNext())
          return (T)getChild(counter++);
        else
          return null;
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:280
   */
  public void flushTreeCache() {
    flushCache();
    if (children == null) {
      return;
    }
    for (int i = 0; i < children.length; i++) {
      if (children[i] != null) {
        ((ASTNode)children[i]).flushTreeCache();
      }
    }
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:294
   */
  public void flushCache() {
    flushAttrAndCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:300
   */
  public void flushAttrAndCollectionCache() {
    flushAttrCache();
    flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:307
   */
  public void flushAttrCache() {
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:312
   */
  public void flushCollectionCache() {
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:317
   */
  public ASTNode<T> clone() throws CloneNotSupportedException {
    ASTNode node = (ASTNode) super.clone();
    node.flushAttrAndCollectionCache();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:325
   */
  public ASTNode<T> copy() {
    try {
      ASTNode node = (ASTNode) clone();
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
   * @declaredat ASTNode:344
   */
  @Deprecated
  public ASTNode<T> fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:354
   */
  public ASTNode<T> treeCopyNoTransform() {
    ASTNode tree = (ASTNode) copy();
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
   * @declaredat ASTNode:374
   */
  public ASTNode<T> treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * Performs a full traversal of the tree using getChild to trigger rewrites
   * @apilevel low-level
   * @declaredat ASTNode:382
   */
  public void doFullTraversal() {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).doFullTraversal();
    }
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:390
   */
  protected boolean is$Equal(ASTNode n1, ASTNode n2) {
    if (n1 == null && n2 == null) return true;
    if (n1 == null || n2 == null) return false;
    return n1.is$Equal(n2);
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:398
   */
  protected boolean is$Equal(ASTNode node) {
    if (getClass() != node.getClass()) {
      return false;
    }
    if (numChildren != node.numChildren) {
      return false;
    }
    for (int i = 0; i < numChildren; i++) {
      if (children[i] == null && node.children[i] != null) {
        return false;
      }
      if (!((ASTNode)children[i]).is$Equal(((ASTNode)node.children[i]))) {
        return false;
      }
    }
    return true;
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:26
   */
    protected void collect_contributors_Program_errors() {
    for(int i = 0; i < getNumChild(); i++) {
      getChild(i).collect_contributors_Program_errors();
    }
  }
  protected void contributeTo_Program_Program_errors(Set<ErrorMessage> collection) {
  }

  /**
   * @attribute inh
   * @aspect Errors
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:28
   */
  @ASTNodeAnnotation.Attribute
  public Program program() {
    if (program_visited) {
      throw new RuntimeException("Circular definition of attr: program in class: org.jastadd.ast.AST.InhDecl");
    }
    program_visited = true;
    Program program_value = getParent().Define_program(this, null);

    program_visited = false;
    return program_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean program_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:60
   */
  @ASTNodeAnnotation.Attribute
  public UnknownType unknownType() {
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attr: unknownType in class: org.jastadd.ast.AST.InhDecl");
    }
    unknownType_visited = true;
    UnknownType unknownType_value = getParent().Define_unknownType(this, null);

    unknownType_visited = false;
    return unknownType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean unknownType_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:64
   */
  @ASTNodeAnnotation.Attribute
  public IntType intType() {
    if (intType_visited) {
      throw new RuntimeException("Circular definition of attr: intType in class: org.jastadd.ast.AST.InhDecl");
    }
    intType_visited = true;
    IntType intType_value = getParent().Define_intType(this, null);

    intType_visited = false;
    return intType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean intType_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:68
   */
  @ASTNodeAnnotation.Attribute
  public BoolType boolType() {
    if (boolType_visited) {
      throw new RuntimeException("Circular definition of attr: boolType in class: org.jastadd.ast.AST.InhDecl");
    }
    boolType_visited = true;
    BoolType boolType_value = getParent().Define_boolType(this, null);

    boolType_visited = false;
    return boolType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean boolType_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:72
   */
  @ASTNodeAnnotation.Attribute
  public FloatType floatType() {
    if (floatType_visited) {
      throw new RuntimeException("Circular definition of attr: floatType in class: org.jastadd.ast.AST.InhDecl");
    }
    floatType_visited = true;
    FloatType floatType_value = getParent().Define_floatType(this, null);

    floatType_visited = false;
    return floatType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean floatType_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:76
   */
  @ASTNodeAnnotation.Attribute
  public VoidType voidType() {
    if (voidType_visited) {
      throw new RuntimeException("Circular definition of attr: voidType in class: org.jastadd.ast.AST.InhDecl");
    }
    voidType_visited = true;
    VoidType voidType_value = getParent().Define_voidType(this, null);

    voidType_visited = false;
    return voidType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean voidType_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:80
   */
  @ASTNodeAnnotation.Attribute
  public InferredType inferredType() {
    if (inferredType_visited) {
      throw new RuntimeException("Circular definition of attr: inferredType in class: org.jastadd.ast.AST.InhDecl");
    }
    inferredType_visited = true;
    InferredType inferredType_value = getParent().Define_inferredType(this, null);

    inferredType_visited = false;
    return inferredType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean inferredType_visited = false;
  /**
   * @attribute inh
   * @aspect NTAs
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:84
   */
  @ASTNodeAnnotation.Attribute
  public MismatchedType mismatchedType() {
    if (mismatchedType_visited) {
      throw new RuntimeException("Circular definition of attr: mismatchedType in class: org.jastadd.ast.AST.InhDecl");
    }
    mismatchedType_visited = true;
    MismatchedType mismatchedType_value = getParent().Define_mismatchedType(this, null);

    mismatchedType_visited = false;
    return mismatchedType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean mismatchedType_visited = false;
  /**
   * @attribute inh
   * @aspect UnknownDecl
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/UnknownDecl.jrag:4
   */
  @ASTNodeAnnotation.Attribute
  public UnknownDeclaration UnknownDeclaration() {
    if (UnknownDeclaration_visited) {
      throw new RuntimeException("Circular definition of attr: UnknownDeclaration in class: org.jastadd.ast.AST.InhDecl");
    }
    UnknownDeclaration_visited = true;
    UnknownDeclaration UnknownDeclaration_value = getParent().Define_UnknownDeclaration(this, null);

    UnknownDeclaration_visited = false;
    return UnknownDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean UnknownDeclaration_visited = false;
  /**
   * @apilevel internal
   */
  public Program Define_program(ASTNode caller, ASTNode child) {
    return getParent().Define_program(this, caller);
  }
  /**
   * @apilevel internal
   */
  public FunctionDeclaration Define_linkedFunction(ASTNode caller, ASTNode child) {
    return getParent().Define_linkedFunction(this, caller);
  }
  /**
   * @apilevel internal
   */
  public String Define_uniqueName(ASTNode caller, ASTNode child) {
    return getParent().Define_uniqueName(this, caller);
  }
  /**
   * @apilevel internal
   */
  public UnknownType Define_unknownType(ASTNode caller, ASTNode child) {
    return getParent().Define_unknownType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public IntType Define_intType(ASTNode caller, ASTNode child) {
    return getParent().Define_intType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public BoolType Define_boolType(ASTNode caller, ASTNode child) {
    return getParent().Define_boolType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public FloatType Define_floatType(ASTNode caller, ASTNode child) {
    return getParent().Define_floatType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public VoidType Define_voidType(ASTNode caller, ASTNode child) {
    return getParent().Define_voidType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public InferredType Define_inferredType(ASTNode caller, ASTNode child) {
    return getParent().Define_inferredType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MismatchedType Define_mismatchedType(ASTNode caller, ASTNode child) {
    return getParent().Define_mismatchedType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public IdentifierDeclaration Define_lookup(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_lookup(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_inExprOf(ASTNode caller, ASTNode child, IdentifierDeclaration decl) {
    return getParent().Define_inExprOf(this, caller, decl);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode caller, ASTNode child) {
    return getParent().Define_isVariable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode caller, ASTNode child) {
    return getParent().Define_isFunction(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_usedByFunction(ASTNode caller, ASTNode child) {
    return getParent().Define_usedByFunction(this, caller);
  }
  /**
   * @apilevel internal
   */
  public int Define_numberOfParameters(ASTNode caller, ASTNode child) {
    return getParent().Define_numberOfParameters(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Type Define_linkedValueType(ASTNode caller, ASTNode child) {
    return getParent().Define_linkedValueType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    return getParent().Define_typeConflict(this, caller);
  }
  /**
   * @apilevel internal
   */
  public String Define_typeErrorMsg(ASTNode caller, ASTNode child) {
    return getParent().Define_typeErrorMsg(this, caller);
  }
  /**
   * @apilevel internal
   */
  public UnknownDeclaration Define_UnknownDeclaration(ASTNode caller, ASTNode child) {
    return getParent().Define_UnknownDeclaration(this, caller);
  }
  /**
   * @apilevel internal
   */
  public String Define_idIndex(ASTNode caller, ASTNode child) {
    return getParent().Define_idIndex(this, caller);
  }
}
