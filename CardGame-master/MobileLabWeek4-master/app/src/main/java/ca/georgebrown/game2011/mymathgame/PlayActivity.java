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

import java.util.Random;

public class PlayActivity extends Activity {

    private Paint paint;
    private Canvas gameCanvas;
    private Bitmap gameBitmap;
    private ImageView gameFrame;
    private Rectangle rectangle;

    public ImageButton[] cards;
    private Bitmap[]    cardBitmaps;
    private Bitmap[]    selectedBitmaps;
    private int firstType;
    private int secondType;
    private int thirdType;
    private int fourthType;

    Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.card1);//assign your bitmap;
    Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.card2);
    Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.drawable.card3);
    Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.drawable.card4);
    Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(),R.drawable.card5);
    Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(),R.drawable.card6);
    Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(),R.drawable.card7);
    Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(),R.drawable.card8);
    Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(),R.drawable.card9);
    Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(),R.drawable.card10);
    Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(),R.drawable.card11);
    Bitmap bitmap12 = BitmapFactory.decodeResource(getResources(),R.drawable.card12);
    Bitmap bitmap13 = BitmapFactory.decodeResource(getResources(),R.drawable.card13);
    Bitmap bitmap14 = BitmapFactory.decodeResource(getResources(),R.drawable.card14);
    Bitmap bitmap15 = BitmapFactory.decodeResource(getResources(),R.drawable.card15);
    Bitmap bitmap16 = BitmapFactory.decodeResource(getResources(),R.drawable.card16);
    Bitmap bitmap17 = BitmapFactory.decodeResource(getResources(),R.drawable.card17);
    Bitmap bitmap18 = BitmapFactory.decodeResource(getResources(),R.drawable.card18);
    Bitmap bitmap19 = BitmapFactory.decodeResource(getResources(),R.drawable.card19);
    Bitmap bitmap20 = BitmapFactory.decodeResource(getResources(),R.drawable.card20);
    Bitmap bitmap21 = BitmapFactory.decodeResource(getResources(),R.drawable.card21);
    Bitmap bitmap22 = BitmapFactory.decodeResource(getResources(),R.drawable.card22);
    Bitmap bitmap23 = BitmapFactory.decodeResource(getResources(),R.drawable.card23);
    Bitmap bitmap24 = BitmapFactory.decodeResource(getResources(),R.drawable.card24);
    Bitmap bitmap25 = BitmapFactory.decodeResource(getResources(),R.drawable.card25);
    Bitmap bitmap26 = BitmapFactory.decodeResource(getResources(),R.drawable.card26);
    Bitmap bitmap27 = BitmapFactory.decodeResource(getResources(),R.drawable.card27);
    Bitmap bitmap28 = BitmapFactory.decodeResource(getResources(),R.drawable.card28);
    Bitmap bitmap29 = BitmapFactory.decodeResource(getResources(),R.drawable.card29);
    Bitmap bitmap30 = BitmapFactory.decodeResource(getResources(),R.drawable.card30);
    Bitmap bitmap31 = BitmapFactory.decodeResource(getResources(),R.drawable.card31);
    Bitmap bitmap32 = BitmapFactory.decodeResource(getResources(),R.drawable.card32);
    Bitmap bitmap33 = BitmapFactory.decodeResource(getResources(),R.drawable.card33);
    Bitmap bitmap34 = BitmapFactory.decodeResource(getResources(),R.drawable.card34);
    Bitmap bitmap35 = BitmapFactory.decodeResource(getResources(),R.drawable.card35);
    Bitmap bitmap36 = BitmapFactory.decodeResource(getResources(),R.drawable.card36);
    Bitmap bitmap37 = BitmapFactory.decodeResource(getResources(),R.drawable.card37);
    Bitmap bitmap38 = BitmapFactory.decodeResource(getResources(),R.drawable.card38);
    Bitmap bitmap39 = BitmapFactory.decodeResource(getResources(),R.drawable.card39);
    Bitmap bitmap40 = BitmapFactory.decodeResource(getResources(),R.drawable.card40);
    Bitmap bitmap41 = BitmapFactory.decodeResource(getResources(),R.drawable.card41);
    Bitmap bitmap42 = BitmapFactory.decodeResource(getResources(),R.drawable.card42);
    Bitmap bitmap43 = BitmapFactory.decodeResource(getResources(),R.drawable.card43);
    Bitmap bitmap44 = BitmapFactory.decodeResource(getResources(),R.drawable.card44);
    Bitmap bitmap45 = BitmapFactory.decodeResource(getResources(),R.drawable.card45);
    Bitmap bitmap46 = BitmapFactory.decodeResource(getResources(),R.drawable.card46);
    Bitmap bitmap47 = BitmapFactory.decodeResource(getResources(),R.drawable.card47);
    Bitmap bitmap48 = BitmapFactory.decodeResource(getResources(),R.drawable.card48);
    Bitmap bitmap49 = BitmapFactory.decodeResource(getResources(),R.drawable.card49);
    Bitmap bitmap50 = BitmapFactory.decodeResource(getResources(),R.drawable.card50);
    Bitmap bitmap51 = BitmapFactory.decodeResource(getResources(),R.drawable.card51);
    Bitmap bitmap52 = BitmapFactory.decodeResource(getResources(),R.drawable.card52);
    Bitmap bitmap53 = BitmapFactory.decodeResource(getResources(),R.drawable.bug);

    //assign your bitmap;
    Bitmap[] arrayOfBitmap = {bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, bitmap7, bitmap8, bitmap9, bitmap10, bitmap11, bitmap12, bitmap13, bitmap14, bitmap15, bitmap16, bitmap17, bitmap18, bitmap19, bitmap20, bitmap21, bitmap22, bitmap23, bitmap24, bitmap25, bitmap26, bitmap27, bitmap28, bitmap29, bitmap30, bitmap31, bitmap32, bitmap33, bitmap34, bitmap35, bitmap36, bitmap37, bitmap38, bitmap39, bitmap40, bitmap41, bitmap42, bitmap43, bitmap44, bitmap45, bitmap46, bitmap47, bitmap48, bitmap49, bitmap50, bitmap51, bitmap52,};
    int[] faceDownMemory;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        gameFrame = findViewById(R.id.canvasImageView);
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        gameBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        gameCanvas = new Canvas(gameBitmap);

        gameCanvas.drawColor(Color.BLACK);

        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
        gameCanvas.drawText("Score:42 Lives:3 Hi:97", 50, 100, paint);

        gameFrame.setImageBitmap(gameBitmap);

        Point newTopLeft = new Point(250,250);
        Point newBottomRight = new Point(500,400);
        rectangle = new Rectangle(newTopLeft, newBottomRight);

        drawRectangle(rectangle, "DRAW");



        ImageButton card1But = (ImageButton) findViewById(R.id.Card1);
        card1listner card1listVar = new card1listner();
        card1But.setOnClickListener(card1listVar);

        ImageButton card2But = (ImageButton) findViewById(R.id.Card2);
        card2listner card2listVar = new card2listner();
        card2But.setOnClickListener(card2listVar);

        ImageButton card3But = (ImageButton) findViewById(R.id.Card3);
        card3listner card3listVar = new card3listner();
        card3But.setOnClickListener(card1listVar);

        ImageButton card4But = (ImageButton) findViewById(R.id.Card4);
        card4listner card4listVar = new card4listner();
        card4But.setOnClickListener(card4listVar);

        ImageButton card5But = (ImageButton) findViewById(R.id.Card5);
        card5listner card5listVar = new card5listner();
        card5But.setOnClickListener(card5listVar);

        ImageButton card6But = (ImageButton) findViewById(R.id.Card6);
        card6listner card6listVar = new card6listner();
        card6But.setOnClickListener(card6listVar);

        ImageButton card7But = (ImageButton) findViewById(R.id.Card7);
        card7listner card7listVar = new card7listner();
        card7But.setOnClickListener(card7listVar);

        ImageButton card8But = (ImageButton) findViewById(R.id.Card8);
        card8listner card8listVar = new card8listner();
        card8But.setOnClickListener(card8listVar);

        ImageButton card9But = (ImageButton) findViewById(R.id.Card9);
        card9listner card9listVar = new card9listner();
        card9But.setOnClickListener(card9listVar);
    }
    private void card1() {
        cards[0].setImageBitmap(selectedBitmaps[faceDownMemory[0]] );
    }

    private class card1listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card1();
        }
    }
    private void card2() {
        cards[1].setImageBitmap(selectedBitmaps[faceDownMemory[1]] );
    }

    private class card2listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card2();
        }
    }
    private void card3() {
        cards[2].setImageBitmap(selectedBitmaps[faceDownMemory[2]] );
    }

    private class card3listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card3();
        }
    }
    private void card4() {
        cards[3].setImageBitmap(selectedBitmaps[faceDownMemory[3]] );
    }

    private class card4listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card4();
        }
    }
    private void card5() {
        cards[4].setImageBitmap(selectedBitmaps[faceDownMemory[4]] );
    }

    private class card5listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card5();
        }
    }
    private void card6() {
        cards[5].setImageBitmap(selectedBitmaps[faceDownMemory[5]] );
    }

    private class card6listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card6();
        }
    }
    private void card7() {
        cards[6].setImageBitmap(selectedBitmaps[faceDownMemory[6]] );
    }

    private class card7listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card7();
        }
    }
    private void card8() {
        cards[7].setImageBitmap(selectedBitmaps[faceDownMemory[7]] );
    }

    private class card8listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card8();
        }
    }
    private void card9() {
        cards[8].setImageBitmap(selectedBitmaps[faceDownMemory[8]] );
    }

    private class card9listner implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            card9();
        }
    }

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
            int i=0;
        else
            resetCards();
    }
    void resetCards(){
        for(int i=0; i<cards.length; i++)
          cards[i].setImageBitmap();

    }
    private void drawRectangle(Rectangle rectangle, String action) {
        if (action.equals("DRAW")) {
            paint.setColor(Color.WHITE);
        }
        else // ERASE
        {
            paint.setColor(Color.BLACK);
        }

        int rectLeft = rectangle.getTopLeft().getX();
        int rectTop = rectangle.getTopLeft().getY();
        int rectRight = rectangle.getBottomRight().getX();
        int rectBottom = rectangle.getBottomRight().getY();

        Rect rectToDraw = new Rect(rectLeft, rectTop, rectRight, rectBottom);
        gameCanvas.drawRect(rectToDraw, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float touchX = event.getX();
        float touchY = event.getY();

        drawRectangle(rectangle, "ERASE");
        rectangle.translate(new Point((int)touchX, (int)touchY));
        drawRectangle(rectangle, "DRAW");

        gameFrame.invalidate();

        return super.onTouchEvent(event);
    }
}
