1. Packages to import:
    - android.widget.Button

    (audio player)
    - android.media.MediaPlayer
    - android.media.AudioAttributes
    - android.net.Uri
    - android.util.Log
    - java.io.IOException
    
    (video player)
    - android.widget.MediaController
    - android.widget.VideoView

2. Add this line to the manifest file, `AndroidManifest.xml`:

        <uses-permission android:name="android.permission.INTERNET"/>

3. Audio Player

    - Create a flag variable

            final int []flag = {1}; // this will be used to pause/resume track

    - Create new player

            final MediaPlayer player = new MediaPlayer();

    - Create new track

            Uri track = Uri.parse("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3");

    - Create new audio attributes

            player.setAudioAttributes(
                new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()
            );

    - Set up player

            try {
                player.setDataSource(getApplicationContext(), track);
                player.prepare();
            }
            catch (IOException e) {
                e.printStackTrace();
                Log.d("Error", "Error");
            }

    - Play Button

            playBtn.setOnClickListener(v->{player.start();})
            
    - Pause Button 

            pauseBtn.setOnClickListener(v->{
                if(flag[0] == 1){
                    player.pause();
                    pauseBtn.setText("Resume");
                }
                else{
                    player.start();
                    pauseBtn.setText("Pause");
                }
                flag[0] = flaf[0] * -1;
            })

    - Still figuring out how to change tracks lol

4. Video Player

    - Download a video in `app/main/res/raw` 

        (will have to create the `raw` folder)

    - Create a new video view

            VideoView video = findViewById(R.id.kitty_video);

    - Set up the video source

            video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_file);
            
            video.start()

    - Create a new media controller
        
            MediaController media = new MediaController(this);

    - Attach controller to video view

            control.setAnchorView(video);
            video.setMediaController(control);

[Back to Index](../README.md)
