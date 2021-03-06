/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.InstanceDecl#getName <em>Name</em>}</li>
 *   <li>{@link uclid.xtext.uclid.InstanceDecl#getModule <em>Module</em>}</li>
 *   <li>{@link uclid.xtext.uclid.InstanceDecl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see uclid.xtext.uclid.UclidPackage#getInstanceDecl()
 * @model
 * @generated
 */
public interface InstanceDecl extends DeclRule
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uclid.xtext.uclid.UclidPackage#getInstanceDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.InstanceDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' reference.
   * @see #setModule(uclid.xtext.uclid.Module)
   * @see uclid.xtext.uclid.UclidPackage#getInstanceDecl_Module()
   * @model
   * @generated
   */
  uclid.xtext.uclid.Module getModule();

  /**
   * Sets the value of the '{@link uclid.xtext.uclid.InstanceDecl#getModule <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' reference.
   * @see #getModule()
   * @generated
   */
  void setModule(uclid.xtext.uclid.Module value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link uclid.xtext.uclid.ArgMapListRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see uclid.xtext.uclid.UclidPackage#getInstanceDecl_Args()
   * @model containment="true"
   * @generated
   */
  EList<ArgMapListRule> getArgs();

} // InstanceDecl
