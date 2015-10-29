package com.mobilise.rest.helpers;

import com.mobilise.rest.client.MobiliseRestClient;
import com.mobilise.rest.model.service.Services;
import retrofit.Call;
import retrofit.Response;

import java.io.IOException;

/**
 * Created by Turckish on 10/27/2015.
 */
public class ServiceHelper {

    public Services getServices(MobiliseRestClient client, int page, int number) throws IOException {
        Call<Services> servicesCall = client.getService().listServices(page, number);

        Response<Services> response;
        Services services = null;

        response = servicesCall.execute();
        services = response.body();

        return services;
    }

}
