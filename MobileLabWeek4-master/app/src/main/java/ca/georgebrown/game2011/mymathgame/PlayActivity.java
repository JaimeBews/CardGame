package ca.georgebrown.game2011.mymathgame;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;

public class PlayActivity extends Activity {

    private Paint paint;
    private Canvas gameCanvas;
    private Bitmap gameBitmap;
    private ImageView gameFrame;
    private TextView scoreText;
    private TextView timeText;
    private TextView matchedText;
    public ImageButton[] cards;
    public Bitmap[]    cardBitmaps;
    public Bitmap[]    selectedBitmaps;
    private int timeRemaining=20;
// declares the bitmap
    Bitmap bitmap1 ;
    Bitmap bitmap2;
    Bitmap bitmap3;
   Bitmap bitmap4;
    Bitmap bitmap5 ;
    Bitmap bitmap6 ;
    Bitmap bitmap7 ;
    Bitmap bitmap8;
    Bitmap bitmap9 ;

    Bitmap bitmap10 ;
    Bitmap bitmap11 ;
    Bitmap bitmap12;
    Bitmap bitmap13;
    Bitmap bitmap14 ;
    Bitmap bitmap15 ;
    Bitmap bitmap16 ;
    Bitmap bitmap17;
    Bitmap bitmap18 ;
    Bitmap bitmap19 ;
    Bitmap bitmap20 ;
    Bitmap bitmap21;
    Bitmap bitmap22 ;
    Bitmap bitmap23 ;
    Bitmap bitmap24 ;
    Bitmap bitmap25;
    Bitmap bitmap26;
    Bitmap bitmap27;
    Bitmap bitmap28;
    Bitmap bitmap29 ;
    Bitmap bitmap30 ;
    Bitmap bitmap31 ;
    Bitmap bitmap32 ;
    Bitmap bitmap33 ;
    Bitmap bitmap34;
    Bitmap bitmap35 ;
    Bitmap bitmap36 ;
    Bitmap bitmap37 ;
    Bitmap bitmap38 ;
    Bitmap bitmap39 ;
    Bitmap bitmap40;
    Bitmap bitmap41 ;
    Bitmap bitmap42;
    Bitmap bitmap43 ;
    Bitmap bitmap44 ;
    Bitmap bitmap45;
    Bitmap bitmap46;
    Bitmap bitmap47;
    Bitmap bitmap48;

    Bitmap bitmap49;
    Bitmap bitmap50;
    Bitmap bitmap51;
    Bitmap bitmap52;

