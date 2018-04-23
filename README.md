# simple-android-crud
Simple Android CRUD application using REST-API. This simple CRUD application using [book-rest-api](https://github.com/budasuyasa/book-rest-api) as REST-API backend, build on ExpressJS and MySQL database.

---



### Install
1. Make sure you have installed Android Studio, NodeJs and MySQL server on your local machine.
2. Clone [book-rest-api](https://github.com/budasuyasa/book-rest-api) to your local machine. Config your port and database connection. Click [here](https://github.com/budasuyasa/book-rest-api/blob/master/README.md) for more details.
3. Clone this repo to your local machine. Open Android Studio and open this project. Open up `app/src/main/java/budasuyasa/android/simplecrud/Config/ApiEndpoint.java`, and set your REST-API endpoints as shown below. If you connect to your localhost using Android Emulator, use IP 10.0.2.2:port as `BASE` URL.
```java
    public static String BASE = "http://10.0.2.2:3000/";
    public static String BOOKS = BASE + "book";
```
4. You are done. Debug your application using device or Android Emulator.


