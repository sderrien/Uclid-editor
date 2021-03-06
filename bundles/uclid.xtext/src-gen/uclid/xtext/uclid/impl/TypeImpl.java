/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uclid.xtext.uclid.Type;
import uclid.xtext.uclid.UclidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.TypeImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.TypeImpl#getT <em>T</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getDecl() <em>Decl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected static final String DECL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected String decl = DECL_EDEFAULT;

  /**
   * The default value of the '{@link #getT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected static final String T_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected String t = T_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return UclidPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDecl(String newDecl)
  {
    String oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.TYPE__DECL, oldDecl, decl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setT(String newT)
  {
    String oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.TYPE__T, oldT, t));
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
      case UclidPackage.TYPE__DECL:
        return getDecl();
      case UclidPackage.TYPE__T:
        return getT();
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
      case UclidPackage.TYPE__DECL:
        setDecl((String)newValue);
        return;
      case UclidPackage.TYPE__T:
        setT((String)newValue);
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
      case UclidPackage.TYPE__DECL:
        setDecl(DECL_EDEFAULT);
        return;
      case UclidPackage.TYPE__T:
        setT(T_EDEFAULT);
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
      case UclidPackage.TYPE__DECL:
        return DECL_EDEFAULT == null ? decl != null : !DECL_EDEFAULT.equals(decl);
      case UclidPackage.TYPE__T:
        return T_EDEFAULT == null ? t != null : !T_EDEFAULT.equals(t);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (decl: ");
    result.append(decl);
    result.append(", t: ");
    result.append(t);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
