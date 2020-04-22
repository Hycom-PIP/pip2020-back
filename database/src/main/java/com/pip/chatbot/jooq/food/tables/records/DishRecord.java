/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq.food.tables.records;


import com.pip.chatbot.jooq.food.tables.Dish;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DishRecord extends UpdatableRecordImpl<DishRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -159945468;

    /**
     * Setter for <code>food.dish.dish_id</code>.
     */
    public void setDishId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>food.dish.dish_id</code>.
     */
    public Integer getDishId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>food.dish.dish_name</code>.
     */
    public void setDishName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>food.dish.dish_name</code>.
     */
    public String getDishName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Dish.DISH.DISH_ID;
    }

    @Override
    public Field<String> field2() {
        return Dish.DISH.DISH_NAME;
    }

    @Override
    public Integer component1() {
        return getDishId();
    }

    @Override
    public String component2() {
        return getDishName();
    }

    @Override
    public Integer value1() {
        return getDishId();
    }

    @Override
    public String value2() {
        return getDishName();
    }

    @Override
    public DishRecord value1(Integer value) {
        setDishId(value);
        return this;
    }

    @Override
    public DishRecord value2(String value) {
        setDishName(value);
        return this;
    }

    @Override
    public DishRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DishRecord
     */
    public DishRecord() {
        super(Dish.DISH);
    }

    /**
     * Create a detached, initialised DishRecord
     */
    public DishRecord(Integer dishId, String dishName) {
        super(Dish.DISH);

        set(0, dishId);
        set(1, dishName);
    }
}
