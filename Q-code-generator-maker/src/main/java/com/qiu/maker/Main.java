package com.qiu.maker;

import com.qiu.maker.generator.main.GenerateTemplate;
import com.qiu.maker.generator.main.ZipGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        GenerateTemplate generatorTemplate = new ZipGenerator();
        generatorTemplate.doGenerate();
    }
}
