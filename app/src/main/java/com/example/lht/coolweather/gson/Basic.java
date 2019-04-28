package com.example.lht.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    /**
     * json数据:
     * {
     *     "basic":{
     *         "city":"苏州"
     *         "id":"CN101190401"
     *         "update":{
     *             "loc":"2016-08-08 21:58"
     *         }
     *     }
     * }
     *
     * json中的一些字段不适合直接用来作为java字段来命名，因此使用
     * 了@SerializedName注解的方式来让json字段和java字段之间建立映射关系
     * */
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
