package com.qiu.web.model.dto.generator;

import com.qiu.maker.meta.Meta;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 制作生成器请求
 *
 * @author qiu
 */
@Data
public class GeneratorMakeRequest implements Serializable {

    /**
     * 元数据
     */
    private Meta meta;

    /**
     * zip文件路径
     */
    private String zipFilePath;

    private static final long serialVersionUID = 1L;
}