/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq;


import com.pip.chatbot.jooq.food.Food;
import com.pip.chatbot.jooq.jokes.Jokes;
import com.pip.chatbot.jooq.weather.Weather;

import java.util.Arrays;
import java.util.List;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -771396625;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>food</code>.
     */
    public final Food FOOD = Food.FOOD;

    /**
     * The schema <code>jokes</code>.
     */
    public final Jokes JOKES = Jokes.JOKES;

    /**
     * The schema <code>weather</code>.
     */
    public final Weather WEATHER = Weather.WEATHER;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.<Schema>asList(
            Food.FOOD,
            Jokes.JOKES,
            Weather.WEATHER);
    }
}
