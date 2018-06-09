package com.example.chrisantus.smer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
/**
 * Created by chrisantus on 2018. 4. 28..
 */
import android.app.Activity;
public class Fragment18_ extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.frag_layout_3, container, false);
        return rootView; //fragment 불러오기
    }
}