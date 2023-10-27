package com.excelparser.util;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public final class ConfigurationManager {
    private static Scanner scanner = new Scanner(System.in);
    private static String instructorPath;
    private static String coursePath;
    private static String frequencyPath;
    private static final String SECTIONS_FILE = "./backup/sections.dat";
    private static final String INSTRUCTORS_FILE = "./backup/instructors.dat";

    private ConfigurationManager() {}

    public static void configure(String instructorPath, String coursePath, String frequencyPath) {
        ConfigurationManager.instructorPath = instructorPath;
        ConfigurationManager.coursePath = coursePath;
        ConfigurationManager.frequencyPath = frequencyPath;
    }

    public static String getInstructorPath() {
        return instructorPath;
    }

    public static String getCoursePath() {
        return coursePath;
    }
    public static String getFrequencyPathPath() {
        return frequencyPath;
    }

    private static boolean isValidXLSXFilePath(String path) {
        return Files.exists(Paths.get(path)) && path.toLowerCase().endsWith(".xlsx");
    }

    public static boolean serializedFilesExist() {
        return Files.exists(Paths.get(SECTIONS_FILE)) && Files.exists(Paths.get(INSTRUCTORS_FILE));
    }

    public static String getSectionsFile() {
        return SECTIONS_FILE;
    }

    public static String getInstructorsFile() {
    return INSTRUCTORS_FILE;
    }
}
