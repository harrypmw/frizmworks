package org.web.productcommand;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ProductQueryCommand {

	void productCommand(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
