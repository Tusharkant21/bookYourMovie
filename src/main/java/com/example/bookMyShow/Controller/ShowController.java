package com.example.bookMyShow.Controller;

import com.example.bookMyShow.Dtos.ShowRequestDto;
import com.example.bookMyShow.Model.ShowEntity;
import com.example.bookMyShow.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "show")
public class ShowController {
    @Autowired
    ShowService showService;

    @PostMapping("/add")
    public String addShow(@RequestBody ShowRequestDto showRequestDto) throws Exception{
        return showService.addShow(showRequestDto);

    }

    public List<ShowEntity> getAllShows() throws Exception {
        return showService.getAllShows();
    }
}
