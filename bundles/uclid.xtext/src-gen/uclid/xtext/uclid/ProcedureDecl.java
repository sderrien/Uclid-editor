/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.ProcedureDecl#getRet <em>Ret</em>}</li>
 *   <li>{@link uclid.xtext.uclid.ProcedureDecl#getReq <em>Req</em>}</li>
 *   <li>{@link uclid.xtext.uclid.ProcedureDecl#getEnsure <em>Ensure</em>}</li>
 *   <li>{@link uclid.xtext.uclid.ProcedureDecl#getModifies <em>Modifies</em>}</li>
 *   <li>{@link uclid.xtext.uclid.ProcedureDecl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getProcedureDecl()
 * @model
 * @generated
 */
public interface ProcedureDecl extends FuncDecl
{
  /**
   * Returns the value of the '<em><b>Ret</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret</em>' containment reference.
   * @see #setRet(ProcReturnArgRule)
   * @see uclid.xtext.uclid.UclidPackage#getProcedureDecl_Ret()
   * @model containment="true"
   * @generated
   */
  ProcReturnArgRule getRet();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.ProcedureDecl#getRet <em>Ret</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret</em>' containment reference.
   * @see #getRet()
   * @generated
   */
  void setRet(ProcReturnArgRule value);

  /**
   * Returns the value of the '<em><b>Req</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.RequireExprsRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getProcedureDecl_Req()
   * @model containment="true"
   * @generated
   */
  EList<RequireExprsRule> getReq();

  /**
   * Returns the value of the '<em><b>Ensure</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.EnsureExprsRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ensure</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getProcedureDecl_Ensure()
   * @model containment="true"
   * @generated
   */
  EList<EnsureExprsRule> getEnsure();

  /**
   * Returns the value of the '<em><b>Modifies</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.ModifiesExprsRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifies</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getProcedureDecl_Modifies()
   * @model containment="true"
   * @generated
   */
  EList<ModifiesExprsRule> getModifies();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(CompoundStatement)
   * @see uclid.xtext.uclid.UclidPackage#getProcedureDecl_Body()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getBody();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.ProcedureDecl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(CompoundStatement value);

} // ProcedureDecl
