package com.qiu.maker.generator.main;

/**
 * 生成代码生成器（包含压缩包）
 */
public class ZipGenerator extends GenerateTemplate{

    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        String buildDist = super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
        return super.buildZip(buildDist);
    }
}