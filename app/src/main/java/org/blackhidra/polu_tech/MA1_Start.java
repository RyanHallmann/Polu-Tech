package org.blackhidra.polu_tech;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MA1_Start extends AppCompatActivity {

    public Button btnStart;
    public Button btnNextDay;

    public TextView txtvQuestion1;
    public TextView txtvQuestion2;
    public TextView txtvQuestion3;
    public TextView txtvLandPol;
    public TextView txtvAirPol;
    public TextView txtvOceanPol;
    public TextView txtvNaturePol;
    public TextView txtvCompanySize;
    public TextView txtvMoney;
    public TextView txtvDaysLeft;

    public ImageView imvSky;
    public ImageView imvLand;
    public ImageView imvOcean;
    public ImageView imvNature;
    public ImageView imvCompany;

    public int LandPol;
    public int AirPol;
    public int OceanPol;
    public int NaturePol;
    public int CompanySize;
    public int Money;
    public int DaysLeft;
    public Double QuestionNum1;
    public Double QuestionNum2;
    public Double QuestionNum3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma1__start);

        btnStart = (Button) findViewById(R.id.btnStart);

        CompanySize = 50;
        Money = 50;
        AirPol = 0;
        LandPol = 0;
        OceanPol = 0;
        NaturePol = 0;
    }

    public void StartGame(View view) {
        DaysLeft = 10;
        GUI();
    }

    public void GUI () {

        setContentView(R.layout.activity_ma2_gui);
        imvSky = (ImageView) findViewById(R.id.imvSky);
        imvLand = (ImageView) findViewById(R.id.imvLand);
        imvOcean = (ImageView) findViewById(R.id.imvOcean);
        imvNature = (ImageView) findViewById(R.id.imvNature);
        imvCompany = (ImageView) findViewById(R.id.imvCompany);

        //I never thought that colors would be the thing that defeat me
        //but setting the background of these Image Views has actually
        //been the hardest thing to figure out so far.

        //This Didn't Work
        //imvSky.getBackground().setColorFilter(Color.argb(255, 4, 212, 115), PorterDuff.Mode.MULTIPLY);
        //Neither did this
        //imvSky.setBackgroundColor(Color.parseColor("#80EA0A"));
        //I Just don't know what to do
        //imvSky.setBackgroundResource(R.color.Sky3);
        //imvOcean.setBackgroundColor(Color.rgb(0, 14, 142));

        //So the app functions but it's missing its visual elements
        //also I ran out of scenes for a ending/final screen

/*
        if (AirPol <= 0) {
            imvSky.setBackgroundColor(Color.argb(255, 0, 128, 248));
            imvSky.requestLayout();
        }
        else if (AirPol <= 50) {
            imvSky.setBackgroundResource(R.color.Sky3);
            imvSky.getBackground().setColorFilter(Color.argb(255, 128, 234, 10), PorterDuff.Mode.MULTIPLY);
        }
        else if (AirPol <= 100) {
            imvSky.getBackground().setColorFilter(Color.argb(255, 4, 212, 115), PorterDuff.Mode.MULTIPLY);
            imvSky.setBackgroundColor(Color.parseColor("#80EA0A"));
            imvSky.setBackgroundResource(R.color.Sky3);
        }
        else if (AirPol <= 150) {
            imvSky.setBackgroundColor(Color.argb(255, 1, 158, 85));
            imvSky.requestLayout();
        }
        else {
            imvSky.setBackgroundColor(Color.argb(255, 17, 158, 1));
            imvSky.requestLayout();
        }

        if (LandPol <= 0) {
            imvLand.setBackgroundColor(Color.rgb(0, 237, 12));
        }
        else if (LandPol <= 50) {
            imvLand.setBackgroundColor(Color.rgb(3, 188, 15));
        }
        else if (LandPol <= 100) {
            imvLand.setBackgroundColor(Color.rgb(55, 141, 5));
        }
        else if (LandPol <= 150) {
            imvLand.setBackgroundColor(Color.rgb(105, 141, 5));
        }
        else {
            imvLand.setBackgroundColor(Color.rgb(141, 132, 5));
        }

        if (OceanPol <= 0) {
            imvOcean.setBackgroundColor(Color.rgb(0, 14, 142));
        }
        else if (OceanPol <= 20) {
            imvOcean.setBackgroundColor(Color.rgb(0, 91, 144));
        }
        else if (OceanPol <= 40) {
            imvOcean.setBackgroundColor(Color.rgb(0, 144, 124));
        }
        else if (OceanPol <= 60) {
            imvOcean.setBackgroundColor(Color.rgb(0, 144, 53));
        }
        else {
            imvOcean.setBackgroundColor(Color.rgb(0, 144, 0));
        }

        if (NaturePol <= 0) {
            imvNature.setBackgroundColor(Color.rgb(142, 66, 0));
        }
        else if (NaturePol <= 50) {
            imvNature.setBackgroundColor(Color.rgb(114, 53, 1));
        }
        else if (NaturePol <= 100) {
            imvNature.setBackgroundColor(Color.rgb(84, 39, 0));
            imvNature.getLayoutParams().height = 80;
            imvNature.requestLayout();
        }
        else if (NaturePol <= 150) {
            imvNature.setBackgroundColor(Color.rgb(57, 27, 0));
            imvNature.getLayoutParams().height = 60;
            imvNature.requestLayout();
        }
        else {
            imvNature.setBackgroundColor(Color.rgb(20, 9, 0));
            imvNature.getLayoutParams().height = 20;
            imvNature.requestLayout();
        }

        if (CompanySize <= 0) {
            imvCompany.getLayoutParams().height = 120;
            imvCompany.requestLayout();
        }
        else if (CompanySize <= 50) {
            imvCompany.getLayoutParams().height = 180;
            imvCompany.requestLayout();
        }
        else if (CompanySize <= 100) {
            imvCompany.getLayoutParams().height = 240;
            imvCompany.requestLayout();
        }
        else if (CompanySize <= 150) {
            imvCompany.getLayoutParams().height = 300;
            imvCompany.requestLayout();
        }
        else {
            imvCompany.getLayoutParams().height = 400;
            imvCompany.requestLayout();
        }
*/
        new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
            GenerateQuestion();
            }

        }.start();
    }

    public void GenerateQuestion() {
        setContentView(R.layout.activity_ma3_questions);
        txtvQuestion1 = (TextView) findViewById(R.id.txtvQuestion1);
        txtvQuestion2 = (TextView) findViewById(R.id.txtvQuestion2);
        txtvQuestion3 = (TextView) findViewById(R.id.txtvQuestion3);
        QuestionNum1 = Math.random() * 5 + 0;
        QuestionNum2 = Math.random() * 5 + 0;
        QuestionNum3 = Math.random() * 5 + 0;

        if (QuestionNum1 <= 0) {
            txtvQuestion1.setText("Deforest Foreign Countries");
        }
        else if (QuestionNum1 <= 1) {
            txtvQuestion1.setText("Dump Garbage in Ocean");
        }
        else if (QuestionNum1 <= 2) {
            txtvQuestion1.setText("Bury Nuclear Waste in Earth");
        }
        else if (QuestionNum1 <= 3) {
            txtvQuestion1.setText("Pump Co2 into the Air");
        }
        else {
            txtvQuestion1.setText("Donate to Charity");
        }

       if (QuestionNum2 <= 0) {
            txtvQuestion2.setText("Deforest Foreign Countries");
        }
        else if (QuestionNum2 <= 1) {
            txtvQuestion2.setText("Dump Garbage in Ocean");
        }
        else if (QuestionNum2 <= 2) {
            txtvQuestion2.setText("Bury Nuclear Waste in Earth");
        }
        else if (QuestionNum2 <= 3) {
            txtvQuestion2.setText("Pump Co2 into the Air");
        }
        else {
            txtvQuestion2.setText("Donate to Charity");
        }

        if (QuestionNum3 <= 0) {
            txtvQuestion3.setText("Deforest Foreign Countries");
        }
        else if (QuestionNum3 <= 1) {
            txtvQuestion3.setText("Dump Garbage in Ocean");
        }
        else if (QuestionNum3 <= 2) {
            txtvQuestion3.setText("Bury Nuclear Waste in Earth");
        }
        else if (QuestionNum3 <= 3) {
            txtvQuestion3.setText("Pump Co2 into the Air");
        }
        else {
            txtvQuestion3.setText("Donate to Charity");
        }


    }

    public void Question1 (View view) {
        if (QuestionNum1 <= 0) {
            NaturePol+=50;
            CompanySize+=20;
            Money+=30;
        }
        else if (QuestionNum1 <= 1) {
            OceanPol+=30;
            NaturePol+=10;
            CompanySize+=10;
            Money+=40;
        }
        else if (QuestionNum1 <= 2) {
            LandPol+=70;
            NaturePol+=30;
            CompanySize+=50;
            Money+=80;
        }
        else if (QuestionNum1 <= 3) {
            AirPol+=100;
            CompanySize+=10;
            Money+=10;
        }
        else {
            CompanySize-=40;
            Money-=50;
            AirPol-=10;
            LandPol-=10;
            OceanPol-=10;
            NaturePol-=30;
        }

        setContentView(R.layout.activity_ma4_stats);

        btnNextDay = (Button) findViewById(R.id.btnNextDay);
        txtvLandPol = (TextView) findViewById(R.id.txtvLandPol);
        txtvAirPol = (TextView) findViewById(R.id.txtvAirPol);
        txtvOceanPol = (TextView) findViewById(R.id.txtvOceanPol);
        txtvNaturePol = (TextView) findViewById(R.id.txtvNaturePol);
        txtvCompanySize = (TextView) findViewById(R.id.txtvCompanySize);
        txtvMoney = (TextView) findViewById(R.id.txtvMoney);
        txtvDaysLeft = (TextView) findViewById(R.id.txtvDaysLeft);

        txtvAirPol.setText(String.valueOf(AirPol));
        txtvLandPol.setText(String.valueOf(LandPol));
        txtvOceanPol.setText(String.valueOf(OceanPol));
        txtvNaturePol.setText(String.valueOf(NaturePol));
        txtvCompanySize.setText(String.valueOf(CompanySize));
        txtvMoney.setText(String.valueOf(Money));

        DaysLeft-=1;
        if (DaysLeft <= 0) {
            btnNextDay.setText("END GAME");
        }

        txtvDaysLeft.setText(String.valueOf(DaysLeft));
    }

    public void Question2 (View view) {
        if (QuestionNum2 <= 0) {
            NaturePol+=50;
            CompanySize+=20;
            Money+=30;
        }
        else if (QuestionNum2 <= 1) {
            OceanPol+=30;
            NaturePol+=10;
            CompanySize+=10;
            Money+=40;
        }
        else if (QuestionNum2 <= 2) {
            LandPol+=70;
            NaturePol+=30;
            CompanySize+=50;
            Money+=80;
        }
        else if (QuestionNum2 <= 3) {
            AirPol+=100;
            CompanySize+=10;
            Money+=10;
        }
        else {
            CompanySize-=40;
            Money-=50;
            AirPol-=10;
            LandPol-=10;
            OceanPol-=10;
            NaturePol-=30;
        }

        setContentView(R.layout.activity_ma4_stats);

        btnNextDay = (Button) findViewById(R.id.btnNextDay);
        txtvLandPol = (TextView) findViewById(R.id.txtvLandPol);
        txtvAirPol = (TextView) findViewById(R.id.txtvAirPol);
        txtvOceanPol = (TextView) findViewById(R.id.txtvOceanPol);
        txtvNaturePol = (TextView) findViewById(R.id.txtvNaturePol);
        txtvCompanySize = (TextView) findViewById(R.id.txtvCompanySize);
        txtvMoney = (TextView) findViewById(R.id.txtvMoney);
        txtvDaysLeft = (TextView) findViewById(R.id.txtvDaysLeft);

        txtvAirPol.setText(String.valueOf(AirPol));
        txtvLandPol.setText(String.valueOf(LandPol));
        txtvOceanPol.setText(String.valueOf(OceanPol));
        txtvNaturePol.setText(String.valueOf(NaturePol));
        txtvCompanySize.setText(String.valueOf(CompanySize));
        txtvMoney.setText(String.valueOf(Money));

        DaysLeft-=1;
        if (DaysLeft <= 0) {
            btnNextDay.setText("END GAME");
        }

        txtvDaysLeft.setText(String.valueOf(DaysLeft));
    }

    public void Question3 (View view) {
        if (QuestionNum3 <= 0) {
            NaturePol+=50;
            CompanySize+=20;
            Money+=30;
        }
        else if (QuestionNum3 <= 1) {
            OceanPol+=30;
            NaturePol+=10;
            CompanySize+=10;
            Money+=40;
        }
        else if (QuestionNum3 <= 2) {
            LandPol+=70;
            NaturePol+=30;
            CompanySize+=50;
            Money+=80;
        }
        else if (QuestionNum3 <= 3) {
            AirPol+=100;
            CompanySize+=10;
            Money+=10;
        }
        else {
            CompanySize-=40;
            Money-=50;
            AirPol-=10;
            LandPol-=10;
            OceanPol-=10;
            NaturePol-=30;
        }

        setContentView(R.layout.activity_ma4_stats);

        btnNextDay = (Button) findViewById(R.id.btnNextDay);
        txtvLandPol = (TextView) findViewById(R.id.txtvLandPol);
        txtvAirPol = (TextView) findViewById(R.id.txtvAirPol);
        txtvOceanPol = (TextView) findViewById(R.id.txtvOceanPol);
        txtvNaturePol = (TextView) findViewById(R.id.txtvNaturePol);
        txtvCompanySize = (TextView) findViewById(R.id.txtvCompanySize);
        txtvMoney = (TextView) findViewById(R.id.txtvMoney);
        txtvDaysLeft = (TextView) findViewById(R.id.txtvDaysLeft);

        txtvAirPol.setText(String.valueOf(AirPol));
        txtvLandPol.setText(String.valueOf(LandPol));
        txtvOceanPol.setText(String.valueOf(OceanPol));
        txtvNaturePol.setText(String.valueOf(NaturePol));
        txtvCompanySize.setText(String.valueOf(CompanySize));
        txtvMoney.setText(String.valueOf(Money));

        DaysLeft-=1;
        if (DaysLeft <= 0) {
            btnNextDay.setText("END GAME");
        }

        txtvDaysLeft.setText(String.valueOf(DaysLeft));
    }

    public void NextDay(View view) {
        if (DaysLeft <= 0) {
            CompanySize = 50;
            Money = 50;
            AirPol = 0;
            LandPol = 0;
            OceanPol = 0;
            NaturePol = 0;
            setContentView(R.layout.activity_ma1__start);
        }
        else {
            GUI();
            setContentView(R.layout.activity_ma2_gui);
        }
    }

}
