package com.onektower.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zhwilson on 2016/11/19.
 * 数据库操作
 * SQLite 一个无服务器的，进程内的，自足自己的，零配置的，事件性的关系型数据库
 * <p>
 * 在Android中使用SQLite涉及的两个重要的类：
 * SQLiteDataBase：对外暴露数据库相关方法的辅助类
 * SQLiteOpenHelper:管理数据库的创建以及版本的控制
 * <p>
 * SQLite语句：
 */
public class SQLiteHelper {
    //数据库名
    private static final String DB_NAME = "zhwilson.db";
    //数据库版本
    private static final int DB_VERSION = 0;
    //表名
    private static final String TABLE_COMPANY = "1ktower";
    private SQLiteDatabase db;

    private class OpenHelper extends SQLiteOpenHelper {
        public OpenHelper(Context ctx) {
            //创建数据库
            super(ctx, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            //创建表
            StringBuffer sb = new StringBuffer();
            sb.append("create table ").append(TABLE_COMPANY)
                    .append(" (")
                    .append("_id integer primary key autoincrement, ")
                    .append("name text, ")
                    .append("number integer, ")
                    .append("sex integer ")
                    .append(");");
            sqLiteDatabase.execSQL(sb.toString());

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }

        private void tableCreate() {

        }
    }
}
