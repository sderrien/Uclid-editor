/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Stmt Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.CaseStmtRule#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getCaseStmtRule()
 * @model
 * @generated
 */
public interface CaseStmtRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getCaseStmtRule_Cases()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getCases();

} // CaseStmtRule
