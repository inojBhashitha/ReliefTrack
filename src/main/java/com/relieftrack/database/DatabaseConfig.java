package com.relieftrack.database;

public final class DatabaseConfig {

    private DatabaseConfig() {
        // Prevent instantiation
    }

    public static final String DATABASE_FOLDER = "data";
    public static final String DATABASE_NAME = "relieftrack.db";
    public static final String DATABASE_URL =
            "jdbc:sqlite:data/relieftrack.db";
}