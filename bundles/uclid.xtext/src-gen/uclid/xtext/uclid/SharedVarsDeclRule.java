/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Vars Decl Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.SharedVarsDeclRule#getVars <em>Vars</em>}</li>
 *   <li>{@link uclid.xtext.uclid.SharedVarsDeclRule#getT <em>T</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getSharedVarsDeclRule()
 * @model
 * @generated
 */
public interface SharedVarsDeclRule extends DeclRule
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.VarDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getSharedVarsDeclRule_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getVars();

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Type)
   * @see uclid.xtext.uclid.UclidPackage#getSharedVarsDeclRule_T()
   * @model containment="true"
   * @generated
   */
  Type getT();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.SharedVarsDeclRule#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Type value);

} // SharedVarsDeclRule
