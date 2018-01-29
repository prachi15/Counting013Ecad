

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionListener implements HttpSessionListener {
   	ServletContext ctx=null;
    static int total=0,count=0;
    	

    public SessionListener() {
 
    }
    public void sessionCreated(HttpSessionEvent se)  { 
    	ctx=se.getSession().getServletContext();
    	total++;
    	count++;
    	ctx=se.getSession().getServletContext();
    	ctx.setAttribute("total",total);
    	ctx.setAttribute("count", count);
    	
    }
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	total--;
    	count--;
    	ctx.setAttribute("total", total);
    	ctx.setAttribute("count", count);
    }
	
}
