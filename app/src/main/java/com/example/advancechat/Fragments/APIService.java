package com.example.advancechat.Fragments;

import com.example.advancechat.Notification.MyResponse;
import com.example.advancechat.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAwMZ2VlY:APA91bF9gkR8cBz53hXCsWpFUUdsw3ohtCCVUcwqAFkRB1ml8CclzjFamS3K2dlKoZUvlvxQ55dABScvu4sTMqeTteaqt3V5lNGbSmAMU1TTGcM7a6NH18mtf9pRFL5_hVhn9wcjpF8T"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
