android-ViewScreenshot
======================

Android library that enables the user to take a screenshot from any view

<h2>Usage:</h2>
String mPath = Environment.getExternalStorageDirectory().toString() + "/test";
Screenshot.takeScreenshot(view, mPath);
imageView.setImageBitmap(Screenshot.getBitmapScreenshot(view, mPath));


<h3>Permissions:</h3>
The following permission is needed:
\<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
