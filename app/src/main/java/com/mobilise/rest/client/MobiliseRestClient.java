package com.mobilise.rest.client;

import com.mobilise.rest.logging.LoggingInterceptor;
import com.mobilise.rest.service.MobiliseService;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Turckish on 10/27/2015.
 */
public class MobiliseRestClient {
    private Retrofit retrofit;
    private MobiliseService service;
    private LoggingInterceptor loggingInterceptor = null;

    public MobiliseRestClient(String baseMobiliseApiUrl)
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseMobiliseApiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(MobiliseService.class);
    }

    public void enableDebugging()
    {
        if (loggingInterceptor == null) {
            loggingInterceptor = new LoggingInterceptor();
            retrofit.client().interceptors().add(loggingInterceptor);
        }
    }

    public void disableDebugging()
    {
        if (loggingInterceptor != null) {
            retrofit.client().interceptors().remove(loggingInterceptor);
            loggingInterceptor = null;
        }
    }

    public Retrofit getRetrofit()
    {
        return retrofit;
    }

    public MobiliseService getService()
    {
        return service;
    }

}


