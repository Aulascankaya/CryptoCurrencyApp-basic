package com.ulas.cyrptocurrency.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")  // must equal data name
    public String currency;
    @SerializedName("price")
    public String price;
}
