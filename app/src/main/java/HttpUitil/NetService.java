package HttpUitil;


import Bean.WeatherBean;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tinyzo on 2016-12-15.
 */

public interface NetService {
    @GET("now")
    rx.Observable<WeatherBean> getData(
            @Query("city") String city,
            @Query("key") String key,
            @Query("lang") String lang
    );

}
