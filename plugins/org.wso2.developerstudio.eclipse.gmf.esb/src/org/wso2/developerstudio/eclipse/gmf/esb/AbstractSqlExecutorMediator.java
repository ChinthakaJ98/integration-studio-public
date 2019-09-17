/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Sql Executor Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsType <em>Connection Ds Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDbType <em>Connection Db Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDbDriver <em>Connection Db Driver</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsInitialContext <em>Connection Ds Initial Context</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsName <em>Connection Ds Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionURL <em>Connection URL</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionUsername <em>Connection Username</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionPassword <em>Connection Password</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyAutocommit <em>Property Autocommit</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyIsolation <em>Property Isolation</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxactive <em>Property Maxactive</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxidle <em>Property Maxidle</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxopenstatements <em>Property Maxopenstatements</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxwait <em>Property Maxwait</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMinidle <em>Property Minidle</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyPoolstatements <em>Property Poolstatements</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestonborrow <em>Property Testonborrow</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestwhileidle <em>Property Testwhileidle</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyValidationquery <em>Property Validationquery</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyInitialsize <em>Property Initialsize</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getSqlStatements <em>Sql Statements</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedDriverConfig <em>Is Registry Based Driver Config</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedUrlConfig <em>Is Registry Based Url Config</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedUserConfig <em>Is Registry Based User Config</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedPassConfig <em>Is Registry Based Pass Config</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedDriverConfigKey <em>Registry Based Driver Config Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedUrlConfigKey <em>Registry Based Url Config Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedUserConfigKey <em>Registry Based User Config Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedPassConfigKey <em>Registry Based Pass Config Key</em>}</li>
 * </ul>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSqlExecutorMediator extends Mediator {
    /**
     * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
     * The default value is <code>"DB_CONNECTION"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType
     * @see #setConnectionType(SqlExecutorConnectionType)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionType()
     * @model default="DB_CONNECTION"
     * @generated
     */
    SqlExecutorConnectionType getConnectionType();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionType <em>Connection Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorConnectionType
     * @see #getConnectionType()
     * @generated
     */
    void setConnectionType(SqlExecutorConnectionType value);

    /**
     * Returns the value of the '<em><b>Connection Ds Type</b></em>' attribute.
     * The default value is <code>"EXTERNAL"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Ds Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Ds Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType
     * @see #setConnectionDsType(SqlExecutorDatasourceType)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionDsType()
     * @model default="EXTERNAL"
     * @generated
     */
    SqlExecutorDatasourceType getConnectionDsType();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsType <em>Connection Ds Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Ds Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorDatasourceType
     * @see #getConnectionDsType()
     * @generated
     */
    void setConnectionDsType(SqlExecutorDatasourceType value);

    /**
     * Returns the value of the '<em><b>Connection Db Type</b></em>' attribute.
     * The default value is <code>"OTHER"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlDatabaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Db Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Db Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlDatabaseType
     * @see #setConnectionDbType(SqlDatabaseType)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionDbType()
     * @model default="OTHER"
     * @generated
     */
    SqlDatabaseType getConnectionDbType();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDbType <em>Connection Db Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Db Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlDatabaseType
     * @see #getConnectionDbType()
     * @generated
     */
    void setConnectionDbType(SqlDatabaseType value);

    /**
     * Returns the value of the '<em><b>Connection Db Driver</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Db Driver</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Db Driver</em>' attribute.
     * @see #setConnectionDbDriver(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionDbDriver()
     * @model default=""
     * @generated
     */
    String getConnectionDbDriver();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDbDriver <em>Connection Db Driver</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Db Driver</em>' attribute.
     * @see #getConnectionDbDriver()
     * @generated
     */
    void setConnectionDbDriver(String value);

    /**
     * Returns the value of the '<em><b>Connection Ds Initial Context</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Ds Initial Context</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Ds Initial Context</em>' attribute.
     * @see #setConnectionDsInitialContext(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionDsInitialContext()
     * @model default=""
     * @generated
     */
    String getConnectionDsInitialContext();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsInitialContext <em>Connection Ds Initial Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Ds Initial Context</em>' attribute.
     * @see #getConnectionDsInitialContext()
     * @generated
     */
    void setConnectionDsInitialContext(String value);

    /**
     * Returns the value of the '<em><b>Connection Ds Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Ds Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Ds Name</em>' attribute.
     * @see #setConnectionDsName(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionDsName()
     * @model default=""
     * @generated
     */
    String getConnectionDsName();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionDsName <em>Connection Ds Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Ds Name</em>' attribute.
     * @see #getConnectionDsName()
     * @generated
     */
    void setConnectionDsName(String value);

    /**
     * Returns the value of the '<em><b>Connection URL</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection URL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection URL</em>' attribute.
     * @see #setConnectionURL(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionURL()
     * @model default=""
     * @generated
     */
    String getConnectionURL();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionURL <em>Connection URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection URL</em>' attribute.
     * @see #getConnectionURL()
     * @generated
     */
    void setConnectionURL(String value);

    /**
     * Returns the value of the '<em><b>Connection Username</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Username</em>' attribute.
     * @see #setConnectionUsername(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionUsername()
     * @model default=""
     * @generated
     */
    String getConnectionUsername();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionUsername <em>Connection Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Username</em>' attribute.
     * @see #getConnectionUsername()
     * @generated
     */
    void setConnectionUsername(String value);

    /**
     * Returns the value of the '<em><b>Connection Password</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Password</em>' attribute.
     * @see #setConnectionPassword(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_ConnectionPassword()
     * @model default=""
     * @generated
     */
    String getConnectionPassword();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getConnectionPassword <em>Connection Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Password</em>' attribute.
     * @see #getConnectionPassword()
     * @generated
     */
    void setConnectionPassword(String value);

    /**
     * Returns the value of the '<em><b>Property Autocommit</b></em>' attribute.
     * The default value is <code>"DEFAULT"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Autocommit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Autocommit</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #setPropertyAutocommit(SqlExecutorBooleanValue)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyAutocommit()
     * @model default="DEFAULT"
     * @generated
     */
    SqlExecutorBooleanValue getPropertyAutocommit();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyAutocommit <em>Property Autocommit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Autocommit</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #getPropertyAutocommit()
     * @generated
     */
    void setPropertyAutocommit(SqlExecutorBooleanValue value);

    /**
     * Returns the value of the '<em><b>Property Isolation</b></em>' attribute.
     * The default value is <code>"DEFAULT"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Isolation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Isolation</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel
     * @see #setPropertyIsolation(SqlExecutorIsolationLevel)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyIsolation()
     * @model default="DEFAULT"
     * @generated
     */
    SqlExecutorIsolationLevel getPropertyIsolation();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyIsolation <em>Property Isolation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Isolation</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorIsolationLevel
     * @see #getPropertyIsolation()
     * @generated
     */
    void setPropertyIsolation(SqlExecutorIsolationLevel value);

    /**
     * Returns the value of the '<em><b>Property Maxactive</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Maxactive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Maxactive</em>' attribute.
     * @see #setPropertyMaxactive(int)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyMaxactive()
     * @model default="-1"
     * @generated
     */
    int getPropertyMaxactive();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxactive <em>Property Maxactive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Maxactive</em>' attribute.
     * @see #getPropertyMaxactive()
     * @generated
     */
    void setPropertyMaxactive(int value);

    /**
     * Returns the value of the '<em><b>Property Maxidle</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Maxidle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Maxidle</em>' attribute.
     * @see #setPropertyMaxidle(int)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyMaxidle()
     * @model default="-1"
     * @generated
     */
    int getPropertyMaxidle();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxidle <em>Property Maxidle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Maxidle</em>' attribute.
     * @see #getPropertyMaxidle()
     * @generated
     */
    void setPropertyMaxidle(int value);

    /**
     * Returns the value of the '<em><b>Property Maxopenstatements</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Maxopenstatements</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Maxopenstatements</em>' attribute.
     * @see #setPropertyMaxopenstatements(int)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyMaxopenstatements()
     * @model default="-1"
     * @generated
     */
    int getPropertyMaxopenstatements();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxopenstatements <em>Property Maxopenstatements</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Maxopenstatements</em>' attribute.
     * @see #getPropertyMaxopenstatements()
     * @generated
     */
    void setPropertyMaxopenstatements(int value);

    /**
     * Returns the value of the '<em><b>Property Maxwait</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Maxwait</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Maxwait</em>' attribute.
     * @see #setPropertyMaxwait(int)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyMaxwait()
     * @model default="-1"
     * @generated
     */
    int getPropertyMaxwait();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMaxwait <em>Property Maxwait</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Maxwait</em>' attribute.
     * @see #getPropertyMaxwait()
     * @generated
     */
    void setPropertyMaxwait(int value);

    /**
     * Returns the value of the '<em><b>Property Minidle</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Minidle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Minidle</em>' attribute.
     * @see #setPropertyMinidle(int)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyMinidle()
     * @model default="-1"
     * @generated
     */
    int getPropertyMinidle();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyMinidle <em>Property Minidle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Minidle</em>' attribute.
     * @see #getPropertyMinidle()
     * @generated
     */
    void setPropertyMinidle(int value);

    /**
     * Returns the value of the '<em><b>Property Poolstatements</b></em>' attribute.
     * The default value is <code>"DEFAULT"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Poolstatements</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Poolstatements</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #setPropertyPoolstatements(SqlExecutorBooleanValue)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyPoolstatements()
     * @model default="DEFAULT"
     * @generated
     */
    SqlExecutorBooleanValue getPropertyPoolstatements();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyPoolstatements <em>Property Poolstatements</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Poolstatements</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #getPropertyPoolstatements()
     * @generated
     */
    void setPropertyPoolstatements(SqlExecutorBooleanValue value);

    /**
     * Returns the value of the '<em><b>Property Testonborrow</b></em>' attribute.
     * The default value is <code>"DEFAULT"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Testonborrow</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Testonborrow</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #setPropertyTestonborrow(SqlExecutorBooleanValue)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyTestonborrow()
     * @model default="DEFAULT"
     * @generated
     */
    SqlExecutorBooleanValue getPropertyTestonborrow();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestonborrow <em>Property Testonborrow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Testonborrow</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #getPropertyTestonborrow()
     * @generated
     */
    void setPropertyTestonborrow(SqlExecutorBooleanValue value);

    /**
     * Returns the value of the '<em><b>Property Testwhileidle</b></em>' attribute.
     * The default value is <code>"DEFAULT"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Testwhileidle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Testwhileidle</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #setPropertyTestwhileidle(SqlExecutorBooleanValue)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyTestwhileidle()
     * @model default="DEFAULT"
     * @generated
     */
    SqlExecutorBooleanValue getPropertyTestwhileidle();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyTestwhileidle <em>Property Testwhileidle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Testwhileidle</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.SqlExecutorBooleanValue
     * @see #getPropertyTestwhileidle()
     * @generated
     */
    void setPropertyTestwhileidle(SqlExecutorBooleanValue value);

    /**
     * Returns the value of the '<em><b>Property Validationquery</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Validationquery</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Validationquery</em>' attribute.
     * @see #setPropertyValidationquery(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyValidationquery()
     * @model
     * @generated
     */
    String getPropertyValidationquery();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyValidationquery <em>Property Validationquery</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Validationquery</em>' attribute.
     * @see #getPropertyValidationquery()
     * @generated
     */
    void setPropertyValidationquery(String value);

    /**
     * Returns the value of the '<em><b>Property Initialsize</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Initialsize</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Initialsize</em>' attribute.
     * @see #setPropertyInitialsize(int)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_PropertyInitialsize()
     * @model default="-1"
     * @generated
     */
    int getPropertyInitialsize();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getPropertyInitialsize <em>Property Initialsize</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Initialsize</em>' attribute.
     * @see #getPropertyInitialsize()
     * @generated
     */
    void setPropertyInitialsize(int value);

    /**
     * Returns the value of the '<em><b>Sql Statements</b></em>' containment reference list.
     * The list contents are of type {@link org.wso2.developerstudio.eclipse.gmf.esb.SqlStatement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sql Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sql Statements</em>' containment reference list.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_SqlStatements()
     * @model containment="true"
     * @generated
     */
    EList<SqlStatement> getSqlStatements();

    /**
     * Returns the value of the '<em><b>Is Registry Based Driver Config</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Registry Based Driver Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Registry Based Driver Config</em>' attribute.
     * @see #setIsRegistryBasedDriverConfig(boolean)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_IsRegistryBasedDriverConfig()
     * @model default="false"
     * @generated
     */
    boolean isIsRegistryBasedDriverConfig();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedDriverConfig <em>Is Registry Based Driver Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Registry Based Driver Config</em>' attribute.
     * @see #isIsRegistryBasedDriverConfig()
     * @generated
     */
    void setIsRegistryBasedDriverConfig(boolean value);

    /**
     * Returns the value of the '<em><b>Is Registry Based Url Config</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Registry Based Url Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Registry Based Url Config</em>' attribute.
     * @see #setIsRegistryBasedUrlConfig(boolean)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_IsRegistryBasedUrlConfig()
     * @model default="false"
     * @generated
     */
    boolean isIsRegistryBasedUrlConfig();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedUrlConfig <em>Is Registry Based Url Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Registry Based Url Config</em>' attribute.
     * @see #isIsRegistryBasedUrlConfig()
     * @generated
     */
    void setIsRegistryBasedUrlConfig(boolean value);

    /**
     * Returns the value of the '<em><b>Is Registry Based User Config</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Registry Based User Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Registry Based User Config</em>' attribute.
     * @see #setIsRegistryBasedUserConfig(boolean)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_IsRegistryBasedUserConfig()
     * @model default="false"
     * @generated
     */
    boolean isIsRegistryBasedUserConfig();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedUserConfig <em>Is Registry Based User Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Registry Based User Config</em>' attribute.
     * @see #isIsRegistryBasedUserConfig()
     * @generated
     */
    void setIsRegistryBasedUserConfig(boolean value);

    /**
     * Returns the value of the '<em><b>Is Registry Based Pass Config</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Registry Based Pass Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Registry Based Pass Config</em>' attribute.
     * @see #setIsRegistryBasedPassConfig(boolean)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_IsRegistryBasedPassConfig()
     * @model default="false"
     * @generated
     */
    boolean isIsRegistryBasedPassConfig();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#isIsRegistryBasedPassConfig <em>Is Registry Based Pass Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Registry Based Pass Config</em>' attribute.
     * @see #isIsRegistryBasedPassConfig()
     * @generated
     */
    void setIsRegistryBasedPassConfig(boolean value);

    /**
     * Returns the value of the '<em><b>Registry Based Driver Config Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Registry Based Driver Config Key</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Registry Based Driver Config Key</em>' containment reference.
     * @see #setRegistryBasedDriverConfigKey(RegistryKeyProperty)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_RegistryBasedDriverConfigKey()
     * @model containment="true"
     * @generated
     */
    RegistryKeyProperty getRegistryBasedDriverConfigKey();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedDriverConfigKey <em>Registry Based Driver Config Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Registry Based Driver Config Key</em>' containment reference.
     * @see #getRegistryBasedDriverConfigKey()
     * @generated
     */
    void setRegistryBasedDriverConfigKey(RegistryKeyProperty value);

    /**
     * Returns the value of the '<em><b>Registry Based Url Config Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Registry Based Url Config Key</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Registry Based Url Config Key</em>' containment reference.
     * @see #setRegistryBasedUrlConfigKey(RegistryKeyProperty)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_RegistryBasedUrlConfigKey()
     * @model containment="true"
     * @generated
     */
    RegistryKeyProperty getRegistryBasedUrlConfigKey();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedUrlConfigKey <em>Registry Based Url Config Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Registry Based Url Config Key</em>' containment reference.
     * @see #getRegistryBasedUrlConfigKey()
     * @generated
     */
    void setRegistryBasedUrlConfigKey(RegistryKeyProperty value);

    /**
     * Returns the value of the '<em><b>Registry Based User Config Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Registry Based User Config Key</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Registry Based User Config Key</em>' containment reference.
     * @see #setRegistryBasedUserConfigKey(RegistryKeyProperty)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_RegistryBasedUserConfigKey()
     * @model containment="true"
     * @generated
     */
    RegistryKeyProperty getRegistryBasedUserConfigKey();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedUserConfigKey <em>Registry Based User Config Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Registry Based User Config Key</em>' containment reference.
     * @see #getRegistryBasedUserConfigKey()
     * @generated
     */
    void setRegistryBasedUserConfigKey(RegistryKeyProperty value);

    /**
     * Returns the value of the '<em><b>Registry Based Pass Config Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Registry Based Pass Config Key</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Registry Based Pass Config Key</em>' containment reference.
     * @see #setRegistryBasedPassConfigKey(RegistryKeyProperty)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAbstractSqlExecutorMediator_RegistryBasedPassConfigKey()
     * @model containment="true"
     * @generated
     */
    RegistryKeyProperty getRegistryBasedPassConfigKey();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AbstractSqlExecutorMediator#getRegistryBasedPassConfigKey <em>Registry Based Pass Config Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Registry Based Pass Config Key</em>' containment reference.
     * @see #getRegistryBasedPassConfigKey()
     * @generated
     */
    void setRegistryBasedPassConfigKey(RegistryKeyProperty value);

} // AbstractSqlExecutorMediator
