/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.EnumTypeRule#getEnums <em>Enums</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getEnumTypeRule()
 * @model
 * @generated
 */
public interface EnumTypeRule extends Type
{
  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.VarDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getEnumTypeRule_Enums()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getEnums();

} // EnumTypeRule