package com.example.tp1_1.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.tp1_1.R;

// This class is a view component loaded in MainActivity
public class BallView extends View {

    // Pencil that will allow the picture to be drawn
    private Paint picturePainter = new Paint(Paint.ANTI_ALIAS_FLAG);

    // Bitmap that will be drawn
    private Bitmap ballPicture;

    // Picture postion from left and top of the view component
    private int posTopDpx;
    private int posLeftDpx;

    // Component view constructor
    public BallView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    // onSizeChanged is called each time the size view changes, here only once because the activity
    // in which the view is displayed (MainActivity) has been stacked in protrait mode (see manifest
    // file). onSizeChanged is called before onDraw.
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        // Loading picture into bitmap
        ballPicture = BitmapFactory.decodeResource(getResources(), R.drawable.bille);

        // Getting left and top position for a picture at the center of the view component
        posLeftDpx = (w- ballPicture.getWidth())/2;
        posTopDpx = (h- ballPicture.getHeight())/2;
    }

    // onDraw is called by the system each time the view component is displayed or updated
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Drawing the picture in the middle of the view component
        canvas.drawBitmap(ballPicture, posLeftDpx, posTopDpx, picturePainter);
    }
}