   // Bitmap bitmap53 = BitmapFactory.decodeResource(getResources(),R.drawable.bug);
    Bitmap[] arrayOfBitmap;
//randomizes the cards
    public void setRandCards() {
        shuffleArray(arrayOfBitmap);
        for(int i=0;i<5;i++) {
            selectedBitmaps[i]=arrayOfBitmap[i];
            selectedBitmaps[i+5]=arrayOfBitmap[i];
        }
        shuffleArray(selectedBitmaps);
    }
//flips the cards over
    public void flipCards(){
        for(int i=0;i< cards.length;i++ )
            cards[i].setImageBitmap(bitmap1);
    }
    //shuffles cards
    private static void shuffleArray(Bitmap[] array)
    {
        int index;
        Bitmap temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    @Override
    //sets up screen when begins
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        gameFrame = (ImageView) findViewById(R.id.canvasImageView);
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        gameBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        gameCanvas = new Canvas(gameBitmap);

        gameCanvas.drawColor(Color.BLACK);
        //sets each image to a bitmap
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.card_1c);//assign your bitmap;
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.card_1d);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.drawable.card_1h);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.drawable.card_1s);
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(),R.drawable.card_2c);
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(),R.drawable.card_2d);
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(),R.drawable.card_2h);
        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(),R.drawable.card_2s);
        Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(),R.drawable.card_3c);
        Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(),R.drawable.card_3d);
        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(),R.drawable.card_3h);
        Bitmap bitmap12 = BitmapFactory.decodeResource(getResources(),R.drawable.card_3s);
        Bitmap bitmap13 = BitmapFactory.decodeResource(getResources(),R.drawable.card_4c);
        Bitmap bitmap14 = BitmapFactory.decodeResource(getResources(),R.drawable.card_4d);
        Bitmap bitmap15 = BitmapFactory.decodeResource(getResources(),R.drawable.card_4h);
        Bitmap bitmap16 = BitmapFactory.decodeResource(getResources(),R.drawable.card_4s);
        Bitmap bitmap17 = BitmapFactory.decodeResource(getResources(),R.drawable.card_5c);
        Bitmap bitmap18 = BitmapFactory.decodeResource(getResources(),R.drawable.card_5d);
        Bitmap bitmap19 = BitmapFactory.decodeResource(getResources(),R.drawable.card_5h);
        Bitmap bitmap20 = BitmapFactory.decodeResource(getResources(),R.drawable.card_5s);
        Bitmap bitmap21 = BitmapFactory.decodeResource(getResources(),R.drawable.card_6c);
        Bitmap bitmap22 = BitmapFactory.decodeResource(getResources(),R.drawable.card_6d);
        Bitmap bitmap23 = BitmapFactory.decodeResource(getResources(),R.drawable.card_6h);
        Bitmap bitmap24 = BitmapFactory.decodeResource(getResources(),R.drawable.card_6s);
        Bitmap bitmap25 = BitmapFactory.decodeResource(getResources(),R.drawable.card_7c);
        Bitmap bitmap26 = BitmapFactory.decodeResource(getResources(),R.drawable.card_7d);
        Bitmap bitmap27 = BitmapFactory.decodeResource(getResources(),R.drawable.card_7h);
        Bitmap bitmap28 = BitmapFactory.decodeResource(getResources(),R.drawable.card_7s);
        Bitmap bitmap29 = BitmapFactory.decodeResource(getResources(),R.drawable.card_8c);
        Bitmap bitmap30 = BitmapFactory.decodeResource(getResources(),R.drawable.card_8d);
        Bitmap bitmap31 = BitmapFactory.decodeResource(getResources(),R.drawable.card_8h);
        Bitmap bitmap32 = BitmapFactory.decodeResource(getResources(),R.drawable.card_8s);
        Bitmap bitmap33 = BitmapFactory.decodeResource(getResources(),R.drawable.card_9c);
        Bitmap bitmap34 = BitmapFactory.decodeResource(getResources(),R.drawable.card_9d);
        Bitmap bitmap35 = BitmapFactory.decodeResource(getResources(),R.drawable.card_9h);
        Bitmap bitmap36 = BitmapFactory.decodeResource(getResources(),R.drawable.card_9s);
        Bitmap bitmap37 = BitmapFactory.decodeResource(getResources(),R.drawable.card_10c);
        Bitmap bitmap38 = BitmapFactory.decodeResource(getResources(),R.drawable.card_10d);
        Bitmap bitmap39 = BitmapFactory.decodeResource(getResources(),R.drawable.card_10h);
        Bitmap bitmap40 = BitmapFactory.decodeResource(getResources(),R.drawable.card_10s);
        Bitmap bitmap41 = BitmapFactory.decodeResource(getResources(),R.drawable.card_11c);
        Bitmap bitmap42 = BitmapFactory.decodeResource(getResources(),R.drawable.card_11d);
        Bitmap bitmap43 = BitmapFactory.decodeResource(getResources(),R.drawable.card_11h);
        Bitmap bitmap44 = BitmapFactory.decodeResource(getResources(),R.drawable.card_11s);
        Bitmap bitmap45 = BitmapFactory.decodeResource(getResources(),R.drawable.card_12c);
        Bitmap bitmap46 = BitmapFactory.decodeResource(getResources(),R.drawable.card_12d);
        Bitmap bitmap47 = BitmapFactory.decodeResource(getResources(),R.drawable.card_12h);
        Bitmap bitmap48 = BitmapFactory.decodeResource(getResources(),R.drawable.card_12s);
        Bitmap bitmap49 = BitmapFactory.decodeResource(getResources(),R.drawable.card_13c);
        Bitmap bitmap50 = BitmapFactory.decodeResource(getResources(),R.drawable.card_13d);
        Bitmap bitmap51 = BitmapFactory.decodeResource(getResources(),R.drawable.card_13h);
        Bitmap bitmap52 = BitmapFactory.decodeResource(getResources(),R.drawable.card_13s);
        Bitmap bitmap53 = BitmapFactory.decodeResource(getResources(),R.drawable.cardback);;
        ImageButton card1 = (ImageButton) findViewById(R.id.Card1);
       ImageButton card2 = (ImageButton) findViewById(R.id.Card2);
        ImageButton card3 = (ImageButton) findViewById(R.id.Card3);
       ImageButton card4 = (ImageButton) findViewById(R.id.Card4);
        ImageButton card5 = (ImageButton) findViewById(R.id.Card5);
        ImageButton card6 = (ImageButton) findViewById(R.id.Card6);
        ImageButton card7 = (ImageButton) findViewById(R.id.Card7);
        ImageButton card8 = (ImageButton) findViewById(R.id.Card8);
        ImageButton card9 = (ImageButton) findViewById(R.id.Card9);
        //adds each image into array
         arrayOfBitmap = new Bitmap[]{bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, bitmap7, bitmap8, bitmap9, bitmap10, bitmap11, bitmap12, bitmap13, bitmap14, bitmap15, bitmap16, bitmap17, bitmap18, bitmap19, bitmap20, bitmap21, bitmap22, bitmap23, bitmap24, bitmap25, bitmap26, bitmap27, bitmap28, bitmap29, bitmap30, bitmap31, bitmap32, bitmap33, bitmap34, bitmap35, bitmap36, bitmap37, bitmap38, bitmap39, bitmap40, bitmap41, bitmap42, bitmap43, bitmap44, bitmap45, bitmap46, bitmap47, bitmap48, bitmap49, bitmap50, bitmap51, bitmap52};
        //how many bitmaps to use
         selectedBitmaps= new Bitmap[]{bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, bitmap7, bitmap8, bitmap9, bitmap10};
        cards = new ImageButton[]{card1,card2,card3,card4,card5,card6,card7,card8,card9};

        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
        scoreText = (TextView) findViewById(R.id.score);
        scoreText.setTextColor(Color.RED);
        timeText = (TextView)findViewById(R.id.timerText);
        matchedText=(TextView)findViewById(R.id.matchText);
        matchedText.setVisibility(View.INVISIBLE);
        setRandCards();
        //handles the timer
        new CountDownTimer(21000, 1000) {
            public void onFinish( ) {

                cancel();
            }

            public void onTick(long millisUntilFinished) {
                if( timeRemaining>0) {
                    timeRemaining--;
                    timeText.setText(Integer.toString(timeRemaining));
                }

            }
        }.start();


    }

    int Score=0;
    //checks if the cards flipped over match
    private void checkMatch(ImageButton checkCard){
        Bitmap bitmap113 = ((BitmapDrawable)checkCard.getDrawable()).getBitmap();
        Bitmap bitmap111 = ((BitmapDrawable)currCard.getDrawable()).getBitmap();



        if(((BitmapDrawable)checkCard.getDrawable()).getBitmap()==((BitmapDrawable)currCard.getDrawable()).getBitmap()&&currCard!=checkCard){
            Score++;
            scoreText.setText(Integer.toString(Score));
            matchedText.setVisibility(View.VISIBLE);
            new CountDownTimer(1000, 1000) {
                public void onFinish( ) {
                matchedText.setVisibility(View.INVISIBLE);
                 cancel();
                }

                public void onTick(long millisUntilFinished) {


                }
            }.start();
            checkCard.setVisibility(View.INVISIBLE);
            currCard.setVisibility(View.INVISIBLE);
        }

    }
