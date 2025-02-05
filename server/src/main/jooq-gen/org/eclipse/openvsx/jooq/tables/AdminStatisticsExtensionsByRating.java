/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.util.Arrays;
import java.util.List;

import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.AdminStatisticsExtensionsByRatingRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminStatisticsExtensionsByRating extends TableImpl<AdminStatisticsExtensionsByRatingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.admin_statistics_extensions_by_rating</code>
     */
    public static final AdminStatisticsExtensionsByRating ADMIN_STATISTICS_EXTENSIONS_BY_RATING = new AdminStatisticsExtensionsByRating();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminStatisticsExtensionsByRatingRecord> getRecordType() {
        return AdminStatisticsExtensionsByRatingRecord.class;
    }

    /**
     * The column <code>public.admin_statistics_extensions_by_rating.admin_statistics_id</code>.
     */
    public final TableField<AdminStatisticsExtensionsByRatingRecord, Long> ADMIN_STATISTICS_ID = createField(DSL.name("admin_statistics_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.admin_statistics_extensions_by_rating.rating</code>.
     */
    public final TableField<AdminStatisticsExtensionsByRatingRecord, Integer> RATING = createField(DSL.name("rating"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.admin_statistics_extensions_by_rating.extensions</code>.
     */
    public final TableField<AdminStatisticsExtensionsByRatingRecord, Integer> EXTENSIONS = createField(DSL.name("extensions"), SQLDataType.INTEGER.nullable(false), this, "");

    private AdminStatisticsExtensionsByRating(Name alias, Table<AdminStatisticsExtensionsByRatingRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdminStatisticsExtensionsByRating(Name alias, Table<AdminStatisticsExtensionsByRatingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.admin_statistics_extensions_by_rating</code> table reference
     */
    public AdminStatisticsExtensionsByRating(String alias) {
        this(DSL.name(alias), ADMIN_STATISTICS_EXTENSIONS_BY_RATING);
    }

    /**
     * Create an aliased <code>public.admin_statistics_extensions_by_rating</code> table reference
     */
    public AdminStatisticsExtensionsByRating(Name alias) {
        this(alias, ADMIN_STATISTICS_EXTENSIONS_BY_RATING);
    }

    /**
     * Create a <code>public.admin_statistics_extensions_by_rating</code> table reference
     */
    public AdminStatisticsExtensionsByRating() {
        this(DSL.name("admin_statistics_extensions_by_rating"), null);
    }

    public <O extends Record> AdminStatisticsExtensionsByRating(Table<O> child, ForeignKey<O, AdminStatisticsExtensionsByRatingRecord> key) {
        super(child, key, ADMIN_STATISTICS_EXTENSIONS_BY_RATING);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<AdminStatisticsExtensionsByRatingRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AdminStatisticsExtensionsByRatingRecord, ?>>asList(Keys.ADMIN_STATISTICS_EXTENSIONS_BY_RATING__ADMIN_STATISTICS_EXTENSIONS_BY_RATING_FKEY);
    }

    private transient AdminStatistics _adminStatistics;

    public AdminStatistics adminStatistics() {
        if (_adminStatistics == null)
            _adminStatistics = new AdminStatistics(this, Keys.ADMIN_STATISTICS_EXTENSIONS_BY_RATING__ADMIN_STATISTICS_EXTENSIONS_BY_RATING_FKEY);

        return _adminStatistics;
    }

    @Override
    public AdminStatisticsExtensionsByRating as(String alias) {
        return new AdminStatisticsExtensionsByRating(DSL.name(alias), this);
    }

    @Override
    public AdminStatisticsExtensionsByRating as(Name alias) {
        return new AdminStatisticsExtensionsByRating(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminStatisticsExtensionsByRating rename(String name) {
        return new AdminStatisticsExtensionsByRating(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminStatisticsExtensionsByRating rename(Name name) {
        return new AdminStatisticsExtensionsByRating(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
