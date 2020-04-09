package com.pip.chatbot.repository;

import com.pip.chatbot.jooq.weather.Tables;
import com.pip.chatbot.model.City;
import org.jooq.DSLContext;

import java.util.List;
import java.util.Optional;

public class CitiesRepository {
    private final DSLContext dsl;

    public CitiesRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public Optional<City> getCity(String cityName) {
        return Optional.ofNullable(dsl.selectFrom(Tables.CITY)
                .where(Tables.CITY.CITY_.eq(cityName))
                .fetchAnyInto(City.class));
    }

    public boolean isCityExist(String city) {
        return dsl.fetchExists(dsl.selectFrom(Tables.CITY).where(Tables.CITY.CITY_.eq(city)));
    }

    public List<City> getAllCities() {
        return dsl.selectFrom(Tables.CITY).fetchInto(City.class);
    }

    public Optional<City> createCity(City city) {
        return Optional.ofNullable(dsl.insertInto(Tables.CITY)
                .set(Tables.CITY.CITY_, city.getCity())
                .set(Tables.CITY.COUNTRY, city.getCountry())
                .set(Tables.CITY.LATITUDE, city.getLatitude())
                .set(Tables.CITY.LONGITUDE, city.getLongitude())
                .returningResult()
                .fetchOne()
                .into(City.class));
    }

    public boolean deleteCity(String city) {
        int numberOfRowsAffected = dsl.delete(Tables.CITY)
                .where(Tables.CITY.CITY_.eq(city))
                .execute();
        return numberOfRowsAffected >= 1;
    }

    public List<City> getCitiesForCountry(String country) {
        return dsl.selectFrom(Tables.CITY)
                .where(Tables.CITY.COUNTRY.eq(country))
                .fetchInto(City.class);
    }
}
