package com.geek.netty;

import okhttp3.*;

import java.io.IOException;

/**
 * @author: zhangycl
 * @date: 2020/10/28
 * @description:
 */
public class OKHttpDemo {


    public static void main(String[] args) throws IOException {
        OKHttpDemo demo = new OKHttpDemo();
        //打印url返回的内容
        String response = demo.doGet("http://localhost:8801/test");
        System.out.println(response);

    }

    String doGet(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }


}
