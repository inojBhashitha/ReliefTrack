package com.relieftrack.app;

import com.relieftrack.database.DatabaseManager;

import java.sql.Connection;

public class DatabaseTest {

    public static void main(String[] args) {

        try (Connection connection = DatabaseManager.getConnection()) {

            System.out.println("✅ Database Connected Successfully!");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}