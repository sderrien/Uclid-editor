/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Decl Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.DefineDeclRule#getName <em>Name</em>}</li>
 *   <li>{@link uclid.xtext.uclid.DefineDeclRule#getL <em>L</em>}</li>
 *   <li>{@link uclid.xtext.uclid.DefineDeclRule#getT <em>T</em>}</li>
 *   <li>{@link uclid.xtext.uclid.DefineDeclRule#getE <em>E</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getDefineDeclRule()
 * @model
 * @generated
 */
public interface DefineDeclRule extends DeclRule
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uclid.xtext.uclid.UclidPackage#getDefineDeclRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.DefineDeclRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(IdTypeListRule)
   * @see uclid.xtext.uclid.UclidPackage#getDefineDeclRule_L()
   * @model containment="true"
   * @generated
   */
  IdTypeListRule getL();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.DefineDeclRule#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(IdTypeListRule value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Type)
   * @see uclid.xtext.uclid.UclidPackage#getDefineDeclRule_T()
   * @model containment="true"
   * @generated
   */
  Type getT();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.DefineDeclRule#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Type value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(ExprRule)
   * @see uclid.xtext.uclid.UclidPackage#getDefineDeclRule_E()
   * @model containment="true"
   * @generated
   */
  ExprRule getE();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.DefineDeclRule#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(ExprRule value);

} // DefineDeclRule