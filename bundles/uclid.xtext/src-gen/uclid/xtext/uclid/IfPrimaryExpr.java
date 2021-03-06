/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.IfPrimaryExpr#getC <em>C</em>}</li>
 *   <li>{@link uclid.xtext.uclid.IfPrimaryExpr#getE <em>E</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getIfPrimaryExpr()
 * @model
 * @generated
 */
public interface IfPrimaryExpr extends E13Rule
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(ExprRule)
   * @see uclid.xtext.uclid.UclidPackage#getIfPrimaryExpr_C()
   * @model containment="true"
   * @generated
   */
  ExprRule getC();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.IfPrimaryExpr#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(ExprRule value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.ExprRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getIfPrimaryExpr_E()
   * @model containment="true"
   * @generated
   */
  EList<ExprRule> getE();

} // IfPrimaryExpr
