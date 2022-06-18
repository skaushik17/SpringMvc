package com.satender;


@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i , @RequestParam("t2") int j)
	{
		
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
	  AddService as= new AddService();	
	  ModelAndView mv= new ModelAndView();
	  mv.setViewName("display.jsp") 
	  mv.addObject("result",as.add(i,j))	
	
	  return mv;
		
	}

}
