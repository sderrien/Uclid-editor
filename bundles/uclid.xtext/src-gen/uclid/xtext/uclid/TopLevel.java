/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.TopLevel#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getTopLevel()
 * @model
 * @generated
 */
public interface TopLevel extends ModelRule
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.ModuleRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getTopLevel_Rules()
   * @model containment="true"
   * @generated
   */
  EList<ModuleRule> getRules();

} // TopLevel
