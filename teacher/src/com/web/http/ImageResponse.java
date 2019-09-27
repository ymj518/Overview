package com.web.http;

/**
 * @author ymj
 * @ClassName ImageResponse
 * @Description TODO
 * @Data 2019/9/27
 * @Version 1.0
 **/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(urlPatterns = "/getImage.do")
public class ImageResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //第一步，将图片写入字节数组
        //获得web根路径
        String path = super.getServletContext().getRealPath("/");
        //通过根路径下images的图片文件创建File对象
        File imgFile = new File(path + "images/me.jpg");
        //通过图片文件创建字节输入流
        InputStream is = new FileInputStream(imgFile);
        //通过字节输入流构建缓冲输入字节流
        BufferedInputStream bis = new BufferedInputStream(is);
        //创建指定长度的缓冲区
        byte[] buffer = new byte[1024];
        //设置响应对象的内容类型
        resp.setContentType("image/jpeg;UTF-8");
        //获取响应对象的输出流（字节流）
        OutputStream outputStream = resp.getOutputStream();
    }
}