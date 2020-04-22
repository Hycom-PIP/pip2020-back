/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq.food.tables.records;


import com.pip.chatbot.jooq.food.tables.MenuDish;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MenuDishRecord extends UpdatableRecordImpl<MenuDishRecord> implements Record3<Integer, Integer, Float> {

    private static final long serialVersionUID = -2093617848;

    /**
     * Setter for <code>food.menu_dish.menu_id</code>.
     */
    public void setMenuId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>food.menu_dish.menu_id</code>.
     */
    public Integer getMenuId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>food.menu_dish.dish_id</code>.
     */
    public void setDishId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>food.menu_dish.dish_id</code>.
     */
    public Integer getDishId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>food.menu_dish.price</code>.
     */
    public void setPrice(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>food.menu_dish.price</code>.
     */
    public Float getPrice() {
        return (Float) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Float> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return MenuDish.MENU_DISH.MENU_ID;
    }

    @Override
    public Field<Integer> field2() {
        return MenuDish.MENU_DISH.DISH_ID;
    }

    @Override
    public Field<Float> field3() {
        return MenuDish.MENU_DISH.PRICE;
    }

    @Override
    public Integer component1() {
        return getMenuId();
    }

    @Override
    public Integer component2() {
        return getDishId();
    }

    @Override
    public Float component3() {
        return getPrice();
    }

    @Override
    public Integer value1() {
        return getMenuId();
    }

    @Override
    public Integer value2() {
        return getDishId();
    }

    @Override
    public Float value3() {
        return getPrice();
    }

    @Override
    public MenuDishRecord value1(Integer value) {
        setMenuId(value);
        return this;
    }

    @Override
    public MenuDishRecord value2(Integer value) {
        setDishId(value);
        return this;
    }

    @Override
    public MenuDishRecord value3(Float value) {
        setPrice(value);
        return this;
    }

    @Override
    public MenuDishRecord values(Integer value1, Integer value2, Float value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MenuDishRecord
     */
    public MenuDishRecord() {
        super(MenuDish.MENU_DISH);
    }

    /**
     * Create a detached, initialised MenuDishRecord
     */
    public MenuDishRecord(Integer menuId, Integer dishId, Float price) {
        super(MenuDish.MENU_DISH);

        set(0, menuId);
        set(1, dishId);
        set(2, price);
    }
}
