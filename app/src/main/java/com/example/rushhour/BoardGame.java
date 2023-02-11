package com.example.rushhour;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class BoardGame extends View {
   Context context;
   Square[][] squares;

   public BoardGame(Context context) {
      super(context);
      this.context = context;
      squares = new Square[6][6];


   }

   @Override
   protected void onDraw(Canvas canvas) {
      super.onDraw(canvas);
      drawBoard(canvas);


   }


   private void drawBoard(Canvas canvas) {
      float x = 0;
      float y = 0;
      float w = canvas.getWidth() / 6;
      float h = w;
      int color;

      for (int i = 0; i < squares.length; i++) {
         for (int j = 0; j < squares.length; j++) {
            color = Color.GRAY;
            if (true/*firstTime*/)
               squares[i][j] = new Square(x, y, w, h, color);

            squares[i][j].draw(canvas);
            x = x + w;
         }
         y = y + h;
         x = 0;
      }
   }
}
