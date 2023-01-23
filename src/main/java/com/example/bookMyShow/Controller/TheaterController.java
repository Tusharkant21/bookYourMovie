package com.example.bookMyShow.Controller;

import com.example.bookMyShow.Dtos.TheaterRequestDto;
import com.example.bookMyShow.Model.TheaterEntity;
import com.example.bookMyShow.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/theater")
public class TheaterController {
    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public String addTheater(@RequestBody TheaterRequestDto theaterRequestDto) throws Exception {
        return theaterService.createTheater(theaterRequestDto);}

    @GetMapping("/all_theater")
    public List<TheaterEntity> getAllTheater() throws Exception{
            return theaterService.getAllTheater();

    }

//    @GetMapping("/get_theater/{id}")
//    public TheaterEntity getATheater(@PathVariable int id){
//        Optional<TheaterEntity> theaterEntity= TheaterService.getAtheater(id);
//        return theaterEntity;
//    }



}
