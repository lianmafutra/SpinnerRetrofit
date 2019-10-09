package com.sunflower.spinnerretrofit.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ResponseData {

    @SerializedName("result")
    private List<ResultItem> result;

    @SerializedName("kode")
    private int kode;

    public void setResult(List<ResultItem> result) {
        this.result = result;
    }

    public List<ResultItem> getResult() {
        return result;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getKode() {
        return kode;
    }

    @Override
    public String toString() {
        return
                "ResponseData{" +
                        "result = '" + result + '\'' +
                        ",kode = '" + kode + '\'' +
                        "}";
    }
}