package dragoz.swimingfish;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class SoundPlayer   {

    private static MediaPlayer over;
    private static MediaPlayer hit;


    public  SoundPlayer(Context context){


        hit=MediaPlayer.create(context,R.raw.hit);
        over=MediaPlayer.create(context,R.raw.over);


    }


    public void playhitsound(){

        hit.start();

    }

    public void playoversound() {

        over.start();

    }




}
