package com.example.bookMyShow.Services;


import com.example.bookMyShow.Dtos.MovieRequestDto;
import com.example.bookMyShow.Model.MovieEntity;
import com.example.bookMyShow.Model.UserEntity;
import com.example.bookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRequestDto movieRequestDto;
    @Autowired
    private MovieRepository movieRepository;

    public String addMovieService(MovieRequestDto movieRequestDto) throws Exception{
        MovieEntity movieEntity = MovieEntity.builder().movieName(movieRequestDto.getMovieName()).releaseDate(movieRequestDto.getReleaseDate()).duration(movieRequestDto.getDuration()).build();
        movieRepository.save(movieEntity);
        return "movie add successfully";
    }

}
