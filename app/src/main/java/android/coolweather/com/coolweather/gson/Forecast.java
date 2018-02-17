package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/2/12 0012.
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public Now.More more;
    public class Temperature {
        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_id")
        public String info;
    }
}