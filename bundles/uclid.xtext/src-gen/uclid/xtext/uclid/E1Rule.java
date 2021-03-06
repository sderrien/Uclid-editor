/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E1 Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.E1Rule#getPred <em>Pred</em>}</li>
 *   <li>{@link uclid.xtext.uclid.E1Rule#getExistential <em>Existential</em>}</li>
 *   <li>{@link uclid.xtext.uclid.E1Rule#getA <em>A</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getE1Rule()
 * @model
 * @generated
 */
public interface E1Rule extends ExprRule
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' attribute.
   * @see #setPred(String)
   * @see uclid.xtext.uclid.UclidPackage#getE1Rule_Pred()
   * @model
   * @generated
   */
  String getPred();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.E1Rule#getPred <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' attribute.
   * @see #getPred()
   * @generated
   */
  void setPred(String value);

  /**
   * Returns the value of the '<em><b>Existential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Existential</em>' containment reference.
   * @see #setExistential(EObject)
   * @see uclid.xtext.uclid.UclidPackage#getE1Rule_Existential()
   * @model containment="true"
   * @generated
   */
  EObject getExistential();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.E1Rule#getExistential <em>Existential</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Existential</em>' containment reference.
   * @see #getExistential()
   * @generated
   */
  void setExistential(EObject value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(E1Rule)
   * @see uclid.xtext.uclid.UclidPackage#getE1Rule_A()
   * @model containment="true"
   * @generated
   */
  E1Rule getA();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.E1Rule#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(E1Rule value);

} // E1Rule
