package edu.gl.dddsampleduck.interfaces.duck.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import edu.gl.dddsampleduck.interfaces.booking.facade.DuckServiceFacade;
import edu.gl.dddsampleduck.interfaces.booking.facade.dto.DuckDTO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

public class DuckController {

    private DuckServiceFacade duckServiceFacade;

    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm"), false));
    }

    @RequestMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model) throws Exception {
        List<DuckDTO> duckList = duckServiceFacade.listAllDucks();

        model.put("duckList", duckList);
        return "admin/list";
    }

    @RequestMapping("/show")
    public String show(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model) throws Exception {
        String duckId = request.getParameter("duckId");
        DuckDTO dto = duckServiceFacade.loadDuck(new AtomicInteger(Integer.parseInt(duckId)));
        model.put("duck", dto);
        return "admin/show";
    }

    public void setBookingServiceFacade(DuckServiceFacade duckServiceFacade) {
        this.duckServiceFacade = duckServiceFacade;
    }
}
