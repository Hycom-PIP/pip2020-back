/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq.jokes.tables;


import com.pip.chatbot.jooq.jokes.Jokes;
import com.pip.chatbot.jooq.jokes.Keys;
import com.pip.chatbot.jooq.jokes.tables.records.MarkRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Mark extends TableImpl<MarkRecord> {

    private static final long serialVersionUID = -1760872860;

    /**
     * The reference instance of <code>jokes.mark</code>
     */
    public static final Mark MARK = new Mark();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarkRecord> getRecordType() {
        return MarkRecord.class;
    }

    /**
     * The column <code>jokes.mark.id</code>.
     */
    public final TableField<MarkRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('jokes.mark_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jokes.mark.joke_id</code>.
     */
    public final TableField<MarkRecord, Integer> JOKE_ID = createField(DSL.name("joke_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jokes.mark.mark</code>.
     */
    public final TableField<MarkRecord, BigDecimal> MARK_ = createField(DSL.name("mark"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * Create a <code>jokes.mark</code> table reference
     */
    public Mark() {
        this(DSL.name("mark"), null);
    }

    /**
     * Create an aliased <code>jokes.mark</code> table reference
     */
    public Mark(String alias) {
        this(DSL.name(alias), MARK);
    }

    /**
     * Create an aliased <code>jokes.mark</code> table reference
     */
    public Mark(Name alias) {
        this(alias, MARK);
    }

    private Mark(Name alias, Table<MarkRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mark(Name alias, Table<MarkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Mark(Table<O> child, ForeignKey<O, MarkRecord> key) {
        super(child, key, MARK);
    }

    @Override
    public Schema getSchema() {
        return Jokes.JOKES;
    }

    @Override
    public Identity<MarkRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARK;
    }

    @Override
    public UniqueKey<MarkRecord> getPrimaryKey() {
        return Keys.MARK_PKEY;
    }

    @Override
    public List<UniqueKey<MarkRecord>> getKeys() {
        return Arrays.<UniqueKey<MarkRecord>>asList(Keys.MARK_PKEY);
    }

    @Override
    public List<ForeignKey<MarkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MarkRecord, ?>>asList(Keys.MARK__MARK_JOKE_ID_FKEY);
    }

    public Joke joke() {
        return new Joke(this, Keys.MARK__MARK_JOKE_ID_FKEY);
    }

    @Override
    public Mark as(String alias) {
        return new Mark(DSL.name(alias), this);
    }

    @Override
    public Mark as(Name alias) {
        return new Mark(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mark rename(String name) {
        return new Mark(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mark rename(Name name) {
        return new Mark(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
