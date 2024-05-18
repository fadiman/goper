package first.sample.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	Logger log = LogManager.getLogger();
	
	@RequestMapping(value="/sample/openSampleList.do")
	public ModelAndView openSampleList(Map<String,Object> commendMap) throws Exception{
		ModelAndView mv = new ModelAndView("");
		log.debug("인터셉터 테스트");
		
		return mv;
	}

}
