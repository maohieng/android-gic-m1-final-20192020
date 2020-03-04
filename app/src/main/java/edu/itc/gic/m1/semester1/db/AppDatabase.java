package edu.itc.gic.m1.semester1.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * This class is used for ...
 *
 * @autor MAO Hieng 2/26/2020
 */

@Database(entities = , version = )
public abstract class AppDatabase extends RoomDatabase {
    // Singleton
    private static AppDatabase INSTANCE;
}
