package com.ulas.cyrptocurrency.service;

import com.ulas.cyrptocurrency.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    // GET,POST,UPDATE,DELETE  (Read Docs API)

    //URL BASE --> www.website.com
      // GET --> price?key=xxxx

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")

    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();

}
