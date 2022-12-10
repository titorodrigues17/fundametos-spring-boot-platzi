package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.Bean.MyBEanWithDependency;
import com.fundamentos.springboot.fundamentos.Bean.MyBean;
import com.fundamentos.springboot.fundamentos.componet.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBEanWithDependency myBEanWithDependency;
	public  FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBEanWithDependency myBEanWithDependency){
		this.componentDependency= componentDependency;
		this.myBean = myBean;
		this.myBEanWithDependency = myBEanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBEanWithDependency.printWhithDependency();
	}
}
