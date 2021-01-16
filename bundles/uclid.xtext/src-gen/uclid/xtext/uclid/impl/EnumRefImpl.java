/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uclid.xtext.uclid.EnumRef;
import uclid.xtext.uclid.EnumValue;
import uclid.xtext.uclid.UclidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.EnumRefImpl#get_enum <em>enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumRefImpl extends E13RuleImpl implements EnumRef
{
  /**
   * The cached value of the '{@link #get_enum() <em>enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_enum()
   * @generated
   * @ordered
   */
  protected EnumValue _enum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UclidPackage.Literals.ENUM_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumValue get_enum()
  {
    if (_enum != null && _enum.eIsProxy())
    {
      InternalEObject old_enum = (InternalEObject)_enum;
      _enum = (EnumValue)eResolveProxy(old_enum);
      if (_enum != old_enum)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UclidPackage.ENUM_REF__ENUM, old_enum, _enum));
      }
    }
    return _enum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumValue basicGet_enum()
  {
    return _enum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void set_enum(EnumValue new_enum)
  {
    EnumValue old_enum = _enum;
    _enum = new_enum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.ENUM_REF__ENUM, old_enum, _enum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UclidPackage.ENUM_REF__ENUM:
        if (resolve) return get_enum();
        return basicGet_enum();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UclidPackage.ENUM_REF__ENUM:
        set_enum((EnumValue)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UclidPackage.ENUM_REF__ENUM:
        set_enum((EnumValue)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UclidPackage.ENUM_REF__ENUM:
        return _enum != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumRefImpl