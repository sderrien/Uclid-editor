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

import uclid.xtext.uclid.ExprRule;
import uclid.xtext.uclid.IfPrimaryExpr;
import uclid.xtext.uclid.UclidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.IfPrimaryExprImpl#getC <em>C</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.IfPrimaryExprImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfPrimaryExprImpl extends E13RuleImpl implements IfPrimaryExpr
{
  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected ExprRule c;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<ExprRule> e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfPrimaryExprImpl()
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
    return UclidPackage.Literals.IF_PRIMARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprRule getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(ExprRule newC, NotificationChain msgs)
  {
    ExprRule oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.IF_PRIMARY_EXPR__C, oldC, newC);
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
  public void setC(ExprRule newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.IF_PRIMARY_EXPR__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.IF_PRIMARY_EXPR__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.IF_PRIMARY_EXPR__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExprRule> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<ExprRule>(ExprRule.class, this, UclidPackage.IF_PRIMARY_EXPR__E);
    }
    return e;
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
      case UclidPackage.IF_PRIMARY_EXPR__C:
        return basicSetC(null, msgs);
      case UclidPackage.IF_PRIMARY_EXPR__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
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
      case UclidPackage.IF_PRIMARY_EXPR__C:
        return getC();
      case UclidPackage.IF_PRIMARY_EXPR__E:
        return getE();
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
      case UclidPackage.IF_PRIMARY_EXPR__C:
        setC((ExprRule)newValue);
        return;
      case UclidPackage.IF_PRIMARY_EXPR__E:
        getE().clear();
        getE().addAll((Collection<? extends ExprRule>)newValue);
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
      case UclidPackage.IF_PRIMARY_EXPR__C:
        setC((ExprRule)null);
        return;
      case UclidPackage.IF_PRIMARY_EXPR__E:
        getE().clear();
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
      case UclidPackage.IF_PRIMARY_EXPR__C:
        return c != null;
      case UclidPackage.IF_PRIMARY_EXPR__E:
        return e != null && !e.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfPrimaryExprImpl
