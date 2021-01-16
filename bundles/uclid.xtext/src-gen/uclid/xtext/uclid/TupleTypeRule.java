/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.TupleTypeRule#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getTupleTypeRule()
 * @model
 * @generated
 */
public interface TupleTypeRule extends Type
{
  /**
   * Returns the value of the '<em><b>Tuple</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getTupleTypeRule_Tuple()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTuple();

} // TupleTypeRule
