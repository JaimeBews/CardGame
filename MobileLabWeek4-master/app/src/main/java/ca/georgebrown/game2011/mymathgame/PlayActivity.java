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

    Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.);//assign your bitmap;
    Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.);//assign your bitmap;
    Bitmap[] arrayOfBitmap = {bitmap1, bitmap2};
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



        ImageButton card1But = (ImageButton) findViewById(R.id.);
        card1listner card1listVar = new card1listner();
        card1But.setOnClickListener(card1listVar);

        ImageButton card2But = (ImageButton) findViewById(R.id.);
        card2listner card2listVar = new card2listner();
        card2But.setOnClickListener(card2listVar);

        ImageButton card3But = (ImageButton) findViewById(R.id.);
        card3listner card3listVar = new card3listner();
        card3But.setOnClickListener(card1listVar);

        ImageButton card4But = (ImageButton) findViewById(R.id.);
        card4listner card4listVar = new card4listner();
        card4But.setOnClickListener(card4listVar);

        ImageButton card5But = (ImageButton) findViewById(R.id.);
        card5listner card5listVar = new card5listner();
        card5But.setOnClickListener(card5listVar);

        ImageButton card6But = (ImageButton) findViewById(R.id.);
        card6listner card6listVar = new card6listner();
        card6But.setOnClickListener(card6listVar);

        ImageButton card7But = (ImageButton) findViewById(R.id.);
        card7listner card7listVar = new card7listner();
        card7But.setOnClickListener(card7listVar);

        ImageButton card8But = (ImageButton) findViewById(R.id.);
        card8listner card8listVar = new card8listner();
        card8But.setOnClickListener(card8listVar);

        ImageButton card9But = (ImageButton) findViewById(R.id.);
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
