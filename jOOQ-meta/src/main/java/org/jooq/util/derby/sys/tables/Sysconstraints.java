/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Sysconstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 896651060;

	/**
	 * The singleton instance of <code>SYS.SYSCONSTRAINTS</code>
	 */
	public static final org.jooq.util.derby.sys.tables.Sysconstraints SYSCONSTRAINTS = new org.jooq.util.derby.sys.tables.Sysconstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.CONSTRAINTID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINTID = createField("CONSTRAINTID", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.TABLEID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.CONSTRAINTNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINTNAME = createField("CONSTRAINTNAME", org.jooq.impl.SQLDataType.VARCHAR, SYSCONSTRAINTS);

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.TYPE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.SCHEMAID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.STATE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> STATE = createField("STATE", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * The column <code>SYS.SYSCONSTRAINTS.REFERENCECOUNT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> REFERENCECOUNT = createField("REFERENCECOUNT", org.jooq.impl.SQLDataType.INTEGER, SYSCONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private Sysconstraints() {
		super("SYSCONSTRAINTS", org.jooq.util.derby.sys.Sys.SYS);
	}
}
