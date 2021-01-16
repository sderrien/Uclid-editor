/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Return Arg Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.ProcReturnArgRule#getL <em>L</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getProcReturnArgRule()
 * @model
 * @generated
 */
public interface ProcReturnArgRule extends EObject
{
  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(IdTypeListRule)
   * @see uclid.xtext.uclid.UclidPackage#getProcReturnArgRule_L()
   * @model containment="true"
   * @generated
   */
  IdTypeListRule getL();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.ProcReturnArgRule#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(IdTypeListRule value);

} // ProcReturnArgRule