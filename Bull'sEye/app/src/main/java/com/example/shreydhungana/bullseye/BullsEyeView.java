package com.example.shreydhungana.bullseye;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;


/**
 * Created by shreydhungana on 10/20/16.
 */
public class BullsEyeView extends View {

    private  Paint paint;

    //values for Red,green et

    private int redVal;
    private int greenVal;
    private int blueVal;

    public BullsEyeView(Context context){

        super(context);

        redVal = 248;
        greenVal = 232;
        blueVal = 198;

        paint = new Paint();


    }

    public void onDraw (Canvas canvas){

        float centerX = canvas.getWidth() / 2;
        float centerY = canvas.getHeight() /2;

        // radius for the first ring

        float radius = canvas.getHeight() /2;

        //fill the canvas with beige color

        canvas.drawRGB(194, 183, 158);

        //draw five rings

        int ringRed = redVal;
        int ringGreen = greenVal;
        int ringBlue = blueVal;

        for (int i = 1; i <= 5; i++){

            paint.setStyle(Style.FILL);
            paint.setColor(Color.rgb(ringRed, ringGreen, ringBlue));
            canvas.drawCircle(centerX, centerY, radius, paint);

            ringRed -= 13;
            ringGreen -= 13;
            ringBlue -= 13;
            radius -= 120;


        }


    }












}
