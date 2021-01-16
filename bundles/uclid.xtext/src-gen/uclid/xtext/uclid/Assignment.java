/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.Assignment#getLhs <em>Lhs</em>}</li>
 *   <li>{@link uclid.xtext.uclid.Assignment#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends AssignmentRule
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.Lhs}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getAssignment_Lhs()
   * @model containment="true"
   * @generated
   */
  EList<Lhs> getLhs();

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.ExprRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getAssignment_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<ExprRule> getExprs();

} // Assignment