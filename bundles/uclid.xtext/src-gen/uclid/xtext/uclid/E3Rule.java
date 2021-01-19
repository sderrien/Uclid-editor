/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E3 Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.E3Rule#getE <em>E</em>}</li>
 *   <li>{@link uclid.xtext.uclid.E3Rule#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getE3Rule()
 * @model
 * @generated
 */
public interface E3Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getE3Rule_E()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getE();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see uclid.xtext.uclid.UclidPackage#getE3Rule_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.E3Rule#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // E3Rule
