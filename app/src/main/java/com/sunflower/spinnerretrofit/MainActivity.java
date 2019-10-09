package com.sunflower.spinnerretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.sunflower.myspinner.OnSpinerItemClick;
import com.sunflower.myspinner.SpinnerDialog;
import com.sunflower.spinnerretrofit.Model.ResponseData;
import com.sunflower.spinnerretrofit.Model.ResultItem;
import com.sunflower.spinnerretrofit.Server.Interface;
import com.sunflower.spinnerretrofit.Server.RetroServer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ProgressBar loading;

    private List<String> results = new ArrayList<String>();
    SpinnerDialog spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.txt_pilih) void click(){
        get_spinner();
    }


    public void get_spinner() {

        Interface api = RetroServer.getClient().create(Interface.class);
        Call<ResponseData> masalah = api.getdata();
        masalah.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {

                results = new ArrayList();

                final List<ResultItem> masalah_list = response.body().getResult();

                for (int i = 0; i < masalah_list.size(); i++) {
                    results.add(masalah_list.get(i).getKantorDinas());
                    loading.setVisibility(View.GONE);
                }

                spinner = new SpinnerDialog(MainActivity.this, (ArrayList<String>) results,"Pilih kategori Masalah");
                spinner.bindOnSpinerListener(new OnSpinerItemClick() {
                    @Override
                    public void onClick(String item, int position) {
                       ;
                        Toast.makeText(MainActivity.this,
                                masalah_list.get(position).getIdKantorDinas()+" "+
                                masalah_list.get(position).getKantorDinas(), Toast.LENGTH_SHORT).show();
                    }
                });

                if (spinner==null){

                }
                else {

                    spinner.showSpinerDialog();
                    spinner.searchbar(false);
                    spinner.setCancellable(true);
                }
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
            }
        });

    }



}
