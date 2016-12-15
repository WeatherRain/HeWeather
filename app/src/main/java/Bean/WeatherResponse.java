package Bean;

/**
 * Created by tinyzo on 2016-12-15.
 */

public class WeatherResponse implements WeatherDataSourse {
    private RemoteDataSourse mRemoteDataSourse;
    public  WeatherResponse()
    {
        mRemoteDataSourse=new RemoteDataSourse();
    }
    @Override
    public void getdata(String city, String key, String lang, LoadCallBack callBack) {
       mRemoteDataSourse.getdata(city,key,lang,callBack);
    }
}
