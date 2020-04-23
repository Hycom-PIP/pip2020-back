/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq.jokes.tables.records;


import com.pip.chatbot.jooq.jokes.tables.Mark;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MarkRecord extends UpdatableRecordImpl<MarkRecord> implements Record3<Integer, Integer, Double> {

    private static final long serialVersionUID = -832307454;

    /**
     * Setter for <code>jokes.mark.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jokes.mark.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jokes.mark.joke_id</code>.
     */
    public void setJokeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jokes.mark.joke_id</code>.
     */
    public Integer getJokeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jokes.mark.mark</code>.
     */
    public void setMark(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>jokes.mark.mark</code>.
     */
    public Double getMark() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Mark.MARK.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Mark.MARK.JOKE_ID;
    }

    @Override
    public Field<Double> field3() {
        return Mark.MARK.MARK_;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getJokeId();
    }

    @Override
    public Double component3() {
        return getMark();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getJokeId();
    }

    @Override
    public Double value3() {
        return getMark();
    }

    @Override
    public MarkRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MarkRecord value2(Integer value) {
        setJokeId(value);
        return this;
    }

    @Override
    public MarkRecord value3(Double value) {
        setMark(value);
        return this;
    }

    @Override
    public MarkRecord values(Integer value1, Integer value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarkRecord
     */
    public MarkRecord() {
        super(Mark.MARK);
    }

    /**
     * Create a detached, initialised MarkRecord
     */
    public MarkRecord(Integer id, Integer jokeId, Double mark) {
        super(Mark.MARK);

        set(0, id);
        set(1, jokeId);
        set(2, mark);
    }
}
