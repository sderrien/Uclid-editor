/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.IfStmtRule#getC <em>C</em>}</li>
 *   <li>{@link uclid.xtext.uclid.IfStmtRule#getThen <em>Then</em>}</li>
 *   <li>{@link uclid.xtext.uclid.IfStmtRule#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getIfStmtRule()
 * @model
 * @generated
 */
public interface IfStmtRule extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(ExprRule)
   * @see uclid.xtext.uclid.UclidPackage#getIfStmtRule_C()
   * @model containment="true"
   * @generated
   */
  ExprRule getC();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.IfStmtRule#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(ExprRule value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(CompoundStatement)
   * @see uclid.xtext.uclid.UclidPackage#getIfStmtRule_Then()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getThen();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.IfStmtRule#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(CompoundStatement value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(CompoundStatement)
   * @see uclid.xtext.uclid.UclidPackage#getIfStmtRule_Else()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getElse();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.IfStmtRule#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(CompoundStatement value);

} // IfStmtRule
