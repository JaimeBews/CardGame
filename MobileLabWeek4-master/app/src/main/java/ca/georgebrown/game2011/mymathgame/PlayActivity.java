package ca.georgebrown.game2011.mymathgame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class PlayActivity extends Activity {

    private Paint paint;
    private Canvas gameCanvas;
    private Bitmap gameBitmap;
    private ImageView gameFrame;
    public ImageButton[] cards;
  //  private Bitmap[]    cardBitmaps;
  //  private Bitmap[]    selectedBitmaps;
    private int firstType;
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

  //  Bitmap bitmap53 = BitmapFactory.decodeResource(getResources(),R.drawable.bug);

    //assign your bitmap;
   // Bitmap[] arrayOfBitmap = {bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, bitmap7, bitmap8, bitmap9, bitmap10, bitmap11, bitmap12, bitmap13, bitmap14, bitmap15, bitmap16, bitmap17, bitmap18, bitmap19, bitmap20, bitmap21, bitmap22, bitmap23, bitmap24, bitmap25, bitmap26, bitmap27, bitmap28, bitmap29, bitmap30, bitmap31, bitmap32, bitmap33, bitmap34, bitmap35, bitmap36, bitmap37, bitmap38, bitmap39, bitmap40, bitmap41, bitmap42, bitmap43, bitmap44, bitmap45, bitmap46, bitmap47, bitmap48, bitmap49, bitmap50, bitmap51, bitmap52,};
   /* int[] faceDownMemory;
    public void setRandCards() {
        for(int i=0;i<4;i++) {
            int rnd = (int) Math.floor(Math.random() * arrayOfBitmap.length);
            selectedBitmaps[i]=arrayOfBitmap[rnd];
        }
    }
    public void layCards(){
        for (int i = 0;i<selectedBitmaps.length; i++) {
            int rnd = (int) Math.floor(Math.random() * cards.length);
            faceDownMemory[rnd]=i;
            rnd = (int) Math.floor(Math.random() * selectedBitmaps.length);
            faceDownMemory[rnd]=i;
        }
    }
    public void flipCards(){

    }
*/
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

        bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.cardone);//assign your bitmap;
        //  bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.card2);
        //  bitmap3 = BitmapFactory.decodeResource(getResources(),R.drawable.card3);

        /* bitmap4 = BitmapFactory.decodeResource(getResources(),R.drawable.card4);
         bitmap5 = BitmapFactory.decodeResource(getResources(),R.drawable.card5);
         bitmap6 = BitmapFactory.decodeResource(getResources(),R.drawable.card6);
         bitmap7 = BitmapFactory.decodeResource(getResources(),R.drawable.card7);
         bitmap8 = BitmapFactory.decodeResource(getResources(),R.drawable.card8);
         bitmap9 = BitmapFactory.decodeResource(getResources(),R.drawable.card9);

         bitmap10 = BitmapFactory.decodeResource(getResources(),R.drawable.card10);
         bitmap11 = BitmapFactory.decodeResource(getResources(),R.drawable.card11);
         bitmap12 = BitmapFactory.decodeResource(getResources(),R.drawable.card12);
         bitmap14 = BitmapFactory.decodeResource(getResources(),R.drawable.card14);
         bitmap15 = BitmapFactory.decodeResource(getResources(),R.drawable.card15);
         bitmap16 = BitmapFactory.decodeResource(getResources(),R.drawable.card16);
         bitmap17 = BitmapFactory.decodeResource(getResources(),R.drawable.card17);
         bitmap18 = BitmapFactory.decodeResource(getResources(),R.drawable.card18);
         bitmap19 = BitmapFactory.decodeResource(getResources(),R.drawable.card19);
         bitmap20 = BitmapFactory.decodeResource(getResources(),R.drawable.card20);
         bitmap21 = BitmapFactory.decodeResource(getResources(),R.drawable.card21);
         bitmap22 = BitmapFactory.decodeResource(getResources(),R.drawable.card22);
         bitmap23 = BitmapFactory.decodeResource(getResources(),R.drawable.card23);
         bitmap24 = BitmapFactory.decodeResource(getResources(),R.drawable.card24);
         bitmap25 = BitmapFactory.decodeResource(getResources(),R.drawable.card25);
         bitmap26 = BitmapFactory.decodeResource(getResources(),R.drawable.card26);
         bitmap27 = BitmapFactory.decodeResource(getResources(),R.drawable.card27);
         bitmap28 = BitmapFactory.decodeResource(getResources(),R.drawable.card28);
         bitmap29 = BitmapFactory.decodeResource(getResources(),R.drawable.card29);
         bitmap30 = BitmapFactory.decodeResource(getResources(),R.drawable.card30);
         bitmap31 = BitmapFactory.decodeResource(getResources(),R.drawable.card31);
         bitmap32 = BitmapFactory.decodeResource(getResources(),R.drawable.card32);
         bitmap33 = BitmapFactory.decodeResource(getResources(),R.drawable.card33);
         bitmap34 = BitmapFactory.decodeResource(getResources(),R.drawable.card34);
         bitmap35 = BitmapFactory.decodeResource(getResources(),R.drawable.card35);
         bitmap36 = BitmapFactory.decodeResource(getResources(),R.drawable.card36);
         bitmap37 = BitmapFactory.decodeResource(getResources(),R.drawable.card37);
         bitmap38 = BitmapFactory.decodeResource(getResources(),R.drawable.card38);
         bitmap39 = BitmapFactory.decodeResource(getResources(),R.drawable.card39);
         bitmap40 = BitmapFactory.decodeResource(getResources(),R.drawable.card40);
         bitmap41 = BitmapFactory.decodeResource(getResources(),R.drawable.card41);
         bitmap42 = BitmapFactory.decodeResource(getResources(),R.drawable.card42);
         bitmap43 = BitmapFactory.decodeResource(getResources(),R.drawable.card43);
         bitmap44 = BitmapFactory.decodeResource(getResources(),R.drawable.card44);
         bitmap45 = BitmapFactory.decodeResource(getResources(),R.drawable.card45);
         bitmap46 = BitmapFactory.decodeResource(getResources(),R.drawable.card46);
         bitmap47 = BitmapFactory.decodeResource(getResources(),R.drawable.card47);
         bitmap48 = BitmapFactory.decodeResource(getResources(),R.drawable.card48);

         bitmap49 = BitmapFactory.decodeResource(getResources(),R.drawable.card49);
         bitmap50 = BitmapFactory.decodeResource(getResources(),R.drawable.card50);
         bitmap51 = BitmapFactory.decodeResource(getResources(),R.drawable.card51);
         bitmap52 = BitmapFactory.decodeResource(getResources(),R.drawable.card52);
*/

        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
    }
   public void ButtonOnClick(View v) {
       switch (v.getId()) {
           case R.id.Card1:
               Toast.makeText(this, "Im 1", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card2:
               Toast.makeText(this, "Im 2", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card3:
               Toast.makeText(this, "Im 3", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card4:
               Toast.makeText(this, "Im 4", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card5:
               Toast.makeText(this, "Im 5", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card6:
               Toast.makeText(this, "Im 6", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card7:
               Toast.makeText(this, "Im 7", Toast.LENGTH_LONG).show();
               break;
           case R.id.Card8:
               Toast.makeText(this, "Im 8", Toast.LENGTH_LONG).show();
               break;

           case R.id.Card9:
               Toast.makeText(this, "Im 9", Toast.LENGTH_LONG).show();
               break;

       }
   }

/*
    private void addMatch(int curr){
        if(curr==0){
            firstType++;
        }
        if(curr==1){
            secondType++;
        }
        if(curr==2){
            thirdType++;
        }
        if(curr==3){
            fourthType++;
        }
    }
    private void checkMatch(){
        if(firstType==2||secondType==2||thirdType==2||fourthType==2)
            paint.setColor(Color.WHITE);
        else
            resetCards();
    }
    void resetCards(){
        for(int i=0; i<cards.length; i++)
          cards[i].setImageBitmap(bitmap53);

    }
*/
}
