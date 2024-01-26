package com.example.tours;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;
import java.util.Date;

public class Tour {


    private Long id;

    private String title;

    private String country;

    private String city;

    // data wyjazdu
    private LocalDate departureDate;

    // data powrotu
    private LocalDate returnDate;

    private int price;


    public Tour() {
    }


    public Tour(Long id, String title, String country, String city, LocalDate departureDate, LocalDate returnDate, int price) {
        this.id = id;
        this.title = title;
        this.country = country;
        this.city = city;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
