package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();
		browser.out();
		
		UI.in();
		
		System.out.println();
		Chrome chrome = new Chrome();
		//chrome.in(); 객체.인터페이스 메서드는 막힘
		chrome.out();
		
		chrome.play();
		Chrome.play(); // 비추천, 부모 클래스로 추적해야하는 불편함 발생
		Browser.play(); // 추천
		
	}
}
