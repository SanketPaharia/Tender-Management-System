package com.masai.usecase;

import java.io.IOException;
import java.io.PrintWriter;


import com.hit.utility.IDUtil;
import com.masai.model.Tender;
import com.masai.dao.*;

public class CreateTender {

	
	public CreateTender() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doGet() throws  IOException {
		
	
		String tid= IDUtil.generateTenderId();
		String tname= request.getParameter("tname").trim();
		String ttype= request.getParameter("ttype").trim();
		String stprice= request.getParameter("tprice").trim();
		String tdesc= request.getParameter("tdesc").trim();
		String stdeadline= request.getParameter("tdeadline").trim();
		String tloc= request.getParameter("tloc").trim();
		int tprice=Integer.parseInt(stprice);
		System.out.print(tid+" "+tname+" "+ttype+" "+tprice+" "+tdesc+" "+stdeadline+" "+tloc+" "+"completed ");
		
		Tender tender = new //TenderBean(id, name, type, price, desc, stdeadline, location)
				
				 Tender(tid,tname,ttype,tprice,tdesc,stdeadline,tloc);
		
		TenderDao dao = new TenderDaoImpl();
		
		String status = dao.createTender(tender);
		
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("createTender.jsp");
		
		rd.include(request, response);
		
		pw.print("<script>document.getElementById('show').innerHTML = '"+status+"'</script>");
	}

}
