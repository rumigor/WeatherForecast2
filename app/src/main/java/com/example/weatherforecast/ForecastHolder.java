package com.example.weatherforecast;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ForecastHolder extends RecyclerView.ViewHolder{
    private final TextView day;
    private final TextView dayT;
    private final TextView nightT;
    private final ImageView weatherCondition;

    public TextView getNightT() {
        return nightT;
    }

    public ForecastHolder(@NonNull View itemView) {
        super(itemView);
        day = itemView.findViewById(R.id.day);
        dayT = itemView.findViewById(R.id.dayT);
        nightT = itemView.findViewById(R.id.nightT);
        weatherCondition = itemView.findViewById(R.id.imageView);
    }

    public TextView getDay() {
        return day;
    }

    public TextView getDayT() {
        return dayT;
    }

    public ImageView getWeatherCondition() {
        return weatherCondition;
    }

    public void bind (final String dayW, final String temperatureW, final String temperatureN,final String weatherConditionW){
        day.setText(dayW);
        dayT.setText(temperatureW);
        nightT.setText(temperatureN);
        setPic(weatherConditionW);

    }

    private void setPic(String wCond) {
        Picasso.with(itemView.getContext()).load(String.format("http://openweathermap.org/img/wn/%s@4x.png", wCond)).into(weatherCondition);
    }
}
