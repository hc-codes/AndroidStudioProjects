package dragoz.swimingfish;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Swiming_fish_view extends View {
    private Bitmap fish[] = new Bitmap[2];
    private Bitmap backgroundimage;
    private Paint scorepaint = new Paint();
    private Bitmap Life[] = new Bitmap[2];
    private int fishx = 10;
    private int fishy;
    private int fishspeed;
    private int canvaswidth, canvasHeight;
    private int yellowx, yellowy, yellowspeed = 15;
    private Paint yellowpaint = new Paint();
    private int greenx, greeny, greenspeed = 20;
    private Paint greenpaint = new Paint();
    private int redx, redy, redspeed = 25;
    private Paint redaint = new Paint();
    private Boolean touch = false;
    private int score, lifecounter;


    private static SoundPool soundPool;
    private static int hitsound;
    private static int over;

    SoundPlayer sound=new SoundPlayer(this.getContext());


    public  Swiming_fish_view(Context context) {
        super(context);
        fish[0] = BitmapFactory.decodeResource(getResources(), R.drawable.fish1);
        fish[1] = BitmapFactory.decodeResource(getResources(), R.drawable.fish2);
        backgroundimage = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        yellowpaint.setColor(Color.YELLOW);
        yellowpaint.setAntiAlias(false);
        greenpaint.setColor(Color.GREEN);
        greenpaint.setAntiAlias(false);
        redaint.setColor(Color.RED);
        redaint.setAntiAlias(false);
        scorepaint.setColor(Color.BLUE);
        scorepaint.setTextSize(70);
        scorepaint.setTypeface(Typeface.DEFAULT_BOLD);
        scorepaint.setAntiAlias(true);

        Life[0] = BitmapFactory.decodeResource(getResources(), R.drawable.hearts);
        Life[1] = BitmapFactory.decodeResource(getResources(), R.drawable.heart_grey);
        fishy = 550;
        score = 0;
        lifecounter = 3;
    }

    @SuppressLint("DrawAllocation")
    @Override
    public void onDraw(Canvas canvas)throws NullPointerException {
        super.onDraw(canvas);
        canvaswidth = canvas.getWidth();
        canvasHeight = canvas.getHeight();
        canvas.drawBitmap(backgroundimage,0,0,null);

        int minFishy = fish[0].getHeight();
        int maxFishy = canvasHeight - fish[0].getHeight();
        fishy = fishy + fishspeed;
        System.out.println(fishy);

        if (fishy < minFishy) {
            fishy = minFishy;
        }
        if (fishy > maxFishy) {
            fishy = maxFishy;
        }
        fishspeed = fishspeed + 3;
        if (touch) {
            canvas.drawBitmap(fish[1], fishx, fishy, null);
            touch = false;
        } else {
            canvas.drawBitmap(fish[0], fishx, fishy, null);
        }
        yellowx = yellowx - yellowspeed;
        if (hitballchecker(yellowx, yellowy)) {
            score = score + 10;
            yellowx = -100;


            sound.playhitsound();
        }
        if (yellowx < 0) {
            yellowx = canvaswidth + 21;
            yellowy = (int) Math.floor(Math.random() * (maxFishy - minFishy)) + minFishy;
        }
        canvas.drawCircle(yellowx, yellowy, 30, yellowpaint);
        greenx = greenx - greenspeed;
        if (hitballchecker(greenx, greeny)) {
            score = score + 5;
            greenx = -100;

            sound.playhitsound();

        }
        if (greenx < 0) {
            greenx = canvaswidth + 21;
            greeny = (int) Math.floor(Math.random() * (maxFishy - minFishy)) + minFishy;

        }
        canvas.drawCircle(greenx, greeny, 25, greenpaint);


        if (score > 100){

            redspeed = redspeed++;
        redx = redx - redspeed;
    }

    else
            redx = redx - redspeed;
        if (hitballchecker(redx, redy)){//to check whether the fish hit the red ball

            redx = -100;
            lifecounter--;

            sound.playoversound();

            if (lifecounter == 0){
                Toast.makeText(getContext(), "Game Over", Toast.LENGTH_SHORT).show();
                Intent gameoverintentent = new Intent(getContext(), gameover_activity.class);
                gameoverintentent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                gameoverintentent.putExtra("Score", score);
                getContext().startActivity(gameoverintentent);
            }
        }
        if (redx < 0) {
            redx = canvaswidth + 21;
            redy = (int) Math.floor(Math.random() * (maxFishy - minFishy)) + minFishy;

        }

        canvas.drawCircle(redx, redy, 35, redaint);
        canvas.drawText("Score: " + score, 20, 60, scorepaint);
        for (int i=0; i<3; i++){
            int x = (int) (580 + Life[0].getWidth() * 1.5 * i);
            int y = 30;
            if (i < lifecounter){
                canvas.drawBitmap(Life[0], x, y, null);
            }
            else {
                canvas.drawBitmap(Life[1], x, y, null);
            }
        }
    }


    public boolean hitballchecker(int x, int y){
        if (fishx < x && x < (fishx + fish[0].getWidth()) && fishy < y && y < (fishy + fish[0].getHeight())){
            return true;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            touch = true;
            fishspeed = -22;
        }
        return true;
    }



}