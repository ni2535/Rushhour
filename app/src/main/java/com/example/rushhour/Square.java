package com.example.rushhour;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class Square extends Shape{
    private float  w,h;
    private Paint p;
    private Paint pStroke;

    public Square(float x, float y, float w, float h, int color) {
        super(x,y,color);

        this.w = w;
        this.h = h;
        p = new Paint();
        pStroke = new Paint();
        p.setStyle(Paint.Style.FILL);
        p.setColor(color);
        pStroke.setStyle(Paint.Style.STROKE);
        pStroke.setColor(Color.BLACK);
        pStroke.setStrokeWidth(20);
        pStroke.setStrokeCap(Paint.Cap.ROUND);

    }

    public void draw(Canvas canvas)
    {
        RectF mRectF = new RectF(x,y,x+w,y+h);
        canvas.drawRoundRect(mRectF, 0, 0, p);
        canvas.drawRoundRect(mRectF, 0, 0, pStroke);
    }

    public boolean didXandYInSquare(float xc, float yc)
    {
        // xc & yc are the coin location
        // check if the point in the middle of the circle, is in the square
        if(xc > x && xc < x+w && yc > y && yc < y+h)
            return  true;
        return false;
    }
}
