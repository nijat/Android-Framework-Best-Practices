# Android-Framework-Best-Practices

# Awesome Libraries
* Butter Knife - http://jakewharton.github.io/butterknife/ ( XML Binding)

        compile 'com.jakewharton:butterknife:8.8.0'
        annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.0'

* Retrofit  - http://square.github.io/retrofit/  (Network, JSON Mapper)

        compile 'com.google.code.gson:gson:2.6.2'
        compile 'com.squareup.retrofit2:retrofit:2.3.0'
        compile 'com.squareup.retrofit2:converter-gson:2.0.2'
        compile 'com.squareup.okhttp3:okhttp:3.3.1'
        
* Fabric (Realtime Analytics Tool)
        
        compile('com.crashlytics.sdk.android:crashlytics:2.6.8@aar') {
            transitive = true;
        }
        
* Permission Checker - Dexter -https://github.com/Karumi/Dexter
        
        compile 'com.karumi:dexter:4.1.0'
* Stetho - inspect DB, network traffic - http://facebook.github.io/stetho/

Stetho is a debug bridge for Android applications from Facebook that integrates with the Chrome desktop browser's Developer Tools. With Stetho you can easily inspect your application, most notably the network traffic. It also allows you to easily inspect and edit SQLite databases and the shared preferences in your app. You should, however, make sure that Stetho is only enabled in the debug build and not in the release build variant.
          
          compile 'com.facebook.stetho:stetho:1.5.0' 

# Awesome Plugins for Android Studio
* Butter Knife - http://jakewharton.github.io/butterknife/ Android plugin https://github.com/avast/android-butterknife-zelezny
* Json To Object POJO - https://github.com/robohorse/RoboPOJOGenerator
* Json To Object - https://github.com/zzz40500/GsonFormat


# File naming, Package naming, Resource files naming, layout naming
Read https://github.com/ribot/android-guidelines/blob/master/project_and_code_guidelines.md


