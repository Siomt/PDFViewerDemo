 # build.gradle 添加

```
compile 'com.github.barteksc:android-pdf-viewer:3.0.0-beta.3'
```

# 添加权限

```
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.DOWNLOAD_WITHOUT_NOTIFICATION"/>
```

# 添加控件

```
<com.github.barteksc.pdfviewer.PDFView
        android:id="@+id/pdfView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

# 加载文件方式，另选一种即可

```
pdfView.fromUri(Uri)
pdfView.fromFile(File)
pdfView.fromBytes(byte[])
pdfView.fromStream(InputStream) 
pdfView.fromSource(DocumentSource)
pdfView.fromAsset(String)
```
# 最后加载文件

```
pdfView..load();
```

# 例子

```
 File path = new File(Environment.getExternalStorageDirectory().getPath() + "/pdfdemo.pdf");
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromFile(path).load();
```
注：我的手机根目录下有**pdfdemo.pdf **这个文件。