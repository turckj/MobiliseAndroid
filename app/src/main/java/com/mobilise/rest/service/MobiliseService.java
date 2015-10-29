package com.mobilise.rest.service;

import com.mobilise.rest.model.requirement.Requirements;
import com.mobilise.rest.model.service.Services;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Turckish on 9/24/2015.
 */
public interface MobiliseService {
    @GET("/api/v1/services")
    Call<Services> listServices(@Query("page") int page, @Query("limit") int numPages);

    @GET("/api/v1/requirements")
    Call<Requirements> listRequirements(@Query("page") int page, @Query("limit") int numPages);
}
