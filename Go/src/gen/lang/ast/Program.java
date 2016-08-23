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
 * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Go.ast:1
 * @production Program : {@link ASTNode} ::= <span class="component">{@link Global}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Interpreter.jrag:109
   */
  public void eval(){
    try {
      int mainFunctionIndex = -1;
      ActivationRecord startingRecord = new ActivationRecord();

      for(int i = 0; i < getNumGlobal(); ++i){
        if(getGlobal(i).getIdentifierDeclaration().getIdentifier().equals("main")){
          mainFunctionIndex = i;
        }

        if (getGlobal(i) instanceof GlobalVariable) {
          GlobalVariable globalVariable = (GlobalVariable) getGlobal(i);
          startingRecord.put(globalVariable.getIdentifierDeclaration().uniqueName(), globalVariable.getExpression().eval(startingRecord));
        }
      }

      if (mainFunctionIndex >= 0) {
        ValueContainer returnCode = ((FunctionDeclaration) getGlobal(mainFunctionIndex)).eval(startingRecord);
        return;
      }

      throw new RuntimeException("Could not find a main function");
    } catch(RuntimeException e){
      System.out.println(e.getMessage());
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Program(List<Global> p0) {
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
    unknownType_reset();
    intType_reset();
    boolType_reset();
    floatType_reset();
    voidType_reset();
    inferredType_reset();
    mismatchedType_reset();
    predefinedFunctions_reset();
    UnknownDeclaration_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:41
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Program_errors_visited = false;
    Program_errors_computed = false;
    Program_errors_value = null;
    Program_errors_contributors = null;
    collect_contributors_Program_errors = false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:52
   */
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:59
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
   * @declaredat ASTNode:78
   */
  @Deprecated
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:88
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
   * @declaredat ASTNode:108
   */
  public Program treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:115
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Global list.
   * @param list The new list node to be used as the Global list.
   * @apilevel high-level
   */
  public void setGlobalList(List<Global> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Global list.
   * @return Number of children in the Global list.
   * @apilevel high-level
   */
  public int getNumGlobal() {
    return getGlobalList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Global list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Global list.
   * @apilevel low-level
   */
  public int getNumGlobalNoTransform() {
    return getGlobalListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Global list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Global list.
   * @apilevel high-level
   */
  public Global getGlobal(int i) {
    return (Global) getGlobalList().getChild(i);
  }
  /**
   * Check whether the Global list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasGlobal() {
    return getGlobalList().getNumChild() != 0;
  }
  /**
   * Append an element to the Global list.
   * @param node The element to append to the Global list.
   * @apilevel high-level
   */
  public void addGlobal(Global node) {
    List<Global> list = (parent == null) ? getGlobalListNoTransform() : getGlobalList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addGlobalNoTransform(Global node) {
    List<Global> list = getGlobalListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Global list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setGlobal(Global node, int i) {
    List<Global> list = getGlobalList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Global list.
   * @return The node representing the Global list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Global")
  public List<Global> getGlobalList() {
    List<Global> list = (List<Global>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Global list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Global list.
   * @apilevel low-level
   */
  public List<Global> getGlobalListNoTransform() {
    return (List<Global>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Global list.
   * @return The node representing the Global list.
   * @apilevel high-level
   */
  public List<Global> getGlobals() {
    return getGlobalList();
  }
  /**
   * Retrieves the Global list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Global list.
   * @apilevel low-level
   */
  public List<Global> getGlobalsNoTransform() {
    return getGlobalListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:26
   */
    private boolean collect_contributors_Program_errors = false;
  protected void collect_contributors_Program_errors() {
    if (collect_contributors_Program_errors) return;
    super.collect_contributors_Program_errors();
    collect_contributors_Program_errors = true;
  }

  /**
   * @apilevel internal
   */
  protected boolean unknownType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean unknownType_computed = false;
  /**
   * @apilevel internal
   */
  protected UnknownType unknownType_value;
  /**
   * @apilevel internal
   */
  private void unknownType_reset() {
    unknownType_computed = false;
    unknownType_value = null;
    unknownType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public UnknownType unknownType() {
    ASTNode$State state = state();
    if (unknownType_computed) {
      return unknownType_value;
    }
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attr: unknownType in class: org.jastadd.ast.AST.SynDecl");
    }
    unknownType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    unknownType_value = new UnknownType();
    unknownType_value.setParent(this);
    if (true) {
      unknownType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    unknownType_visited = false;
    return unknownType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean intType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean intType_computed = false;
  /**
   * @apilevel internal
   */
  protected IntType intType_value;
  /**
   * @apilevel internal
   */
  private void intType_reset() {
    intType_computed = false;
    intType_value = null;
    intType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public IntType intType() {
    ASTNode$State state = state();
    if (intType_computed) {
      return intType_value;
    }
    if (intType_visited) {
      throw new RuntimeException("Circular definition of attr: intType in class: org.jastadd.ast.AST.SynDecl");
    }
    intType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    intType_value = new IntType();
    intType_value.setParent(this);
    if (true) {
      intType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    intType_visited = false;
    return intType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean boolType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean boolType_computed = false;
  /**
   * @apilevel internal
   */
  protected BoolType boolType_value;
  /**
   * @apilevel internal
   */
  private void boolType_reset() {
    boolType_computed = false;
    boolType_value = null;
    boolType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public BoolType boolType() {
    ASTNode$State state = state();
    if (boolType_computed) {
      return boolType_value;
    }
    if (boolType_visited) {
      throw new RuntimeException("Circular definition of attr: boolType in class: org.jastadd.ast.AST.SynDecl");
    }
    boolType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    boolType_value = new BoolType();
    boolType_value.setParent(this);
    if (true) {
      boolType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    boolType_visited = false;
    return boolType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean floatType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean floatType_computed = false;
  /**
   * @apilevel internal
   */
  protected FloatType floatType_value;
  /**
   * @apilevel internal
   */
  private void floatType_reset() {
    floatType_computed = false;
    floatType_value = null;
    floatType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public FloatType floatType() {
    ASTNode$State state = state();
    if (floatType_computed) {
      return floatType_value;
    }
    if (floatType_visited) {
      throw new RuntimeException("Circular definition of attr: floatType in class: org.jastadd.ast.AST.SynDecl");
    }
    floatType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    floatType_value = new FloatType();
    floatType_value.setParent(this);
    if (true) {
      floatType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    floatType_visited = false;
    return floatType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean voidType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean voidType_computed = false;
  /**
   * @apilevel internal
   */
  protected VoidType voidType_value;
  /**
   * @apilevel internal
   */
  private void voidType_reset() {
    voidType_computed = false;
    voidType_value = null;
    voidType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public VoidType voidType() {
    ASTNode$State state = state();
    if (voidType_computed) {
      return voidType_value;
    }
    if (voidType_visited) {
      throw new RuntimeException("Circular definition of attr: voidType in class: org.jastadd.ast.AST.SynDecl");
    }
    voidType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    voidType_value = new VoidType();
    voidType_value.setParent(this);
    if (true) {
      voidType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    voidType_visited = false;
    return voidType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean inferredType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean inferredType_computed = false;
  /**
   * @apilevel internal
   */
  protected InferredType inferredType_value;
  /**
   * @apilevel internal
   */
  private void inferredType_reset() {
    inferredType_computed = false;
    inferredType_value = null;
    inferredType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public InferredType inferredType() {
    ASTNode$State state = state();
    if (inferredType_computed) {
      return inferredType_value;
    }
    if (inferredType_visited) {
      throw new RuntimeException("Circular definition of attr: inferredType in class: org.jastadd.ast.AST.SynDecl");
    }
    inferredType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    inferredType_value = new InferredType();
    inferredType_value.setParent(this);
    if (true) {
      inferredType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    inferredType_visited = false;
    return inferredType_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean mismatchedType_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean mismatchedType_computed = false;
  /**
   * @apilevel internal
   */
  protected MismatchedType mismatchedType_value;
  /**
   * @apilevel internal
   */
  private void mismatchedType_reset() {
    mismatchedType_computed = false;
    mismatchedType_value = null;
    mismatchedType_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public MismatchedType mismatchedType() {
    ASTNode$State state = state();
    if (mismatchedType_computed) {
      return mismatchedType_value;
    }
    if (mismatchedType_visited) {
      throw new RuntimeException("Circular definition of attr: mismatchedType in class: org.jastadd.ast.AST.SynDecl");
    }
    mismatchedType_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    mismatchedType_value = new MismatchedType();
    mismatchedType_value.setParent(this);
    if (true) {
      mismatchedType_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    mismatchedType_visited = false;
    return mismatchedType_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set localLookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:7
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
        for (FunctionDeclaration fDecl : predefinedFunctions()) {
          if (fDecl.getIdentifierDeclaration().getIdentifier().equals(name)) {
            return fDecl.getIdentifierDeclaration();
          }
        }
    
        for (Global gDecl : getGlobals()) {
          if (gDecl.getIdentifierDeclaration().getIdentifier().equals(name)) {
            return gDecl.getIdentifierDeclaration();
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
  protected boolean predefinedFunctions_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean predefinedFunctions_computed = false;
  /**
   * @apilevel internal
   */
  protected List<FunctionDeclaration> predefinedFunctions_value;
  /**
   * @apilevel internal
   */
  private void predefinedFunctions_reset() {
    predefinedFunctions_computed = false;
    predefinedFunctions_value = null;
    predefinedFunctions_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public List<FunctionDeclaration> predefinedFunctions() {
    ASTNode$State state = state();
    if (predefinedFunctions_computed) {
      return predefinedFunctions_value;
    }
    if (predefinedFunctions_visited) {
      throw new RuntimeException("Circular definition of attr: predefinedFunctions in class: org.jastadd.ast.AST.SynDecl");
    }
    predefinedFunctions_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    predefinedFunctions_value = predefinedFunctions_compute();
    predefinedFunctions_value.setParent(this);
    if (true) {
      predefinedFunctions_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    predefinedFunctions_visited = false;
    return predefinedFunctions_value;
  }
  /**
   * @apilevel internal
   */
  private List<FunctionDeclaration> predefinedFunctions_compute() {
      List<FunctionDeclaration> list = new List<FunctionDeclaration>();
      list.add(new FunctionDeclaration(new IdentifierDeclaration(new VoidType(),"print", new Constant()), new List<IdentifierDeclaration>(new IdentifierDeclaration()), new VoidType(), new Block(new List<Statement>())));
      return list;
    }
  /**
   * @apilevel internal
   */
  protected boolean UnknownDeclaration_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean UnknownDeclaration_computed = false;
  /**
   * @apilevel internal
   */
  protected UnknownDeclaration UnknownDeclaration_value;
  /**
   * @apilevel internal
   */
  private void UnknownDeclaration_reset() {
    UnknownDeclaration_computed = false;
    UnknownDeclaration_value = null;
    UnknownDeclaration_visited = false;
  }
  @ASTNodeAnnotation.Attribute
  public UnknownDeclaration UnknownDeclaration() {
    ASTNode$State state = state();
    if (UnknownDeclaration_computed) {
      return UnknownDeclaration_value;
    }
    if (UnknownDeclaration_visited) {
      throw new RuntimeException("Circular definition of attr: UnknownDeclaration in class: org.jastadd.ast.AST.SynDecl");
    }
    UnknownDeclaration_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    UnknownDeclaration_value = new UnknownDeclaration(new UnknownType(),"<unknown>", new Constant());
    UnknownDeclaration_value.setParent(this);
    if (true) {
      UnknownDeclaration_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    UnknownDeclaration_visited = false;
    return UnknownDeclaration_value;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:28
   * @apilevel internal
   */
  public Program Define_program(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return this;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:2
   * @apilevel internal
   */
  public FunctionDeclaration Define_linkedFunction(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return null;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:14
   * @apilevel internal
   */
  public String Define_uniqueName(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return UnknownDeclaration().getIdentifier();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:60
   * @apilevel internal
   */
  public UnknownType Define_unknownType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return unknownType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:64
   * @apilevel internal
   */
  public IntType Define_intType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return intType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:68
   * @apilevel internal
   */
  public BoolType Define_boolType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return boolType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:72
   * @apilevel internal
   */
  public FloatType Define_floatType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return floatType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:76
   * @apilevel internal
   */
  public VoidType Define_voidType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return voidType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:80
   * @apilevel internal
   */
  public InferredType Define_inferredType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return inferredType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/HelperAttributes.jrag:84
   * @apilevel internal
   */
  public MismatchedType Define_mismatchedType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return mismatchedType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:90
   * @apilevel internal
   */
  public IdentifierDeclaration Define_lookup(ASTNode caller, ASTNode child, String name) {
    int childIndex = this.getIndexOfChild(caller);
    return localLookup(name);
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:103
   * @apilevel internal
   */
  public boolean Define_inExprOf(ASTNode caller, ASTNode child, IdentifierDeclaration decl) {
    int childIndex = this.getIndexOfChild(caller);
    return false;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:114
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return true;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return false;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:116
   * @apilevel internal
   */
  public boolean Define_usedByFunction(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return false;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/NameAnalysis.jrag:128
   * @apilevel internal
   */
  public int Define_numberOfParameters(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return 0;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:7
   * @apilevel internal
   */
  public Type Define_linkedValueType(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return unknownType();
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:86
   * @apilevel internal
   */
  public boolean Define_typeConflict(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return false;
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/TypeAnalysis.jrag:89
   * @apilevel internal
   */
  public String Define_typeErrorMsg(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return "If you read this, something is wrong";
  }
  /**
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/UnknownDecl.jrag:4
   * @apilevel internal
   */
  public UnknownDeclaration Define_UnknownDeclaration(ASTNode caller, ASTNode child) {
    int childIndex = this.getIndexOfChild(caller);
    return UnknownDeclaration();
  }
  /**
   * @attribute coll
   * @aspect Errors
   * @declaredat /Users/emingigovic/Desktop/Projekt_Kompilatorer/2015-go-type-inference/Go/src/jastadd/Errors.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public Set<ErrorMessage> errors() {
    ASTNode$State state = state();
    if (Program_errors_computed) {
      return Program_errors_value;
    }
    if (Program_errors_visited) {
      throw new RuntimeException("Circular definition of attr: errors in class: org.jastadd.ast.AST.CollDecl");
    }
    Program_errors_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    Program_errors_value = errors_compute();
    if (true) {
      Program_errors_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    Program_errors_visited = false;
    return Program_errors_value;
  }
  java.util.Collection Program_errors_contributors;

  /**
   * @apilevel internal
   * @return the contributor set for errors
   */
  public java.util.Collection Program_errors_contributors() {
    if (Program_errors_contributors == null)
      Program_errors_contributors  = new java.util.LinkedList();
    return Program_errors_contributors;
  }

  /**
   * @apilevel internal
   */
  private Set<ErrorMessage> errors_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program)) {
      node = node.getParent();
    }
    Program root = (Program) node;
    root.collect_contributors_Program_errors();
    Program_errors_value = new TreeSet<ErrorMessage>();
    if (Program_errors_contributors != null) {
      for (java.util.Iterator iter = Program_errors_contributors.iterator(); iter.hasNext(); ) {
        ASTNode contributor = (ASTNode) iter.next();
        contributor.contributeTo_Program_Program_errors(Program_errors_value);
      }
    }
    // TODO: disabled temporarily since collections may not be cached
    //Program_errors_contributors = null;
    return Program_errors_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean Program_errors_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean Program_errors_computed = false;
  /**
   * @apilevel internal
   */
  protected Set<ErrorMessage> Program_errors_value;
  /**
   * @apilevel internal
   */
  private void Program_errors_reset() {
    Program_errors_computed = false;
    Program_errors_value = null;
    Program_errors_visited = false;
  }
}
