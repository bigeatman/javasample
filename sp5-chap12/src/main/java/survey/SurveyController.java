package survey;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	// using Model
//	@GetMapping
//	public String form(Model model) {
//		List<Question> question = createQuestions();
//		model.addAttribute("question", question);
//		return "survey/surveyForm";
//	}
//
//
	@PostMapping
	public String submit(@ModelAttribute("ansData") AnsweredData data) {
		return "survey/submitted";
	}

	// using ModelAndView
	@GetMapping
	public ModelAndView form() {
		List<Question> questions = createQuestions();
		ModelAndView mav = new ModelAndView();
		mav.addObject("question", questions);
		mav.setViewName("survey/surveyForm");
		return mav;
	}

	private List<Question> createQuestions() {
		Question q = new Question("당신의 역할은 무엇입니까?", Arrays.asList("서버", "프론트", "풀스택"));
		Question q1 = new Question("가장 많이 사용하는 개발 도구는?", Arrays.asList("Eclipse", "Intelij", "Sublime"));
		Question q2 = new Question("하고 싶은 말", Arrays.asList("서버", "프론트", "풀스택"));
		return Arrays.asList(q, q1, q2);
	}

}