package poc;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

/**
 * @author Guido Esch
 */
@SpringUI(path = "/")
@Theme("valo")
public class VaadinUI extends UI{
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("I'm a simple label, but i'm visible"));
    }
    @WebServlet(urlPatterns = "/*")
    @VaadinServletConfiguration(ui = VaadinUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

}