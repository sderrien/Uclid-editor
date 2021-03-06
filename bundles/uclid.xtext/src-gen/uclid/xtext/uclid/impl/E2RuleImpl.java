/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uclid.xtext.uclid.E2Rule;
import uclid.xtext.uclid.E3Rule;
import uclid.xtext.uclid.UclidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E2 Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.E2RuleImpl#getZ <em>Z</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.E2RuleImpl#getOp <em>Op</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.E2RuleImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E2RuleImpl extends E1RuleImpl implements E2Rule
{
  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected EList<E3Rule> z;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ()
   * @generated
   * @ordered
   */
  protected EList<EObject> q;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected E2RuleImpl()
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
    return UclidPackage.Literals.E2_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<E3Rule> getZ()
  {
    if (z == null)
    {
      z = new EObjectContainmentEList<E3Rule>(E3Rule.class, this, UclidPackage.E2_RULE__Z);
    }
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.E2_RULE__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getQ()
  {
    if (q == null)
    {
      q = new EObjectContainmentEList<EObject>(EObject.class, this, UclidPackage.E2_RULE__Q);
    }
    return q;
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
      case UclidPackage.E2_RULE__Z:
        return ((InternalEList<?>)getZ()).basicRemove(otherEnd, msgs);
      case UclidPackage.E2_RULE__Q:
        return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
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
      case UclidPackage.E2_RULE__Z:
        return getZ();
      case UclidPackage.E2_RULE__OP:
        return getOp();
      case UclidPackage.E2_RULE__Q:
        return getQ();
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
      case UclidPackage.E2_RULE__Z:
        getZ().clear();
        getZ().addAll((Collection<? extends E3Rule>)newValue);
        return;
      case UclidPackage.E2_RULE__OP:
        setOp((String)newValue);
        return;
      case UclidPackage.E2_RULE__Q:
        getQ().clear();
        getQ().addAll((Collection<? extends EObject>)newValue);
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
      case UclidPackage.E2_RULE__Z:
        getZ().clear();
        return;
      case UclidPackage.E2_RULE__OP:
        setOp(OP_EDEFAULT);
        return;
      case UclidPackage.E2_RULE__Q:
        getQ().clear();
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
      case UclidPackage.E2_RULE__Z:
        return z != null && !z.isEmpty();
      case UclidPackage.E2_RULE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case UclidPackage.E2_RULE__Q:
        return q != null && !q.isEmpty();
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //E2RuleImpl
