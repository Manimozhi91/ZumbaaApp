package com.zumba.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zumba.bean.Batch;
import com.zumba.bean.Participants;
import com.zumba.service.BatchService;
import com.zumba.service.ParticipantsService;


@WebServlet("/ParticipantsContoller")
public class ParticipantsContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ParticipantsService ps=new ParticipantsService();
       BatchService bs=new BatchService();

    public ParticipantsContoller() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Batch> listOfBatch=bs.findAllBatch();
		HttpSession hs=request.getSession();
		hs.setAttribute("listOfBatch", listOfBatch);
		response.sendRedirect("addParticipants.jsp");
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String operation=request.getParameter("operation");
		if(operation.equals("add")) {
			String pname=request.getParameter("pname");
			int age=Integer.parseInt(request.getParameter("age"));
			String phonenumber=request.getParameter("phonenumber");
			int batchid=Integer.parseInt(request.getParameter("batchid"));
			Participants p=new Participants();
			p.setPname(pname);
			p.setAge(age);
			p.setBatchid(batchid);
			p.setPhonenumber(phonenumber);
			String result=ps.storeParticipants(p);
			pw.println(result);
			RequestDispatcher rd=request.getRequestDispatcher("addParticipants.jsp");
			rd.include(request, response);
			}else if(operation.equals("delete")) {
				int pid=Integer.parseInt(request.getParameter("participantid"));
				ParticipantsService ps=new ParticipantsService();
				String result=ps.deleteParticipant(pid);
				RequestDispatcher rd=request.getRequestDispatcher("deleteParticipants.jsp");
				pw.println(result);
				rd.include(request, response);
			
			}else if(operation.equals("update")) {
				int pid=Integer.parseInt(request.getParameter("pid"));

				String phone=request.getParameter("phonenumber");
				Participants p=new Participants();
				p.setPid(pid);
				p.setPhonenumber(phone);
				ParticipantsService ps=new ParticipantsService();

							String result=ps.updateParticipant(p);
				pw.println(result);
				RequestDispatcher rd=request.getRequestDispatcher("updateParticipants.jsp");
				
				rd.include(request, response);
				
			}else {
				
			}
			response.setContentType("text/html");
		}

}
