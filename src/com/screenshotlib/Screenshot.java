package com.screenshotlib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.MeasureSpec;

public class Screenshot {

	public static void takeScreenshot(View view, String filePath) {
		Bitmap bitmap = getBitmapScreenshot(view);

		File imageFile = new File(filePath);
		imageFile.getParentFile().mkdirs();
		try {
			OutputStream fout = new FileOutputStream(imageFile);
			bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fout);
			fout.flush();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Bitmap getBitmapScreenshot(View view) {
		view.measure(MeasureSpec.makeMeasureSpec(view.getWidth(), MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(view.getHeight(), MeasureSpec.EXACTLY));
		view.layout((int)view.getX(), (int)view.getY(), (int)view.getX() + view.getMeasuredWidth(), (int)view.getY() + view.getMeasuredHeight());

		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache(true);
		Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
		view.setDrawingCacheEnabled(false);

		return bitmap;
	}
}
