package com.qiu.maker.generator.main;

import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * 生成数据模型
 */
public class MainGenerator extends GenerateTemplate{
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}