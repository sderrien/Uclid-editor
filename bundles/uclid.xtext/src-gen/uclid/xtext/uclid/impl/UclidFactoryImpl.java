/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uclid.xtext.uclid.ArgMapListRule;
import uclid.xtext.uclid.ArgMapRule;
import uclid.xtext.uclid.ArrayTypeRule;
import uclid.xtext.uclid.Assignment;
import uclid.xtext.uclid.AssignmentRule;
import uclid.xtext.uclid.AxiomDeclRule;
import uclid.xtext.uclid.CallStatement;
import uclid.xtext.uclid.CaseBlockRule;
import uclid.xtext.uclid.CaseStmtRule;
import uclid.xtext.uclid.CmdRule;
import uclid.xtext.uclid.CompoundStatement;
import uclid.xtext.uclid.ConstDecl;
import uclid.xtext.uclid.ConstRule;
import uclid.xtext.uclid.ConstsDeclRule;
import uclid.xtext.uclid.ControlBlockRule;
import uclid.xtext.uclid.DeclRule;
import uclid.xtext.uclid.DefaultCaseBlockRule;
import uclid.xtext.uclid.DefineDeclRule;
import uclid.xtext.uclid.E10Rule;
import uclid.xtext.uclid.E11Rule;
import uclid.xtext.uclid.E12Rule;
import uclid.xtext.uclid.E13Rule;
import uclid.xtext.uclid.E1Rule;
import uclid.xtext.uclid.E2Rule;
import uclid.xtext.uclid.E3Rule;
import uclid.xtext.uclid.E4Rule;
import uclid.xtext.uclid.E5Rule;
import uclid.xtext.uclid.E6Rule;
import uclid.xtext.uclid.E7Rule;
import uclid.xtext.uclid.E8Rule;
import uclid.xtext.uclid.E9Rule;
import uclid.xtext.uclid.EnsureExprsRule;
import uclid.xtext.uclid.EnumRef;
import uclid.xtext.uclid.EnumTypeRule;
import uclid.xtext.uclid.EnumValue;
import uclid.xtext.uclid.ExprListRule;
import uclid.xtext.uclid.ExprRule;
import uclid.xtext.uclid.ForLoopRule;
import uclid.xtext.uclid.FunctionDecl;
import uclid.xtext.uclid.IdListRule;
import uclid.xtext.uclid.IdTypeListRule;
import uclid.xtext.uclid.IfPrimaryExpr;
import uclid.xtext.uclid.IfStmtRule;
import uclid.xtext.uclid.InitDeclRule;
import uclid.xtext.uclid.InputsDeclRule;
import uclid.xtext.uclid.InstanceDecl;
import uclid.xtext.uclid.InvariantClauseRule;
import uclid.xtext.uclid.Lhs;
import uclid.xtext.uclid.ModelRule;
import uclid.xtext.uclid.ModifiesExprsRule;
import uclid.xtext.uclid.ModuleRule;
import uclid.xtext.uclid.NextDeclRule;
import uclid.xtext.uclid.OutputsDeclRule;
import uclid.xtext.uclid.ParenthesisExpr;
import uclid.xtext.uclid.ProcReturnArgRule;
import uclid.xtext.uclid.ProcedureDecl;
import uclid.xtext.uclid.RecordTypeRule;
import uclid.xtext.uclid.RequireExprsRule;
import uclid.xtext.uclid.SharedVarsDeclRule;
import uclid.xtext.uclid.SpecDeclRule;
import uclid.xtext.uclid.Statement;
import uclid.xtext.uclid.StatementRule;
import uclid.xtext.uclid.SynonymTypeRule;
import uclid.xtext.uclid.TopLevel;
import uclid.xtext.uclid.TupleExpr;
import uclid.xtext.uclid.TupleTypeRule;
import uclid.xtext.uclid.Type;
import uclid.xtext.uclid.TypeDecl;
import uclid.xtext.uclid.UclidFactory;
import uclid.xtext.uclid.UclidPackage;
import uclid.xtext.uclid.VarDecl;
import uclid.xtext.uclid.VarRef;
import uclid.xtext.uclid.VarsDeclRule;
import uclid.xtext.uclid.WhileLoopRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UclidFactoryImpl extends EFactoryImpl implements UclidFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UclidFactory init()
  {
    try
    {
      UclidFactory theUclidFactory = (UclidFactory)EPackage.Registry.INSTANCE.getEFactory(UclidPackage.eNS_URI);
      if (theUclidFactory != null)
      {
        return theUclidFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UclidFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UclidFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UclidPackage.MODEL_RULE: return createModelRule();
      case UclidPackage.MODULE_RULE: return createModuleRule();
      case UclidPackage.DECL_RULE: return createDeclRule();
      case UclidPackage.TYPE_DECL: return createTypeDecl();
      case UclidPackage.INPUTS_DECL_RULE: return createInputsDeclRule();
      case UclidPackage.OUTPUTS_DECL_RULE: return createOutputsDeclRule();
      case UclidPackage.VARS_DECL_RULE: return createVarsDeclRule();
      case UclidPackage.VAR_DECL: return createVarDecl();
      case UclidPackage.CONSTS_DECL_RULE: return createConstsDeclRule();
      case UclidPackage.SHARED_VARS_DECL_RULE: return createSharedVarsDeclRule();
      case UclidPackage.DEFINE_DECL_RULE: return createDefineDeclRule();
      case UclidPackage.PROC_RETURN_ARG_RULE: return createProcReturnArgRule();
      case UclidPackage.REQUIRE_EXPRS_RULE: return createRequireExprsRule();
      case UclidPackage.ENSURE_EXPRS_RULE: return createEnsureExprsRule();
      case UclidPackage.MODIFIES_EXPRS_RULE: return createModifiesExprsRule();
      case UclidPackage.INSTANCE_DECL: return createInstanceDecl();
      case UclidPackage.ARG_MAP_LIST_RULE: return createArgMapListRule();
      case UclidPackage.ARG_MAP_RULE: return createArgMapRule();
      case UclidPackage.AXIOM_DECL_RULE: return createAxiomDeclRule();
      case UclidPackage.SPEC_DECL_RULE: return createSpecDeclRule();
      case UclidPackage.INIT_DECL_RULE: return createInitDeclRule();
      case UclidPackage.NEXT_DECL_RULE: return createNextDeclRule();
      case UclidPackage.STATEMENT: return createStatement();
      case UclidPackage.CALL_STATEMENT: return createCallStatement();
      case UclidPackage.ASSIGNMENT_RULE: return createAssignmentRule();
      case UclidPackage.COMPOUND_STATEMENT: return createCompoundStatement();
      case UclidPackage.LHS: return createLhs();
      case UclidPackage.VAR_REF: return createVarRef();
      case UclidPackage.IF_STMT_RULE: return createIfStmtRule();
      case UclidPackage.CASE_STMT_RULE: return createCaseStmtRule();
      case UclidPackage.DEFAULT_CASE_BLOCK_RULE: return createDefaultCaseBlockRule();
      case UclidPackage.CASE_BLOCK_RULE: return createCaseBlockRule();
      case UclidPackage.FOR_LOOP_RULE: return createForLoopRule();
      case UclidPackage.WHILE_LOOP_RULE: return createWhileLoopRule();
      case UclidPackage.INVARIANT_CLAUSE_RULE: return createInvariantClauseRule();
      case UclidPackage.EXPR_RULE: return createExprRule();
      case UclidPackage.E1_RULE: return createE1Rule();
      case UclidPackage.E2_RULE: return createE2Rule();
      case UclidPackage.E3_RULE: return createE3Rule();
      case UclidPackage.E4_RULE: return createE4Rule();
      case UclidPackage.E5_RULE: return createE5Rule();
      case UclidPackage.E6_RULE: return createE6Rule();
      case UclidPackage.E7_RULE: return createE7Rule();
      case UclidPackage.E8_RULE: return createE8Rule();
      case UclidPackage.E9_RULE: return createE9Rule();
      case UclidPackage.E10_RULE: return createE10Rule();
      case UclidPackage.E11_RULE: return createE11Rule();
      case UclidPackage.E12_RULE: return createE12Rule();
      case UclidPackage.ENUM_REF: return createEnumRef();
      case UclidPackage.E13_RULE: return createE13Rule();
      case UclidPackage.TUPLE_EXPR: return createTupleExpr();
      case UclidPackage.IF_PRIMARY_EXPR: return createIfPrimaryExpr();
      case UclidPackage.PARENTHESIS_EXPR: return createParenthesisExpr();
      case UclidPackage.CONST_RULE: return createConstRule();
      case UclidPackage.TYPE: return createType();
      case UclidPackage.CONTROL_BLOCK_RULE: return createControlBlockRule();
      case UclidPackage.CMD_RULE: return createCmdRule();
      case UclidPackage.ID_LIST_RULE: return createIdListRule();
      case UclidPackage.ID_TYPE_LIST_RULE: return createIdTypeListRule();
      case UclidPackage.EXPR_LIST_RULE: return createExprListRule();
      case UclidPackage.TOP_LEVEL: return createTopLevel();
      case UclidPackage.MODULE: return createModule();
      case UclidPackage.CONST_DECL: return createConstDecl();
      case UclidPackage.FUNCTION_DECL: return createFunctionDecl();
      case UclidPackage.PROCEDURE_DECL: return createProcedureDecl();
      case UclidPackage.STATEMENT_RULE: return createStatementRule();
      case UclidPackage.ASSIGNMENT: return createAssignment();
      case UclidPackage.ENUM_TYPE_RULE: return createEnumTypeRule();
      case UclidPackage.ENUM_VALUE: return createEnumValue();
      case UclidPackage.TUPLE_TYPE_RULE: return createTupleTypeRule();
      case UclidPackage.RECORD_TYPE_RULE: return createRecordTypeRule();
      case UclidPackage.ARRAY_TYPE_RULE: return createArrayTypeRule();
      case UclidPackage.SYNONYM_TYPE_RULE: return createSynonymTypeRule();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelRule createModelRule()
  {
    ModelRuleImpl modelRule = new ModelRuleImpl();
    return modelRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleRule createModuleRule()
  {
    ModuleRuleImpl moduleRule = new ModuleRuleImpl();
    return moduleRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclRule createDeclRule()
  {
    DeclRuleImpl declRule = new DeclRuleImpl();
    return declRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeDecl createTypeDecl()
  {
    TypeDeclImpl typeDecl = new TypeDeclImpl();
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputsDeclRule createInputsDeclRule()
  {
    InputsDeclRuleImpl inputsDeclRule = new InputsDeclRuleImpl();
    return inputsDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OutputsDeclRule createOutputsDeclRule()
  {
    OutputsDeclRuleImpl outputsDeclRule = new OutputsDeclRuleImpl();
    return outputsDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarsDeclRule createVarsDeclRule()
  {
    VarsDeclRuleImpl varsDeclRule = new VarsDeclRuleImpl();
    return varsDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstsDeclRule createConstsDeclRule()
  {
    ConstsDeclRuleImpl constsDeclRule = new ConstsDeclRuleImpl();
    return constsDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SharedVarsDeclRule createSharedVarsDeclRule()
  {
    SharedVarsDeclRuleImpl sharedVarsDeclRule = new SharedVarsDeclRuleImpl();
    return sharedVarsDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefineDeclRule createDefineDeclRule()
  {
    DefineDeclRuleImpl defineDeclRule = new DefineDeclRuleImpl();
    return defineDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcReturnArgRule createProcReturnArgRule()
  {
    ProcReturnArgRuleImpl procReturnArgRule = new ProcReturnArgRuleImpl();
    return procReturnArgRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RequireExprsRule createRequireExprsRule()
  {
    RequireExprsRuleImpl requireExprsRule = new RequireExprsRuleImpl();
    return requireExprsRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnsureExprsRule createEnsureExprsRule()
  {
    EnsureExprsRuleImpl ensureExprsRule = new EnsureExprsRuleImpl();
    return ensureExprsRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModifiesExprsRule createModifiesExprsRule()
  {
    ModifiesExprsRuleImpl modifiesExprsRule = new ModifiesExprsRuleImpl();
    return modifiesExprsRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InstanceDecl createInstanceDecl()
  {
    InstanceDeclImpl instanceDecl = new InstanceDeclImpl();
    return instanceDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArgMapListRule createArgMapListRule()
  {
    ArgMapListRuleImpl argMapListRule = new ArgMapListRuleImpl();
    return argMapListRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArgMapRule createArgMapRule()
  {
    ArgMapRuleImpl argMapRule = new ArgMapRuleImpl();
    return argMapRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AxiomDeclRule createAxiomDeclRule()
  {
    AxiomDeclRuleImpl axiomDeclRule = new AxiomDeclRuleImpl();
    return axiomDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpecDeclRule createSpecDeclRule()
  {
    SpecDeclRuleImpl specDeclRule = new SpecDeclRuleImpl();
    return specDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitDeclRule createInitDeclRule()
  {
    InitDeclRuleImpl initDeclRule = new InitDeclRuleImpl();
    return initDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NextDeclRule createNextDeclRule()
  {
    NextDeclRuleImpl nextDeclRule = new NextDeclRuleImpl();
    return nextDeclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CallStatement createCallStatement()
  {
    CallStatementImpl callStatement = new CallStatementImpl();
    return callStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignmentRule createAssignmentRule()
  {
    AssignmentRuleImpl assignmentRule = new AssignmentRuleImpl();
    return assignmentRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompoundStatement createCompoundStatement()
  {
    CompoundStatementImpl compoundStatement = new CompoundStatementImpl();
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lhs createLhs()
  {
    LhsImpl lhs = new LhsImpl();
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfStmtRule createIfStmtRule()
  {
    IfStmtRuleImpl ifStmtRule = new IfStmtRuleImpl();
    return ifStmtRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseStmtRule createCaseStmtRule()
  {
    CaseStmtRuleImpl caseStmtRule = new CaseStmtRuleImpl();
    return caseStmtRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefaultCaseBlockRule createDefaultCaseBlockRule()
  {
    DefaultCaseBlockRuleImpl defaultCaseBlockRule = new DefaultCaseBlockRuleImpl();
    return defaultCaseBlockRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseBlockRule createCaseBlockRule()
  {
    CaseBlockRuleImpl caseBlockRule = new CaseBlockRuleImpl();
    return caseBlockRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForLoopRule createForLoopRule()
  {
    ForLoopRuleImpl forLoopRule = new ForLoopRuleImpl();
    return forLoopRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhileLoopRule createWhileLoopRule()
  {
    WhileLoopRuleImpl whileLoopRule = new WhileLoopRuleImpl();
    return whileLoopRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvariantClauseRule createInvariantClauseRule()
  {
    InvariantClauseRuleImpl invariantClauseRule = new InvariantClauseRuleImpl();
    return invariantClauseRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprRule createExprRule()
  {
    ExprRuleImpl exprRule = new ExprRuleImpl();
    return exprRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E1Rule createE1Rule()
  {
    E1RuleImpl e1Rule = new E1RuleImpl();
    return e1Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E2Rule createE2Rule()
  {
    E2RuleImpl e2Rule = new E2RuleImpl();
    return e2Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E3Rule createE3Rule()
  {
    E3RuleImpl e3Rule = new E3RuleImpl();
    return e3Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E4Rule createE4Rule()
  {
    E4RuleImpl e4Rule = new E4RuleImpl();
    return e4Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E5Rule createE5Rule()
  {
    E5RuleImpl e5Rule = new E5RuleImpl();
    return e5Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E6Rule createE6Rule()
  {
    E6RuleImpl e6Rule = new E6RuleImpl();
    return e6Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E7Rule createE7Rule()
  {
    E7RuleImpl e7Rule = new E7RuleImpl();
    return e7Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E8Rule createE8Rule()
  {
    E8RuleImpl e8Rule = new E8RuleImpl();
    return e8Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E9Rule createE9Rule()
  {
    E9RuleImpl e9Rule = new E9RuleImpl();
    return e9Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E10Rule createE10Rule()
  {
    E10RuleImpl e10Rule = new E10RuleImpl();
    return e10Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E11Rule createE11Rule()
  {
    E11RuleImpl e11Rule = new E11RuleImpl();
    return e11Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E12Rule createE12Rule()
  {
    E12RuleImpl e12Rule = new E12RuleImpl();
    return e12Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumRef createEnumRef()
  {
    EnumRefImpl enumRef = new EnumRefImpl();
    return enumRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public E13Rule createE13Rule()
  {
    E13RuleImpl e13Rule = new E13RuleImpl();
    return e13Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleExpr createTupleExpr()
  {
    TupleExprImpl tupleExpr = new TupleExprImpl();
    return tupleExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfPrimaryExpr createIfPrimaryExpr()
  {
    IfPrimaryExprImpl ifPrimaryExpr = new IfPrimaryExprImpl();
    return ifPrimaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParenthesisExpr createParenthesisExpr()
  {
    ParenthesisExprImpl parenthesisExpr = new ParenthesisExprImpl();
    return parenthesisExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstRule createConstRule()
  {
    ConstRuleImpl constRule = new ConstRuleImpl();
    return constRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlBlockRule createControlBlockRule()
  {
    ControlBlockRuleImpl controlBlockRule = new ControlBlockRuleImpl();
    return controlBlockRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CmdRule createCmdRule()
  {
    CmdRuleImpl cmdRule = new CmdRuleImpl();
    return cmdRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdListRule createIdListRule()
  {
    IdListRuleImpl idListRule = new IdListRuleImpl();
    return idListRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdTypeListRule createIdTypeListRule()
  {
    IdTypeListRuleImpl idTypeListRule = new IdTypeListRuleImpl();
    return idTypeListRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprListRule createExprListRule()
  {
    ExprListRuleImpl exprListRule = new ExprListRuleImpl();
    return exprListRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TopLevel createTopLevel()
  {
    TopLevelImpl topLevel = new TopLevelImpl();
    return topLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uclid.xtext.uclid.Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstDecl createConstDecl()
  {
    ConstDeclImpl constDecl = new ConstDeclImpl();
    return constDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionDecl createFunctionDecl()
  {
    FunctionDeclImpl functionDecl = new FunctionDeclImpl();
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcedureDecl createProcedureDecl()
  {
    ProcedureDeclImpl procedureDecl = new ProcedureDeclImpl();
    return procedureDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatementRule createStatementRule()
  {
    StatementRuleImpl statementRule = new StatementRuleImpl();
    return statementRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumTypeRule createEnumTypeRule()
  {
    EnumTypeRuleImpl enumTypeRule = new EnumTypeRuleImpl();
    return enumTypeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumValue createEnumValue()
  {
    EnumValueImpl enumValue = new EnumValueImpl();
    return enumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleTypeRule createTupleTypeRule()
  {
    TupleTypeRuleImpl tupleTypeRule = new TupleTypeRuleImpl();
    return tupleTypeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecordTypeRule createRecordTypeRule()
  {
    RecordTypeRuleImpl recordTypeRule = new RecordTypeRuleImpl();
    return recordTypeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayTypeRule createArrayTypeRule()
  {
    ArrayTypeRuleImpl arrayTypeRule = new ArrayTypeRuleImpl();
    return arrayTypeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SynonymTypeRule createSynonymTypeRule()
  {
    SynonymTypeRuleImpl synonymTypeRule = new SynonymTypeRuleImpl();
    return synonymTypeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UclidPackage getUclidPackage()
  {
    return (UclidPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UclidPackage getPackage()
  {
    return UclidPackage.eINSTANCE;
  }

} //UclidFactoryImpl
