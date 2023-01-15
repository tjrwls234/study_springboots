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

    // boardController 용
    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> boardsList = new ArrayList<>();
        BoardBean boardBean1 = new BoardBean();
        boardBean1.setTitle("가슴운동 루틴");
        boardBean1.setContent("가슴운동 1. 플랫 벤치프레스 2. 덤벨 벤치프레스 3. 인클라인 벤치프레스 4. 플라이 5. 딥스");
        boardBean1.setUserName("Mark");
        boardBean1.setDate("2023-01-06");
        boardsList.add(boardBean1);

        BoardBean boardBean2 = new BoardBean();
        boardBean2.setTitle("등운동 루틴");
        boardBean2.setContent("등운동 1. 턱걸이 2. 렛풀다운 3. 시티드 로우 4. 바벨로우 5. 케이풀 풀다운");
        boardBean2.setUserName("Jacob");
        boardBean2.setDate("2023-01-08");
        boardsList.add(boardBean2);

        BoardBean boardBean3 = new BoardBean();
        boardBean3.setTitle("어깨운동 루틴");
        boardBean3.setContent("어깨운동 1. 머신 숄더프레스 2. 덤벨 숄더프레스 3. 사이드 레터럴 레이즈 4. 페이스 풀 5. 리버스 펙 덱 플라이");
        boardBean3.setUserName("Bird");
        boardBean3.setDate("2023-01-09");
        boardsList.add(boardBean3);

        BoardBean boardBean4 = new BoardBean();
        boardBean4.setTitle("하체운동 루틴");
        boardBean4.setContent("하체운동 1. 스쿼트 2. 파워프레스 3.레그 레이지  4. 레그 컬");
        boardBean4.setUserName("seok");
        boardBean4.setDate("2023-01-12");
        boardsList.add(boardBean4);

        return boardsList;
    }
}
