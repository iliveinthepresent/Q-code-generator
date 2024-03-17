package com.qiu.web.model.dto.generator;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 生成器使用请求
 *
 * @author qiu
 */
@Data
public class GeneratorUseRequest implements Serializable {

    /**
     * 生成器的 id
     */
    private Long id;

    /**
     * 数据模型
     */
    private Map<String, Object> dataModel;


    private static final long serialVersionUID = 1L;
}