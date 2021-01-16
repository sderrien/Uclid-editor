/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E8 Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.E8Rule#getE <em>E</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getE8Rule()
 * @model
 * @generated
 */
public interface E8Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.E9Rule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getE8Rule_E()
   * @model containment="true"
   * @generated
   */
  EList<E9Rule> getE();

} // E8Rule
