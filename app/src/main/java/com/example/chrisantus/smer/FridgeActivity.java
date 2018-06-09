package com.example.chrisantus.smer;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.Bitmap;

import java.util.ArrayList;

public class FridgeActivity extends AppCompatActivity {
    private LinearLayout mGallery1;
    ArrayList<Integer> mImgIds = new ArrayList<>();
    private LayoutInflater mInflater;
    private HorizontalScrollView horizontalScrollView;
    SharedPreferences sh_pref;
    SharedPreferences.Editor toEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);
        mInflater = LayoutInflater.from(this);
        Intent intent = getIntent();

        String msg = (String) intent.getExtras().get("msg");

        if (msg.equals("onion")) {
            mImgIds.add(R.drawable.onion);
            sharedPreferences();
        }
        if (msg.equals("pa")) {
            mImgIds.add(R.drawable.pa);
            sharedPreferences();
        }
        if (msg.equals("cow")) {
            mImgIds.add(R.drawable.cow);
            sharedPreferences();

        }
        if (msg.equals("pork")) {
            mImgIds.add(R.drawable.pork);
            sharedPreferences();
        }
        if (msg.equals("eggs")) {
            mImgIds.add(R.drawable.eggs);
            sharedPreferences();
        }
        if (msg.equals("potato")) {
            mImgIds.add(R.drawable.potato);
            sharedPreferences();
        }
        if (msg.equals("saewo")) {
            mImgIds.add(R.drawable.saewo);
            sharedPreferences();
        }
        if (msg.equals("tofu")) {
            mImgIds.add(R.drawable.tofu);
            sharedPreferences();
        }
        if (msg.equals("namul")) {
            mImgIds.add(R.drawable.namul);
            sharedPreferences();
        }
        if (msg.equals("sikbang")) {
            mImgIds.add(R.drawable.sikbang);
            sharedPreferences();
        }
        if (msg.equals("grarlic")) {
            mImgIds.add(R.drawable.grarlic);
            sharedPreferences();
        }
        if (msg.equals("butter")) {
            mImgIds.add(R.drawable.butter);
            sharedPreferences();
        }
        if (msg.equals("milk")) {
            mImgIds.add(R.drawable.milk);
            sharedPreferences();
        }
        if (msg.equals("cream")) {
            mImgIds.add(R.drawable.cream);
            sharedPreferences();
        }
        if (msg.equals("kim")) {
            mImgIds.add(R.drawable.kim);
            sharedPreferences();
        }
        if (msg.equals("fish")) {
            mImgIds.add(R.drawable.fish);
            sharedPreferences();
        }

        applySharedPreference();


        initView1();


    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//        SharedPreferences sf=getPreferences(sfName,0);
//        SharedPreferences.Editor editor=sf.edit();
//        Intent intent=getIntent();

    //        String msg=(String)intent.getExtras().get("msg");
//        editor.putInt("img",msg);
//        editor.commit();
    //}
//    private void initData() {
//        Intent intent = getIntent();
//
//        String msg = (String) intent.getExtras().get("msg");
//
//        if (msg.equals("onion")) {
//            mImgIds.add(R.drawable.onion);
//            sharedPreferences();
//        }
//        if (msg.equals("pa")) {
//            mImgIds.add(R.drawable.pa);
//            sharedPreferences();
//        }
//        if (msg.equals("cow")) {
//            mImgIds.add(R.drawable.cow);
//            sharedPreferences();
//
//        }
//        if (msg.equals("pork")) {
//            mImgIds.add(R.drawable.pork);
//            sharedPreferences();
//        }
//        if (msg.equals("eggs")) {
//            mImgIds.add(R.drawable.eggs);
//            sharedPreferences();
//        }
//        if (msg.equals("potato")) {
//            mImgIds.add(R.drawable.potato);
//            sharedPreferences();
//        }
//        if (msg.equals("saewo")) {
//            mImgIds.add(R.drawable.saewo);
//            sharedPreferences();
//        }
//        if (msg.equals("tofu")) {
//            mImgIds.add(R.drawable.tofu);
//            sharedPreferences();
//        }
//        if (msg.equals("namul")) {
//            mImgIds.add(R.drawable.namul);
//            sharedPreferences();
//        }
//        if (msg.equals("sikbang")) {
//            mImgIds.add(R.drawable.sikbang);
//            sharedPreferences();
//        }
//        if (msg.equals("grarlic")) {
//            mImgIds.add(R.drawable.grarlic);
//            sharedPreferences();
//        }
//        if (msg.equals("butter")) {
//            mImgIds.add(R.drawable.butter);
//            sharedPreferences();
//        }
//        if (msg.equals("milk")) {
//            mImgIds.add(R.drawable.milk);
//            sharedPreferences();
//        }
//        if (msg.equals("cream")) {
//            mImgIds.add(R.drawable.cream);
//            sharedPreferences();
//        }
//        if (msg.equals("kim")) {
//            mImgIds.add(R.drawable.kim);
//            sharedPreferences();
//        }
//        if (msg.equals("fish")) {
//            mImgIds.add(R.drawable.fish);
//            sharedPreferences();
//        }
//        applySharedPreference();
//
//    }

    private void initView1() {
        mGallery1 = (LinearLayout) findViewById(R.id.id_gallery);
        for (int i = 0; i < mImgIds.size(); i++) {
            View view = mInflater.inflate(R.layout.activity_gallery_item,
                    mGallery1, false);
            ImageView img = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);
            img.setImageResource(mImgIds.get(i));
            TextView txt = (TextView) view.findViewById(R.id.id_index_gallery_item_text);
            txt.setText("Info " + i);
            mGallery1.addView(view);
        }
    }

    public void sharedPreferences() {
        sh_pref = getSharedPreferences("ingredient", MODE_PRIVATE);
        toEdit = sh_pref.edit();
        for (int i = 0; i < mImgIds.size(); i++) {
            toEdit.putInt("match", mImgIds.get(i));
        }
        toEdit.commit();
    }

    public void applySharedPreference() {
        sh_pref = getSharedPreferences("ingredient", MODE_PRIVATE);
        if (sh_pref != null && sh_pref.contains("match")) {
            for (int i = 0; i < mImgIds.size(); i++) {
                View view = mInflater.inflate(R.layout.activity_gallery_item,
                        mGallery1, false);
                ImageView img = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);
                img.setImageResource(mImgIds.get(i));
            }
        }
    }

}
