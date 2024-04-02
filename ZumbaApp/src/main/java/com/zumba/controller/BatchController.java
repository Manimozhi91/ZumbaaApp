package com.zumba.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.Result;
import com.zumba.bean.Batch;
import com.zumba.service.BatchService;

/**
 * Servlet implementation class BatchController
 */
@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      BatchService bs=new BatchService();
      
   
    public BatchController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		List<Object[]> listOfbatchAndStudents=bs.findBatchAndStudentInfo();
		HttpSession hs=request.getSession();
		hs.setAttribute("listOfBP", listOfbatchAndStudents);
		response.sendRedirect("batchAndParticipants.jsp");


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String operation=request.getParameter("operation");
		if(operation.equals("store")) {
			int batchid=Integer.parseInt(request.getParameter("batchid"));
			String typeofbatch=request.getParameter("typeofbatch");
			String time=request.getParameter("time");
			Batch batch=new Batch(batchid,typeofbatch,time);
			String result=bs.storeBatch(batch);
			pw.println(result);

			RequestDispatcher rd=request.getRequestDispatcher("addBatch.jsp");
			
			rd.include(request, response);
		}else if(operation.equals("update")) {
			int batchid=Integer.parseInt(request.getParameter("batchid"));

			String typeofbatch=request.getParameter("typeofbatch");
			String time=request.getParameter("time");
			Batch bat=new Batch();
			bat.setBatchid(batchid);
			bat.setTypeofbatch(typeofbatch);
			bat.setTime(time);
			BatchService bs=new BatchService();
			String result=bs.updateBatch(bat);
			pw.println(result);
			RequestDispatcher rd=request.getRequestDispatcher("updateBatch.jsp");
			
			rd.include(request, response);

		}else if(operation.equals("delete")) {
			int batchid=Integer.parseInt(request.getParameter("batchid"));
			BatchService bs=new BatchService();
			String result=bs.deleteBatch(batchid);
			RequestDispatcher rd=request.getRequestDispatcher("deleteBatch.jsp");
			pw.println(result);
			rd.include(request, response);

			
		}else {
			pw.println("wrong operation");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		
		response.setContentType("text/html");	}

}
