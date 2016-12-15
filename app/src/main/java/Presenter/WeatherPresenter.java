package Presenter;

import android.util.Log;

import Bean.WeatherBean;
import Bean.WeatherDataSourse;
import Bean.WeatherResponse;
import timer.heweather.MainActivity;
import timer.heweather.R;

/**
 * Created by tinyzo on 2016-12-15.
 */

public class WeatherPresenter {
    private WeatherResponse mWeatherResponse;
    public WeatherPresenter()
    {
        mWeatherResponse=new WeatherResponse();
    }
     public  void start()
     {
         getData("beijing","86590feb4d9f43a790cf49666c410d53","zh-cn");
     }

    public void getData(String city, String key,String lang) {
        mWeatherResponse.getdata(city, key, lang, new WeatherDataSourse.LoadCallBack() {
            @Override
            public void onGirlsLoaded(WeatherBean girlsBean) {
                System.out.print("获取数据"+girlsBean.getResult().get(0).getCity());
            }
        });
    }
      /*  mWeatherResponse.getdata(city, key, new GirlsDataSource.LoadGirlsCallback() {
            @Override
            public void onGirlsLoaded(GirlsBean girlsBean) {
                if (isRefresh) {
                    mView.refresh(girlsBean.getResults());
                } else {
                    mView.load(girlsBean.getResults());
                }
                mView.showNormal();
            }

            @Override
            public void onDataNotAvailable() {
                if (isRefresh) {
                    mView.showError();
                }
            }
        });
    }*/
}
