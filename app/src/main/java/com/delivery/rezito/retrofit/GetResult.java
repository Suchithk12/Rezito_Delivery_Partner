package com.delivery.rezito.retrofit;

import android.util.Log;
import android.widget.Toast;

import com.delivery.rezito.MyApplication;
import com.delivery.rezito.utils.Utiles;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetResult {
    public static MyListener myListener;

    public void callForLogin(Call<JsonObject> call, String callno) {
        if(!Utiles.internetChack()){
            Toast.makeText(MyApplication.mContext, "Please Check Your Internet Connection", Toast.LENGTH_SHORT).show();
        }else {
            call.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    Log.e("message", " : " + response.message());
                    Log.e("body", " : " + response.body());
                    Log.e("callno", " : " + callno);
                    myListener.callback(response.body(), callno);
                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {
                    myListener.callback(null, callno);
                    call.cancel();
                    t.printStackTrace();
                }
            });
        }

    }

    public interface MyListener {
        // you can define any parameter as per your requirement
        public void callback(JsonObject result, String callNo);
    }

    public void setMyListener(MyListener Listener) {
        myListener = Listener;
    }
}
