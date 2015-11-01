package filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterGo implements Filter {

	@Override
	public void init(FilterConfig initConfig) throws ServletException {
		String parameter = initConfig.getInitParameter("FilterBegin");
		System.out.println(parameter);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String ipAddress = request.getRemoteAddr();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date now = new Date();
		String time = sdf.format(now);
		System.out.println("IP = " + ipAddress + ", Time = " + time);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

}
