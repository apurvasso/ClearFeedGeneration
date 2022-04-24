package com.citiBridge;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@WebServlet("/FileUp")
public class FileUp extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
	protected void Service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		FileItem f = (FileItem)(RequestContext)request;
		try {
			f.write(new File("F:\\workspace\\Citi_Bridge"+ request.getLocalName()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
