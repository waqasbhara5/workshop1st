package com.example.superheroapi;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SearchName extends AppCompatActivity {
TextView tv1;
ImageView iv;
EditText etEnterName;
Button btnFetchByName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_name);
        tv1 = findViewById(R.id.tv1);
        etEnterName = findViewById(R.id.etEnterName);
        btnFetchByName = findViewById(R.id.btnFetchByName);
        iv = findViewById(R.id.iv);


        Retrofit retrofit = RetrofitClient.getInstance();
        SuperHeroAPIService superHeroAPIService = retrofit.create(SuperHeroAPIService.class);

        btnFetchByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etEnterName.getText().toString();

                    Call<Root> rootCall = superHeroAPIService.fetchByName(name);
                    rootCall.enqueue(new Callback<Root>() {
                        @Override
                        public void onResponse(Call<Root> call, Response<Root> response) {

                            if (response.isSuccessful()) {

                                Root root = response.body();


                                Glide.with(SearchName.this)
                                        .load(root.getResults().get(0).getImage().getUrl())
                                        .into(iv);

                                tv1.setText("POWERSTATS : \n\n"+
                                        "\n\nName : "+root.getResults().get(0).getName()+
                                        "\n\nPowerStats :"+root.getResults().get(0).getPowerstats().getName()+
                                        "\n\nIntelligence : "+root.getResults().get(0).getPowerstats().getIntelligence()+
                                        "\n\nStrenght : "+root.getResults().get(0).getPowerstats().getStrength()+
                                        "\n\nSpeed : "+root.getResults().get(0).getPowerstats().getSpeed()+
                                        "\n\nDurability : "+root.getResults().get(0).getPowerstats().getDurability()+
                                        "\n\nPower : "+root.getResults().get(0).getPowerstats().getPower()+
                                        "\n\nCombat : "+root.getResults().get(0).getPowerstats().getCombat()+

                                        "\n\nBIOGRAPHY :\n\n"+
                                                "\n\n\nFull Name : "+root.getResults().get(0).getBiography().getFullName()+
                                                "\n\nAllter Egos : "+root.getResults().get(0).getBiography().getAlterEgos()+
                                                "\n\nAliases : "+root.getResults().get(0).getBiography().getAliases()+
                                                "\n\nPlace of Birth : "+root.getResults().get(0).getBiography().getPlaceOfBirth()+
                                                "\n\nFirst Appearance : "+root.getResults().get(0).getBiography().getFirstAppearance()+
                                                "\n\nPublisher : "+root.getResults().get(0).getBiography().getPublisher()+
                                                "\n\nAlignment : "+root.getResults().get(0).getBiography().getAlignment()+

                                        "\n\nCONNECTIONS :\n\n "+
                                        "\n\nGroup Affiliation :"+root.getResults().get(0).getConnections().getApikey()+
                                        "\n\nRelatives  :"+root.getResults().get(0).getConnections().getRelatives()+

                                        "\n\nWork : \n\n"+
                                        "\n\nOccupation  :"+root.getResults().get(0).getWork().getOccupation()+
                                        "\n\nBase  :"+root.getResults().get(0).getWork().getBase()+

                                        "\n\nAppearance :\n\n "+
                                        "\n\nGender   :"+root.getResults().get(0).getAppearance().getGender()+
                                        "\n\nRace   :"+root.getResults().get(0).getAppearance().getRace()+
                                        "\n\nHeight   :"+root.getResults().get(0).getAppearance().getHeight()+
                                        "\n\nWeieght   :"+root.getResults().get(0).getAppearance().getWeight()+
                                        "\n\nEye Color   :"+root.getResults().get(0).getAppearance().getApikey5()+
                                        "\n\n Hair Color   :"+root.getResults().get(0).getAppearance().getApikey6()



                                );
                            }
                        }

                        @Override
                        public void onFailure(Call<Root> call, Throwable t) {
                            Toast.makeText(SearchName.this, "failure", Toast.LENGTH_SHORT).show();
                        }
                    });

            }
        });

    }
}