// reveals the cards for a few seconds
private void butClickHelper(final int i){
    if(clickedCards==0)
    {
        clickedCards++;
        cards[i].setImageBitmap(selectedBitmaps[i]);
        currCard=cards[i];
    }else if(clickedCards==1)
    {
        clickedCards ++;
        cards[i].setImageBitmap(selectedBitmaps[i]);
       new CountDownTimer(1000, 1000) {
            public void onFinish( ) {
                checkMatch(cards[i]);
                flipCards();
                clickedCards =0;
                cancel();
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();


    }
}

    int clickedCards=0;
    ImageButton currCard;

    //initiates clickhelper
   public void ButtonOnClick(View v) {
       switch (v.getId()) {
           case R.id.Card1:
               butClickHelper(0);
               break;
           case R.id.Card2:
               butClickHelper(1);
               break;
           case R.id.Card3:
               butClickHelper(2);
               break;
           case R.id.Card4:
               butClickHelper(3);
               break;
           case R.id.Card5:
               butClickHelper(4);
               break;
           case R.id.Card6:
               butClickHelper(5);
               break;
           case R.id.Card7:
               butClickHelper(6);
               break;
           case R.id.Card8:
               butClickHelper(7);
               break;

           case R.id.Card9:
               butClickHelper(8);

               break;

       }
   }





}
