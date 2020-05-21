/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq.food.tables;


import com.pip.chatbot.jooq.food.Food;
import com.pip.chatbot.jooq.food.Keys;
import com.pip.chatbot.jooq.food.tables.records.CountryRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = 1711844303;

    /**
     * The reference instance of <code>food.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>food.country.country</code>.
     */
    public final TableField<CountryRecord, String> COUNTRY_ = createField(DSL.name("country"), org.jooq.impl.SQLDataType.VARCHAR(127).nullable(false), this, "");

    /**
     * Create a <code>food.country</code> table reference
     */
    public Country() {
        this(DSL.name("country"), null);
    }

    /**
     * Create an aliased <code>food.country</code> table reference
     */
    public Country(String alias) {
        this(DSL.name(alias), COUNTRY);
    }

    /**
     * Create an aliased <code>food.country</code> table reference
     */
    public Country(Name alias) {
        this(alias, COUNTRY);
    }

    private Country(Name alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(Name alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Country(Table<O> child, ForeignKey<O, CountryRecord> key) {
        super(child, key, COUNTRY);
    }

    @Override
    public Schema getSchema() {
        return Food.FOOD;
    }

    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.COUNTRY_PKEY;
    }

    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.COUNTRY_PKEY);
    }

    @Override
    public Country as(String alias) {
        return new Country(DSL.name(alias), this);
    }

    @Override
    public Country as(Name alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(String name) {
        return new Country(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(Name name) {
        return new Country(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
