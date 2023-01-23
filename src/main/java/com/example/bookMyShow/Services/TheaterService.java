package com.example.bookMyShow.Services;

import com.example.bookMyShow.Dtos.TheaterRequestDto;
import com.example.bookMyShow.Model.TheaterEntity;
import com.example.bookMyShow.Repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaterService {
    @Autowired
    TheaterRequestDto theaterRequestDto;
    @Autowired
    TheaterRepository theaterRepository;
    public String createTheater(TheaterRequestDto theaterRequestDto) throws Exception{
        TheaterEntity theaterEntity = TheaterEntity.builder().name(theaterRequestDto.getName()).city(theaterRequestDto.getCity()).address(theaterRequestDto.getAddress()).build();
        theaterRepository.save(theaterEntity);
        return "theater added sucessfullt";
    }
    public List<TheaterEntity>  getAllTheater() throws Exception{
         return (List<TheaterEntity>) theaterRepository.findAll();

     }
//    public Optional<TheaterEntity> getAtheater(Integer id){
//        return (Optional<TheaterEntity>) theaterRepository.findById(id);
//;
//    }
//    public Movie getAMovie(String name){
//        Optional<Movie> movieResponse =  movieRepository.findById(name);
//        Movie movie = movieResponse.get();
//        return movie;
//    }
//    public List<Movie> getAllMovies(){
//        return movieRepository.findAll();
//
//    }


}
