package com.qiu.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        File parentFile = new File(projectPath).getParentFile();
        String inputPath = new File(parentFile, "Q-code-generator-demo-projects/acm-template").getAbsolutePath();
        String outputPath = projectPath;
        copyFilesByHutool(inputPath, outputPath);
    }
}
