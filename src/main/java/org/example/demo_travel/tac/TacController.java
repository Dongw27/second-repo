package org.example.demo_travel.tac;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

import org.example.demo_travel.location_relation_title.PublicRelatedDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/tac")
public class TacController {
    @Autowired
    private PublicRelatedDataService publicRelatedDataService;

    @Autowired
    private TacService service;

    @GetMapping("/searchList")
    public String searchList(
            @RequestParam(defaultValue = "")String searchWord,
            Model model ) {
        log.info("Controller :  /tac/searchList");


        log.info("searchWord: {}",searchWord);


        List<TacVO> vos = service.searchList(searchWord);
        log.info("vos: {}",vos);
        model.addAttribute("vos", vos);


        return "travel/selectOne";
    }


}//end class