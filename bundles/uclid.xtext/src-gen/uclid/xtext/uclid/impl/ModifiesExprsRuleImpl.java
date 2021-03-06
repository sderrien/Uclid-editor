/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uclid.xtext.uclid.IdListRule;
import uclid.xtext.uclid.ModifiesExprsRule;
import uclid.xtext.uclid.UclidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifies Exprs Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.ModifiesExprsRuleImpl#getL <em>L</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifiesExprsRuleImpl extends MinimalEObjectImpl.Container implements ModifiesExprsRule
{
  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected IdListRule l;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModifiesExprsRuleImpl()
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
    return UclidPackage.Literals.MODIFIES_EXPRS_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdListRule getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(IdListRule newL, NotificationChain msgs)
  {
    IdListRule oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.MODIFIES_EXPRS_RULE__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setL(IdListRule newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.MODIFIES_EXPRS_RULE__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.MODIFIES_EXPRS_RULE__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.MODIFIES_EXPRS_RULE__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UclidPackage.MODIFIES_EXPRS_RULE__L:
        return basicSetL(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UclidPackage.MODIFIES_EXPRS_RULE__L:
        return getL();
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
      case UclidPackage.MODIFIES_EXPRS_RULE__L:
        setL((IdListRule)newValue);
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
      case UclidPackage.MODIFIES_EXPRS_RULE__L:
        setL((IdListRule)null);
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
      case UclidPackage.MODIFIES_EXPRS_RULE__L:
        return l != null;
    }
    return super.eIsSet(featureID);
  }

} //ModifiesExprsRuleImpl
