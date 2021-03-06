/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Decl Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.InitDeclRule#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getInitDeclRule()
 * @model
 * @generated
 */
public interface InitDeclRule extends DeclRule
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(CompoundStatement)
   * @see uclid.xtext.uclid.UclidPackage#getInitDeclRule_Body()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getBody();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.InitDeclRule#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(CompoundStatement value);

} // InitDeclRule
