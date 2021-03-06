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

import uclid.xtext.uclid.CmdRule;
import uclid.xtext.uclid.ExprListRule;
import uclid.xtext.uclid.IdListRule;
import uclid.xtext.uclid.UclidPackage;
import uclid.xtext.uclid.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.CmdRuleImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.CmdRuleImpl#getC <em>C</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.CmdRuleImpl#getLid <em>Lid</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.CmdRuleImpl#getLex <em>Lex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmdRuleImpl extends MinimalEObjectImpl.Container implements CmdRule
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected VarDecl lhs;

  /**
   * The default value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected static final String C_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected String c = C_EDEFAULT;

  /**
   * The cached value of the '{@link #getLid() <em>Lid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLid()
   * @generated
   * @ordered
   */
  protected IdListRule lid;

  /**
   * The cached value of the '{@link #getLex() <em>Lex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLex()
   * @generated
   * @ordered
   */
  protected ExprListRule lex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CmdRuleImpl()
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
    return UclidPackage.Literals.CMD_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDecl getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(VarDecl newLhs, NotificationChain msgs)
  {
    VarDecl oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__LHS, oldLhs, newLhs);
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
  public void setLhs(VarDecl newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.CMD_RULE__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.CMD_RULE__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setC(String newC)
  {
    String oldC = c;
    c = newC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__C, oldC, c));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdListRule getLid()
  {
    return lid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLid(IdListRule newLid, NotificationChain msgs)
  {
    IdListRule oldLid = lid;
    lid = newLid;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__LID, oldLid, newLid);
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
  public void setLid(IdListRule newLid)
  {
    if (newLid != lid)
    {
      NotificationChain msgs = null;
      if (lid != null)
        msgs = ((InternalEObject)lid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.CMD_RULE__LID, null, msgs);
      if (newLid != null)
        msgs = ((InternalEObject)newLid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.CMD_RULE__LID, null, msgs);
      msgs = basicSetLid(newLid, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__LID, newLid, newLid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprListRule getLex()
  {
    return lex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLex(ExprListRule newLex, NotificationChain msgs)
  {
    ExprListRule oldLex = lex;
    lex = newLex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__LEX, oldLex, newLex);
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
  public void setLex(ExprListRule newLex)
  {
    if (newLex != lex)
    {
      NotificationChain msgs = null;
      if (lex != null)
        msgs = ((InternalEObject)lex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.CMD_RULE__LEX, null, msgs);
      if (newLex != null)
        msgs = ((InternalEObject)newLex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.CMD_RULE__LEX, null, msgs);
      msgs = basicSetLex(newLex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.CMD_RULE__LEX, newLex, newLex));
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
      case UclidPackage.CMD_RULE__LHS:
        return basicSetLhs(null, msgs);
      case UclidPackage.CMD_RULE__LID:
        return basicSetLid(null, msgs);
      case UclidPackage.CMD_RULE__LEX:
        return basicSetLex(null, msgs);
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
      case UclidPackage.CMD_RULE__LHS:
        return getLhs();
      case UclidPackage.CMD_RULE__C:
        return getC();
      case UclidPackage.CMD_RULE__LID:
        return getLid();
      case UclidPackage.CMD_RULE__LEX:
        return getLex();
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
      case UclidPackage.CMD_RULE__LHS:
        setLhs((VarDecl)newValue);
        return;
      case UclidPackage.CMD_RULE__C:
        setC((String)newValue);
        return;
      case UclidPackage.CMD_RULE__LID:
        setLid((IdListRule)newValue);
        return;
      case UclidPackage.CMD_RULE__LEX:
        setLex((ExprListRule)newValue);
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
      case UclidPackage.CMD_RULE__LHS:
        setLhs((VarDecl)null);
        return;
      case UclidPackage.CMD_RULE__C:
        setC(C_EDEFAULT);
        return;
      case UclidPackage.CMD_RULE__LID:
        setLid((IdListRule)null);
        return;
      case UclidPackage.CMD_RULE__LEX:
        setLex((ExprListRule)null);
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
      case UclidPackage.CMD_RULE__LHS:
        return lhs != null;
      case UclidPackage.CMD_RULE__C:
        return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
      case UclidPackage.CMD_RULE__LID:
        return lid != null;
      case UclidPackage.CMD_RULE__LEX:
        return lex != null;
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
    result.append(" (c: ");
    result.append(c);
    result.append(')');
    return result.toString();
  }

} //CmdRuleImpl
