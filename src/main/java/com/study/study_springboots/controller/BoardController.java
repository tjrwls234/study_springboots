package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> BoardsList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("BoardsList", BoardsList);
        modelAndView.setViewName("/board/list");
        return modelAndView;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam String title, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> BoardsList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("title", title);
        modelAndView.addObject("BoardsList", BoardsList);
        modelAndView.setViewName("/board/view");
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("/board/edit");
        return modelAndView;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form() {
        return "/board/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String formPost() {
        // insert biz
        return "/board/list";
    }
}
