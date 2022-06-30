package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {

	private String host;

	public Client() {
		super();
		System.out.println("Client.Constructor called.");
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void send() {
		System.out.println("Client.send() to " + host);
	}

	public void destroy() throws Exception {
		System.out.println("Client.destory called.");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Client.afterPropertiesSet called.");
	}

}
