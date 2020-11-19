package com.ptit.pacmancustomjava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class PacmanCanvas extends View {
    Paint pacmanPaint;
    Paint eyeOfPacmanPaint;
    public PacmanCanvas(Context context) {
        super(context);
        init();
    }
    public PacmanCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public PacmanCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    public PacmanCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    private void init() {
        pacmanPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pacmanPaint.setColor(Color.YELLOW);
        eyeOfPacmanPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        eyeOfPacmanPaint.setColor(Color.RED);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Kích thước của View
        int square = 300;
        // Cách lề trên
        float top = 300;
        // Cách lề trái
        float left = 300;
        float right = left + square;
        float bottom = top + square;
        // Giá trị bắt đầu quét (tính bằng độ)
        float startAngle = 30;
        // Giá trị quét (Ở đây mình quét từ góc 30 độ đến góc 330 độ)
        // sẽ được hình cái đầu của pacman
        float sweepAngle = 300;
        canvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, true, pacmanPaint);

        // cx, cy: tâm của hình tròn
        float cx = left + 180;
        float cy = top + 70;
        // Bán kinh của hình tròn
        float radius = 25;
        canvas.drawCircle(cx, cy, radius, eyeOfPacmanPaint);
    }
}
