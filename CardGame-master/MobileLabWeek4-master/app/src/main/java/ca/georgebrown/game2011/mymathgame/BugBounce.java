package ca.georgebrown.game2011.mymathgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

/**
 * Created by user on 3/6/2018.
 */

public class BugBounce extends View {
    int m_ScreenW;
    int m_ScreenH;
    int m_X;
    int m_Y;
    int m_InitialY;
    int m_BugW;
    int m_BugH;
    int m_ScoreH;
    int m_Score;
    boolean m_clickEnabled;
    Bitmap m_Bug, m_BGR;
    Paint m_Paint;
    long m_StartTime, m_EndTime;
    double m_Diff;
    public BugBounce(Context context){
        super(context);

        m_StartTime = System.nanoTime();
        m_Bug = BitmapFactory.decodeResource(getResources(),R.drawable.cookie);
        m_BGR = BitmapFactory.decodeResource(getResources(), R.drawable.me);

        m_BugW = m_Bug.getWidth();
        m_BugH = m_Bug.getHeight();

        m_InitialY =100;
        m_ScoreH = 100;

    }
@Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh){
        super.onSizeChanged(w, h, oldw ,oldh);

        m_ScreenH = h;
        m_ScreenW = w;
        m_BGR = Bitmap.createScaledBitmap(m_BGR,w,h,true);

        m_X = (int) (m_ScreenW/2)-(m_BugW/2);
        m_Y = m_InitialY;
    }
    @Override
    protected void onDraw(Canvas canvas){

        super.onDraw(canvas);
        Random rn = new Random();
        canvas.drawBitmap(m_BGR,0,0,null);
        m_EndTime = System.nanoTime();
        m_Diff = (m_EndTime-m_StartTime)/1e6;
        if ( m_Diff>1000){
            m_clickEnabled= true;
            m_X =(int)( Math.random()*(m_ScreenW-m_BugW));
            m_Y = (int) (m_ScoreH+Math.random()*(m_ScreenH-m_BugH));
            m_StartTime = m_EndTime;
        }
        m_Paint = new Paint();
        m_Paint.setColor(Color.RED);
        m_Paint.setTextSize(50);
        canvas.drawText("Score: "+m_Score,50,100,m_Paint);

        canvas.drawBitmap(m_Bug,m_X,m_Y,null);
        invalidate();
    }
    public boolean onTouchEvent(MotionEvent motionEvent){
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        System.out.println(x+"("+m_X+" "+(m_X+ m_BugW)+")"+y+"("+m_Y+" "+(m_Y+m_BugH)+")");
        if ((x >= m_X && x <= m_X+m_BugW) && (y >= m_Y-m_BugH/2 && y <= m_Y+m_BugH)&&m_clickEnabled) {
            m_Score++;
            m_clickEnabled = false;
        }
        return super.onTouchEvent (motionEvent);


    }
}
