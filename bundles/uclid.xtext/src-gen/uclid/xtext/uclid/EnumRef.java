/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.EnumRef#get_enum <em>enum</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getEnumRef()
 * @model
 * @generated
 */
public interface EnumRef extends E13Rule
{
  /**
   * Returns the value of the '<em><b>enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>enum</em>' reference.
   * @see #set_enum(EnumValue)
   * @see uclid.xtext.uclid.UclidPackage#getEnumRef__enum()
   * @model
   * @generated
   */
  EnumValue get_enum();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.EnumRef#get_enum <em>enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>enum</em>' reference.
   * @see #get_enum()
   * @generated
   */
  void set_enum(EnumValue value);

} // EnumRef