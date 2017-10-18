Blink
======================

[ ![Download](https://api.bintray.com/packages/abdallahalaraby/Blink/Blink/images/download.svg) ](https://bintray.com/abdallahalaraby/Blink/Blink/_latestVersion)

Android library that enables users to take screenshots for Views and Activities.

<h2>Dependency:</h2>
Include Blink into your project by adding the following line in your module-level build.gradle

	compile 'com.abdallahalaraby.blink:library:0.1.2@aar'

<h2>Usage:</h2>
	
	Bitmap bitmap = Screenshot.getInstance().takeScreenshotForView(view); // Take Screenshot for View
	imageView.setImageBitmap(bitmap);

In case you want to take a screenshot for the whole activity use:

	Bitmap bitmap = Screenshot.getInstance().takeScreenshotForScreen(activity); // Take Screenshot for Activity
	imageView.setImageBitmap(bitmap);

If you want to store the bitmap to storage:
	
	Bitmap bitmap = Screenshot.getInstance().takeScreenshotForView(view);
	String path = Environment.getExternalStorageDirectory().toString() + "/test";
	FileUtils.getInstance().storeBitmap(bitmap, path);

<h3>Permissions:</h3>
The following permission is needed if you want to store the bitmaps:
    
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
