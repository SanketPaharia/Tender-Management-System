package com.masai.usecase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import com.masai.utility.IDUtil;
import com.masai.model.Tender;
import com.masai.dao.*;

public class CreateTender {

	static class FastReader{
	    BufferedReader br;
	    StringTokenizer st;
	    public FastReader()
	    {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	    String next()
	    {
	      while (st == null || !st.hasMoreElements()){
	        try { st = new StringTokenizer(br.readLine()); }
	        catch (IOException e) { e.printStackTrace(); }
	      }
	      return st.nextToken();
	    }
	    int nextInt() { return Integer.parseInt(next()); }
	    long nextLong() { return Long.parseLong(next()); }
	    double nextDouble(){ return Double.parseDouble(next()); }
	    String nextLine(){
	      String str = "";
	      try { str = br.readLine(); }
	      catch (IOException e) { e.printStackTrace(); }
	      return str;
	    }
	  }
	public static void main(String[] args) {
		try{
			String tid= IDUtil.generateTenderId();
			FastReader fs = new FastReader();
			System.out.println("Enter the FirstName\n");
			String tname = fs.next();
			System.out.println("Enter the Tendor type\n");
			String ttype = fs.next();
			System.out.println("Enter the Tendor price\n");
			String stprice = fs.next();
			System.out.println("Enter the Tendor description \n");
			String tdesc = fs.next();
			System.out.println("Enter the deadline\n");
			String stdeadline = fs.next();
			System.out.println("Enter the location \n");
			String tloc  = fs.next();
			
			int tprice=Integer.parseInt(stprice);
			
			System.out.println(tid+" "+tname+" "+ttype+" "+tprice+" "+tdesc+" "+stdeadline+" "+tloc+" "+"completed ");
			
			Tender tendor = new Tender(tid ,tname ,ttype ,tprice ,tdesc ,stdeadline ,tloc);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
