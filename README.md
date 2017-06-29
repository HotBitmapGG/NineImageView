# NineImageView

[![](https://jitpack.io/v/HotBitmapGG/NineImageView.svg)](https://jitpack.io/#HotBitmapGG/NineImageView)

A nine graph display controls

## Screenshots

<a href="art/pic1.png"><img src="art/pic1.png" width="30%"/></a> <a href="art/pic2.png"><img src="art/pic2.png" width="30%"/></a> <a href="art/pic3.png"><img src="art/pic3.png" width="30%"/></a>


## Usage

```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

		dependencies {
    	        compile 'com.github.HotBitmapGG:NineImageView:V1.0'
    	}

```

* 1.In the XML

```java

    <com.hotbitmapgg.nineimagelibrary.NineImageView
        android:id="@+id/multi_image"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        app:nineImageHorizontalSpace="4dp"
        app:nineImageRatio="0.8"
        app:nineImageVerticalSpace="4dp" />

```

* 2.In the code

```java

        NineImageView nineImageView = (NineImageView) findViewById(R.id.multi_image);
        //set the picture url set
        nineImageView.setImageUrls(imageUrls);
        nineImageView.setOnClickItemListener(new NineImageView.OnClickItemListener() {
            @Override
            public void onClick(int i, ArrayList<String> url) {
               //set the picture click event,then do you have to do operation
            }
        });

```

## instructions

The control of the image to load depends on the glide load library if you need to use other image You can directly copy under the lib files to your project, the framework for the image to replace it.


## About me

[![Wercker](https://img.shields.io/badge/weibo-HotBitmapGG-blue.svg)](http://weibo.com/3223089177/profile?topnav=1&wvr=6&is_all=1)

An android developer in Wuhan.

If you want to make friends with me, You can focus on my weibo.


## License

DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE

Everyone is permitted to copy and distribute verbatim or modified
copies of this license document, and changing it is allowed as long
as the name is changed.

DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

You just DO WHAT THE FUCK YOU WANT TO.