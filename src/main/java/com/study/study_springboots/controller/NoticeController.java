package com.study.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
    @RequestMapping(value = { "/list", "" }, method = RequestMethod.GET)
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> BoardsList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("BoardsList", BoardsList);
        modelAndView.setViewName("/board/list");
        return modelAndView;
    }

    @RequestMapping(value = "/view/{action_uid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable String action_uid, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataByUid(action_uid);
        modelAndView.setViewName("/board/view");
        modelAndView.addObject("boardBean", boardBean);
        return modelAndView;
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public ModelAndView view(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        HashMap<String, String> boardBean = params;
        modelAndView.setViewName("/board/view");
        modelAndView.addObject("boardBean", boardBean);

        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView edit(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        HashMap<String, String> boardBean = params;
        modelAndView.setViewName("/board/edit");
        modelAndView.addObject("boardBean", boardBean);

        return modelAndView;
    }

}
