package com.kazarian.android.sematech_tir_1401_1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        VideoView vvtest = findViewById(R.id.vvtest);
        String myURL = "https://hajifirouz2.asset.aparat.com/aparat-video/ab0c17d439ffa97b6e5815f7e582b00e46363011-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImU2NTlkNjM1MWRiN2IyN2RhYzdjMmY3ZTA3YWYzOTQyIiwiZXhwIjoxNjU4ODYwMTk1LCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.2hkTdawBj16l0B3-KJpXC0JMPbm5VodMz1jyRd4Ib_4";
        vvtest.setVideoURI(Uri.parse(myURL));
        vvtest.setMediaController(new MediaController(VideoViewActivity.this));
        vvtest.start();
    }
}