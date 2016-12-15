package Bean;

/**
 * Created by tinyzo on 2016-12-15.
 */

public interface WeatherDataSourse {
    interface LoadCallBack
    {
        void onGirlsLoaded(WeatherBean girlsBean);
    }
    void getdata(String city,String key,String lang,LoadCallBack callBack);
}
