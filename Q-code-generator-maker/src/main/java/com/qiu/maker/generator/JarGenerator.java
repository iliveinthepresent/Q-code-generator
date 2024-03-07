package com.qiu.maker.generator;

import java.io.*;

/**
 * 生成jar包
 */
public class JarGenerator {

    public static void doGenerate(String projectDir) throws IOException, InterruptedException {
        // 调用Process类 执行 Maven 打包命令
        String winMavenCommand = "mvn.cmd clean package -DskipTest=true";
        String otherMavenCommand = "mvn clean package -DskipTest=true";
        String mavenCommand = System.getProperty("os.name").startsWith("Windows") ? winMavenCommand : otherMavenCommand;

        ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
        processBuilder.directory(new File(projectDir));

        Process process = processBuilder.start();
        InputStream inputStream = process.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        int exitCode = process.waitFor();
        System.out.println("命令执行结束，退出码：" + exitCode);

    }
}
