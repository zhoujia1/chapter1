/* 
 * Copyright (C), 2015-2016, 深圳天道计然金融服务有限公司
 * File Name: @(#)HelloServlet.java
 * Encoding UTF-8
 * Author: jia.zhou@mljr.com
 * Version: 1.0
 * Date: 2016-09-17
 */
package org.smart4j.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能描述
 * <p>
 * <p>
 * <a href="HelloServlet.java"><i>View Source</i></a>
 *
 * @author jia.zhou@mljr.com
 * @version 1.0
 * @since 1.0
 * Created on 2016-09-17.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        req.setAttribute("currentTime",currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
