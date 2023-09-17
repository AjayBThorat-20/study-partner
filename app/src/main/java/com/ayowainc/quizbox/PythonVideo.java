package com.ayowainc.quizbox;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PythonVideo extends AppCompatActivity {

    Button Goback;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_python_video);
        MediaController mediaController = new MediaController( this );

        Goback = findViewById(R.id.vid_back_btn);
        videoView = findViewById( R.id.vid );
        videoView.setMediaController( mediaController );
        mediaController.setAnchorView( videoView );

        Uri uri = Uri.parse( "https://firebasestorage.googleapis.com/v0/b/the-quizbox-3bb56.appspot.com/o/python.mp4?alt=media&token=65943a51-7ba9-4cb0-a876-3f80f8bb0ad0" );
        videoView.setVideoURI( uri );
        videoView.start();




        Goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GT = new Intent(getApplicationContext(), TutVideo.class);
                startActivity(GT);
            }
        });

    }
}



