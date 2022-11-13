package com.masai.usecase;

import java.io.IOException;
import java.io.PrintWriter;

import com.hit.dao.BidderDao;
import com.hit.dao.BidderDaoImpl;

import com.masai.dao.*;

public class AcceptBid {

	
	 public AcceptBid() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet() throws  IOException {
			
			
			String bidderId = request.getParameter("bid");
			String tenderId = request.getParameter("tid");
			String vendorId = request.getParameter("vid");
			
			BidderDao dao = new BidderDaoImpl();
			
			String status = dao.acceptBid(bidderId, tenderId, vendorId);
			
			PrintWriter pw = response.getWriter();
			
			RequestDispatcher rd = request.getRequestDispatcher("viewTenderBidsForm.jsp");
			
			rd.include(request, response);
			
			pw.print("<script>document.getElementById('show').innerHTML='"+status+"'</script>");
			
			pw.close();
		}

		
		
}
