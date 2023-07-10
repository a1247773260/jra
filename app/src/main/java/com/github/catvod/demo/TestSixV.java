package com.github.catvod.demo;

import android.content.Context;

import com.github.catvod.spider.SixV;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestSixV {
    SixV sixV;

    @Before
    public void init() {
        sixV = new SixV();
        sixV.init(new Context(), "https://www.6vdy.org/");
    }

    @Test
    public void homeContent() {
        // 首页测试，输出...
        String s = sixV.homeContent(true);
        System.out.println(s);
    }

    @Test
    public void categoryContent() {
        // 分类页面数据测试
        HashMap<String, String> extend = new HashMap<>();
        System.out.println(sixV.categoryContent("my_tid_movie", "1", true, extend));
    }

    @Test
    public void detailContent() {
        // 详情页面数据测试
        ArrayList<String> ids = new ArrayList<>();
        ids.add("https://www.6vdy.org/xijupian/20346.html");
//        ids.add("https://www.6vdy.org/xijupian/20531.html");
//        ids.add("https://www.6vdy.org/xijupian/20620.html");
        System.out.println(sixV.detailContent(ids));
    }

    @Test
    public void searchContent() {
        // 搜索测试
        String s = sixV.searchContent("保镖", true);
        System.out.println(s);
    }
}