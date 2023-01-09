package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.study.study_springboots.beans.BoardBean;

public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "김석진");
        searchForm.put("id", "ID0001    ");
        return searchForm;
    }

    public ArrayList<String> getTableListWithString() {
        ArrayList<String> tableListWithString = new ArrayList<String>();
        tableListWithString.add("@mdo");
        tableListWithString.add("@fat");
        tableListWithString.add("@twitter");

        return tableListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors dataInfor = new DataInfors();
        HashMap<String, String> searchForm = dataInfor.getSearchFormData();
        ArrayList<String> tableListWithString = dataInfor.getTableListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tableListWithString", tableListWithString);
        bundlesData.put("getDataWithMemberBean", dataInfor.getDataWithMemberBean());
        bundlesData.put("getDataListWithMemberBean", dataInfor.getDataListWithMemberBean());
        return bundlesData;

    }

    public BoardBean getDataWithMemberBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }

    public ArrayList<BoardBean> getDataListWithMemberBean() {
        ArrayList<BoardBean> memebersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        memebersList.add(boardBean);

        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("Jacob");
        boardBean02.setContent("Thornton");
        boardBean02.setUserName("@fat");
        memebersList.add(boardBean02);

        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("Larry");
        boardBean03.setContent("Bird");
        boardBean03.setUserName("@twitter");
        memebersList.add(boardBean03);
        return memebersList;
    }
}
