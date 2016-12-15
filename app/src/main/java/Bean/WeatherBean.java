package Bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by tinyzo on 2016-12-15.
 */

public class WeatherBean  {
 private List<ResultEnty> result;

    public List<ResultEnty> getResult() {
        return result;
    }
    public void setResult(List<ResultEnty> result) {
        this.result = result;
    }
    public static class ResultEnty  implements Parcelable
    {
        private String city;
        private String cnty;
        private String prov;

        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getCnty() {
            return cnty;
        }
        public void setCnty(String cnty) {
            this.cnty = cnty;
        }
        public String getProv() {
            return prov;
        }
        public void setProv(String prov) {
            this.prov = prov;
        }
        protected ResultEnty(Parcel in) {
            city=in.readString();
            cnty=in.readString();
            prov=in.readString();

        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
             dest.writeString(city);
            dest.writeString(cnty);
            dest.writeString(prov);
        }


        public static final Parcelable.Creator<ResultEnty> CREATOR = new Parcelable.Creator<ResultEnty>() {
            @Override
            public ResultEnty createFromParcel(Parcel in) {
                return new ResultEnty(in);
            }

            @Override
            public ResultEnty[] newArray(int size) {
                return new ResultEnty[size];
            }
        };

    }
}
