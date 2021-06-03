package com.example.githubusers.data.network

import com.example.githubusers.data.modeels.Episode
import com.example.githubusers.data.modeels.Location
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable;

interface API {
    @GET("character/{id}")
    fun getHeroByIdArray(
        @Query("id") id: Array<Int>
    ): Observable<Character>

    @GET("location/{id}")
    fun getLocationByIdArray(
        @Query("id") id: Array<Int>
    ): Observable<Location>

    @GET("episode/{id}")
    fun getEpisodeByIdArray(
        @Query("id") id: Array<Int>
    ): Observable<Episode>
}