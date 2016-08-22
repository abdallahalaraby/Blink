android-ViewScreenshot
======================

Android library that enables the user to take a screenshot from any view

<h2>Usage:</h2>
	
	Bitmap bitmap = Screenshot.getInstance().takeScreenshot(view); // Take Screenshot for View
	imageView.setImageBitmap(bitmap);


If you want to store the bitmap to storage:
	
	Bitmap bitmap = Screenshot.getInstance().takeScreenshot(view);
	String path = Environment.getExternalStorageDirectory().toString() + "/test";
	FileUtils.getInstance().storeBitmap(bitmap, path);

<h3>Permissions:</h3>
The following permission is needed if you want to store the bitmaps:
    
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
