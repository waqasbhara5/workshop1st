package com.example.superheroapi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    ImageView ivImage;
    TextView tvname,tvintelligence,tvstrenght,tvSpeed,tvdurability,
            tvpower,tvcombat,tvgroup_affiliation,tvrelatives,tvOccupation,tvBase,tvFullName,
            tvAlterEgos,tvAliases,tvPlaceOfBirth,tvFirstAppearance,tvPublisher,tvAlignment,
            tvApper,tvGender,tvRace,tvHeight,tvWeight,tvEyeColor,tvHairColor;
    Button btn_Fatch_Data  ;
    EditText  etid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvname = findViewById(R.id.tvname);
        tvintelligence = findViewById(R.id.tvintelligence);
        tvstrenght = findViewById(R.id.tvstrenght);
        tvSpeed  = findViewById(R.id.tvspeed);
        tvdurability = findViewById(R.id.tvdurability);
        tvpower = findViewById(R.id.tvpower);
        tvcombat = findViewById(R.id.tvcombat);
        tvgroup_affiliation =findViewById(R.id.tvgroup_affiliation);
        tvrelatives = findViewById(R.id.tvrelatives);
        tvOccupation = findViewById(R.id.tvOccupation);
        tvBase = findViewById(R.id.tvBase);
        tvFullName = findViewById(R.id.tvFullName);
        tvAlterEgos = findViewById(R.id.tvAlterEgos);
        tvAliases = findViewById(R.id.tvAliases);
        tvPlaceOfBirth = findViewById(R.id.tvPlaceofBirth);
        tvFirstAppearance = findViewById(R.id.tvFirstAppearance);
        tvPublisher = findViewById(R.id.tvPublisher);
        tvAlignment = findViewById(R.id.tvAlignment);

        tvGender = findViewById(R.id.tvGender);
        tvRace = findViewById(R.id.tvRace);
        tvHeight = findViewById(R.id.tvHeight);
        tvWeight = findViewById(R.id.tvWeight);
        tvEyeColor = findViewById(R.id.tvEyeColor);
        tvHairColor = findViewById(R.id.tvHairColor);

        ivImage = findViewById(R.id.ivImage);


        btn_Fatch_Data = findViewById(R.id.btn_Fatch_Data);
        etid = findViewById(R.id.etid);

        Retrofit retrofit = RetrofitClient.getInstance();
        SuperHeroAPIService superHeroAPIService = retrofit.create(SuperHeroAPIService.class);

        btn_Fatch_Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = etid.getText().toString();
                Call<Image> callFetchImage = superHeroAPIService.fetchImage(id);
                    callFetchImage.enqueue(new Callback<Image>() {
                        @Override
                        public void onResponse(Call<Image> call, Response<Image> response) {
                            if (response.isSuccessful()){
                                Image image = response.body();


                            }
                        }

                        @Override
                        public void onFailure(Call<Image> call, Throwable t) {

                        }
                    });
                ///----------------------------
                Call<Powerstat> callFetchPowerstat = superHeroAPIService.fetchPowerStats(id);


               callFetchPowerstat.enqueue(new Callback<Powerstat>() {
                   @Override
                   public void onResponse(Call<Powerstat> call, Response<Powerstat> response) {
                       if (response.isSuccessful()) {
                           Powerstat powerstat = response.body();
                           tvname.setText("Name : " + powerstat.getName());
                       tvintelligence.setText("Intelligence : "+powerstat.getIntelligence());
                       tvstrenght.setText("Strenght :" +powerstat.getStrength());
                       tvSpeed.setText("Speed : " +powerstat.getSpeed());
                       tvdurability.setText("Durability : " +powerstat.getDurability());
                       tvpower.setText("Power :" +powerstat.getPower());
                       tvcombat.setText("Combat : "+powerstat.getCombat());

                       }
                   }

                   @Override
                   public void onFailure(Call<Powerstat> call, Throwable t) {

                   }
               });

               Call<Work> callFetchWork = superHeroAPIService.fetchWork(id);
                callFetchWork.enqueue(new Callback<Work>() {
                    @Override
                    public void onResponse(Call<Work> call, Response<Work> response) {
                        if (response.isSuccessful()){
                            Work work = response.body();
                            tvOccupation.setText("Occupation : " +work.getOccupation());
                            tvBase.setText("Base : " +work.getBase());
                        }
                    }

                    @Override
                    public void onFailure(Call<Work> call, Throwable t) {

                    }
                });

               Call<Biography> callFetchBiography = superHeroAPIService.fetchBiography(id);
                callFetchBiography.enqueue(new Callback<Biography>() {
                    @Override
                    public void onResponse(Call<Biography> call, Response<Biography> response) {
                        if (response.isSuccessful()){
                            Biography biography = response.body();
                            tvFullName.setText("Full Name : " +biography.getApikey());
                            tvAlterEgos.setText("AlterEgos : " +biography.getApikey2());
                            tvAliases.setText("Aliases : " +biography.getAliases());
                            tvPlaceOfBirth.setText("Place of Birth : " +biography.getApikey3());
                            tvFirstAppearance.setText("First Appearance : "+biography.getApikey4());
                            tvPublisher.setText("Publisher : "+biography.getPublisher());
                            tvAlignment.setText("Alignment : "+biography.getAlignment());


                        }
                    }

                    @Override
                    public void onFailure(Call<Biography> call, Throwable t) {

                    }
                });


                Call<Connections> callFetchConnections = superHeroAPIService.fetchConnections(id);
                    callFetchConnections.enqueue(new Callback<Connections>() {
                        @Override
                        public void onResponse(Call<Connections> call, Response<Connections> response) {
                            if (response.isSuccessful()) {
                                Connections connections = response.body();
                                tvgroup_affiliation.setText("Group Affiliation : " +connections.getApikey());
                                tvrelatives.setText("Relatives : " +connections.getRelatives());
                            }
                        }

                        @Override
                        public void onFailure(Call<Connections> call, Throwable t) {

                        }
                    });
                    Call<Appearance> appearanceCall = superHeroAPIService.fetchAppearance(id);
                        appearanceCall.enqueue(new Callback<Appearance>() {
                            @Override
                            public void onResponse(Call<Appearance> call, Response<Appearance> response) {
                            if (response.isSuccessful()){
                                Appearance appearance = response.body();
                                tvGender.setText("Gender : " +appearance.getGender());
                                tvRace.setText("Race : "+appearance.getRace());
                                tvHeight.setText("Height : "+appearance.getHeight());
                                tvWeight.setText("Weight :"+appearance.getWeight());
                                tvEyeColor.setText("Eye Color : " +appearance.getApikey5());
                                tvHairColor.setText("Hair Color : " +appearance.getApikey6());
                            }
                            }

                            @Override
                            public void onFailure(Call<Appearance> call, Throwable t) {

                            }
                        });
            }
        });


    }
}