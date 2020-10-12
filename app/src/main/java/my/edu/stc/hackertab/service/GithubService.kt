package my.edu.stc.hackertab.service

import my.edu.stc.hackertab.model.Repository
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    /**
     * @param language - any programming language
     * @param spokenLanguage - natural language
     * @param since - when it start be popular
     */
    @GET("/repositories?")
    fun getRepositories(@Query("language") language: String,
                        @Query("spoken_language") spokenLanguage: String,
                        @Query("since") since: String): Call<List<Repository>>
}