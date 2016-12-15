package Bean;

import HttpUitil.NetService;
import HttpUitil.RetrofitUtil;
import retrofit2.Retrofit;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by tinyzo on 2016-12-15.
 */

public class RemoteDataSourse implements WeatherDataSourse {
    @Override
    public void getdata(String city, String key, String lang, final LoadCallBack callBack) {
        RetrofitUtil.getRetrofit()
                .create(NetService.class)
                .getData("beijing","86590feb4d9f43a790cf49666c410d53","zh-cn")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(WeatherBean weatherBean) {
                   callBack.onGirlsLoaded(weatherBean);
                    }
                });
    }
}
