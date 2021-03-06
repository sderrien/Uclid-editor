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

import uclid.xtext.uclid.RecordTypeRule;
import uclid.xtext.uclid.Type;
import uclid.xtext.uclid.UclidPackage;
import uclid.xtext.uclid.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uclid.xtext.uclid.impl.RecordTypeRuleImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link uclid.xtext.uclid.impl.RecordTypeRuleImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordTypeRuleImpl extends TypeImpl implements RecordTypeRule
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<VarDecl> fields;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordTypeRuleImpl()
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
    return UclidPackage.Literals.RECORD_TYPE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VarDecl> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, UclidPackage.RECORD_TYPE_RULE__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UclidPackage.RECORD_TYPE_RULE__TYPE, oldType, newType);
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
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UclidPackage.RECORD_TYPE_RULE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UclidPackage.RECORD_TYPE_RULE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UclidPackage.RECORD_TYPE_RULE__TYPE, newType, newType));
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
      case UclidPackage.RECORD_TYPE_RULE__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case UclidPackage.RECORD_TYPE_RULE__TYPE:
        return basicSetType(null, msgs);
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
      case UclidPackage.RECORD_TYPE_RULE__FIELDS:
        return getFields();
      case UclidPackage.RECORD_TYPE_RULE__TYPE:
        return getType();
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
      case UclidPackage.RECORD_TYPE_RULE__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends VarDecl>)newValue);
        return;
      case UclidPackage.RECORD_TYPE_RULE__TYPE:
        setType((Type)newValue);
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
      case UclidPackage.RECORD_TYPE_RULE__FIELDS:
        getFields().clear();
        return;
      case UclidPackage.RECORD_TYPE_RULE__TYPE:
        setType((Type)null);
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
      case UclidPackage.RECORD_TYPE_RULE__FIELDS:
        return fields != null && !fields.isEmpty();
      case UclidPackage.RECORD_TYPE_RULE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //RecordTypeRuleImpl
