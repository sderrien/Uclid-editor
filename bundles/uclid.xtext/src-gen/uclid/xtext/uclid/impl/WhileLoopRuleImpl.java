/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext.uclid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uclid.xtext.uclid.CompoundStatement;
import uclid.xtext.uclid.ExprRule;
import uclid.xtext.uclid.InvariantClauseRule;
import uclid.xtext.uclid.UclidPackage;
import uclid.xtext.uclid.WhileLoopRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.WhileLoopRuleImpl#getC <em>C</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.WhileLoopRuleImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.WhileLoopRuleImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLoopRuleImpl extends MinimalEObjectImpl.Container implements WhileLoopRule
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
   * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInv()
   * @generated
   * @ordered
   */
  protected EList<InvariantClauseRule> inv;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected CompoundStatement stmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileLoopRuleImpl()
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
    return UclidPackage.Literals.WHILE_LOOP_RULE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.WHILE_LOOP_RULE__C, oldC, newC);
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
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.WHILE_LOOP_RULE__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.WHILE_LOOP_RULE__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.WHILE_LOOP_RULE__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InvariantClauseRule> getInv()
  {
    if (inv == null)
    {
      inv = new EObjectContainmentEList<InvariantClauseRule>(InvariantClauseRule.class, this, UclidPackage.WHILE_LOOP_RULE__INV);
    }
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompoundStatement getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(CompoundStatement newStmt, NotificationChain msgs)
  {
    CompoundStatement oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.WHILE_LOOP_RULE__STMT, oldStmt, newStmt);
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
  public void setStmt(CompoundStatement newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.WHILE_LOOP_RULE__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.WHILE_LOOP_RULE__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.WHILE_LOOP_RULE__STMT, newStmt, newStmt));
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
      case UclidPackage.WHILE_LOOP_RULE__C:
        return basicSetC(null, msgs);
      case UclidPackage.WHILE_LOOP_RULE__INV:
        return ((InternalEList<?>)getInv()).basicRemove(otherEnd, msgs);
      case UclidPackage.WHILE_LOOP_RULE__STMT:
        return basicSetStmt(null, msgs);
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
      case UclidPackage.WHILE_LOOP_RULE__C:
        return getC();
      case UclidPackage.WHILE_LOOP_RULE__INV:
        return getInv();
      case UclidPackage.WHILE_LOOP_RULE__STMT:
        return getStmt();
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
      case UclidPackage.WHILE_LOOP_RULE__C:
        setC((ExprRule)newValue);
        return;
      case UclidPackage.WHILE_LOOP_RULE__INV:
        getInv().clear();
        getInv().addAll((Collection<? extends InvariantClauseRule>)newValue);
        return;
      case UclidPackage.WHILE_LOOP_RULE__STMT:
        setStmt((CompoundStatement)newValue);
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
      case UclidPackage.WHILE_LOOP_RULE__C:
        setC((ExprRule)null);
        return;
      case UclidPackage.WHILE_LOOP_RULE__INV:
        getInv().clear();
        return;
      case UclidPackage.WHILE_LOOP_RULE__STMT:
        setStmt((CompoundStatement)null);
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
      case UclidPackage.WHILE_LOOP_RULE__C:
        return c != null;
      case UclidPackage.WHILE_LOOP_RULE__INV:
        return inv != null && !inv.isEmpty();
      case UclidPackage.WHILE_LOOP_RULE__STMT:
        return stmt != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileLoopRuleImpl
