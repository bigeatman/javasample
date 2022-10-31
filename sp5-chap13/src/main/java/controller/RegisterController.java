package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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
		System.out.println("STEP1");
		return "register/step1";
	}

	@PostMapping("register/step2")
	public String stepTwoPost(@RequestParam(value = "agree", defaultValue = "false") Boolean isAgree, Model model) {
		System.out.println("STEP2");
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
	public String stepThreePost(@Valid @ModelAttribute("req") RegisterRequest req, Errors errors) {
		System.out.println("STEP3");

		if (errors.hasErrors()) {
			return "register/step2";
		}

		try {
			memberRegisterService.regist(req);
			return "register/step3";
		} catch (DuplicateMemberException e) {
			e.printStackTrace();
			return "register/step2";
		}
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		System.out.println("TEST");
		binder.setValidator(new RegisterRequestValidator());
	}

	@GetMapping("register/step3")
	public String stepThreeGet() {
		return "register/step3";
	}
}
