package jp.co.rakus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleKitanoApplication {

	public static void main(String[] args) {
		System.out.println("デプロイとs－バー起動を行います");
		SpringApplication.run(GitSampleKitanoApplication.class, args);
	}
}
