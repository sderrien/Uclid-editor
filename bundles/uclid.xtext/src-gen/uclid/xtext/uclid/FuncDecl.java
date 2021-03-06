/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.FuncDecl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uclid.xtext.uclid.FuncDecl#getT <em>T</em>}</li>
 *   <li>{@link uclid.xtext.uclid.FuncDecl#getE <em>E</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getFuncDecl()
 * @model
 * @generated
 */
public interface FuncDecl extends DeclRule, TypedObjectDecl
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(ArgList)
   * @see uclid.xtext.uclid.UclidPackage#getFuncDecl_Inputs()
   * @model containment="true"
   * @generated
   */
  ArgList getInputs();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.FuncDecl#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(ArgList value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Type)
   * @see uclid.xtext.uclid.UclidPackage#getFuncDecl_T()
   * @model containment="true"
   * @generated
   */
  Type getT();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.FuncDecl#getT <em>T</em>}' containment reference.
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
   * @see uclid.xtext.uclid.UclidPackage#getFuncDecl_E()
   * @model containment="true"
   * @generated
   */
  ExprRule getE();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.FuncDecl#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(ExprRule value);

} // FuncDecl
