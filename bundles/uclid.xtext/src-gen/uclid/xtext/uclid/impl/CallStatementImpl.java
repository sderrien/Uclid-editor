/**
 * generated by Xtext 2.24.0
 */
package uclid.xtext.uclid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uclid.xtext.uclid.CallStatement;
import uclid.xtext.uclid.ExprRule;
import uclid.xtext.uclid.UclidPackage;
import uclid.xtext.uclid.VarReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.CallStatementImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.CallStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.CallStatementImpl#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallStatementImpl extends StatementImpl implements CallStatement
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected EList<VarReference> lhs;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<ExprRule> exprs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallStatementImpl()
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
    return UclidPackage.Literals.CALL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VarReference> getLhs()
  {
    if (lhs == null)
    {
      lhs = new EObjectContainmentEList<VarReference>(VarReference.class, this, UclidPackage.CALL_STATEMENT__LHS);
    }
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.CALL_STATEMENT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExprRule> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<ExprRule>(ExprRule.class, this, UclidPackage.CALL_STATEMENT__EXPRS);
    }
    return exprs;
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
      case UclidPackage.CALL_STATEMENT__LHS:
        return ((InternalEList<?>)getLhs()).basicRemove(otherEnd, msgs);
      case UclidPackage.CALL_STATEMENT__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
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
      case UclidPackage.CALL_STATEMENT__LHS:
        return getLhs();
      case UclidPackage.CALL_STATEMENT__TARGET:
        return getTarget();
      case UclidPackage.CALL_STATEMENT__EXPRS:
        return getExprs();
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
      case UclidPackage.CALL_STATEMENT__LHS:
        getLhs().clear();
        getLhs().addAll((Collection<? extends VarReference>)newValue);
        return;
      case UclidPackage.CALL_STATEMENT__TARGET:
        setTarget((String)newValue);
        return;
      case UclidPackage.CALL_STATEMENT__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends ExprRule>)newValue);
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
      case UclidPackage.CALL_STATEMENT__LHS:
        getLhs().clear();
        return;
      case UclidPackage.CALL_STATEMENT__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case UclidPackage.CALL_STATEMENT__EXPRS:
        getExprs().clear();
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
      case UclidPackage.CALL_STATEMENT__LHS:
        return lhs != null && !lhs.isEmpty();
      case UclidPackage.CALL_STATEMENT__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case UclidPackage.CALL_STATEMENT__EXPRS:
        return exprs != null && !exprs.isEmpty();
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
    result.append(" (target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //CallStatementImpl
