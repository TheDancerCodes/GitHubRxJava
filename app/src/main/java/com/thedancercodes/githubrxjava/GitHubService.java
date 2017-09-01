package com.thedancercodes.githubrxjava;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by nabwera on 01/09/2017.
 */

// We will pass this interface into Retrofit and Retrofit will create an implementation of GitHubService.
public interface GitHubService {

    @GET("users/{user}/starred")
    Observable<List<GitHubRepo>> getStarredRepositories(@Path("user") String userName);
}
