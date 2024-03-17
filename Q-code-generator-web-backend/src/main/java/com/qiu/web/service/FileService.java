package com.qiu.web.service;

import javax.servlet.http.HttpServletResponse;

public interface FileService {
     void downloadFile(String filepath, HttpServletResponse response);
}
