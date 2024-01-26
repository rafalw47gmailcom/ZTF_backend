package com.example.tours;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/tours")
public class TourAPI {

    private List<Tour> tourList;

    public TourAPI() {
        tourList = new ArrayList<>();
        tourList.add(new Tour(1L,"Wyjazd na narty", "Polska", "Zakopane", LocalDate.of(2024,12,1), LocalDate.of(2024,12,20),5000));
        tourList.add(new Tour(2L,"Wyjazd na Madagaskar", "Madagaskar", "Antananarywa", LocalDate.of(2024,12,1), LocalDate.of(2024,12,20),15000));
        tourList.add(new Tour(3L,"Wyjazd do Paryża", "Francja", "Paryż", LocalDate.of(2024,12,1), LocalDate.of(2024,12,20),7000));

    }

    @GetMapping("/all")
    public List<Tour> getAllTourList(){
        return tourList;
    }

    @PostMapping("/addTour")
    public boolean addTour(@RequestBody Tour tour) {
        return tourList.add(tour);
    }

    @PutMapping
    public boolean updateTour (@RequestBody Tour tour) {
        return tourList.add(tour);
    }

    @DeleteMapping
    public boolean deleteTour (@RequestParam int index) {
        return tourList.removeIf(element -> element.getId() == index);
    }

    @GetMapping
    public Tour getById(@RequestParam int index){

        Optional<Tour> first = tourList.stream().filter(element -> element.getId() == index).findFirst();

        return first.get();
    }


}

// public Tour(Long id, String title, String country, String city, LocalDate departureDate, LocalDate returnDate, int price) {
