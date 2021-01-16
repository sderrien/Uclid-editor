/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Block Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.CaseBlockRule#getE <em>E</em>}</li>
 *   <li>{@link uclid.xtext.uclid.CaseBlockRule#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getCaseBlockRule()
 * @model
 * @generated
 */
public interface CaseBlockRule extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(ExprRule)
   * @see uclid.xtext.uclid.UclidPackage#getCaseBlockRule_E()
   * @model containment="true"
   * @generated
   */
  ExprRule getE();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.CaseBlockRule#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(ExprRule value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(CompoundStatement)
   * @see uclid.xtext.uclid.UclidPackage#getCaseBlockRule_Body()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getBody();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.CaseBlockRule#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(CompoundStatement value);

} // CaseBlockRule
