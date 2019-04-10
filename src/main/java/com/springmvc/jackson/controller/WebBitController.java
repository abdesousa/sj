package com.springmvc.jackson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.jackson.model.WebBit;
import com.springmvc.jackson.model.WebBitDto;

public class WebBitController {

    //    @PostMapping(value = "/saveBits.htm")
//    @ResponseBody
//    public ResponseEntity saveBits(@RequestParam("icsBitMapId") Integer ics                                ){
//        try {
//
//
//
//            List<WebBit> webBitList = new ArrayList<>();
//            JSONArray bitJsonArray = new JSONArray(bits);
//            Gson g = new Gson();
//            for(int i = 0; i < bitJsonArray.length(); i++){
//                WebBit webBit = g.fromJson(bitJsonArray.get(i).toString(), WebBit.class);
//                webBitList.add(webBit);
//            }
//            this.service.saveListOfBits(webBitList, webIcsBitmap);
//            return new ResponseEntity(HttpStatus.OK);
//        } catch (Exception e) {
//            LOGGER.error("Unexpected error", e);
//            return MessageJSonFactory.buildResponse("Unexpected Error: "+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
    
    @RequestMapping(value = "/saveBits.htm",method=RequestMethod.POST)
    public ModelAndView saveBits(@ModelAttribute("webBitDto") WebBitDto webBitDto)
    {
        
    	return new ModelAndView("redirect:/webBits");
    }
    
    @RequestMapping(value = "/webBits")
    public ModelAndView listEmployees(@ModelAttribute("webBitDto") WebBitDto webBitDto)
    {
        ModelAndView model = new ModelAndView("webBits");

        List<WebBit> webBitList = new ArrayList<WebBit>();
        webBitList.add(new WebBit(1,"bit 1","desc 1","neg 1" ));
        webBitList.add(new WebBit(2,"bit 2","desc 2","neg 2" ));		
        webBitList.add(new WebBit(3,"bit 3","desc 3","neg 3" ));
        
        model.addObject("webBitList", webBitList);
        
        return model;
    }
    

}
