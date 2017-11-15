# InternetChecker-Android [![](https://jitpack.io/v/Rupesh-Saxena/InternetConnectionChecker-Android.svg)](https://jitpack.io/#Rupesh-Saxena/InternetConnectionChecker-Android)
Android library for internet connection detection with callbacks.

# Step 1. Add the JitPack repository to your build file i.e. build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

# Step 2. Add the dependency
```
	dependencies {
	        compile 'com.github.Rupesh-Saxena:InternetConnectionChecker-Android:1.0'
	}

```
# How to use
```
//check internet connection and perform action
        new InternetConnection(this, new InternetConnectionListener() {
            @Override
            public void onInternetConnectionEnable() {
                //TODO PERFORM TASKS ON INTERNET CONNECTION ENABLE
		....
            }

            @Override
            public void onInternetConnectionDisable() {
                //TODO PERFORM TASKS ON INTERNET CONNECTION DISABLE
		....
            }
});
```


