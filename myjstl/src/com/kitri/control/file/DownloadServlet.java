package com.kitri.control.file;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("filename");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String gurupath = "D:\\javaData\\fileupload\\";
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ new String(fileName.getBytes("utf-8"), "iso-8859-1") + "\"");
 
		FileInputStream fileInputStream = new FileInputStream(gurupath
				+ fileName);
 
		int i;
		while ((i = fileInputStream.read()) != -1) {
			out.write(i);
		}
		fileInputStream.close();
		out.close();
	}

}
