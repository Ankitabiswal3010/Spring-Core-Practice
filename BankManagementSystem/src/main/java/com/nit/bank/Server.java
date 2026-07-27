package com.nit.bank;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("server")
public class Server 
{
	@PostConstruct
	public void process()
	{
		IO.println("💻 Starting the Bank Server");
		IO.println("🔐 Verifying Security Certificates");
		IO.println("🗄️ Connecting to the Database");
		IO.println("🌐 Establishing Network Connection");
		IO.println("✅ Displaying \"Bank is Ready");
	}
	

}
