package co.edu.udea.compumovil.gr05_20182.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Image_Button_New =  findViewById(R.id.photo_new);
        Image_Button_New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Image_Button_New = new Intent(Main_Activity.this,Meme_Image_new.class);
                startActivity(Image_Button_New);
            }
        });

        ImageButton Image_Button_Old =  findViewById(R.id.image_old);
        Image_Button_Old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Image_Button_Old = new Intent(Main_Activity.this,Meme_Image_Old.class);
                startActivity(Image_Button_Old);
            }
        });

        ImageButton Video_Button_Old =  findViewById(R.id.video_old);
        Video_Button_Old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Video_Button_Old = new Intent(Main_Activity.this,Meme_Video_Old.class);
                startActivity(Video_Button_Old);
            }
        });

        ImageButton Video_Button_New =  findViewById(R.id.video_new);
        Video_Button_New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Video_Button_New = new Intent(Main_Activity.this,Meme_Video_new.class);
                startActivity(Video_Button_New);
            }
        });

        ImageButton Image_Button_Popular =  findViewById(R.id.image_popular);
        Image_Button_Popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Image_Button_Popular = new Intent(Main_Activity.this,Meme_Video_new.class);
                startActivity(Image_Button_Popular);
            }
        });

        ImageButton Video_Button_Popular =  findViewById(R.id.video_popular);
        Video_Button_Popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Video_Button_Popular = new Intent(Main_Activity.this,Meme_Video_new.class);
                startActivity(Video_Button_Popular);
            }
        });
    }

}
