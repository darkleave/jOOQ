/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgProc extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1881962652;

	/**
	 * The singleton instance of <code>pg_catalog.pg_proc</code>
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgProc PG_PROC = new org.jooq.util.postgres.pg_catalog.tables.PgProc();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_proc.proname</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PRONAME = createField("proname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>pg_catalog.pg_proc.pronamespace</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> PRONAMESPACE = createField("pronamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proowner</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> PROOWNER = createField("proowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.prolang</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> PROLANG = createField("prolang", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.procost</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Float> PROCOST = createField("procost", org.jooq.impl.SQLDataType.REAL, this);

	/**
	 * The column <code>pg_catalog.pg_proc.prorows</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Float> PROROWS = createField("prorows", org.jooq.impl.SQLDataType.REAL, this);

	/**
	 * The column <code>pg_catalog.pg_proc.provariadic</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> PROVARIADIC = createField("provariadic", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proisagg</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> PROISAGG = createField("proisagg", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proiswindow</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> PROISWINDOW = createField("proiswindow", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>pg_catalog.pg_proc.prosecdef</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> PROSECDEF = createField("prosecdef", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proisstrict</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> PROISSTRICT = createField("proisstrict", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proretset</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> PRORETSET = createField("proretset", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>pg_catalog.pg_proc.provolatile</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROVOLATILE = createField("provolatile", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The column <code>pg_catalog.pg_proc.pronargs</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PRONARGS = createField("pronargs", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.pronargdefaults</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PRONARGDEFAULTS = createField("pronargdefaults", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.prorettype</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> PRORETTYPE = createField("prorettype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proargtypes</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long[]> PROARGTYPES = createField("proargtypes", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	/**
	 * The column <code>pg_catalog.pg_proc.proallargtypes</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long[]> PROALLARGTYPES = createField("proallargtypes", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this);

	/**
	 * The column <code>pg_catalog.pg_proc.proargmodes</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> PROARGMODES = createField("proargmodes", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this);

	/**
	 * The column <code>pg_catalog.pg_proc.proargnames</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> PROARGNAMES = createField("proargnames", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * The column <code>pg_catalog.pg_proc.proargdefaults</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROARGDEFAULTS = createField("proargdefaults", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>pg_catalog.pg_proc.prosrc</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROSRC = createField("prosrc", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>pg_catalog.pg_proc.probin</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROBIN = createField("probin", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>pg_catalog.pg_proc.proconfig</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> PROCONFIG = createField("proconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * The column <code>pg_catalog.pg_proc.proacl</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> PROACL = createField("proacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * Create a <code>pg_catalog.pg_proc</code> table reference
	 */
	public PgProc() {
		super("pg_proc", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_proc</code> table reference
	 */
	public PgProc(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.pg_catalog.tables.PgProc.PG_PROC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgProc as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgProc(alias);
	}
}
