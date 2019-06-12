/*
 * Copyright 2017 copyright eastar Jeong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.log;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import java.lang.reflect.Method;
import java.util.ArrayList;

@SuppressWarnings("ALL")
/**
 * @author r
 */
public class Log {

    public static final int VERBOSE = android.util.Log.VERBOSE;
    public static final int DEBUG = android.util.Log.DEBUG;
    public static final int INFO = android.util.Log.INFO;
    public static final int WARN = android.util.Log.WARN;
    public static final int ERROR = android.util.Log.ERROR;
    public static final int ASSERT = android.util.Log.ASSERT;

    public static boolean LOG = false;

    public enum eMODE {
        STUDIO, SYSTEMOUT
    }

    public static eMODE MODE = eMODE.STUDIO;
    public static boolean FLOG = false;
    public static final String LOG_ROOTPATH = "_flog";

    public static int p(int priority, Object... args) {return -1;}
    public static int ps(int priority, StackTraceElement info, Object... args) {return -1;}
    public static int println(int priority, String tag, String locator, String msg) {return -1;}
    public static int e_filter(long nano, Object... args) {return -1;}
    public static int a(Object... args) {return -1;}
    public static int e(Object... args) {return -1;}
    public static int w(Object... args) {return -1;}
    public static int i(Object... args) {return -1;}
    public static int d(Object... args) {return -1;}
    public static int v(Object... args) {return -1;}
    public static int json(String json) {return -1;}
    public static int object(Object o) {return -1;}
    public static int milliseconds(long milliseconds) {return -1;}
    public static int provider(Context context, Uri uri) {return -1;}
    public static int pn(int priority, int depth, Object... args) {return -1;}
    public static int viewtree(View parent, int... depth) {return -1;}
    public static int clz(Class<?> clz) {return -1;}

    ////////////////////////////////////////////////////////////////////////////
    public static void toast(Context context, Object... args) { }
    ////////////////////////////////////////////////////////////////////////////
    //_DUMP
    ////////////////////////////////////////////////////////////////////////////
    public static String _MESSAGE(Object... args) { return ""; }
    public static String _DUMP_json(String json) { return ""; }
    public static String _DUMP(String object) { return ""; }
    public static String _DUMP(Method method) { return ""; }
    public static String _DUMP(Intent intent) { return ""; }
    public static String _DUMP_StackTrace(Throwable tr) {return ""; }
    public static String _DUMP(Throwable th) {return ""; }
    public static String _DUMP_milliseconds() { return ""; }
    public static String _DUMP_milliseconds(long milliseconds) {return ""; }
    public static String _DUMP_yyyymmddhhmmss(long milliseconds) {return ""; }
    public static String _DUMP_elapsed(long elapsedRealtime) {return ""; }
    public static String _h2s(byte[] bytes) {return ""; }
    public static byte[] _s2h(String bytes_text) {return null;}
    public static String _DUMP_object(Object o) {return ""; }

    // Line Logger
    public static class Line1Logger {
        public static void append(Object... args) { }
        public static String pop() {return ""; }
    }

    // String Logger
    public static class LineNLogger {
        public static void insert(Object... args) { }
        public static String get() {return ""; }
        public static void clear() {}
    }

    // LIST_LOGGER
    public static class ListLogger {
        public static void insert(Object... args) { }
        public static ArrayList<String> pop() { return null; }
        public static ArrayList<String> get() { return null; }
        public static ArrayList<String> peek() { return null; }
        public static void clear() { return; }
    }

    //tic
    public static void tic_s() { }
    public static void tic() { }
    public static void tic(String... args) { }
    public static void tic_s(Object seed) { }
    public static void tic(Object seed, Object... args) { }

    //keep loger
    public static Loger _LOGER = new Loger();
    public static Loger _loger() {
        return _LOGER;
    }
    public static class Loger {
        public void log(Object... args) { }
        public void print() { }
    }

    //flog
    public static void flog(Context context, Object... args) { }
    public static void flog(String file_prefix, Object... args) { }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //image save
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void compress(String name, byte[] data) { }
    public static void compress(String name, Bitmap bmp) { }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //life tools
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //상속트리마지막 위치
    public static int po(int priority, String methodNameKey, Object... args) { return -1; }
    public static void sendBroadcast(Class<?> clz, Intent intent) { }
    public static void startService(Class<?> clz, Intent intent) { }
    public static void onResume(Class<?> clz) { }
    public static void onPause(Class<?> clz) { }
    public static void onDetach(Class<?> clz) { }
    public static void onDestroyView(Class<?> clz) { }
    public static void onCreate(Class<?> clz, Bundle savedInstanceState) { }
    public static void onAttach(Class<?> clz, Context context) { }
    public static void onCreate(Class<?> clz) { }
    public static void onNewIntent(Class<?> clz) { }
    public static void onDestroy(Class<?> clz) { }
    public static void onStart(Class<?> clz) { }
    public static void onStop(Class<?> clz) { }
    public static void onRestart(Class<?> clz) { }
    public static ArrayList<Class<?>> CLZS = new ArrayList<>();
    public static void startActivity(Class<?> clz, Intent intent) { }
    public static void startActivity(Class<?> clz, Intent intent, Bundle options) { }
    public static void onActivityCreated(Class<?> clz, Bundle savedInstanceState) { }
    public static void onActivityResult(Class<?> clz, int requestCode, int resultCode, Intent data) { }
    public static int pc(int priority, String methodNameKey, Object... args) { return -1; }
    public static void startActivities(Class<?> clz, Intent[] intents) { }
    public static void startActivityForResult(Class<?> clz, Intent intent, int requestCode) { }
    public static void startActivityForResult(Class<?> clz, Intent intent, int requestCode, Bundle options) { }
    public static void onItemClick(AdapterView<?> parent, View view, int position, long id) { }
    public static void measure(int widthMeasureSpec, int heightMeasureSpec) { }

    //tools
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void printStackTrace() { }
    public static void printStackTrace(Exception e) { }
    private static long LAST_ACTION_MOVE;
    public static void onTouchEvent(MotionEvent event) {}
    public static void showTable(SQLiteDatabase db) {}
}
