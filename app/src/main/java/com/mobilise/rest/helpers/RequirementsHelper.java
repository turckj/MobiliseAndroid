package com.mobilise.rest.helpers;

import com.mobilise.rest.client.MobiliseRestClient;
import com.mobilise.rest.model.requirement.Requirements;

import retrofit.Call;
import retrofit.Response;

import java.io.IOException;

/**
 * Created by Turckish on 10/27/2015.
 */
public class RequirementsHelper {

    public Requirements getRequirements(MobiliseRestClient client, int page, int number) throws IOException {
        Call<Requirements> requirementsCall = client.getService().listRequirements(page, number);

        Response<Requirements> response;
        Requirements requirements = null;

        response = requirementsCall.execute();
        requirements = response.body();

        return requirements;
    }

}
