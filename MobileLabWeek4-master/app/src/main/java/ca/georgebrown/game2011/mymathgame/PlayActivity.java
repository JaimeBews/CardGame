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
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PlayActivity extends Activity {

    private Paint paint;
    private Canvas gameCanvas;
    private Bitmap gameBitmap;
    private ImageView gameFrame;
    private TextView scoreText;
    public ImageButton[] cards;
    public Bitmap[]    cardBitmaps;
    public Bitmap[]    selectedBitmaps;
    public int firstType;
    private int secondType;
    private int thirdType;
    private int fourthType;

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

    public void setRandCards() {
        shuffleArray(arrayOfBitmap);
        for(int i=0;i<5;i++) {
            selectedBitmaps[i]=arrayOfBitmap[i];
            selectedBitmaps[i+5]=arrayOfBitmap[i];
        }
        shuffleArray(selectedBitmaps);
    }

    public void flipCards(){
        for(int i=0;i< cards.length;i++ )
            cards[i].setImageBitmap(bitmap1);
    }
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

         bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.carda);//assign your bitmap;
         bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.cardb);
         bitmap3 = BitmapFactory.decodeResource(getResources(),R.drawable.cardc);
         bitmap4 = BitmapFactory.decodeResource(getResources(),R.drawable.cardd);
         bitmap5 = BitmapFactory.decodeResource(getResources(),R.drawable.carde);
         bitmap6 = BitmapFactory.decodeResource(getResources(),R.drawable.cardf);
         bitmap7 = BitmapFactory.decodeResource(getResources(),R.drawable.cardg);
         bitmap8 = BitmapFactory.decodeResource(getResources(),R.drawable.cardh);
         bitmap9 = BitmapFactory.decodeResource(getResources(),R.drawable.cardi);
         bitmap10 = BitmapFactory.decodeResource(getResources(),R.drawable.cardj);
         bitmap11 = BitmapFactory.decodeResource(getResources(),R.drawable.cardk);
         bitmap12 = BitmapFactory.decodeResource(getResources(),R.drawable.cardl);
         bitmap13 = BitmapFactory.decodeResource(getResources(),R.drawable.cardm);
         bitmap14 = BitmapFactory.decodeResource(getResources(),R.drawable.cardn);
      //   bitmap15 = BitmapFactory.decodeResource(getResources(),R.drawable.cardo);
       //  bitmap16 = BitmapFactory.decodeResource(getResources(),R.drawable.cardp);
       //  bitmap17 = BitmapFactory.decodeResource(getResources(),R.drawable.cardq);
       //  bitmap18 = BitmapFactory.decodeResource(getResources(),R.drawable.cardr);
       //  bitmap19 = BitmapFactory.decodeResource(getResources(),R.drawable.cards);
       // bitmap20 = BitmapFactory.decodeResource(getResources(),R.drawable.cardt);
        /* bitmap21 = BitmapFactory.decodeResource(getResources(),R.drawable.cardu);
         bitmap22 = BitmapFactory.decodeResource(getResources(),R.drawable.cardv);
         bitmap23 = BitmapFactory.decodeResource(getResources(),R.drawable.cardw);
         bitmap24 = BitmapFactory.decodeResource(getResources(),R.drawable.cardx);
         bitmap25 = BitmapFactory.decodeResource(getResources(),R.drawable.cardy);
         bitmap26 = BitmapFactory.decodeResource(getResources(),R.drawable.cardz);
         bitmap27 = BitmapFactory.decodeResource(getResources(),R.drawable.cardaa);
         bitmap28 = BitmapFactory.decodeResource(getResources(),R.drawable.cardbb);
         bitmap29 = BitmapFactory.decodeResource(getResources(),R.drawable.cardcc);
         bitmap30 = BitmapFactory.decodeResource(getResources(),R.drawable.carddd);
         bitmap31 = BitmapFactory.decodeResource(getResources(),R.drawable.cardee);
         bitmap32 = BitmapFactory.decodeResource(getResources(),R.drawable.cardff);
         bitmap33 = BitmapFactory.decodeResource(getResources(),R.drawable.cardgg);
         bitmap34 = BitmapFactory.decodeResource(getResources(),R.drawable.cardhh);
         bitmap35 = BitmapFactory.decodeResource(getResources(),R.drawable.cardii);
         bitmap36 = BitmapFactory.decodeResource(getResources(),R.drawable.cardjj);
         bitmap37 = BitmapFactory.decodeResource(getResources(),R.drawable.cardkk);
         bitmap38 = BitmapFactory.decodeResource(getResources(),R.drawable.cardll);
         bitmap39 = BitmapFactory.decodeResource(getResources(),R.drawable.cardmm);
         bitmap40 = BitmapFactory.decodeResource(getResources(),R.drawable.cardnn);
         bitmap41 = BitmapFactory.decodeResource(getResources(),R.drawable.cardoo);
         bitmap42 = BitmapFactory.decodeResource(getResources(),R.drawable.cardpp);
         bitmap43 = BitmapFactory.decodeResource(getResources(),R.drawable.cardqq);
         bitmap44 = BitmapFactory.decodeResource(getResources(),R.drawable.cardrr);
         bitmap45 = BitmapFactory.decodeResource(getResources(),R.drawable.cardss);
         bitmap46 = BitmapFactory.decodeResource(getResources(),R.drawable.cardtt);
         bitmap47 = BitmapFactory.decodeResource(getResources(),R.drawable.carduu);
         bitmap48 = BitmapFactory.decodeResource(getResources(),R.drawable.cardvv);
         bitmap49 = BitmapFactory.decodeResource(getResources(),R.drawable.cardww);
         bitmap50 = BitmapFactory.decodeResource(getResources(),R.drawable.cardxx);
        bitmap51 = BitmapFactory.decodeResource(getResources(),R.drawable.cardyy);
         bitmap52 = BitmapFactory.decodeResource(getResources(),R.drawable.cardzz);*/
        // bitmap53 = BitmapFactory.decodeResource(getResources(),R.drawable.bug);
        ImageButton card1 = (ImageButton) findViewById(R.id.Card1);
       ImageButton card2 = (ImageButton) findViewById(R.id.Card2);
        ImageButton card3 = (ImageButton) findViewById(R.id.Card3);
       ImageButton card4 = (ImageButton) findViewById(R.id.Card4);
        ImageButton card5 = (ImageButton) findViewById(R.id.Card5);
        ImageButton card6 = (ImageButton) findViewById(R.id.Card6);
        ImageButton card7 = (ImageButton) findViewById(R.id.Card7);
        ImageButton card8 = (ImageButton) findViewById(R.id.Card8);
        ImageButton card9 = (ImageButton) findViewById(R.id.Card9);
         arrayOfBitmap = new Bitmap[]{bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, bitmap7, bitmap8, bitmap9, bitmap10, bitmap11, bitmap12, bitmap13, bitmap14};//, bitmap15, bitmap16, bitmap17};//, bitmap18, bitmap19, bitmap20, bitmap21, bitmap22, bitmap23, bitmap24, bitmap25, bitmap26, bitmap27, bitmap28, bitmap29, bitmap30, bitmap31, bitmap32, bitmap33, bitmap34, bitmap35, bitmap36, bitmap37, bitmap38, bitmap39, bitmap40, bitmap41, bitmap42, bitmap43, bitmap44, bitmap45, bitmap46, bitmap47, bitmap48, bitmap49, bitmap50, bitmap51, bitmap52};
        selectedBitmaps= new Bitmap[]{bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, bitmap7, bitmap8, bitmap9, bitmap10};
        cards = new ImageButton[]{card1,card2,card3,card4,card5,card6,card7,card8,card9};

        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
        scoreText = (TextView) findViewById(R.id.score);
        scoreText.setTextColor(Color.RED);
        setRandCards();



    }
    int Score=0;
    private void checkMatch(ImageButton checkCard){
        Bitmap bitmap113 = ((BitmapDrawable)checkCard.getDrawable()).getBitmap();
        Bitmap bitmap111 = ((BitmapDrawable)currCard.getDrawable()).getBitmap();


        if(((BitmapDrawable)checkCard.getDrawable()).getBitmap()==((BitmapDrawable)currCard.getDrawable()).getBitmap()){
            Score++;
            scoreText.setText(Integer.toString(Score));
            checkCard.setVisibility(View.INVISIBLE);
            currCard.setVisibility(View.INVISIBLE);
        }

    }

private void butClickHelper(int i){
    if(clickedCards==false)
    {
        clickedCards=true;
        cards[i].setImageBitmap(selectedBitmaps[i]);
        currCard=cards[i];
    }else
    {
        cards[i].setImageBitmap(selectedBitmaps[i]);
        checkMatch(cards[i]);
        clickedCards = false;
        flipCards();
    }
}
    boolean clickedCards;
    ImageButton currCard;
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
