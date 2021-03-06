/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Decl Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.SpecDeclRule#getName <em>Name</em>}</li>
 *   <li>{@link uclid.xtext.uclid.SpecDeclRule#getE <em>E</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getSpecDeclRule()
 * @model
 * @generated
 */
public interface SpecDeclRule extends DeclRule
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uclid.xtext.uclid.UclidPackage#getSpecDeclRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.SpecDeclRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(ExprRule)
   * @see uclid.xtext.uclid.UclidPackage#getSpecDeclRule_E()
   * @model containment="true"
   * @generated
   */
  ExprRule getE();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.SpecDeclRule#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(ExprRule value);

} // SpecDeclRule
