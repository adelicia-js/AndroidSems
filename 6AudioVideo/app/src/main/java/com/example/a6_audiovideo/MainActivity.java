package com.example.a6_audiovideo;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import java.io.IOException;
import android.widget.MediaController;
import android.widget.VideoView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playBtn = findViewById(R.id.play_btn);
        Button pauseBtn = findViewById(R.id.pause_btn);

        final int []flag = {1};
        final MediaPlayer player = new MediaPlayer();

        Uri track = Uri.parse("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-17.mp3");

        player.setAudioAttributes(
                new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()
        );

        try {
            player.setDataSource(getApplicationContext(), track);
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("Import failed", "importing audio failed :(");
        }

        playBtn.setOnClickListener(v->{
            player.start();
            Toast.makeText(this, "playing...", Toast.LENGTH_LONG).show();
        });

        pauseBtn.setOnClickListener(v-> {
            if(flag[0]==1){
                pauseBtn.setText("Resume");
                player.pause();
                Toast.makeText(this, "paused", Toast.LENGTH_LONG).show();
            }
            else {
                pauseBtn.setText("Pause");
                player.start();
                Toast.makeText(this, "playing...", Toast.LENGTH_LONG).show();
            }
            flag[0] = flag[0] * -1;
        });

        VideoView video = findViewById(R.id.kitty_video);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.kitty1);
        video.start();

        MediaController control = new MediaController(this);
        control.setAnchorView(video);
        video.setMediaController(control);
    }
}