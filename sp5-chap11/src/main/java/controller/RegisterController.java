package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import exception.DuplicateMemberException;
import service.MemberRegisterService;
import service.RegisterRequest;

@Controller
public class RegisterController {

	@Autowired
	private MemberRegisterService memberRegisterService;
	
	@RequestMapping("register/step1")
	public String stepOne() {
		return "register/step1";
	}

	@PostMapping("register/step2")
	public String stepTwoPost(@RequestParam(value = "agree", defaultValue = "false") Boolean isAgree, Model model) {
		if (isAgree) {
			model.addAttribute("req", new RegisterRequest());
			return "register/step2";
		}

		return "register/step1";
	}

	@GetMapping("register/step2")
	public String stepTwoGet() {
		return "redirect:/register/step1";
	}

	@PostMapping("register/step3")
	public String stepThreePost(@ModelAttribute("req") RegisterRequest req, Model model) {
		try {
			memberRegisterService.regist(req);
			return "register/step3";
		} catch (DuplicateMemberException e) {
			e.printStackTrace();
			return "register/step2";
			// return 해서 step2.jsp가 나오는데 stepTwoPost 메서드는 왜 호출이 안되는가?
			// 리다이렉트가 아니기 때문?
			// step3으로 들어왔지만, step2를 반환하고 모델에 req 값이 이미 설정되어 있음.
			// return "step2"를 하면 step2 컨트롤러가 호출되는게 아니라
			// 단지 뷰만 step2로 설정하여 반환하는것 뿐
		}
	}

	@GetMapping("register/step3")
	public String stepThreeGet() {
		return "register/step3";
	}
}
