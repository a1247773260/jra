package com.github.catvod.demo;

import com.github.catvod.spider.BTPiaoHua;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestBTPiaoHua {

    BTPiaoHua btPiaoHua;

    @Before
    public void init() {
        btPiaoHua = new BTPiaoHua();
    }

    @Test
    public void homeContent() {
        System.out.println(btPiaoHua.homeContent(true));
    }

    @Test
    public void homeVideoContent() {
    }

    @Test
    public void categoryContent() {
        HashMap<String, String> extend = new HashMap<>();
//        System.out.println(btPiaoHua.categoryContent("/dongzuo/", "1", true, extend));
        System.out.println(btPiaoHua.categoryContent("/dongzuo/", "3", true, extend));
    }

    @Test
    public void detailContent() {
        ArrayList<String> ids = new ArrayList<>();
//        ids.add("https://www.xpiaohua.com/column/lianxuju/20210221/51623.html");
//        ids.add("https://www.xpiaohua.com/column/dongzuo/20230626/63766.html");
//        ids.add("https://www.xpiaohua.com/column/dongzuo/20230622/63721.html");
        ids.add("https://www.xpiaohua.com/column/dongzuo/20230622/63719.html");
        System.out.println(btPiaoHua.detailContent(ids));
    }

    @Test
    public void searchContent() {
        System.out.println(btPiaoHua.searchContent("我", true));
    }

    @Test
    public void playerContent() {
    }
}