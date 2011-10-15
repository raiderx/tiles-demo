package org.karpukhin.tilesdemo.servlet;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.servlet.context.ServletUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Pavel Karpukhin
 */
public class SimpleServlet extends HttpServlet {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        TilesContainer container = ServletUtil
            .getContainer(request.getSession().getServletContext());
        container.render("home", request, response);
    }
}
