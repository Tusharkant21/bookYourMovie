package com.example.bookMyShow.Services;

import com.example.bookMyShow.Dtos.ShowRequestDto;
import com.example.bookMyShow.Model.ShowEntity;
import com.example.bookMyShow.Model.TheaterEntity;
import com.example.bookMyShow.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {
    @Autowired
    ShowRequestDto showRequestDto;

    @Autowired
    ShowRepository showRepository;

    public String addShow(ShowRequestDto showRequestDto) throws Exception{
        ShowEntity showEntity = ShowEntity.builder().showDate(showRequestDto.getShowDate()).showTime(showRequestDto.getShowTime()).build();
        showRepository.save(showEntity);
        return "show added scessfully";
    }

    public List<ShowEntity>  getAllShows() throws Exception{
        return (List<ShowEntity>) showRepository.findAll();

    }

}
