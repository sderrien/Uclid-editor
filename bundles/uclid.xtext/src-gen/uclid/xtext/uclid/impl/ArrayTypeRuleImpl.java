/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uclid.xtext.uclid.ArrayTypeRule;
import uclid.xtext.uclid.Type;
import uclid.xtext.uclid.UclidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.ArrayTypeRuleImpl#getB <em>B</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.ArrayTypeRuleImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeRuleImpl extends TypeImpl implements ArrayTypeRule
{
  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected EList<Type> b;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected EList<Type> base;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeRuleImpl()
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
    return UclidPackage.Literals.ARRAY_TYPE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getB()
  {
    if (b == null)
    {
      b = new EObjectContainmentEList<Type>(Type.class, this, UclidPackage.ARRAY_TYPE_RULE__B);
    }
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getBase()
  {
    if (base == null)
    {
      base = new EObjectContainmentEList<Type>(Type.class, this, UclidPackage.ARRAY_TYPE_RULE__BASE);
    }
    return base;
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
      case UclidPackage.ARRAY_TYPE_RULE__B:
        return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
      case UclidPackage.ARRAY_TYPE_RULE__BASE:
        return ((InternalEList<?>)getBase()).basicRemove(otherEnd, msgs);
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
      case UclidPackage.ARRAY_TYPE_RULE__B:
        return getB();
      case UclidPackage.ARRAY_TYPE_RULE__BASE:
        return getBase();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UclidPackage.ARRAY_TYPE_RULE__B:
        getB().clear();
        getB().addAll((Collection<? extends Type>)newValue);
        return;
      case UclidPackage.ARRAY_TYPE_RULE__BASE:
        getBase().clear();
        getBase().addAll((Collection<? extends Type>)newValue);
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
      case UclidPackage.ARRAY_TYPE_RULE__B:
        getB().clear();
        return;
      case UclidPackage.ARRAY_TYPE_RULE__BASE:
        getBase().clear();
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
      case UclidPackage.ARRAY_TYPE_RULE__B:
        return b != null && !b.isEmpty();
      case UclidPackage.ARRAY_TYPE_RULE__BASE:
        return base != null && !base.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayTypeRuleImpl
